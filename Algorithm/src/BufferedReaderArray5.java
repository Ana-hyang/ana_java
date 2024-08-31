import java.io.*;
import java.util.*;

public class BufferedReaderArray5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 2차배열에 두 문장
		String str1 = br.readLine();
		String str2 = br.readLine();

		// 12칸짜리 1차원 char배열 선언
		char ch[] = new char[12];

		for (int i = 0; i < str1.length(); i++) {
			ch[i] = str1.charAt(i);
		}
		for (int i = str1.length(); i < str1.length() + str2.length(); i++) {
			ch[i] = str2.charAt(i - str1.length());
		}

		// 1차원 배열에 출력
		for (int i = 0; i < 12; i++) {
			System.out.print(ch[i]);
		}
	}

}
