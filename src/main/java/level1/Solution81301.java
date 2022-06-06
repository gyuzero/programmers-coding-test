package level1;

/**
 * Level1
 * 2021 카카오 채용연계형 인턴십
 * 숫자 문자열과 영단어
 */
public class Solution81301 {

    String[] wordArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] numberArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public int solution(String s) {

        for (int i = 0; i < wordArr.length; i++)
            s = s.replaceAll(wordArr[i], numberArr[i]);

        return Integer.parseInt(s);
    }
}

