import student.TestCase;

// -------------------------------------------------------------------------
/**
 * This class is used to provide test cases for the BinaryTree class
 *
 * @author Seth Balodi <shashwb>
 * @version Apr 25, 2014
 */
public class BinaryTreeTest
    extends TestCase
{

    private BinaryTree<String> binaryTree;


    /**
     * this is the setUp method for the TestBinaryTree method which tests the
     * methods in the BinaryTree class
     */
    public void setUp()
    {
        binaryTree = new BinaryTree<String>("original");
    }


    // ----------------------------------------------------------
    /**
     * This test case is used to test the size method of the BinaryTree class
     */
    public void testSize()
    {
        assertEquals(1, binaryTree.size());

        BinaryTree<String> leftValue = new BinaryTree<String>("left");
        binaryTree.setLeft(leftValue);
        assertEquals(2, binaryTree.size());

        BinaryTree<String> rightValue = new BinaryTree<String>("right");
        binaryTree.setRight(rightValue);
        assertEquals(3, binaryTree.size());
    }


    // ----------------------------------------------------------
    /**
     * This test case is used to test the height method of the BinaryTree class
     */
    public void testHeight()
    {
        assertEquals(1, binaryTree.height());

        BinaryTree<String> leftValue = new BinaryTree<String>("left");
        binaryTree.setLeft(leftValue);
        assertEquals(2, binaryTree.height());

        BinaryTree<String> rightValue = new BinaryTree<String>("right");
        binaryTree.setRight(rightValue);
        assertEquals(2, binaryTree.height());

        BinaryTree<String> secondLeft = new BinaryTree<String>("secondLeft");
        binaryTree.getLeft().setLeft(secondLeft);
        assertEquals(3, binaryTree.height());

        BinaryTree<String> secondRight = new BinaryTree<String>("secondRight");
        binaryTree.getRight().setRight(secondRight);
        assertEquals(3, binaryTree.height());

    }


    // ----------------------------------------------------------
    /**
     * This test case is used to test the clone method of the BinaryTree class
     */
    public void testClone()
    {
        binaryTree.setElement("top");
        assertEquals("top", binaryTree.getElement());
        assertEquals(binaryTree.clone().getElement(), binaryTree.getElement());

        BinaryTree<String> addLeft = new BinaryTree<String>("left");
        binaryTree.setLeft(addLeft);
        assertEquals(binaryTree.getElement(), binaryTree.clone().getElement());
        assertEquals(binaryTree.clone().getLeft().getElement(), binaryTree
            .getLeft().getElement());

        BinaryTree<String> addRight = new BinaryTree<String>("right");
        binaryTree.setRight(addRight);
        assertEquals(binaryTree.getElement(), binaryTree.clone().getElement());
        assertEquals(binaryTree.clone().getRight().getElement(), binaryTree
            .getRight().getElement());
    }


    // ----------------------------------------------------------
    /**
     * this test case is used to test the toPreOrderString method of the
     * BinaryTree class
     */
    public void testToPreOrderString()
    {
        assertEquals("(original)", binaryTree.toPreOrderString());

        BinaryTree<String> addLeft = new BinaryTree<String>("left");
        binaryTree.setLeft(addLeft);
        assertEquals("(original (left))", binaryTree.toPreOrderString());

        BinaryTree<String> addRight = new BinaryTree<String>("right");
        binaryTree.setRight(addRight);
        assertEquals("(original (left) (right))",
            binaryTree.toPreOrderString());

    }


    // ----------------------------------------------------------
    /**
     * This test case is used to test the toInOrderString method of the
     * BinaryTree class
     */
    public void testToInOrderString()
    {
        assertEquals("(original)", binaryTree.toPreOrderString());

        BinaryTree<String> addLeft = new BinaryTree<String>("left");
        binaryTree.setLeft(addLeft);
        assertEquals("((left) original)", binaryTree.toInOrderString());

        BinaryTree<String> addRight = new BinaryTree<String>("right");
        binaryTree.setRight(addRight);
        assertEquals("((left) original (right))", binaryTree.toInOrderString());

    }


    // ----------------------------------------------------------
    /**
     * This test case is used to test the toPostOrderString method of hte
     * BinaryTree class
     */
    public void testToPostOrderString()
    {
        assertEquals("(original)", binaryTree.toPreOrderString());

        BinaryTree<String> addLeft = new BinaryTree<String>("left");
        binaryTree.setLeft(addLeft);
        assertEquals("((left) original)", binaryTree.toPostOrderString());

        BinaryTree<String> addRight = new BinaryTree<String>("right");
        binaryTree.setRight(addRight);
        assertEquals(
            "((left) (right) original)",
            binaryTree.toPostOrderString());
    }

}
