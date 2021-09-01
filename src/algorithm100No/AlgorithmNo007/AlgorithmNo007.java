package algorithm100No.AlgorithmNo007;

/**
 * �Էµ� ���� �Ҽ����� �Ǻ��Ͻÿ�
 * 
 * - �Է¼�: 13
 * - ���� : 13�� �Ҽ��Դϴ�.
 *
 */
public class AlgorithmNo007 {
	public static void solution(int input) {
		int answer = 1;
		int cnt = 2;
		while(cnt <= input) {
			
			if (input % cnt == 0) answer++;
			cnt++;
			if (answer > 2) break;
			
		}
		
		if (answer > 2) {
			System.out.println(input + "�� �Ҽ��� �ƴմϴ�.");
		} else {
			System.out.println(input + "�� �Ҽ��Դϴ�.");
		}
	}
	
	public static void solution_jins() {
		// �Ҽ��� 1�� �ڱ��ڽ��� �����ϰ� ������ �������� ����� ������ -> �Ҽ��� �ƴ�
		// �Ҽ� = 1�� �ڱ��ڽŸ� ����������� ���.
		
		int num = 13;
		boolean isPrimeNumber = true;
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				// primeNumber X
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(num + "�� �Ҽ� �Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}

		
		
	}
}
