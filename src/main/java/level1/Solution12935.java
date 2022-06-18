package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Level1
 * 연습문제
 * 제일 작은 수 제거하기
 */
public class Solution12935 {
    public int[] solution(int[] arr) {

        if (arr.length <= 1) return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
