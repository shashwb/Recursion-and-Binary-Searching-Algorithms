import static org.junit.Assert.*;
import org.junit.Test;


// -------------------------------------------------------------------------
/**
 *  This class is used to test the Expressions class and the methods contained
 *  within it
 *
 *  @author Seth Balodi
 *  @version Apr 25, 2014
 */
public class ExpressionsTest extends student.TestCase
{

    // ----------------------------------------------------------
    /**
     * This method is used to test the Expressions class
     */
    @Test
    public void test()
    {
        Expressions.main(null);
        assertTrue(systemOut().getHistory().contains(
            "(((a) - (b)) * (((c) + (d)) / (e)))"));

        new Expressions();

    }

}
