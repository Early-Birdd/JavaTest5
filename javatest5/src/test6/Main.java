package test6;

import java.util.*;
public class Main {

	public int solution(int n , int m) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			Q.offer(i);
		}
		while(!Q.isEmpty()) {
			for(int j=1; j<m; j++) {
				Q.offer(Q.poll());
			}
			Q.poll();
			if(Q.size()==1) {
				answer+=Q.poll();
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.print(T.solution(n, m));
	}

}
