import java.io.*;
import java.util.*;

public class Min_Guhyun03 {

	public static void main(String[] args) {
		// 빙고 숫자 입력받기 5x5
		Scanner sc = new Scanner(System.in);
		int bingo[][] = new int[5][5];
		HashMap<Integer, int[]> position = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = sc.nextInt();
				position.put(bingo[i][j], new int[] { i, j });
			}
		}
		// 사회자가 부르는 숫자 입력받기
		int mc[] = new int[25];
		for (int i = 0; i < 25; i++) {
			mc[i] = sc.nextInt();
		}
		// 번호 위치 저장할 배열
		int[] row = new int[5];
		int[] col = new int[5];
		int daegakLeft = 0; // 왼쪽 상단 대각선
		int daegakRight = 0; // 오른쪽 상단 대각선

		// 숫자 호출 및 빙고 체크
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

			// 3선 성공 완료 체크
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
