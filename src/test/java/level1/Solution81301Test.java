package level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution81301Test {

    @Test
    void 숫자_문자열과_영단어() {
        assertEquals(1478, new Solution81301().solution("one4seveneight"));
        assertEquals(234567, new Solution81301().solution("23four5six7"));
        assertEquals(234567, new Solution81301().solution("2three45sixseven"));
        assertEquals(123, new Solution81301().solution("123"));
    }

}