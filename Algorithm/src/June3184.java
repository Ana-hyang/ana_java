import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June3184 {

	// 선언
	static int R, C;
	static char[][] arr;
	static int visited[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static int cnto, cntv;

	// 재귀함수
	static void dfs(int y, int x) {
		visited[y][x] = 1;

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < R && nx >= 0 && nx < C && arr[ny][nx] !='#' && visited[ny][nx] == 0) {
				if (arr[ny][nx] == 'o') {
					cnto++;
				} else if(arr[ny][nx]=='v'){
					cntv++;
				}

				dfs(ny, nx);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		R = Integer.parseInt(str[0]);
		C = Integer.parseInt(str[1]);

		// 배열입력받기
		arr = new char[R][C];
		visited = new int[R][C];
		for (int i = 0; i < R; i++) {
			String st = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = st.charAt(j);
			}
		}
		
		// 재귀함수 들어가기
		int sumo = 0;
		int sumv = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (arr[i][j] != '.' && arr[i][j] != '#' && visited[i][j] == 0) {
					cnto = 0;
					cntv = 0;
					dfs(i, j);
					if (cnto > cntv) {
						sumo += cnto;
					} else {
						sumv += cntv;
					}
				}
			}
		}

		// 출력하기
		System.out.println(sumo + " " + sumv);

	}

}
