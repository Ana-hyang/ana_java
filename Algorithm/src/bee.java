import java.io.*;
import java.util.*;

public class bee {
	static int N, M;
	static int arr[][];
	static int max, fmax;
	static int[][] oddDirections = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }, { 1, -1 }, { -1, -1 }, };
	static int[][] evenDirections = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }, { -1, 1 }, { 1, 1 } };
//	static int dy1[] = { -1, 1, 0, 0, };
//	static int dx1[] = { 0, 0, -1, 1 };
	static int visited[][];

	static void dfs1(int lev, int y, int x) {
		visited[y][x] = 1;
		max += arr[y][x];

		if (lev == 4) {
			if (fmax < max) {
				fmax = max;
			}
			max = 0;
			return;
		}

		if (x % 2 == 1) {
			for (int i = 0; i < oddDirections.length; i++) {
				int ny = y + oddDirections[i][0];
				int nx = x + oddDirections[i][1];
				if (ny >= 0 && ny < N && nx >= 0 && nx < M && visited[ny][nx] == 0) {
					dfs1(lev + 1, ny, nx);
				}			
			}
		} else {
			for (int i = 0; i < evenDirections.length; i++) {
				int ny = y + evenDirections[i][0];
				int nx = x + evenDirections[i][1];
				if (ny >= 0 && ny < N && nx >= 0 && nx < M && visited[ny][nx] == 0) {
					dfs1(lev + 1, ny, nx);
				}			
			}
		}

/*		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < N && nx >= 0 && nx < M && visited[ny][nx] == 0) {
				dfs1(lev + 1, ny, nx);
			}
		}	*/
		visited[y][x] = 0;
	}

	public static void main(String[] args) throws IOException {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			arr = new int[N][M];
			visited = new int[N][M];
			for (int i = 0; i < N; i++) {
				String st = br.readLine();
				for (int j = 0; j < M; j++) {
					arr[i][j] = Integer.parseInt(st.split(" ")[j]);
				}
			}

			// 재귀함수에 들어가기
			fmax = 0;
			max = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {					
					dfs1(1, i, j);
				}
			}
			System.out.println(max);
			System.out.println("#" + tc + " " + fmax);
		}
	}
}
