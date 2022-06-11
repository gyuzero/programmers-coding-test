package level1;

/**
 * Level1
 * 연습문제
 * 하샤드 수
 */
public class Solution12947 {

    public boolean solution(int x) {

        String str = Integer.toString(x);

        int sum = 0;

        for (int i = 0; i < str.length(); i++)
            sum += str.charAt(i) - '0';

        return (x % sum) == 0;

    }

}
