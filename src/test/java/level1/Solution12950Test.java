package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12950Test {

    @Test
    void 행렬의_덧셈() {
        assertArrayEquals(new int[][]{{4, 6}, {7, 9}}, new Solution12950().solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}));
        assertArrayEquals(new int[][]{{4}, {6}}, new Solution12950().solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}}));
    }

}