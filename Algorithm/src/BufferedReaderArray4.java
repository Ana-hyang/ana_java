import java.io.*;
import java.util.*;

public class BufferedReaderArray4 {

	public static void main(String[] args) throws IOException {
		// 4 5 1
		// 1 2
		// 1 3
		// 1 4
		// 2 4
		// 3 4

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� ���� �ޱ�
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		int v = Integer.parseInt(str.split(" ")[2]);

		// ������ �迭 �Է¹ޱ�
		int arr[][] = new int[m][2];
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(s.split(" ")[j]);
			}
		}
		// ����ϱ� 
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}