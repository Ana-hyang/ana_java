import java.io.*;
import java.util.*;

public class DFS {
	static int n, m, v;
	static int graph[][];
	static int visited[];

	static void dfs(int start) {
		// 함수 전 할 일
		System.out.print(start + " ");
		visited[start] = 1;
		// 재귀함수 들어갈 때
		for (int i = 0; i < n + 1; i++) {
			if (visited[i] == 0 && graph[start][i] == 1)
				dfs(i);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 숫자 세개 받기
		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		v = Integer.parseInt(str.split(" ")[2]);

		// 이차원 배열 입력받기
		int arr[][] = new int[m][2];
		graph = new int[n + 1][n + 1];
		visited = new int[n + 1];
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			int from = Integer.parseInt(s.split(" ")[0]);
			int to = Integer.parseInt(s.split(" ")[1]);
			graph[from][to] = 1;
			graph[to][from] = 1;

		}

		dfs(v);
	}

}
