import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeClassTest {
    @Test
    public void testGetSum() {
        int expected = 11;
        int actual = SomeClass.getSum(5, 6);
        assertEquals(expected, actual);
    }
}