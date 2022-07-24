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
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2 = Inorder(root, list1);
		
		int start = 0;
		int end = list2.size() - 1;
		
		while(start < end) {
			if( list2.get(start) + list2.get(end) == sum) {
				System.out.println("Pair is (" + list2.get(start) + "," + list2.get(end) + ")");
				return true;
			}
			 if (list2.get(start) + list2.get(end) > sum) // decrements end
	            {
	                end--;
	            }
	 
	            if (list2.get(start) + list2.get(end) < sum) // increments start
	            {
	                start++;
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

	

}
