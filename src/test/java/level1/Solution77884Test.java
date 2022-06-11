package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution77884Test {

    @Test
    void 약수의_개수와_덧셈() {
        assertEquals(43, new Solution77884().solution(13, 17));
        assertEquals(52, new Solution77884().solution(24, 27));
    }

}