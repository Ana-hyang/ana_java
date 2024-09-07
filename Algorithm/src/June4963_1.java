import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class June4963_1 {

    static int w, h;
    static int[][] arr, visited;
    static int[] dy = { -1, 1, 0, 0, -1, 1, -1, 1 };
    static int[] dx = { 0, 0, -1, 1, -1, -1, 1, 1 };

    static void dfs(int y, int x) {
        visited[y][x] = 1; // 현재 노드를 방문 처리

        for (int i = 0; i < 8; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny >= 0 && ny < h && nx >= 0 && nx < w && arr[ny][nx] == 1 && visited[ny][nx] == 0) {
                dfs(ny, nx); // 인접한 노드에 대해 DFS 호출
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;

        while (true) {
            str = br.readLine().split(" ");
            w = Integer.parseInt(str[0]);
            h = Integer.parseInt(str[1]);

            if (w == 0 && h == 0) {
                break;
            }

            arr = new int[h][w];
            visited = new int[h][w];
            
            for (int i = 0; i < h; i++) {
                String[] st = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st[j]);
                }
            }

            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == 1 && visited[i][j] == 0) {
                        cnt++;
                        dfs(i, j); // 새로운 연결 요소 발견 시 DFS 호출
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
