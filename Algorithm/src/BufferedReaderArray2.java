import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderArray2 {

	public static void main(String[] args) throws IOException {
		// 1차원 배열 입력
		// 1
		// 2
		// 3
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String arr[] = new String[3];
		for(int i =0 ; i<3 ; i++) {
			arr[i] = br.readLine();
		}
		

		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
	}

}