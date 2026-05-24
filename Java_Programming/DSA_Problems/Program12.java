// P12 - Level Order Traversal (BFS on Binary Tree)
import java.util.*;

class Program12 
{
    static class Node 
    { 
        int data; Node left, right; Node(int d) 
        { 
            data = d; 
        } 
    }

    static void levelOrder(Node root) 
    {
        if (root == null) 
        {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) 
        {
            Node cur = q.poll();
            System.out.print(cur.data + " ");
            if(cur.left != null)
            {
                q.add(cur.left);
            }
            if(cur.right != null) 
            {
                q.add(cur.right);
            }
        }
    }

    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4); 
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Level Order: ");

        levelOrder(root);
    }
}
