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
public class BinarySearchTreeTest extends TestCase
{

    private BinarySearchTree<String> binaryTree;
    private String string1;
    private String string2;
    private String string3;
    private String string4;
    private String string5;
    private String string6;
    private String string7;

    /**
     *
     */
    public void setUp()
    {
        string1 = "one";
        string2 = "two";
        string3 = "three";
        string4 = "four";
        string5 = "five";
        string6 = "six";
        string7 = "seven";

        binaryTree = new BinarySearchTree<String>();

        binaryTree.insert(string4);
        binaryTree.insert(string2);
        binaryTree.insert(string6);
        binaryTree.insert(string1);
        binaryTree.insert(string3);
        binaryTree.insert(string5);
        binaryTree.insert(string7);
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     */
    @Test
    public void test()
    {


        binaryTree.remove(string7);
        assertEquals(binaryTree.findMax(), string2);

        binaryTree.remove(string1);
        assertEquals(binaryTree.findMin(), string5);


        binaryTree.remove(string5);
        assertEquals(binaryTree.find(string6), string6);
        assertEquals(binaryTree.findMin(), string4);
        assertEquals(binaryTree.findMax(), string2);

        binaryTree.remove(string2);
        binaryTree.remove(string6);
        binaryTree.remove(string3);

        assertFalse(binaryTree.isEmpty());
        binaryTree.makeEmpty();
        assertNull(binaryTree.findMax());
        assertNull(binaryTree.findMin());
        assertTrue(binaryTree.isEmpty());

    }

}
