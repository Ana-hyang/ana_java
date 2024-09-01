import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jun1181 {

	public static void main(String[] args) throws IOException {
		
		//단어개수 N개 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//단어 입력받기
		String str [] = new String [N];
		for(int i = 0 ; i < N ; i++) {
			str[i] = br.readLine();
		}
		//if문으로 길이가 짧은 것부터 길이가 같으면 사전 순으로 중복된 단어는 하나만 남기고 제거 
		//길이순대로 배열에 저장 
		//길이가 같다면 사전순으로, 같으면 제거
		for(int i = 0 ; i < N ; i++) {
			
		}
		//배열순서대로 출력

	}

}
