package com.greatlearning.binarysearchtree;

import java.util.Stack;

public class BalanceBracketsService {
	
	static Stack stack = new Stack<>();
	
	static boolean BalanceBracket(String input) {
		for (int i = 0; i < input.length(); i++) {
			char bracket = input.charAt(i);
			if( bracket == '(' || bracket == '[' || bracket == '{') {
				stack.push(bracket);
			}
			
			if( stack.isEmpty()) {
				return false;
			}
			
			char checkBrackets;
            switch (bracket) {
            case ')':
            	checkBrackets = (char) stack.pop();
                if (checkBrackets == '{' || checkBrackets == '[')
                    return false;
                break;
 
            case '}':
            	checkBrackets = (char) stack.pop();
                if (checkBrackets == '(' || checkBrackets == '[')
                    return false;
                break;
 
            case ']':
            	checkBrackets = (char) stack.pop();
                if (checkBrackets == '(' || checkBrackets == '{')
                    return false;
                break;
            }
			
			
			
			
		}
		return stack.isEmpty();
		
		
	}
	
	

}
