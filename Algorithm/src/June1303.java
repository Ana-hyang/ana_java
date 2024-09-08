import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June1303 {

	static int N, M;
	static char arr[][];
	static boolean[][] visited;
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static int cnt;

	static void dfs(int y, int x, char Team) {
		visited[y][x] = true;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < N && nx >= 0 && nx < M && arr[ny][nx] == Team && !visited[ny][nx]) {
				dfs(ny, nx, Team);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// 입력받기 N,M, 배열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		arr = new char[N][M];
		visited = new boolean [N][M];

		for (int i = 0; i < N; i++) {
			String st = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = st.charAt(j);
			}
		}
		// dfs
		int sumW = 0;
		int sumB = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visited[i][j]) {
					cnt = 0;
					dfs(i, j, arr[i][j]);
					if (arr[i][j] == 'W') {
						sumW += cnt * cnt;
					} else {
						sumB += cnt * cnt;
					}					
				}
			}
		}

		// 출력
		System.out.println(sumW + " " + sumB);
	}

}
