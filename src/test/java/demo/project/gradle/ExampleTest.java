package demo.project.gradle;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Pass the method parameters provided by the @ValueSource annotation")
public class ExampleTest {

   @DisplayName("Should pass a non-null message to our test method")
   @ParameterizedTest(name = "index: {index}, message: {0}")
   @ValueSource(strings = { "Hello", "World" })
   public void test(final int message) {
      final ExampleClass exampleClazz = new ExampleClass();
      exampleClazz.calleeMethod(message);

      assertNotNull(exampleClazz);
   }

}
