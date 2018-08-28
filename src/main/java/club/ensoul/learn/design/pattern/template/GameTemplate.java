package club.ensoul.learn.design.pattern.template;

/** 抽象模板类 */
public abstract class GameTemplate {
    //基本方法
    abstract void initialize();
    //基本方法
    abstract void startPlay();
    
    //基本方法
    abstract void difficulty();
    
    //基本方法
    abstract void endPlay();
    
    //模板方法
    public final void play() {
        
        // 调用基本方法，完成相关的逻辑
        
        //初始化游戏
        initialize();
        
        if(hotDifficulty()) {
            difficulty();
        }
        
        //开始游戏
        startPlay();
        
        //结束游戏
        endPlay();
        
    }
    
    // 钩子方法（Hook Method）
    protected boolean hotDifficulty(){
        return false;
    }
    
}