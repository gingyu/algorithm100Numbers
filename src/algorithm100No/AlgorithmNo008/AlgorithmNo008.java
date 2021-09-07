package algorithm100No.AlgorithmNo008;

/**
 * �Էµ� ���� ���丮���� ���Ͻÿ�
 * 
 * - input: 5
 * - output: 120
 *
 */
public class AlgorithmNo008 {
	public static int fatorial(int input) {
		int answer = 1;
		
		for(int i = 1; i <= input; i++) {
			answer*=i;
		}
		
		return answer;
	}
	
	public static void fatorial_jins() {
		int inputNum = 5;
		int accNum = 1;
		
		// 5! = 5 * 4 * 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
		
		for(int i = 1; i <=inputNum; i++) {
			accNum *= i; // accNum = accNum * i
		}
		
		System.out.println(accNum);
		
		for(int i = inputNum; i >= 1; i--) {
			accNum *= i; // accNum = accNum * i
		}
	}
}
