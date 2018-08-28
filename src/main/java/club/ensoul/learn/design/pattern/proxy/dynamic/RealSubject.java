package club.ensoul.learn.design.pattern.proxy.dynamic;

public class RealSubject implements Subject {
    //业务操作
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
