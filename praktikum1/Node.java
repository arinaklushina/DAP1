/*
 * Node class for RB-trees implementation
 */
public class Node
{
    int data;

      Node left;
      Node right;
      Node parent;
    
      boolean color;
    
      public Node(int data) {
        this.data = data;
      }
}
