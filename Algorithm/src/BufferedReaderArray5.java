import java.io.*;
import java.util.*;

public class BufferedReaderArray5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 2���迭�� �� ����
		String str1 = br.readLine();
		String str2 = br.readLine();

		// 12ĭ¥�� 1���� char�迭 ����
		char ch[] = new char[12];

		for (int i = 0; i < str1.length(); i++) {
			ch[i] = str1.charAt(i);
		}
		for (int i = str1.length(); i < str1.length() + str2.length(); i++) {
			ch[i] = str2.charAt(i - str1.length());
		}

		// 1���� �迭�� ���
		for (int i = 0; i < 12; i++) {
			System.out.print(ch[i]);
		}
	}

}
