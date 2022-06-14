package demo.project.gradle;

public class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {
      System.out.println("inner Method");
   }

}
