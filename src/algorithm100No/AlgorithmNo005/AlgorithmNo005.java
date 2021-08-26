package algorithm100No.AlgorithmNo005;

/**
 * �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͻÿ�
 * 
 * helloWorlD
 * 
 * ����: HELLOwORld
 *
 */
public class AlgorithmNo005 {

	public static String castAlpabet(String str) {
		
		// ASCII �ڵ�ǥ���� a�� 97�̹Ƿ� 97���� ���� �빮�ڷ� �Ǵ��ϰ� �ҹ��ڷ� ��ȯ
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
