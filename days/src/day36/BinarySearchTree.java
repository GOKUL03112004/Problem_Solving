package day36;


public class BinarySearchTree {
    Node root;
    int count;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int n){
            this.data=n;
        }
    }

    Node insert(int n, Node root){
        if(root==null){
            root=new Node(n);

        } else if (n<= root.data) {
            root.left=insert(n,root.left);
        }
        else if (n>root.data){
            root.right=insert(n,root.right);
        }
        return root;
    }

    Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        // Step 1: Search for the node to delete
        if (key < root.data) {
            root.left = delete(root.left, key);  // Move left
        } else if (key > root.data) {
            root.right = delete(root.right, key); // Move right
        } else {
            // Node found - Handle deletion

            // Case 1: No child (Leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = minValue(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    void inorder(Node root){
        if(root==null){
            return;
        }
        else {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    int count(Node r){
        int c=0;
        if(null == r) return 0;
        else {
            return count(r.left)+count(r.right)+1;
        }
    }

    void rev_inorder(Node r){
        if(r==null){
            return;
        }
        rev_inorder(r.right);
        System.out.println(r.data);
        rev_inorder(r.left);
    }

    Node minValue(Node root){
        if(root==null){
            return null;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    Node maxValue(Node root){
        if(root==null){
            return null;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }
    public static void main(String[] args) {
        BinarySearchTree s = new BinarySearchTree();
        s.root=s.insert(2,s.root);
        s.insert(5,s.root);
        s.insert(5,s.root);
        s.insert(7,s.root);
       s.insert(1,s.root);
        s.inorder(s.root);
        System.out.println("reverse");
        s.rev_inorder(s.root);
        System.out.println("Min");
        System.out.println(s.minValue(s.root).data);
        System.out.println("Max");
        System.out.println(s.maxValue(s.root).data);

        s.delete(s.root,5);
        System.out.println("After deletion");
        s.inorder(s.root);
        System.out.println("Count:");
        System.out.print(s.count(s.root));

    }
}
