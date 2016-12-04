// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Seth Balodi
 * @version 2014.04.18
 */
public class EventFinder
{

    // ----------------------------------------------------------
    /**
     * This is the find method for the EventFinder class which will use
     * recursion.
     *
     * @param target
     *            the target we are going for
     * @param array
     *            the HistoricEvent array
     * @param start
     *            the start of the array
     * @param end
     *            the end of the array
     * @return returns an int which tells the position of a value through the
     *         binary search
     */
    public int find(
        HistoricEvent target,
        HistoricEvent[] array,
        int start,
        int end)
    {
        // find(target, array, 0, 200)
        // ...
        // find(target, array, 100, 100)
        if (start == end) {
            // we couldn't find it
            return start;
        }


        // find(target, array, 0, 10)
        // find(target, array, 5, 10)
        // find(target, array, 7, 10)
        // find(target, array, 7, 8)

        if (end - start == 1)
        {
            HistoricEvent lastEventThatWeAreComparing = array[start];
            int result = target.compareTo(lastEventThatWeAreComparing);

            if (result == 0)
            {
                return start;
            }
            else if (result < 0)
            {
                // still couldn't find it
                return start;
            }
            else
            {
                // result > 0
                return end;
            }
        }

        // recursive binary search

        int mid = start + (end - start) / 2;
        HistoricEvent eventAtMid = array[mid];

        int result1 = target.compareTo(eventAtMid);

        if (result1 < 0)
        {
            return find(target, array, start, mid);
        }
        else if (result1 > 0)
        {
            return find(target, array, mid + 1, end);
        }
        else
        {
            return mid;
        }

    }

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param target    this is the target we are looking for
     * @param array     this is the array that we are using
     * @return          this returns the position of the target
     */
    public int find(HistoricEvent target,
        HistoricEvent[] array)
    {
        return this.find(target, array, 0, array.length);
    }

}
