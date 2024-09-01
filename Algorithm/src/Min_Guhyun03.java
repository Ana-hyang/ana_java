import java.io.*;
import java.util.*;

public class Min_Guhyun03 {

	public static void main(String[] args) {
		// ���� ���� �Է¹ޱ� 5x5
		Scanner sc = new Scanner(System.in);
		int bingo[][] = new int[5][5];
		HashMap<Integer, int[]> position = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = sc.nextInt();
				position.put(bingo[i][j], new int[] { i, j });
			}
		}
		// ��ȸ�ڰ� �θ��� ���� �Է¹ޱ�
		int mc[] = new int[25];
		for (int i = 0; i < 25; i++) {
			mc[i] = sc.nextInt();
		}
		// ��ȣ ��ġ ������ �迭
		int[] row = new int[5];
		int[] col = new int[5];
		int daegakLeft = 0; // ���� ��� �밢��
		int daegakRight = 0; // ������ ��� �밢��

		// ���� ȣ�� �� ���� üũ
		for (int i = 0; i < 25; i++) {
			int num = mc[i];
			int pos[] = position.get(num);

			int r = pos[0];
			int c = pos[1];

			row[r]++;
			col[c]++;

			if (r == c)
				daegakLeft++;
			if (r + c == 4)
				daegakRight++;

			// 3�� ���� �Ϸ� üũ
			int bingocount = 0;
			for (int j = 0; j < 5; j++) {
				if (row[j] == 5)
					bingocount++;
				if (col[j] == 5)
					bingocount++;
			}
			if (daegakLeft == 5)
				bingocount++;
			if (daegakRight == 5)
				bingocount++;

			if (bingocount >= 3) {
				System.out.println(num);
				break;
			}
		}

	}

}
