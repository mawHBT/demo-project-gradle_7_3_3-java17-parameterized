package demo.project.gradle;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class ExampleTest {

   @Test
   public void test() {
      final ExampleClass exampleClazz = new ExampleClass();
      exampleClazz.calleeMethod("This is a Test").toString;
      assertNull(exampleClazz);
   }

}
