package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution42748Test {

    @Test
    void K번째수() {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        assertArrayEquals(new int[]{5, 6, 3}, new Solution42748().solution(array, commands));
    }

}