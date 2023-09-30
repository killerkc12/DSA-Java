package com.killer.binaryTree;

public class BinaryTree {

    public Node createNewNode(int data){
        Node node = new Node();
        node.value = data;
        node.left=node.right = null;
        return node;
    }

    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");

    }

    public int sumOfTree(Node node) {
        if(node==null){
            return 0;
        }
        return node.value + sumOfTree(node.left) + sumOfTree(node.right);
    }

    public int numberOfNodes(Node node){
        if(node==null){
            return 0;
        }
        return 1 + numberOfNodes(node.left) + numberOfNodes(node.right);
    }

    public int numberOfLeafNodes(Node node) {
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }
        return numberOfLeafNodes(node.left) + numberOfLeafNodes(node.right);
    }

    public int heightOfTreeOrNode(Node node) {
        if (node==null){
            return -1;
        }
        return Math.max(heightOfTreeOrNode(node.left),heightOfTreeOrNode(node.right))+1;
    }

    public void printAtGivenLevel(Node node, int level) {
        if(node==null){
            return;
        }
        if(level==1){
            System.out.print(node.value+" ");
        }
        printAtGivenLevel(node.left,level-1);
        printAtGivenLevel(node.right,level-1);
    }

    public void levelOrderTraversal(Node node) {
        if(node==null){
            return;
        }

        int h = heightOfTreeOrNode(node);
        for(int i=0;i<=h;i++){
            printAtGivenLevel(node,i+1);
            System.out.println();
        }
    }

    public void reverseLevelOrderTraversal(Node node) {
        if(node==null){
            return;
        }
        int h = heightOfTreeOrNode(node);
        for(int i=h;i>=0;i--){
            printAtGivenLevel(node,i+1);
            System.out.println();
        }
    }

    Node mirrorTree(Node node) {
        if(node==null){
            return null;
        }
        Node temp = node.left;
        node.left = node.right;
        node.right=temp;

        mirrorTree(node.left);
        mirrorTree(node.right);

        return node;
    }

    public Node deleteTree(Node node) {
        if(node==null){
            return null;
        }
        node.left=deleteTree(node.left);
        node.right=deleteTree(node.right);

        System.out.println("Deleting node : "+node.value);
        node = null;
        return node;
    }

     boolean isIdentical(Node root, Node root1) {
        if(root==null && root1==null){
            return true;
        }
        if (root==null || root1==null){
            return  false;
        }
        return root.value==root1.value && isIdentical(root.left,root1.left) && isIdentical(root.right,root1.right);
    }

}

