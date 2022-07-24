package com.greatlearning.binarysearchtree;

public class BalanceBracketsDriver {

	
	public static void main(String args[]) {
		
		BalanceBracketsService bracket = new BalanceBracketsService();
		String str = "([[{}]]))";
        if (bracket.BalanceBracket(str))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
		
	}
	
	
}
