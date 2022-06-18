package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12937Test {

    @Test
    void 짝수와_홀수() {
        assertEquals("Odd", new Solution12937().solution(3));
        assertEquals("Even", new Solution12937().solution(4));
    }

}