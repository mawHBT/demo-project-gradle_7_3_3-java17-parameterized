package demo.project.gradle;

public class Callee {

   protected void method1(final String message) {
      innerMethod(message);
   }

   private void innerMethod(final String message) {
      try {
         Thread.sleep(25);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }
      System.out.println("Message: " + message);
   }

}
