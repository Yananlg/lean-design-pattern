package club.ensoul.learn.design.pattern.proxy.ordinary;

public class Client {
    
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.request();
    }
    
}
