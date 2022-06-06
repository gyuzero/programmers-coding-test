package level1;

import java.util.*;

/**
 * Level1
 * 완전탐색
 * 모의고사
 */
public class Solution42840 {

    public int[] solution(int[] answers) {

        int[][] students = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < students.length; i++) {
            map.put(i, getScore(answers, students[i]));
        }

        int maxValue = Collections.max(map.values());

        List<Integer> list = new ArrayList<>();

        map.forEach((k, v) -> {
            if (v == maxValue) list.add(k + 1);
        });

        return list.stream().mapToInt(i -> i).toArray();
    }

    public int getScore(int[] answers, int[] student) {

        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            if (student[i % student.length] == answers[i]) score++;
        }

        return score;
    }
}
