import java.io.*;
import java.util.*;

public class June1012 {
	
	// 선언하기
		static int dy[] = { -1, 1, 0, 0 };
		static int dx[] = { 0, 0, -1, 1 };
		static int T, M, N, K;
		static int arr[][];
		static int visited[][];

	public static void main(String[] args) throws IOException {	

	// 입력받기
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	T = Integer.parseInt(br.readLine());
	for(int tc = 1;tc<=T; tc++){
		String str = br.readLine();
		M = Integer.parseInt(str.split(" ")[0]);
		N = Integer.parseInt(str.split(" ")[1]);
		K = Integer.parseInt(str.split(" ")[2]);
		arr = new int [M][N];
		visited = new int [M][N];
		cnt = 0 ; 	//테스트케이스마다 초기화 

		for(int i = 0 ; i<K ; i++){
		String p = br.nextLine();
		int from = Integer.parceInt(p.split(" ")[0]);
		int to = Integer.parceInt(p.split(" ")[1]);
		arr[from][to] = 1;
		}

		for(int i = 0 ; i<M ; i++){
		for(int j = 0 ; j<N ; j++){
		if(arr[i][j]==1 && visited[i][j] ==0){
		cnt++;
		dfs(i,j);
		}}}
		 
		sysout (cnt);

		//dfs재귀함수 작성
	static void dfs(int y, int x){
		visited[y][x] =1;
		for(int i = 0 ; i<4 ; i++){
		int ny = y + dy[i];
		int nx = x +dx[i];

		if(arr[ny][nx]==1 && visited[ny][nx] ==0 ){
		dfs(ny, nx);
		}


	}
	}
}
