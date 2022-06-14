package demo.project.gradle;

public class Callee {

   protected void method1(final String message) {
      innerMethod(message);
   }

   private void innerMethod(final String message) {
      System.out.println("Message: " + message);
      try {
         Thread.sleep(30);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }
   }

}
