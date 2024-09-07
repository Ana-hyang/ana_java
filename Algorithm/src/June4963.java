import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

public class June4963 {

	static int w, h;
	static int arr[][], visited[][];
	static int dy[] = { -1, 1, 0, 0, -1, 1, -1, 1 };
	static int dx[] = { 0, 0, -1, 1, -1, -1, 1, 1 };
	static int cnt;

	static void dfs(int y, int x) {
		visited[y][x] = 1;
		for (int i = 0; i < 8; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < h && nx >= 0 && nx < w && arr[ny][nx] == 1 && visited[ny][nx] == 0) {
				dfs(ny, nx);
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// w,h 입력 h개 줄에 지도 입력(1,0)
		while (true) {
			String str[] = br.readLine().split(" ");
			w = Integer.parseInt(str[0]);
			h = Integer.parseInt(str[1]);
			if (w == 0 && h == 0) {
				break;
			}
			arr = new int[h][w];
			visited = new int[h][w];
			for (int i = 0; i < h; i++) {
				String st[] = br.readLine().split(" ");
				for (int j = 0; j < w; j++) {
					arr[i][j] = Integer.parseInt(st[j]);
				}
			}
			cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (arr[i][j] == 1 && visited[i][j] == 0) {
					cnt++;
					dfs(i, j);
					}
				}
			}

			System.out.println(cnt);
		}

	}

}
