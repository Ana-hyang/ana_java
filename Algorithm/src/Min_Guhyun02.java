import java.io.*;
import java.util.*;

public class Min_Guhyun02 {

	public static void main(String[] args) {
		// 손님 명수 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		// 가격 입력받기
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		// 가격 오름차순 정렬
		Arrays.sort(arr);
		// 탕후루 가격 선언하기
		long finprice = 0;
		long max = 0;
		// 탕후루 가격 별로 최대 매출 확인해보기 (64bit 정수)
		for (int i = 0; i < N; i++) {
			long price = arr[i];
			long revenue = price * (N - i);
			if (max < revenue) {
				max = revenue;
				finprice = price;
			}
		}
		System.out.println(max + " " + finprice);
	}

}
