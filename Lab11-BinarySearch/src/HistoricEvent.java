//-------------------------------------------------------------------------
/**
 * Represents one event in a historical timeline.
 *
 * @author  Seth Balodi
 * @version 2014.04.18
 */
public class HistoricEvent implements Comparable<HistoricEvent>
{
    //~ Instance/static variables .............................................

    private int year;
    private String title;
    private String description;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new HistoricEvent without a description.
     * @param year The year the event occurred (A.D.)
     * @param title The title of the event
     */
    public HistoricEvent(int year, String title)
    {
        this(year, title, null);
    }


    // ----------------------------------------------------------
    /**
     * Create a new HistoricEvent.
     * @param year The year the event occurred (A.D.)
     * @param title The title of the event
     * @param description The description for the event
     */
    public HistoricEvent(int year, String title, String description)
    {
        assert title != null : "The title cannot be null";

        this.year        = year;
        this.title       = title;
        this.description = description;
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Get this event's year.
     * @return This event's year.
     */
    public int getYear()
    {
        return year;
    }


    // ----------------------------------------------------------
    /**
     * Get this event's title.
     * @return This event's title, which may be null.
     */
    public String getTitle()
    {
        return title;
    }


    // ----------------------------------------------------------
    /**
     * Get this event's description.
     * @return This event's description, which may be null.
     */
    public String getDescription()
    {
        return description;
    }


    // ----------------------------------------------------------
    /**
     * Generate a human-readable representation of this event.
     * @return This event in string form.
     */
    public String toString()
    {
        // When concatenating many strings to produce a result, it is more
        // efficient to use a string builder, rather than using '+' on strings.
        StringBuilder result = new StringBuilder();

        result.append('[');
        result.append(year);
        result.append("] ");
        result.append(title);
        if (description != null)
        {
            result.append(": ");
            result.append(description);
        }
        return result.toString();
    }

    /**
     * this method is used to compare a value to another value to return
     * if the value is greater than, equal to, or less than a value.
     * @param  event is the particular event that we are going to
     * compare to something else
     *
     * @return returns the result of the comparison
     */
    @Override
    public int compareTo(HistoricEvent event)
    {
        if (year == event.getYear())
        {
            return title.compareTo(getTitle());
        }
        else
        {
            return year - event.getYear();
        }
    }
}
