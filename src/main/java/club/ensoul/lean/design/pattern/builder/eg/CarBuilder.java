package club.ensoul.lean.design.pattern.builder.eg;

import java.util.ArrayList;

// Builder抽象建造者 规范产品的组建，一般是由子类实现。
public abstract class CarBuilder {
    
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    
    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
    
}
