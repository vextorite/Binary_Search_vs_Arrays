// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTreeNode
{
   String data;
   BinaryTreeNode left;
   BinaryTreeNode right;
   
   public BinaryTreeNode ( String d, BinaryTreeNode l, BinaryTreeNode r )
   {
      data = d;
      left = l;
      right = r;
   }
   
   BinaryTreeNode getLeft () { return left; }
   BinaryTreeNode getRight () { return right; }
}
