package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Level1
 * 정렬
 * K번째수
 */
public class Solution42748 {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = getThirdNumber(array, commands[i]);
        }

        return answer;
    }

    public int getThirdNumber(int[] array, int[] command) {
        int[] copyArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
        Arrays.sort(copyArray);
        return copyArray[command[2] - 1];
    }

}
