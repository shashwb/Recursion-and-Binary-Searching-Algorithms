import java.util.HashMap;

// -------------------------------------------------------------------------
/**
 * An implementation of the Levenshtein distance algorithm.
 *
 * @author Seth Balodi <shashwb@vt.edu>
 * @version 2014.04.11
 */
public class Levenshtein
{
    // ~ Fields ..........................................................

    private String                   str1;
    private String                   str2;
    private HashMap<String, Integer> hashMap;


    // ~ Constructors ....................................................

    // ----------------------------------------------------------
    /**
     * Create a new Levenshtein object.
     *
     * @param a
     *            the first string
     * @param b
     *            the second string
     */
    public Levenshtein(String a, String b)
    {

        str1 = a;
        str2 = b;
        hashMap = new HashMap<String, Integer>();

    }


    // ~ Methods .........................................................

    /**
     * this is a private method that gives a distance
     */
    private int distance(int c1, int len1, int c2, int len2)
    {

        String answer = c1 + "," + len1 + "," + c2 + "," + len2 + ",";

        if (hashMap.containsKey(answer))
        {
            return hashMap.get(answer);
        }
        else if (len1 == 0)
        {
            hashMap.put(answer, len2);
            return len2;
        }
        else if (len2 == 0)
        {
            hashMap.put(answer, len1);
            return len1;
        }
        else
        {
            int distance1 = distance(c1 + 1, len1 - 1, c2 + 1, len2 - 1);
            if (str1.charAt(c1) != str2.charAt(c2))
            {
                distance1++;
            }
            int distance2 = distance(c1, len1, c2 + 1, len2 - 1) + 1;
            int distance3 = distance(c1 + 1, len1 - 1, c2, len2) + 1;

            hashMap.put(
                answer,
                Math.min(Math.min(distance1, distance2), distance3));
            return Math.min(Math.min(distance1, distance2), distance3);
        }

    }


    // ----------------------------------------------------------
    /**
     * This method is used to return the results of the recursion method
     * outlined above
     *
     * @return returns the distance outlined for the strings
     */
    public int distance()
    {
        return distance(0, str1.length(), 0, str2.length());
    }

}
