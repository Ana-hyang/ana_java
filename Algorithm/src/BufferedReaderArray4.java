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

		// 숫자 세개 받기
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);

		// 이차원 배열 입력받기
		int arr[][] = new int[b][2];
		for (int i = 0; i < b; i++) {
			String s = br.readLine();
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(s.split(" ")[j]);
			}
		}
		// 출력하기 
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
