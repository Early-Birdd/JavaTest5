package test1;

import java.util.*;
public class Main {
	
	public String solution(String str) {
		String answer = " ";
		Stack<Character> s = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') {
				s.push(x);
			}
			else {
				if(s.isEmpty()) {
					return "NO";
				}
				s.pop();
			}
		}
		if(!s.isEmpty()) {
			return "NO";
		}
		answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.print(T.solution(str));
	}

}
