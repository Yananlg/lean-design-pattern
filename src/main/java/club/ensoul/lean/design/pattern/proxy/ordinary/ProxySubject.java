package club.ensoul.lean.design.pattern.proxy.ordinary;

// Proxy代理主题角色 也叫做委托类、代理类。它负责对真实角色的应用，把所有抽象主题类定义的方法限制委托给真实主题角色实现，并且在真实主题角色处理完毕前后做预处理和善后处理工作。
public class ProxySubject implements Subject {
    
    private Subject subject;
    
    ProxySubject(Subject subject) {
        this.subject = subject;
    }
    
    //实现方法
    public void request() {
        System.out.println("run method ProxySubject.request start");
        this.subject.request();
        System.out.println("run method ProxySubject.request end");
    }
    
}
