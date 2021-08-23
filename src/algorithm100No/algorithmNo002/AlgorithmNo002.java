package algorithm100No.algorithmNo002;

/**
 * �Ǻ���ġ ������ ����Ͻÿ�
 * 
 * - An = An-1 + An-2
 * - 1 1 2 3 5 8 13 21 34
 *
 */
public class AlgorithmNo002 {

	public static void fibonacci_me() {
		// �Ǻ���ġ ����
		// �����ε����� ���� �ε������� ���Ͽ� �����ε��� ���� �����ϴ� ����
		
		int[] fibonacciNumbers = new int[10];
		
		for(int i = 0; i < fibonacciNumbers.length; i++) {
			if(i > 1) {
				fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];  
			} else {
				// 1,2��° ���� �Ǻ���ġ������ ������ִ� ������ �ȵǹǷ� 1�� �ʱ�ȭ
				fibonacciNumbers[i] = 1;
			}
		}
		
		for(int fbn : fibonacciNumbers) {
			System.out.println(fbn);
		}
	}
	
	public static void fibonacci_jins() {
		int[] arr = new int[100];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3; i < 100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// �迭�� ������� �ʰ� ����
		// An = An-1 + An-2; n > 3
		// a1 = 1, a2 = 1
		System.out.println();
		int prevPrevNum = 1;	// An-2
		int prevNum = 1;			// An-1 
		
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for(int i = 3; i <= 10; i++) {
			int nNum = prevPrevNum + prevNum;
			System.out.print(nNum + " ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
			
		}
	}
}
