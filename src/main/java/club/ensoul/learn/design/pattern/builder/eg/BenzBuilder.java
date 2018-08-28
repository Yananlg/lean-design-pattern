package club.ensoul.learn.design.pattern.builder.eg;

import java.util.ArrayList;

// // ConcreteBuilder具体建造者实现抽象类 定义的所有方法，并且返回一个组建好的对象。
public class BenzBuilder extends CarBuilder {
    
    private BenzModel benz = new BenzModel();
    
    public CarModel getCarModel() {
        return this.benz;
    }
    
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
