import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) throws IOException {
		// 선언 및 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String arr [] = new String [3];
		arr = str.split(" ");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
