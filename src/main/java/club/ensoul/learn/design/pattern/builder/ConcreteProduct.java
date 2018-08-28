package club.ensoul.learn.design.pattern.builder;

public class ConcreteProduct extends Builder {
    
    private Product product = new Product();
    
    //设置产品零件, 产品类内的逻辑处理
    public void setPart() {
        product.setDoWhat("HAHAHAH");
    }
    
    //组建一个产品
    public Product buildProduct() {
        return product;
    }
}
