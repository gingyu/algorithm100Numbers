package algorithm100No.AlgorithmNo016;

/**
 * ���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
 * 
 * - input: 5
 * - output: 
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */
public class AlgorithmNo018 {
	public static void algorithmNo018() {
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j >= 0; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void algorithmNo018_jins() {
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < n - (j+1))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
