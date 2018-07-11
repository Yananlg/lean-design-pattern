package club.ensoul.lean.design.pattern.template;

public class Client {
    
    public static void main(String[] args) {
        GameTemplate gameTemplate = new Cricket();
        gameTemplate.play();
        
        System.out.println();
        
        gameTemplate = new Football();
        gameTemplate.play();
    }
    
}
