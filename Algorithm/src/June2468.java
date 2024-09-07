import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June2468 {

	static int N;
	static int arr[][], visited[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };

	static int dfs1(int start) {
		// ������ ������ ���� ����
		visited = new int [N][N];
		int cnt = 0;		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] > start && visited[i][j] ==0) {
					dfs2(i,j,start);
					cnt++;
				}
			}
			}return cnt;
		}

		// ����Լ� ����
	static void dfs2(int y, int x, int start) {
		visited[y][x] = 1;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			//�ٿ���� üũ
			if(ny>=0 && ny<N && nx>=0 && nx<N && visited[ny][nx]==0 && arr[ny][nx] > start) {
				dfs2(ny, nx, start);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �Է¹ޱ�
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
//		visited = new int [N][N];
		for (int i = 0; i < N; i++) {
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}

		// ����Լ� ����
		int max = 0;
		for (int i = 1; i <= 100; i++) {
			int safeZones = dfs1(i);
			if (safeZones > max) {
				max = safeZones;
			}
		}
		
		//���
		System.out.println(max);
	}

}
