package level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution42840Test {

    @Test
    void 모의고사() {
        assertArrayEquals(new int[]{1}, new Solution42840().solution(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3}, new Solution42840().solution(new int[]{1, 3, 2, 4, 2}));
    }

}