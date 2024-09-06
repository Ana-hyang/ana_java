import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June11724 {

	static int N, M;
	static int arr[][], visited[];

	static void dfs(int start) {
		visited[start] = 1;

		for (int i = 1; i <= N; i++) {
			if (arr[start][i] == 1 && visited[i] == 0) {
				dfs(i);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		arr = new int[N + 1][N + 1];
		visited = new int[N + 1];
		int cnt = 0;
		for (int i = 0; i < M; i++) {
			String st[] = br.readLine().split(" ");
			int from = Integer.parseInt(st[0]);
			int to = Integer.parseInt(st[1]);
			arr[from][to] = 1;
			arr[to][from] = 1;
		}

		for (int i = 1; i <= N; i++) {
			if (visited[i] == 0) {
				cnt++;
				dfs(i);
			}
		}
		//출력하기
		System.out.println(cnt);
	}

}
