package club.ensoul.lean.design.pattern.template;

public class Cricket extends GameTemplate {
    //实现基本方法
    @Override
    void initialize() {
        System.out.println("Cricket GameTemplate Initialized! Start playing.");
    }
    //实现基本方法
    @Override
    void startPlay() {
        System.out.println("Cricket GameTemplate Started. Enjoy the game!");
    }
    
    @Override
    void difficulty() {
        System.out.println("Cricket GameTemplate Started. Difficulty the game!");
    }
    
    // 钩子方法（Hook Method）
    @Override
    protected boolean hotDifficulty() {
        return true;
    }
    
    //实现基本方法
    @Override
    void endPlay() {
        System.out.println("Cricket GameTemplate Finished!");
    }
    
}