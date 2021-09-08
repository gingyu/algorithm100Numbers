package algorithm100No.AlgorithmNo016;

/**
 * ���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
 * 
 * - input: 5
 * - output:
 * *****
 *  ****
 *   ***
 *    **
 *     * 
 *
 */
public class AlgorithmNo017 {
	public static void algorithmNo017() {
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void algorithmNo017_jins() {
		int n = 5;
		
		/*
		 * 		*****
		 * 		 ****
		 * 		  ***
		 * 		   **
		 * 			*
		 */
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
