import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class VisualBeautyTests{

    @Test
    @DisplayName("Passed тест 1")
    void testPassed1() {
        assertTrue(true, "Passed тест 1");
    }
    @Test
    @DisplayName("Passed тест 2")
    void testPassed2() {
        assertTrue(true, "Passed тест 2");
    }
    @Test
    @DisplayName("Passed тест 3")
    void testPassed3() {
        assertTrue(true, "Passed тест 3");
    }
    @Test
    @DisplayName("Passed тест 4")
    void testPassed4() {
        assertTrue(true, "Passed тест 4");
    }
    @Test
    @DisplayName("Passed тест 5")
    void testPassed5() {
        assertTrue(true, "Passed тест 5");
    }

    @Test
    @DisplayName("Failed тест 1)")
    void testFailed1() {
        fail("Failed тест");
    }
    @Test
    @DisplayName("Failed тест 2")
    void testFailed2() {
        fail("Failed тест");
    }
    @Test
    @DisplayName("Failed тест 3")
    void testFailed3() {
        fail("Failed тест");
    }

    @Test
    @DisplayName("Broken тест")
    void testBroken() {
        throw new RuntimeException("Broken тест");
    }

}
