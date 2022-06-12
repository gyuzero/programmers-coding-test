package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12948Test {

    @Test
    void 핸드폰_번호_가리기() {
        assertEquals("*******4444", new Solution12948().solution("01033334444"	));
        assertEquals("*****8888", new Solution12948().solution("027778888"	));
    }

}