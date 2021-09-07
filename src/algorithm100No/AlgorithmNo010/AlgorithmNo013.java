package algorithm100No.AlgorithmNo010;

/**
 * �Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ� ���� �簢���� ����Ͻÿ�
 * 
 * - INPUT: 4
 * - OUTPUT: 1  2  3  4
 * 			 2  4  6  8
 *           3  6  9 12
 *           4  8 12 16
 *
 */
public class AlgorithmNo013 {
	public static void AlgorithmNo013() {
		int inputNum = 4;
		int[][] line = new int[inputNum][inputNum];
		
		for (int i = 0; i < inputNum; i++) {
			line[i][0] = i+1;
			for (int j = 1; j < inputNum; j++) {
				line[i][j] = line[i][0] * (j+1);
			}
		}
		
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < inputNum; j++) {
				System.out.printf("%4d", line[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void AlgorithmNo013_jins() {
		int n = 4;
		int[][] arr = new int[n][n];
		
		/*
		 * n = 3
		 * 1 2 3
		 * 2 4 6
		 * 3 6 9
		 */
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (i + 1) * (j + 1);
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
