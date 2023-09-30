package com.killer.binaryTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.createNewNode(10);
         root.left = tree.createNewNode(20);
         root.left.left = tree.createNewNode(130);
         root.left.right = tree.createNewNode(40);
         root.right = tree.createNewNode(50);
         root.right.left = tree.createNewNode(60);
         root.right.right = tree.createNewNode(70);

        Node root1 = tree.createNewNode(20);
        root1.left = tree.createNewNode(20);
        root1.left.left = tree.createNewNode(130);
        root1.left.right = tree.createNewNode(40);
        root1.right = tree.createNewNode(50);
        root1.right.left = tree.createNewNode(60);
        root1.right.right = tree.createNewNode(70);

        System.out.println("Identical : "+ tree.isIdentical(root,root1));


        System.out.print("InOrder : ");
         tree.inOrder(root);
        System.out.println();

        System.out.print("PreOrder : ");
        tree.preOrder(root);
        System.out.println();

        System.out.print("PostOrder : ");
        tree.postOrder(root);
        System.out.println();

        System.out.println("Sum of Tree : "+tree.sumOfTree(root));;

        System.out.println("Total Number of Nodes : "+tree.numberOfNodes(root));

        System.out.println("Total Number of Leaf Nodes : "+tree.numberOfLeafNodes(root));

        System.out.println("Total height of Tree/Node : "+tree.heightOfTreeOrNode(root));

        tree.printAtGivenLevel(root,3);
        System.out.println();

        System.out.println("Tranversal : ");
        tree.levelOrderTraversal(root);

        System.out.println("Reverse Tranversal : ");
        tree.reverseLevelOrderTraversal(root);

        System.out.println("Mirror Tree : ");
        tree.levelOrderTraversal(tree.mirrorTree(root));

        System.out.println("Delete Tree : ");
        System.out.println(tree.deleteTree(root));

    }



}
