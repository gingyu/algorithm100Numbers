package algorithm100No;

import java.util.Arrays;

import algorithm100No.algorithmNo003.Algorithm003_1;
import algorithm100No.algorithmNo003.Tree;
import algorithm100No.algorithmNo004.AlgorithmNo004;

public class Algorithm100Numbers {
	public static void main(String[] args) {
		// 1������ �л��̸��� �й��� �Է� �� �˻��ϴ� ���α׷�
		//AlgorithmNo1.student_me();
		//AlgorithmNo1.student_jins();
		
		// 2������ �Ǻ���ġ ������ ����Ͻÿ�
		//AlgorithmNo002.fibonacci_me();
		//AlgorithmNo002.fibonacci_jins();
		
		// 3������ �ֺ�� ã��
		//AlgorithmNo003.choibinsu_me();
		//AlgorithmNo003.choibinsu_jins();
		
		
		// 3-1 ����Ž���˰��� �����ϱ�
//		 int[] a1 = {8,3,65,21,62,78,4,31,25};
//		 int[] a2 = {87,7,85,3,6,21,43,5,2,76,24};
//		 int[] a3 = {0,1,2,3,4,5,6,7,8,9};
		 
		 // ����Ž���� ���� ���ҵ��� �������� ��Ų��.
//		 Arrays.sort(a1);
//		 Arrays.sort(a2);
		 //System.out.println("�� Ž��Ƚ��: " + Algorithm003_1.binarySearch(a1, 3));
		 //System.out.println("�� Ž��Ƚ��: " + Algorithm003_1.binarySearch(a2, 87));
		 
//		 Tree tree = new Tree();
//		 tree.makeTree(a3);
//		 tree.searchBTree(tree.root, 2);
		 
		 // 4������ 10������ 2������ ��ȯ�Ͻÿ�
		 System.out.println(AlgorithmNo004.decimalCastBinary(19));
		 AlgorithmNo004.decimalCastBinary_jins(19);
		 
	}
}
