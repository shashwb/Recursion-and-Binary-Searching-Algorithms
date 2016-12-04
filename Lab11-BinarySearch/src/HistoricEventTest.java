import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Tests for the {@link HistoricEvent} class.
 *
 * @author Seth Balodi shashwb@vt.edu
 * @version 2014.04.18
 */
public class HistoricEventTest
    extends TestCase
{
    // ~ Instance/static variables .............................................

    private HistoricEvent       event;

    private static final String TITLE   = "CS 2114 Lab";
    private static final String MESSAGE =
        "I went to lab today, and I didn't even get a T-shirt.";


    // ~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new test class
     */
    public HistoricEventTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    // ~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Starting conditions for all tests in this class.
     */
    public void setUp()
    {
        event = new HistoricEvent(2010, TITLE, MESSAGE);
    }


    // ----------------------------------------------------------
    /**
     * Test the constructor and accessors.
     */
    public void testAccessors()
    {
        assertEquals(2010, event.getYear());
        assertEquals(TITLE, event.getTitle());
        assertEquals(MESSAGE, event.getDescription());
    }


    // ----------------------------------------------------------
    /**
     * Test toString() on the event created in setUp().
     */
    public void testToString()
    {
        assertEquals("[2010] " + TITLE + ": " + MESSAGE, event.toString());
    }


    // ----------------------------------------------------------
    /**
     * Test toString() on an event with a null title.
     */
    public void testToString2()
    {
        event = new HistoricEvent(2010, MESSAGE);
        assertEquals("[2010] " + MESSAGE, event.toString());
    }


    // ----------------------------------------------------------
    /**
     * Test toString() on an event with a null description.
     */
    public void testToString3()
    {
        event = new HistoricEvent(2010, TITLE, null);
        assertEquals("[2010] " + TITLE, event.toString());
    }


    // ----------------------------------------------------------
    /**
     * Test the compareTo() method
     */
    public void testCompareTo()
    {

        assertEquals(0,
            event.compareTo(new HistoricEvent(1982, "Commodore 64")));

        assertEquals(490,
            event.compareTo(new HistoricEvent(1492, "Leonardo da Vinci")));

        assertEquals(-23, event.compareTo(new HistoricEvent(2005,
            "September 12: eBay acquires Skype")));

    }
}
