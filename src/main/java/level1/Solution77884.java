package level1;

/**
 * Level1
 * 월간 코드 챌린지 시즌2
 * 약수의 개수와 덧셈
 */
public class Solution77884 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (getDivisorCount(i) % 2 == 0)
                answer += i;
            else answer -= i;
        }
        return answer;
    }

    public int getDivisorCount(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        return count;
    }
}
