import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June1743 {

	static int N, M, cnt, max;
	static int arr[][], visited[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };

	static void dfs(int y, int x) {
		visited[y][x] = 1;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < N && nx >= 0 && nx < M && arr[ny][nx] == 1 && visited[ny][nx] == 0) {
				dfs(ny, nx);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력받기
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);

		// 배열값 받기
		arr = new int[N][M];
        visited = new int[N][M];
		for (int i = 0; i < K; i++) {
			String st[] = br.readLine().split(" ");
			int from = Integer.parseInt(st[0])-1;
			int to = Integer.parseInt(st[1])-1;
			arr[from][to] = 1;
		}
		// 재귀함수 들어가기
		max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] == 1 && visited[i][j] == 0) {
					cnt = 0;
					dfs(i, j);					
					if (cnt > max) {
						max = cnt;
					}
				}
			}
		}
		// 가장 큰 음식물의 크기를 출력
		
		System.out.println(max);
	}

}
