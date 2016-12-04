
// -------------------------------------------------------------------------
/**
 *  This is a test class for the EventFinder method
 *
 *  @author Seth Balodi
 *  @version 2014.04.18
 */
public class EventFinderTest extends student.TestCase
{

    private HistoricEvent[] arrays;
    private EventFinder eventFinder;


    /**
     * this is the setUp method for the test cases
     */
    public void setUp() {
        arrays = HistoricEvents.TIMELINE;
        this.eventFinder = new EventFinder();
    }
    // ----------------------------------------------------------
    /**
     * This method tests the find method
     */
    public void testFindEventEarilierThanALlOtherEvents()
    {
        HistoricEvent event = new HistoricEvent(10, "Jesus's friend died");

        assertEquals(0, eventFinder.find(event, arrays));

    }

    // ----------------------------------------------------------
    /**
     * this method tests the find method
     */
    public void testFindEventAfterAllOtherEvents() {

        HistoricEvent event = new HistoricEvent(2060, "The Apocalypse");

        assertEquals(128, eventFinder.find(event, arrays));

    }

    // ----------------------------------------------------------
    /**
     * this method tests the find method
     */
    public void testFindInBetweenTheArrayOfEvents()
    {

        HistoricEvent event1 = new HistoricEvent(1956,
            "Optical fiber was invented by  Basil Hirschowitz, "
            + "C. Wilbur Peters, and Lawrence E. Curtiss");

        assertEquals(56, eventFinder.find(event1, arrays));


        HistoricEvent event =  new HistoricEvent(1959, "Paul Baran",
            "Paul Baran theorises on the \"survivability of communication "
            + "systems under nuclear attack\", digital technology and "
            + "symbiosis between humans and machines");

        assertEquals(60, eventFinder.find(event, arrays));

        HistoricEvent event2 = new HistoricEvent(1963, "The Computer Mouse",
            "Douglas Engelbart invents and patents the first computer "
            + "mouse (nicknamed the mouse because the tail came out the end)");

        assertEquals(64, eventFinder.find(event2, arrays));
    }



}
