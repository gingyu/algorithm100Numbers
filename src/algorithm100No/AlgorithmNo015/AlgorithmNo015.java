package algorithm100No.AlgorithmNo015;

import java.util.Scanner;

/**
 * 구구단 시작 s부터 f단까지 입력받아 아래와 같이 출력하시오
 * 
 * - input: 2 3
 * - output:
 * 2 * 1 = 2	3 * 1 = 3
 * 2 * 2 = 4 	3 * 2 = 6
 * 2 * 3 = 6 	3 * 3 = 9
 * 2 * 4 = 8 	3 * 4 = 12
 * 2 * 5 = 10 	3 * 5 = 15
 * 2 * 6 = 12 	3 * 6 = 18
 * 2 * 7 = 14 	3 * 7 = 21
 * 2 * 8 = 16 	3 * 8 = 24
 * 2 * 9 = 18	3 * 9 = 27
 */
public class AlgorithmNo015 {
	public static void algorithmNo015() {
		Scanner scan = new Scanner(System.in);
		
		int s = 0;
		int f = 0;
		
		s = scan.nextInt();
		f = scan.nextInt();
		
		for(int i = 1; i < 10; i++) {
			for(int j = s; j <= f; j++) {
				System.out.printf("%2d * %2d = %2d", j, i, j*i);
			}
			System.out.println();
		}
	}
	
	public static void algorithmNo015_jins() {
		int s = 2;
		int f = 5;
		// 2 ~ 5 출력
		
		for(int i = 1; i <= 9; i++) {
			for(int dan = s; dan <= f; dan++) {
				System.out.printf("%2d * %2d = %2d", dan, i, dan*i);
			}
			System.out.println();
		}
	}
}
