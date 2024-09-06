import java.io.*;
import java.util.*;

public class Jun2667 {

	static int N;
	static int arr[][];
	static int visited[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static int cnt;

	static void dfs(int y, int x) {
		visited[y][x] = 1;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < N && nx >= 0 && nx < N && arr[ny][nx] == 1 && visited[ny][nx] == 0) {
				dfs(ny, nx);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new int[N][N];
		// 입력받기
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}

		// 재귀함수 들어가기
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1 && visited[i][j] == 0) {
					cnt = 0;
					dfs(i, j);
					// 배열에 받기					
					al.add(cnt);
				}
			}
		}

		
		Collections.sort(al);
		// 출력하기
		System.out.println(al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
