import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June1189 {

	// 선언
	static int R, C, K;
	static char arr[][];
	static int visited[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static int cnt;

	// 재귀함수
	static void dfs(int y, int x, int lev) {
		visited[y][x] = 1;
		if (lev == K) {
			if (y == 0 && x == C - 1) {
				System.out.println("y:" + y + " x:"+x);
				System.out.println(cnt);
				cnt++;
			}
			return;
		}

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < R && nx >= 0 && nx < C && arr[ny][nx] != 'T' && visited[ny][nx] == 0) {
//				System.out.println("ny:" + ny + "nx:" + nx + "lev:" + lev);
				dfs(ny, nx, lev + 1);
				visited[y][x] = 0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		R = Integer.parseInt(str[0]);
		C = Integer.parseInt(str[1]);
		K = Integer.parseInt(str[2]);
		arr = new char[R][C];
		visited = new int[R][C];

		// 정보입력
		for (int i = 0; i < R; i++) {
			String st = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = st.charAt(j);
			}
		}

		// 재귀함수 들어가기
		dfs(R - 1, 0, 1);

		// 출력
		System.out.println(cnt);
	}

}
