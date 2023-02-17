class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    // 깊이 우선 탐색
    public void dfs(int[] numbers, int depth, int target, int sum){
        // 마지막 노드 까지 탐색한 경우
        if(depth == numbers.length){ 
            if(target == sum) answer++;
        } else {
            // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum + numbers[depth]); 
            // 해당 노드의 값을 빼고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); 
        }
    }
}
