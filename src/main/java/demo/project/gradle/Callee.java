package demo.project.gradle;

public class Callee {

   protected void method1(final String message) {
      innerMethod(message);
   }

   private void innerMethod(final String message) {
      System.out.println("Message: " + message);
      final String empty = null;
      System.out.println(empty.toLowerCase());

   }

}
