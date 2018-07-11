package club.ensoul.lean.design.pattern.proxy.coercive;

public class GamePlayerProxy implements IGamePlayer, IProxy {
    
    private IGamePlayer gamePlayer = null;
    
    //构造函数传递用户名
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }
    
    //代练杀怪
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    
    //代练登录
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    
    //代练升级
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }
    
    //代理的代理暂时还没有，就是自己
    public IGamePlayer getProxy() {
        return this;
    }
    
    //计算费用
    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
