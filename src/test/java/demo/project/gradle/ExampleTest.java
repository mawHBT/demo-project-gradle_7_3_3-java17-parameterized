package demo.project.gradle;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ExampleTest {

   public void test() {
      final ExampleClass exampleClazz = new ExampleClass();
      exampleClazz.calleeMethod(int errorInt);
      assertNotNull(exampleClazz);
   }

}
