package test2;

import java.util.*;
public class Main {

	public String solution(String str) {
		String answer = "";
		Stack<Character> s = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x==')') {
				while(s.pop()!='(');
			}
			else {
				s.push(x);
			}
		}
		for(char a : s) {
			answer+=a;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.print(T.solution(str));
	}

}
