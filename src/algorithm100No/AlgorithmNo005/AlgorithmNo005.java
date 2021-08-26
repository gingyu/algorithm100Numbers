package algorithm100No.AlgorithmNo005;

/**
 * 대문자는 소문자로, 소문자는 대문자로 변환하시오
 * 
 * helloWorlD
 * 
 * 정답: HELLOwORld
 *
 */
public class AlgorithmNo005 {

	public static String castAlpabet(String str) {
		
		// ASCII 코드표에서 a는 97이므로 97이하 값은 대문자로 판단하고 소문자로 변환
		StringBuilder sb = new StringBuilder();
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			if (arr[i]+0 < 97) {
				sb.append((arr[i]+"").toLowerCase());
			} else {
				sb.append((arr[i]+"").toUpperCase());
			}
			
		}
		
		return sb.toString();
	}
	
	public static void castAlpabet_jins(String str) {
		char[] arr;
		arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] + ('A' - 'a')); // 'a' 'b' ~ 'z' 'A' 'B' 'C'
			} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A' - 'a'));
			}
		}
		System.out.println(arr);
	}
}
