package club.ensoul.learn.design.pattern.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        
        Subject subject = new RealSubject();
        
        //定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        
        //代理的行为
        proxy.doSomething("Finish");
        
    }
}
