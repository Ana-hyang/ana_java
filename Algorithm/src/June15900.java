import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class June15900 {

	static int N;
	static ArrayList<Integer> list[];
	static int visited[];
	static int answer = 0;

	static void dfs(int n, int p, int cnt) {
		visited[n] = 1;
		for (int next : list[n]) {
			if (next != p && visited[next] == 0) {
				dfs(next, n, cnt + 1);
			}
		}
		if (list[n].size() == 1 && n != 1) {
			answer += cnt;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		visited = new int[N + 1];

		// 연결정보 받기
		for (int i = 1; i < N; i++) {
			String str[] = br.readLine().split(" ");
			int from = Integer.parseInt(str[0]);
			int to = Integer.parseInt(str[1]);
			list[from].add(to);
			list[to].add(from);
		}

		// 재귀함수 들어가기
		dfs(1, 0, 0);

		if (answer % 2 == 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}
