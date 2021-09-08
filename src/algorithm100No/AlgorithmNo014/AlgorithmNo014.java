package algorithm100No.AlgorithmNo014;

import java.util.Arrays;

/**
 * 입력된 숫자의 개수를 출력하시오
 * 
 * - input: 421314218
 * - output: 0: 0
 *           1: 3
 *           2: 2
 *           3: 1
 *           4: 2
 *           5: 0
 *           6: 0
 *           7: 0
 *           8: 1
 *           9: 0
 */
public class AlgorithmNo014 {
	public static void algorithmNo014() {
		int inputNum = 421314218;
		int[] cArr = new int[9];
		int[] sortNum = new int[9];
		
		for(int i = 0; i < sortNum.length; i++) {
			sortNum[i] = inputNum % 10;
			inputNum /= 10;
		}
		
		for(int i = 0; i < sortNum.length; i++) {
			cArr[sortNum[i]]++;
		}
		
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(i + ": " + cArr[i]);
		}
	}
	
	public static void algorithmNo014_jins() {
		int n = 421314218;	// 421314218 -> 8 
							// 42131421 -> 1
							// 4213142 -> 2
							// ...
							// 0
		int[] arr = new int[10]; // 0 ~ 9 입력된 수를 cnt 위한 용도
		// int arr[0] = 0;
		// int arr[1] = 3;
		// int arr[2] = 2;
		
		int[] sortNum = new int[9];
		
		while(n > 0) {
			arr[n % 10]++;
			n /= 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}
}
