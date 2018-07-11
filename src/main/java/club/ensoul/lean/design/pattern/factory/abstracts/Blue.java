package club.ensoul.lean.design.pattern.factory.abstracts;

public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}