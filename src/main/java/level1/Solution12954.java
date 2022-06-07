package level1;

/**
 * Level1
 * 연습문제
 * x만큼 간격이 있는 n개의 숫자
 */
public class Solution12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long sum = 0;

        for (int i = 0; i < n; i++) {
            answer[i] = sum += x;
        }

        return answer;
    }
}
