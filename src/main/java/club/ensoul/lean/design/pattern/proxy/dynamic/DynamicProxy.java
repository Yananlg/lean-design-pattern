package club.ensoul.lean.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        
        //寻找JoinPoint连接点，AOP框架使用元数据定义
        
        //执行一个前置通知
        new BeforeAdvice().exec();
        
        //执行目标，并返回结果
        T t = (T) Proxy.newProxyInstance(loader, interfaces, h);
    
        //执行一个后置通知
        new AfterAdvice().exec();
    
        return t;
    }
}
