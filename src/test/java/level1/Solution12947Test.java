package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12947Test {

    @Test
    void 하샤드_수() {
        assertTrue(new Solution12947().solution(10));
        assertTrue(new Solution12947().solution(12));
        assertFalse(new Solution12947().solution(11));
        assertFalse(new Solution12947().solution(13));
    }

}