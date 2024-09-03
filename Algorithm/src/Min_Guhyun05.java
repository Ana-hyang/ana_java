import java.io.*;
import java.util.*;

public class Min_Guhyun05 {
	static int N, M, K;
	static char arr[][];
	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };

	static void ff(int y, int x) {
		arr[y][x] = '%';

		for (int i = 0; i < 4; i++) {
			int ny = dy[i] + y;
			int nx = dx[i] + x;
			if (ny < 0 || ny >= N || nx < 0 || nx >= M)
				continue;
			if (arr[ny][nx] == '#')
				continue;
			arr[ny][nx] = '%';
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		N = Integer.parseInt(str.split(" ")[0]);
		M = Integer.parseInt(str.split(" ")[1]);
		K = Integer.parseInt(br.readLine());

		arr = new char[N][M];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		// 폭탄을 확인하고, 확인되면 변환하기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] == '@') {
					ff(i, j);
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
		}

	}

}
