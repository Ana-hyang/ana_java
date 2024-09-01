import java.io.*;
import java.util.*;

public class Min_Guhyun02 {

	public static void main(String[] args) {
		// �մ� ��� �ޱ�
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		// ���� �Է¹ޱ�
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		// ���� �������� ����
		Arrays.sort(arr);
		// ���ķ� ���� �����ϱ�
		long finprice = 0;
		long max = 0;
		// ���ķ� ���� ���� �ִ� ���� Ȯ���غ��� (64bit ����)
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
