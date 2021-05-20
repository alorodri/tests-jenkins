import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class MainTest {

    @Test
    @DisplayName("Fail test")
    void doFailTest() {
        Assertions.fail();
    }

    @Test
    @DisplayName("Equals test")
    void doEqualsTest() {
        Assertions.assertEquals(2, 2);
    }
}
