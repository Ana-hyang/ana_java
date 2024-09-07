import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June2468_1 {
	static int N, arr[][], visited[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
//	static int cnt;

	static void dfs2(int y, int x, int h) {
		visited[y][x] = 1;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < N && nx >= 0 && nx < N && visited[y][x] == 0 && arr[y][x] > h) {
				dfs2(ny, nx, h);
			}
		}
	}

	static int dfs1(int h) {
		// 높이보다 안전한 영역 찾기
		int cnt=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] > h && visited[i][j] == 0) {
					cnt++;
					dfs2(i, j, h);
				}
			}

		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new int[N][N];
		for (int i = 0; i < N; i++) {
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		int max = 0;

		// 높이보다 낮은 안전한 영역을 최대값 찾기
		for (int i = 1; i <= 100; i++) {
//			cnt++;
			int safe = dfs1(i);
			if (safe > max) {
				max = safe;
			}
		}
		System.out.println(max);
	}
}
