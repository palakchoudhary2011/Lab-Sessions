package com.greatlearning.binarysearchtree;

public class FindBinaryTreeNodeFromGivenSumDriver {

	static Node root;
	public static void main(String args[]) {
		int sum = 130;
		
		FindBinaryTreeNodeFromGivenSumService node = new FindBinaryTreeNodeFromGivenSumService();
		
		/*
		 root = new Node(40);
		root.left = new Node(20);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(50);
		root.right.right = new Node(70);
		*/
		
		root = node.insert(root, 40);
		root = node.insert(root, 20);
		root = node.insert(root, 60);
		root = node.insert(root, 10);
		root = node.insert(root, 30);
		root = node.insert(root, 50);
		root = node.insert(root, 70);
		
		node.FindNodes(root, sum);
		
	}
}
