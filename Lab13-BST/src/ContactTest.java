import static org.junit.Assert.*;
import student.TestCase;
import org.junit.Test;


// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author sethbalodi
 *  @version May 1, 2014
 */
public class ContactTest extends TestCase
{


    private Contact con1;
    private Contact con2;
    private Contact con3;
    private Contact con4;

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     */
    public void setUp()
    {

        String string1 = "1";
        String string2 = "11";
        String string3 = "111";
        String string4 = "1111";
        String string5 = "11111";
        String string6 = "111111";
        String string7 = "1111111";

        con1 = new Contact(string1, string2, string3);
        con2 = new Contact(string1, string2, string4);
        con3 = new Contact(string1, string5, string3);
        con4 = new Contact(string2, string6, string7);


    }



    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     */
    @Test
    public void test()
    {
        assertEquals(con1.compareTo(con1), 0);
        assertTrue(con1.compareTo(con2) > 0);
        assertTrue(con1.compareTo(con3) > 0);
        assertTrue(con1.compareTo(con4) > 0);
    }

}
