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
			
			char check;
            switch (bracket) {
            case ')':
                check = (char) stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = (char) stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = (char) stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
			
			
			
			
		}
		return stack.isEmpty();
		
		
	}
	
	

}
