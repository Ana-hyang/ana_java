import java.util.Scanner;

public class MinExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int max = 0;
		int idx = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 1; i++) {
			if (max < arr[i + 1] - arr[i]) {
				max = arr[i + 1] - arr[i];
				idx = i+1;	//ÀÎµ¦½º À§Ä¡!!
			}

		}
		if (max > 0) {
			System.out.println(idx + " " + (idx + 1));
		} else {
			System.out.println(0);
		}

	}

}
