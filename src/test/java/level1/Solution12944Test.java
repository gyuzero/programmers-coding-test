package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12944Test {

    @Test
    void 평균_구하기() {
        assertEquals(2.5, new Solution12944().solution(new int[]{1, 2, 3, 4}));
        assertEquals(5, new Solution12944().solution(new int[]{5, 5}));
    }

}