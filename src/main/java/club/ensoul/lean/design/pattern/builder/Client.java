package club.ensoul.lean.design.pattern.builder;

public class Client {
    
    public static void main(String[] args) {
        Director director = new Director();
        director.getAProduct().doSomething();
    }
    
}
