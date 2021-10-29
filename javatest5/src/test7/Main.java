package test7;

import java.util.*;
public class Main {

	public String solution(String strs, String strl) {
		String answer = "";
		Queue<Character> Q = new LinkedList<>();
		for(char x : strs.toCharArray()) {
			Q.offer(x);
		}
		for(char y : strl.toCharArray()) {
			if(Q.contains(y)) {
				if(y!=Q.poll()) {
					return "NO";
				}
			}	
		}
		if(!Q.isEmpty()) {
			return "NO";
		}
		answer+="YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String strs = in.next();
		String strl = in.next();
		System.out.print(T.solution(strs, strl));
	}

}
