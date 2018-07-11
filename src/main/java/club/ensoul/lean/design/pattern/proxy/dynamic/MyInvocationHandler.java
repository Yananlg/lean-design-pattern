package club.ensoul.lean.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    
    //被代理的对象
    private Object target = null;
    
    //通过构造函数传递一个对象
    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }
    
    //代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        return method.invoke(this.target, args);
    }
    
}
