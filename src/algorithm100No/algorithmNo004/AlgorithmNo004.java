package algorithm100No.algorithmNo004;

/**
 * 10진수를 2진수로 변환하시오
 * 
 * 19
 * 
 * 정답: 10011
 *
 */
public class AlgorithmNo004 {
	
	public static String decimalCastBinary(int decimal) {
		int calculate = decimal;
		int[] binaryArr = new int[100];
		int cnt = 0;
		
		StringBuilder sb = new StringBuilder();
		while(calculate > 0) {
			binaryArr[cnt] = calculate % 2 > 0 
					? 1 
					: 0;
			
			calculate /= 2;
			cnt++;
		}
		
		for(int i = cnt-1; i > -1; i--) {
			sb.append(binaryArr[i]);
		}
		//Integer.toBinaryString(decimal)
		
		return sb.toString();
	}
	
	public static void decimalCastBinary_jins(int inputNum) {
		int bin[] = new int[100];
		
		/*
		 * 19 / 2 = 9 ... 1
		 * 9  / 2 = 4 ... 1
		 * 4  / 2 = 2 ... 0
		 * 2  / 2 = 1 ... 0
		 * 1  / 2 = 0 ... 1
		 * 
		 *  010011 => 19
		 */
		
		int i = 0;
		int mok = inputNum;
		
		while (mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--;
		for (; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
	}
}
