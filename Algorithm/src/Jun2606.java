import java.io.*;
import java.util.*;

public class Jun2606 {

	static int N, M;
	static int arr[][];
	static int cnt = 0;
	static int visited[];

	static void dfs(int start) {
		visited[start] = 1;
		cnt++;
		for (int i = 1; i <= N; i++) {
			if (arr[start][i] == 1 && visited[i] == 0)
				dfs(i);
			
		}

	}

	public static void main(String[] args) throws IOException {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		arr = new int[N + 1][N + 1];
		visited = new int[N + 1];
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			int from = Integer.parseInt(str.split(" ")[0]);
			int to = Integer.parseInt(str.split(" ")[1]);
			arr[from][to] = 1;
			arr[to][from] = 1;
		}

		// 재귀함수 부르기
		dfs(1);
		System.out.println(cnt);

	}

}
