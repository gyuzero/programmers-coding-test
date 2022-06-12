package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12943Test {

    @Test
    void 콜라츠_추측() {
        assertEquals(8, new Solution12943().solution(6));
        assertEquals(4, new Solution12943().solution(16));
        assertEquals(-1, new Solution12943().solution(626331));
    }

}