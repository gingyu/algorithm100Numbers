package algorithm100No.AlgorithmNo010;

/**
 * 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
 * 
 * - input: 4
 * - output: 1  2  3  4
 * 			 8  7  6  5
 * 			 9  10 11 12
 *           16 15 14 13
 *
 */
public class AlgorithmNo011 {

	public static void algorithmNo011() {
		int inputNum = 4;
		int line[][] = new int[inputNum][inputNum];
		
		for (int i = 0; i < inputNum; i++) {
			int k = inputNum-1;
			for (int j = 0; j < inputNum; j++) {
				if (i % 2 > 0) {
					line[i][j] = (k+1) + inputNum * i;
					k--;
				} else {
					line[i][j] = (j+1) + inputNum * i;
				}
				
			}
		}
		
		for (int i = 0; i < line.length; i++) {
			for (int j = 0; j < line[i].length; j++) {
				System.out.printf("%3d", line[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void algorithmNo011_jins() {
		int n = 5;
		
		int arr[][] = new int[n][n];
		
		/*
		 * n = 3
		 * 1 2 3
		 * 6 5 4
		 * 7 8 9
		 */
		
		for (int i = 0; i < n; i++) {
			
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = i * n + j + 1;
				}
			} else {
				for (int j = n-1; j >= 0; j--) {
					arr[i][j] = i * n + n - j;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
