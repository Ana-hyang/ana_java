import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderArray1 {

	public static void main(String[] args) throws IOException {
		// 1차원 배열 입력
		// 1 2 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String arr[] = new String[3];
		arr = str.split(" ");

		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
	}

}
