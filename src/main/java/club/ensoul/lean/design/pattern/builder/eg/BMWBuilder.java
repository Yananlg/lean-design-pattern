package club.ensoul.lean.design.pattern.builder.eg;

import java.util.ArrayList;

// ConcreteBuilder具体建造者实现抽象类 定义的所有方法，并且返回一个组建好的对象。
public class BMWBuilder extends CarBuilder {
    
    private BMWModel bmw = new BMWModel();
    
    public CarModel getCarModel() {
        return this.bmw;
    }
    
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
