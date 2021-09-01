package algorithm100No;

import java.util.Arrays;

import algorithm100No.AlgorithmNo005.AlgorithmNo005;
import algorithm100No.AlgorithmNo006.AlgorithmNo006;
import algorithm100No.AlgorithmNo007.AlgorithmNo007;
import algorithm100No.algorithmNo003.Algorithm003_1;
import algorithm100No.algorithmNo003.Tree;
import algorithm100No.algorithmNo004.AlgorithmNo004;

public class Algorithm100Numbers {
	public static void main(String[] args) {
		// 1번문제 학생이름과 학번을 입력 후 검색하는 프로그램
		//AlgorithmNo1.student_me();
		//AlgorithmNo1.student_jins();
		
		// 2번문제 피보나치 수열을 출력하시오
		//AlgorithmNo002.fibonacci_me();
		//AlgorithmNo002.fibonacci_jins();
		
		// 3번문제 최빈수 찾기
		//AlgorithmNo003.choibinsu_me();
		//AlgorithmNo003.choibinsu_jins();
		
		
		// 3-1 이진탐색알고리즘 구현하기
//		 int[] a1 = {8,3,65,21,62,78,4,31,25};
//		 int[] a2 = {87,7,85,3,6,21,43,5,2,76,24};
//		 int[] a3 = {0,1,2,3,4,5,6,7,8,9};
		 
		 // 이진탐색을 위해 원소들을 순차정렬 시킨다.
//		 Arrays.sort(a1);
//		 Arrays.sort(a2);
		 //System.out.println("총 탐색횟수: " + Algorithm003_1.binarySearch(a1, 3));
		 //System.out.println("총 탐색횟수: " + Algorithm003_1.binarySearch(a2, 87));
		 
//		 Tree tree = new Tree();
//		 tree.makeTree(a3);
//		 tree.searchBTree(tree.root, 2);
		 
		 // 4번문제 10진수를 2진수로 변환하시오
//		 System.out.println(AlgorithmNo004.decimalCastBinary(19));
//		 AlgorithmNo004.decimalCastBinary_jins(19);
		 
		 // 5번문제 대소문자 변환
//		 System.out.println(AlgorithmNo005.castAlpabet("helloWorlD"));
//		 AlgorithmNo005.castAlpabet_jins("helloWorlD");
		
		// 6번문제 입력된 두수의 최대 공약수를 구하시오 (12, 18)
//		int[] input = {12, 18};
//		System.out.println(AlgorithmNo006.solution(input));
//		 AlgorithmNo006.solution_jins();
		
		// 7번문제 입력된 수가 소수인지 판별하시오.
		AlgorithmNo007.solution(109);
		AlgorithmNo007.solution_jins();

	}
}
