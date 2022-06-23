package demo.project.gradle;

public class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {
      try {
         Thread.sleep(25);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }
      System.out.println("inner Method");
      final String nullString = null;
      System.out.println(nullString.toLowerCase());
   }

}
