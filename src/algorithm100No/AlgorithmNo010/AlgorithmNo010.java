package algorithm100No.AlgorithmNo010;

/**
 * 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
 * 
 * - input: 4
 * 
 * - output: 1 2 3 4
 * 			 5 6 7 8
 *           9 10 11 12
 *           13 14 15 16
 *
 */
public class AlgorithmNo010 {

	public static void algorithmNo010() {
		int inputNum = 4;
		int[][] line = new int[4][4];
		
		
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < inputNum; j++) {
				line[i][j] = (j+1) + (i*inputNum);
			}
		}
		
		for (int i = 0; i < line.length; i++) {
			for (int j = 0; j < line[i].length; j++) {
				System.out.print(line[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void algorithmNo010_jins() {
		int n = 5;
		
		/*
		 * n = 3
		 * 1  2  3
		 * 4  5  6
		 * 7  8  9
		 */
		//int num = 1;
		
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.printf("%4d", j * (n) + i + 1);
			}
			System.out.println();
		}
	}
}
