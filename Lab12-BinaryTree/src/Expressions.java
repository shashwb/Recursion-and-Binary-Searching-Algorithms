// -------------------------------------------------------------------------
/**
 * This class is used to analyze and print out an expression represented by a
 * binary tree
 *
 * @author Seth Balodi <shashwb>
 * @version Apr 25, 2014
 */
public class Expressions
{

    // ----------------------------------------------------------
    /**
     * This method is used to analyze and print out an expression represented by
     * a binary tree
     *
     * @param args
     *            a method that runs in the expressions class
     */

    public static void main(String[] args)
    {

        BinaryTree<String> left = new BinaryTree<String>("-");
        BinaryTree<String> secondLeft = new BinaryTree<String>("a");
        BinaryTree<String> secondRight = new BinaryTree<String>("b");
        BinaryTree<String> right = new BinaryTree<String>("/");
        BinaryTree<String> rightLeft = new BinaryTree<String>("+");
        BinaryTree<String> rightRight = new BinaryTree<String>("e");
        BinaryTree<String> rightLeftLeft = new BinaryTree<String>("c");
        BinaryTree<String> rightLeftRight = new BinaryTree<String>("d");

        BinaryTree<String> buildTree = new BinaryTree<String>("*", left, right);
        buildTree.getLeft().setLeft(secondLeft);
        buildTree.getLeft().setRight(secondRight);
        buildTree.getRight().setLeft(rightLeft);
        buildTree.getRight().setRight(rightRight);
        buildTree.getRight().getLeft().setLeft(rightLeftLeft);
        buildTree.getRight().getLeft().setRight(rightLeftRight);

        System.out.println(buildTree.toInOrderString());

    }

}
