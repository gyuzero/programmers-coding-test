package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12954Test {

    @Test
    void x만큼_간격이_있는_n개의_숫자() {
        assertArrayEquals(new long[]{2, 4, 6, 8, 10}, new Solution12954().solution(2, 5));
        assertArrayEquals(new long[]{4, 8, 12}, new Solution12954().solution(4, 3));
        assertArrayEquals(new long[]{-4, -8}, new Solution12954().solution(-4, 2));
    }

}