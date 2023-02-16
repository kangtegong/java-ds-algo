import java.util.*;

// https://scshim.tistory.com/241
public class DFS_Recursion {
    //각 노드가 방문된 정보를 1차원 배열 자료형으로 표현
    public static boolean [] visited = {false, false, false ,false ,false ,false ,false ,false, false};
    // 각 노드가 연결된 정보를 2차원 배열 자료형으로 표현
    public static int[][] graph = {{},
        {2, 3, 8},
        {1, 7},
        {1, 4, 5},
        {3, 5},
        {3, 4},
        {7},
        {2, 6, 8},
        {1, 7}};

    public static void main(String[] args){
        int start = 1; // 시작 노드
        dfs(start);
    }

    /*
	 * dfs 알고리즘을 수행하는 함수
	 * @param v 탐색할 노드
    */
    public static void dfs(int v){
        // 현재 노드 방문 처리
        visited[v] = true;
        // 방문 노드 출력
        System.out.print(v + " ");

        // 인접 노드 탐색
        for (int i : graph[v]){
            // 방문하지 않은 인접 노드 중 가장 작은 노드를 스택에 넣기
            if (visited[i]==false){
                dfs(i);
            }
        }
    }
}
