import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderArray3 {

	public static void main(String[] args) throws IOException {
		// 2차원 배열 입력
		// 3 3 (Height, Width)
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 배열의 크기를 입력
		String s = br.readLine();
/*		String h [] = s.split(" ");
		int height = Integer.parseInt(h[0]);	*/
		int height = Integer.parseInt(s.split(" ")[0]);		
		int width = Integer.parseInt(s.split(" ")[1]);

		// 배열의 값을 입력
		int arr [][] = new int [height][width];
		for(int i = 0 ; i<height ; i++) {
			String a = br.readLine();
			for(int j = 0 ; j<width ; j++) {
				arr[i][j] = Integer.parseInt(a.split(" ")[j]);
			}
		}
		System.out.println(height +" " +width );
		System.out.println(arr[2][2]);
	}

}