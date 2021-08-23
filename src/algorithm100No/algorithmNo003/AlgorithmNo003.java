package algorithm100No.algorithmNo003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ���帹�� ������ ���� ����Ͻÿ�. ( �ֺ�� ���ϱ� )
 * 
 * ����: 1 2 2 3 1 4 2 2 4 3 5 3 2
 * ����: 2 (5ȸ) 
 */

public class AlgorithmNo003 {
	
	public static void choibinsu_me() {
		//int[] arr = {1,2,2,3,1,4,2,2,4,3,5,3,2};
		int[] arr = {1,2,2,3,1,4,2,2,4,3};
		Arrays.sort(arr);
		
		List<Choibinsu> list = new ArrayList<Choibinsu>();
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i < arr.length-1) {
				if(arr[i] == arr[i+1]) {
					count++;
				} else {
					Choibinsu cbs = new Choibinsu(arr[i-1], count);
					list.add(cbs);
					count = 1;
					
				}
			}
		}
		
		for(Choibinsu cbs : list) {
			System.out.print(cbs.getTargetNumber() + "(" + cbs.getNumberCount() + "ȸ) ");
		}
		
		System.out.println();
		
		int bigNumber = list.get(1).getNumberCount();
		for(int i = 1; i < list.size(); i++) {
			bigNumber = bigNumber < list.get(i-1).getNumberCount()
					? i-1
					: bigNumber;
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNumberCount() == bigNumber) {
				System.out.println("�ֺ����: " + list.get(i).getTargetNumber() + "(" + list.get(i).getNumberCount() + "ȸ) �Դϴ�.");
			}
		}
	}
	
	public static void choibinsu_jins() {
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		for(int i = 0; i < 10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		// ����� input
		
		// 1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4 --> �ֺ��
		// 3: 2
		// 4: 2
		
		int[] mode = new int[10];
		
		// index -> ������ ��
		// index �� -> index(������ ��)�� ������Դ��� �����ϴ� �뵵
		
		// mode[3] = 5, => 3�� ���ڰ�, 5�� �����ߴ�.
		
		for(int i = 0; i < 10; i++) {
			// ������ġ�� ��� ++������ �Ͽ� ���ε������� Ƚ���� ����ȴ�.
			mode[inputNum[i]]++; 
		}
		
		// mode[1] == 2
		// mode[2] == 4
		// mode[3] == 2
		// mode[4] == 2
		
		int modeNum = 0; // �ֺ��
		int modeCnt = 0; // �ֺ���� ����Ƚ��
		
		for (int i = 0; i < 10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("�ֺ����: " + modeNum + "(" + modeCnt + "ȸ) �Դϴ�");
	}
}
