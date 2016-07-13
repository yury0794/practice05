package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");

		String s = scanner.nextLine().toUpperCase();

		/* 구현합니다. */
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
		scanner.close();
	}
}