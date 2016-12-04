import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Test cases for the Levenshtein distance algorithm.
 *
 * @author Seth Balodi     <shashwb@vt.edu>
 * @version 2014.04.11
 */
public class LevenshteinTests
    extends TestCase
{


    // ----------------------------------------------------------
    /**
     * This method tests the base cases of the private distance method
     */
    public void testRecurBaseCase()
    {

        Levenshtein recur = new Levenshtein("a", "");
        assertEquals(1, recur.distance());

        Levenshtein recur2 = new Levenshtein("", "a");
        assertEquals(1, recur2.distance());

        Levenshtein recur3 = new Levenshtein("", "");
        assertEquals(0, recur3.distance());

    }

    // ----------------------------------------------------------
    /**
     * This method is used to test the addition of more complex, yet still
     * simple strings onto the privat distance method.
     */
    public void testRecurStrings()
    {


        Levenshtein recur = new Levenshtein("Tech", "Tech");
        assertEquals(0, recur.distance());

        Levenshtein recur1 = new Levenshtein("Tech", "Team");
        assertEquals(2, recur1.distance());

        Levenshtein recur2 = new Levenshtein("Virginia", "Virginian");
        assertEquals(1, recur2.distance());

        Levenshtein recur3 = new Levenshtein("read", "reading");
        assertEquals(3, recur3.distance());

        Levenshtein recur4 = new Levenshtein("involve", "uninvolve");
        assertEquals(2, recur4.distance());


    }







}
