import java.io.*;
import java.util.*;

public class bee {
	static int N, M;
	static int arr[][];
	static int max, fmax;
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };
	static int visited[][];

	static void dfs1(int lev, int y, int x) {
		visited[y][x] = 1;
		max += arr[y][x];	
		System.out.println("확인0"+max);
		if (lev == 4) {
			System.out.println("확인1"+max);
			if(fmax < max ) {fmax = max;} 
			System.out.println("확인2"+max);
			max = 0;
			return;
		}
			

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < N && nx >= 0 && nx < M && visited[ny][nx] == 1) {						
				dfs1(lev + 1, ny, nx);
				visited[y][x] = 0;
			}
		}

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
			max = 0;
			int fmax = 0 ;
/*			for(int i = 0 ; i <N ; i++) {
				for(int j = 0 ; j<M ; j++) {
					dfs1(1, i, j);	
				}
			}	*/
			System.out.println("확인4"+max);
			dfs1(1,0,0);
			dfs1(1,1,1);
			System.out.println("#" + tc + " " + fmax);
		}

	}

}
