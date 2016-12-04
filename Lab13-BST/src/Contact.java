// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Seth Balodi <shashwb@vt.edu>
 * @version 05/01/2014
 */
public class Contact
    implements Comparable<Contact>
{

    private String nameFirst;
    private String nameLast;
    private String phone;


    // ----------------------------------------------------------
    /**
     * This method is used as a constructor the the class
     *
     * @param first
     *            is the nameFirst string
     * @param last
     *            is the nameLast string
     * @param number
     *            is the phone string
     */
    public Contact(String first, String last, String number)
    {

        nameFirst = first;
        nameLast = last;
        phone = number;

    }


    public int compareTo(Contact contInfo)
    {

        if (contInfo.getLast().compareTo(nameLast) == 0)
        {
            if (contInfo.getFirst().compareTo(nameFirst) == 0)
            {
                return contInfo.getNumber().compareTo(phone);
            }
            else
            {
                return contInfo.getFirst().compareTo(nameFirst);
            }
        }
        else
        {
            return contInfo.getLast().compareTo(nameLast);
        }

    }


    // ----------------------------------------------------------
    /**
     * This is a get method that returns the contact's first name
     * @return the contact's first name
     */
    public String getFirst()
    {
        return nameFirst;
    }

    // ----------------------------------------------------------
    /**
     * This is a get method that returns the contact's last name
     * @return the contact's last name
     */
    public String getLast()
    {
        return nameLast;
    }

    // ----------------------------------------------------------
    /**
     * This is a get method that returns the contact's phone number
     * @return the contact's phone number
     */
    public String getNumber()
    {
        return phone;
    }

}
