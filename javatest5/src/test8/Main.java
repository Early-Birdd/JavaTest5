package test8;

import java.util.*;

class Person{
	int id;
	int danger;
	public Person(int id, int danger) {
		this.id = id;
		this.danger = danger; 
	}
}

public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			Q.offer(new Person(i,arr[i]));
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.danger>tmp.danger) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) {
					return answer;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
