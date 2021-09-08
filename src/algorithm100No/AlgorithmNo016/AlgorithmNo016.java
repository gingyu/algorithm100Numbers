package algorithm100No.AlgorithmNo016;

/**
 * 다음 입력 n을 받아 아래와 같은 *을 출력하시오
 * 
 * - input: 5
 * - output:
 * *****
 * ****
 * ***
 * **
 * *
 */
public class AlgorithmNo016 {
	public static void algorithmNo016() {
		int n = 5;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append("*");
			System.out.println(sb);
		}
	}
	
	public static void algorithmNo016_jins() {
		int n = 5;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
