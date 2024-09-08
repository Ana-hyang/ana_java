import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class June2210 {

	static int arr[][] = new int[5][5];
	static int num[] = new int[6];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static Set<String> list = new HashSet<>();

	static void dfs(int y, int x, String s, int lev) {
		if (lev == 5) {
			list.add(s);
			System.out.println(list);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < 5 && nx >= 0 && nx < 5) {
				dfs(ny, nx, s + arr[ny][nx], lev + 1);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		// 재귀함수 들어가기, 5번 반복
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				dfs(i, j, "" + arr[i][j], 0);
			}
		}

		System.out.println(list.size());

	}

}
