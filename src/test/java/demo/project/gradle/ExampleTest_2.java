package demo.project.gradle;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ExampleTest_2 {

   @Test
   public void test_2() {
      final ExampleClass exampleClazz = new ExampleClass();
      exampleClazz.calleeMethod("Second test");
      assertNotNull(exampleClazz);
   }

}
