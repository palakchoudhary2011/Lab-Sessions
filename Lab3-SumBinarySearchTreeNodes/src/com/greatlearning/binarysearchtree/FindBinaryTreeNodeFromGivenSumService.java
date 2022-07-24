package com.greatlearning.binarysearchtree;

import java.util.ArrayList;

class Node{
	int key;
	Node left;
	Node right;
	
	  Node(int d)
	    {
	        key = d;
	        left = right = null;
	    }
	
}
public class FindBinaryTreeNodeFromGivenSumService {

	Node root;
	
	public boolean FindNodes(Node root, int sum) {
		if( root == null) {
			return false;
		}
		ArrayList<Integer> list = new ArrayList<>();
		
		list = Inorder(root, list);
		
		int startIndex = 0;
		int lastIndex = list.size() - 1;
		
		while(startIndex < lastIndex) {
			if( list.get(startIndex) + list.get(lastIndex) == sum) {
				System.out.println("Sum :" + sum);
				System.out.println("Pair is (" + list.get(startIndex) + "," + list.get(lastIndex) + ")");
				return true;
			}
			 if (list.get(startIndex) + list.get(lastIndex) > sum){
	                lastIndex--;
	            }
	 
	            if (list.get(startIndex) + list.get(lastIndex) < sum){
	                startIndex++;
	            }
		}
		 System.out.println("Nodes are not found.");
	        return false;
	}
	
	ArrayList<Integer> Inorder(Node root, ArrayList<Integer> list){
		if( root == null) {
			return list; 
		}
		Inorder(root.left, list);
		list.add(root.key);
		Inorder(root.right, list);
		
		return list;
	}

	static Node insert(Node root, int key) {
		
		if( root == null) {
			root = new Node(key);
			return root;
		}
		
		if( key < root.key) {
			root.left = insert( root.left, key);
		} else if( key > root.key) {
			root.right = insert(root.right, key);
		}
		
		return root;
			
	}
		
	
}
