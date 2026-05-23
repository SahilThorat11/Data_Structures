// P11 - Binary Search Tree (insert, search, inorder)
class Program11 
{
    static class Node 
    { 
        int data; 
        Node left, 
        right; 

        Node(int d) 
        { 
            data = d; 
        } 
    }

    static Node insert(Node root, int val) 
    {
        if(root == null) 
        {
            return new Node(val);
        }

        if(val < root.data) 
        {
            root.left = insert(root.left, val);
        }
        else if(val > root.data) 
        {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static boolean search(Node root, int val) 
    {
        if(root == null) 
        {
            return false;
        }

        if(root.data == val) 
        {
            return true;
        }

        return val < root.data ? search(root.left, val) : search(root.right, val);
    }

    static void inorder(Node root) 
    {
        if (root == null) 
        {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) 
    {
        Node root = null;

        for(int v : new int[]{5, 3, 7, 1, 4, 6, 8}) 
        {
            root = insert(root, v);
        }
        System.out.print("Inorder: "); 
        inorder(root); System.out.println();

        System.out.println("Search 4: " + search(root, 4));
        System.out.println("Search 9: " + search(root, 9));
    }
}
