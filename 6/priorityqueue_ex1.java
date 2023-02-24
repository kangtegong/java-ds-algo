import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            que.add(scoville[i]);
        }
        while(que.peek() < K) {
            if (que.size() == 1)
                return -1;
            que.add(que.poll() + que.poll() * 2);
            answer++;
        }
        return answer;
    }
}
