package club.ensoul.learn.design.pattern.factory.abstracts;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}