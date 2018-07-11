package club.ensoul.lean.design.pattern.builder.eg;

// Product产品类 实现了模板方法模式，也就是有模板方法和基本方法
public class BMWModel extends CarModel {
    
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }
    
    protected void engineBoom() {
        System.out.println("宝马车的引擎是这个声音的...");
    }
    
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }
    
    protected void stop() {
        System.out.println("宝马车应该这样停车...");
    }
    
}
