import java.io.*;
import java.util.*;

public class MinString {

	public static void main(String[] args) throws IOException {
		//�ι��� �Է¹ޱ� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		//char�迭�� �ű�� 
		char input [] = new char [12];
		for(int i = 0 ; i <str1.length() ; i++) {
			input [i] = str1.charAt(i);			
		}
		for(int i = str1.length() ; i <12 ; i++) {
			if(str2[i-str1.length()] == null) {
				input [i] = ' ';
			}else {
			input [i] = str2.charAt[i-str1.length];			
		}}
	}

}
