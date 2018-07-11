package club.ensoul.lean.design.pattern.template;

public class Football extends GameTemplate {
    
    @Override
    void initialize() {
        System.out.println("Football GameTemplate Initialized! Start playing.");
    }
    
    @Override
    void startPlay() {
        System.out.println("Football GameTemplate Started. Enjoy the game!");
    }
    
    @Override
    void difficulty() {
        System.out.println("Cricket GameTemplate Started. Difficulty the game!");
    }
    
    
    
    @Override
    void endPlay() {
        System.out.println("Football GameTemplate Finished!");
    }
    
}