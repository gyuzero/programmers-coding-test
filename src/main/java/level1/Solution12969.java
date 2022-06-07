package level1;

import java.util.Scanner;

/**
 * Level1
 * 연습문제
 * 직사각형 별찍기
 */
public class Solution12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            sb.append("*");
        }

        for (int i = 0; i < b; i++) {
            System.out.println(sb);
        }
    }
}
