package club.ensoul.lean.design.pattern.proxy.ordinary;

// RealSubject具体主题角色也叫做被委托角色、被代理角色，是业务逻辑的具体执行者。
public class RealSubject implements Subject {
    
    public RealSubject(Subject subject, String name) {
    }
    
    public RealSubject() {
    }
    
    //实现方法
    public void request() {
        //业务逻辑处理
        System.out.println("run method RealSubject.request");
    }
    
}
