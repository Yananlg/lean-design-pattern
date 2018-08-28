package club.ensoul.learn.design.pattern.proxy.dynamic;

public interface IAdvice {
    //通知只有一个方法，执行即可
    void exec();
}

class BeforeAdvice implements IAdvice {
    
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
    
}

class AfterAdvice implements IAdvice {
    
    public void exec() {
        System.out.println("我是后置通知，我被执行了！");
    }
    
}

