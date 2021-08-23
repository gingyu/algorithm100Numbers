package algorithm100No.algorithmNo003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 가장많이 출현할 수를 출력하시오. ( 최빈수 구하기 )
 * 
 * 문제: 1 2 2 3 1 4 2 2 4 3 5 3 2
 * 정답: 2 (5회) 
 */

public class AlgorithmNo003 {
	
	public static void choibinsu_me() {
		int[] arr = {1,2,2,3,1,4,2,2,4,3,5,3,2};
//		int[] arr = {111,22,22,33,111,222,32,32,222,33,222,22,22};
//		int[] arr = {1,2,1,2,3,4,2,2,4,5,2};
		Arrays.sort(arr);
		
		List<Choibinsu> list = new ArrayList<Choibinsu>();
		int count = 1;
		
		for (int idx : arr) {
			System.out.print(idx + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			Choibinsu cbs = null;
			
			if(i == arr.length-1){
				cbs = new Choibinsu(arr[i], count);
				list.add(cbs);
			} else {
				if (arr[i] == arr[i+1]) {
					count++;
				} else {
					
					if (count == 1) {
						cbs = new Choibinsu(arr[i], count);
						list.add(cbs);
					} else {
						cbs = new Choibinsu(i == 0 ? arr[i] : arr[i-1], count);
						list.add(cbs);
						count = 1;
					}
				}
			}
			
			
		}
		
		for(Choibinsu cbs : list) {
			System.out.print(cbs.getTargetNumber() + "(" + cbs.getNumberCount() + "회) ");
		}
		
		System.out.println();
		
		
		int[] tmpArr = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			tmpArr[i] = list.get(i).getNumberCount();
		}
		
		Arrays.sort(tmpArr);
		int bigNumber = tmpArr[tmpArr.length-1];
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNumberCount() == bigNumber) {
				System.out.println("최빈수는: " + list.get(i).getTargetNumber() + "(" + list.get(i).getNumberCount() + "회) 입니다.");
			}
		}
	}
	
	public static void choibinsu_jins() {
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		
		for(int i = 0; i < 10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		// 사용자 input
		
		// 1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4 --> 최빈수
		// 3: 2
		// 4: 2
		
		int[] mode = new int[10];
		
		// index -> 출현한 수
		// index 값 -> index(출현한 수)가 몇번나왔는지 저장하는 용도
		
		// mode[3] = 5, => 3번 숫자가, 5번 출현했다.
		
		for(int i = 0; i < 10; i++) {
			// 같은위치에 계속 ++연산을 하여 각인덱스별로 횟수가 저장된다.
			mode[inputNum[i]]++; 
		}
		
		// mode[1] == 2
		// mode[2] == 4
		// mode[3] == 2
		// mode[4] == 2
		
		int modeNum = 0; // 최빈수
		int modeCnt = 0; // 최빈수가 나온횟수
		
		for (int i = 0; i < 10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는: " + modeNum + "(" + modeCnt + "회) 입니다");
	}
}
