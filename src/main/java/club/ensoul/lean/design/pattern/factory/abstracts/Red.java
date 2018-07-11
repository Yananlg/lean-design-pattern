package club.ensoul.lean.design.pattern.factory.abstracts;

public class Red implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}