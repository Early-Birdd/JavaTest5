package test3;

import java.util.*;
public class Main {

	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int x : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][x-1]!=0) {
					if(!stack.isEmpty() && board[i][x-1]==stack.peek()) {
						stack.pop();
						answer+=2;
					}
					else {
						stack.push(board[i][x-1]);
					}
					board[i][x-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = in.nextInt();
			}
		}
		int m = in.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = in.nextInt();
		}
		System.out.print(T.solution(n, board, m, moves));
	}

}
