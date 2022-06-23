package demo.project.gradle;

public class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {
      System.out.println("inner Method");
      try {
         Thread.sleep(25);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }
   }

}
