package algorithm100No.AlgorithmNo009;

/**
 * 입력된 수의 각 자리수 합을 구하시오
 * 
 * - input: 1242
 * - output: 9
 * 
 *
 */
public class AlgorithmNo009 {

	public static int AlgorithmNo009(int input) {
		int answer = 0;
		String[] arr = new String[4];
		String str = String.valueOf(input);
		
		arr = str.split("");
		
		for(int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
		
		return answer;
	}
	
	public static void AlgorithmNo009_jins() {
		int inputNum = 1242;
		int accSum = 0;
		
		// 1242 => 123 => 12 => 1
		// 2         3     2    1 => 9
		
		while(inputNum > 0) {
			accSum += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(accSum);
	}
}
