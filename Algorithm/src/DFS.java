import java.io.*;
import java.util.*;

public class DFS {
	static int n, m, v;
	static int graph[][];
	static int visited[];

	static void dfs(int start) {
		// �Լ� �� �� ��
		System.out.print(start + " ");
		visited[start] = 1;
		// ����Լ� �� ��
		for (int i = 0; i < n + 1; i++) {
			if (visited[i] == 0 && graph[start][i] == 1)
				dfs(i);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� ���� �ޱ�
		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		v = Integer.parseInt(str.split(" ")[2]);

		// ������ �迭 �Է¹ޱ�
		int arr[][] = new int[m][2];
		graph = new int[n + 1][n + 1];
		visited = new int[n + 1];
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			int from = Integer.parseInt(s.split(" ")[0]);
			int to = Integer.parseInt(s.split(" ")[1]);
			graph[from][to] = 1;
			graph[to][from] = 1;

		}

		dfs(v);
	}

}
