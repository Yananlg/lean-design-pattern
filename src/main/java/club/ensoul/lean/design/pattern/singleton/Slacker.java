package club.ensoul.lean.design.pattern.singleton;

public class Slacker {
    
    public static void main(String[] args) {
        SingletonA singletonA = SingletonA.getInstance();
        SingletonB singletonB = SingletonB.getInstance();
        SingletonC singletonC = SingletonC.getInstance();
    }

}

/**
 * 懒汉式(线程不安全)[不可用]
 */
class SingletonA {
    
    private static SingletonA singletonA;
    
    private SingletonA() {}
    
    public static SingletonA getInstance() {
        if (singletonA == null) {
            singletonA = new SingletonA();
        }
        return singletonA;
    }
    
}

/**
 * 懒汉式(线程安全，同步方法)[不推荐用]
 * 效率太低，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 */
class SingletonB {
    
    private static SingletonB singletonB;
    
    private SingletonB() {}
    
    public static synchronized SingletonB getInstance() {
        if (singletonB == null) {
            singletonB = new SingletonB();
        }
        return singletonB;
    }
}

/**
 * 懒汉式(线程安全，同步代码块)[不可用]
 * 这种同步并不能起到线程同步的作用。
 * 假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 */
class SingletonC {
    
    private static SingletonC singletonC;
    
    private SingletonC() {}
    
    public static SingletonC getInstance() {
        if (singletonC == null) {
            synchronized (SingletonC.class) {
                singletonC = new SingletonC();
            }
        }
        return singletonC;
    }
}