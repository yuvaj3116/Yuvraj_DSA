package com.yuvraj;


class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinarySearchTreeExample {
    Node root;

    // Insert method
    void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive insert method
    Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }


    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTreeExample bst = new BinarySearchTreeExample();

        
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);

        System.out.println("Inorder traversal of BST:");
        bst.inorder(bst.root);  
    }
}



