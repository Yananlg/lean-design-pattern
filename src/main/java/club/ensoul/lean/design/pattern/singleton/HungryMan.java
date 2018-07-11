package club.ensoul.lean.design.pattern.singleton;

public class HungryMan {
    
    public static void main(String[] args) {
        HungryManConst hungryManConst = HungryManConst.getInstance();
        HungryManStatic hungryManStatic = HungryManStatic.getInstance();
    }
    
}

/**
 * <br/> 饿汉式（静态常量）[可用]
 * <br/> 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * <br/> 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
class HungryManConst {
    
    private final static HungryManConst INSTANCE = new HungryManConst();
    
    private HungryManConst() {}
    
    public static HungryManConst getInstance() {
        return INSTANCE;
    }
    
}


/**
 * <br/> 饿汉式（静态代码块）[可用]
 * <br/> 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * <br/> 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
class HungryManStatic {
    
    private static HungryManStatic instance;
    
    static {
        instance = new HungryManStatic();
    }
    
    private HungryManStatic() {}
    
    public static HungryManStatic getInstance() {
        return instance;
    }
}