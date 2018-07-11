package club.ensoul.lean.design.pattern.builder;

public class Product {
    
    private String doWhat;
    
    // 独立业务处理
    public void doSomething() {
        System.out.println("run method Product.doSomething " + doWhat);
    }
    
    public void setDoWhat(String doWhat) {
        this.doWhat = doWhat;
    }
}
