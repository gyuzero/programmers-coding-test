package level1;

/**
 * Level1
 * 연습문제
 * 콜라츠 추측
 */
public class Solution12943 {
    public int solution(long num) {
        int answer = 0;

        if(num == 1) return 0;

        while(num != 1) {
            if(answer > 500) return -1;
            num = (num % 2 == 0) ? (num / 2) : (num * 3) + 1;
            answer++;
        }


        return answer;
    }
}
