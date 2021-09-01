package algorithm100No.AlgorithmNo007;

/**
 * 입력된 수가 소수인지 판별하시오
 * 
 * - 입력수: 13
 * - 정답 : 13은 소수입니다.
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
			System.out.println(input + "은 소수가 아닙니다.");
		} else {
			System.out.println(input + "은 소수입니다.");
		}
	}
	
	public static void solution_jins() {
		// 소수란 1과 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가 아님
		// 소수 = 1과 자기자신만 나누어떨어지는 경우.
		
		int num = 13;
		boolean isPrimeNumber = true;
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				// primeNumber X
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(num + "은 소수 입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}

		
		
	}
}
