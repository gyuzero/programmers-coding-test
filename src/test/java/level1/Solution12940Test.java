package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12940Test {

    @Test
    void 최대공약수와_최소공배수() {
        assertArrayEquals(new int[] {3, 12}, new Solution12940().solution(3, 12));
        assertArrayEquals(new int[] {1, 10}, new Solution12940().solution(2, 5));
    }

}