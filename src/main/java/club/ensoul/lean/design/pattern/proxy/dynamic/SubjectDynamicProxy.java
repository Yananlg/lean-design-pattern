package club.ensoul.lean.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy<Subject> {
    
    public static Subject newProxyInstance(Subject subject) {
        
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
