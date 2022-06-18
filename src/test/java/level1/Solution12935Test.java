package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12935Test {

    @Test
    void 제일_작은_수_제거하기() {
        assertArrayEquals(new int[]{4, 3, 2}, new Solution12935().solution(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{-1}, new Solution12935().solution(new int[]{10}));
    }

}