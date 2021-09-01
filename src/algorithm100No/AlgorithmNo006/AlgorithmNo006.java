package algorithm100No.AlgorithmNo006;

import java.util.Arrays;

/**
 * 입력된 두 수의 최대공약수를 구하시오
 * 
 * 입력수: 12, 18
 * 정답: 6
 *
 */
public class AlgorithmNo006 {
	// 12: 1,2,3,4,6,12
	// 18: 1,2,3,6,9,18
	
	// 15: 1,3,5,15
	// 30: 1,2,3,5,6,10,15,30
	public static int solution(int[] arr) {
		int answer = 0;
		int cnt = 2;
		Arrays.sort(arr);
		
		do {
			if(arr[0] % cnt == 0 && arr[1] % cnt == 0) {
				answer = cnt;
			}
			cnt++;
			
		} while (cnt <= arr[0]);
		
		return answer;
	}
	
	public static void solution_jins() {
		int num1, num2;
		num1 = 12;
		num2 = 18;
		
		int small;
		int big;
		
		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; // 최대공약수
		
		for (int i = 1; i < small; i++) {
			if (big  % i  == 0 && small % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
