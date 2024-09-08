import java.io.*;
import java.util.*;

public class June11725 {

	static ArrayList<Integer> list[];
	static int arr[];
	static int N;
	static int visited[];

	static void dfs(int n) {
		visited[n] = 1;
		for (int neighbor : list[n]) {
			if (visited[neighbor] == 0) {
				arr[neighbor] = n;
				dfs(neighbor);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];
		visited = new int[N + 1];

		list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 1; i < N; i++) {
			String str[] = br.readLine().split(" ");
			int from = Integer.parseInt(str[0]);
			int to = Integer.parseInt(str[1]);
			list[from].add(to);
			list[to].add(from);
		}

		// 재귀함수 들어가기
		dfs(1);

		// 출력하기
		for (int i = 2; i <= N; i++) {
			System.out.println(arr[i]);
		}

	}

}
