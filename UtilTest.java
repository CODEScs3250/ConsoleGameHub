import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for class Util.
 *
 * @author  Dr. Jody Paul
 * @author  CS3250 Spring 2025
 * @version 20240127
 */
public class UtilTest {
    /**
     * Constructor for test class.
     */
    public UtilTest() {
    }

    /**
     * Set up the test fixture before every test case method.
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Tear down the test fixture after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }

    /** Test initial values. */
    @Test
    public void fibonInitialTest() {
        assertEquals(0, Util.fibon(0));
        assertEquals(1, Util.fibon(1));
    }

    /** Test single-digit indices. */
    @Test
    public void fibonSmallIndexTest() {
        assertEquals(1, Util.fibon(2));
        assertEquals(2, Util.fibon(3));
        assertEquals(3, Util.fibon(4));
        assertEquals(5, Util.fibon(5));
        assertEquals(8, Util.fibon(6));
        assertEquals(13, Util.fibon(7));
        assertEquals(21, Util.fibon(8));
        assertEquals(34, Util.fibon(9));
    }

    /** Test some arbitrary index values. */
    @Test
    public void fibonArbIndexTest() {
        assertEquals(4181, Util.fibon(19));
        assertEquals(75025, Util.fibon(25));
        assertEquals(1346269, Util.fibon(31));
        assertEquals(24157817, Util.fibon(37));
        assertEquals(102334155, Util.fibon(40));
        assertEquals(12586269025L, Util.fibon(50));
    }
}
