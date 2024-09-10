import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June1926 {

	// ����
	static int n, m;
	static int arr[][];
	static int visited[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static int size;

	// ����Լ�
	static void dfs(int y, int x) {
		visited[y][x] = 1;
		size++;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < n && nx >= 0 && nx < m && visited[ny][nx] == 0 && arr[ny][nx] == 1) {
//				size++;
				dfs(ny, nx);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		arr = new int[n][m];
		visited = new int[n][m];

		// �迭 ���� �Է�
		for (int i = 0; i < n; i++) {
			String st[] = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st[j]);
			}
		}

		// ����Լ� ����
		int cnt = 0;
		int maxsize = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1 && visited[i][j] == 0) {
					cnt++;
					size = 0;
					dfs(i, j);
					if (size > maxsize) {
						maxsize = size;
					}
				}
			}
		}
		
		//���
		System.out.println(cnt);
		System.out.println(maxsize);
		
	}

}
