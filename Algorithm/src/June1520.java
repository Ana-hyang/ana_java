import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June1520 {

	static int M, N;
	static int dp[][], arr[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };

	static int dfs(int y, int x) {
		if (y == M - 1 && x == N - 1) {
			return 1;
		}

		if (dp[y][x] != -1) {
			return dp[y][x];
		}

		dp[y][x] = 0;

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny < 0 || ny >= M || nx < 0 || nx >= N)
				continue;
			if (arr[y][x] <= arr[ny][nx])
				continue;
			dp[y][x] += dfs(ny, nx);
		}

		return dp[y][x];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		// 지도 크기 M N
		M = Integer.parseInt(str[0]);
		N = Integer.parseInt(str[1]);
		arr = new int[M][N];
		dp = new int[M][N];
		// 각 지점의 높이 정보 받기
		for (int i = 0; i < M; i++) {
			String st[] = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st[j]);
				dp[i][j] = -1;
			}
		}
		// 재귀함수 들어가기
		// 이동 가능 경로의 수 출력
		System.out.println(dfs(0, 0));
	}

}
