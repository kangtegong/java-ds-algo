import java.util.*;

// https://scshim.tistory.com/241
public class DFS_Stack {
    public static void main(String[] args) {

        //각 노드가 연결된 정보를 2차원 배열 자료형으로 표현
        int [][]graph = {{},
            {2, 3, 8},
            {1, 7},
            {1, 4, 5},
            {3, 5},
            {3, 4},
            {7},
            {2, 6, 8},
            {1, 7}};

        //각 노드가 방문된 정보를 1차원 배열 자료형으로 표현
        boolean[] visited = {
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false
        };

        //정의된 DFS 함수 호출
        DFS_Stack dfsExam = new DFS_Stack();
        dfsExam.dfs(graph, 1, visited);
    }

    /*
     * dfs 메서드
     *  @param graph 노드 연결 정보를 저장
     *  @param v 방문을 시작하는 최상단 노드의 위치
     *  @param visited 노드 방문 정보를 저장
     */
    void dfs(int[][] graph, int start, boolean[] visited) {
        //시작 노드를 방문 처리
        visited[start] = true;
        System.out.print(start + " "); //방문 노드 출력

        Deque < Integer > stack = new LinkedList < > ();
        stack.push(start); //시작 노드를 스택에 입력

        while (!stack.isEmpty()) {
            int now = stack.peek();

            boolean hasNearNode = false; // 방문하지 않은 인접 노드가 있는지 확인
            //인접한 노드를 방문하지 않았을 경우 스택에 넣고 방문처리
            for (int i: graph[now]) {
                if (!visited[i]) {
                    hasNearNode = true;
                    stack.push(i);
                    visited[i] = true;
                    System.out.print(i + " "); //방문 노드 출력
                    break;
                }
            }
            //반문하지 않은 인접 노드가 없는 경우 해당 노드 꺼내기
            if (hasNearNode == false)
                stack.pop();
        }
    }
}
