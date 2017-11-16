import org.junit.Test;
import static org.junit.Assert.*;
import static fuji.Math.*;

public class AddTest {
    @Test public void testAdd() {
        assertEquals("add should return the sum of two integers", 3, add(1, 2));
    }

    @Test public void testSum() {
        assertEquals("sum should return sum of several integers", 4, sum(1, 1, 2));
    }
}
