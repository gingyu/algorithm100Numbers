package algorithm100No.algorithmNo003;

import java.util.ArrayList;
import java.util.List;

/**
 * 이진탐색을 사용하여 가장큰수 또는 가장작은수를 탐색하시오.
 * 
 * - 해당문제는 알고리즘 문제풀이를 중단하고
 * - 현재 대학교에서 강의중인 알고리즘 강의를 찾아보고
 * - 문제를 스스로 만들었다.
 *  
 * - 문제: A1 = {8,3,65,21,62,78,4,31,25}
 * - 문제: A2 = {87,7,5,3,6,2,43,5,2,76,24}
 * 
 * - A1에서 이진탐색으로 62 찾기
 * - A2에서 이진탐색으로 24 찾기
 * 
 * 이진탐색: 배열의 원소들을 순서대로 정렬한 후 중간에서부터 최대일때 오른쪽 가운데 원소를 최소일때 왼쪽에서 가운데 원소를 계속해서
 * 해당 원소의값이 기준값보다 클때는 오른쪽으로 작을때는 왼쪽으로 탐색을 시작한다
 * 
 */

public class Algorithm003_1 {
	static int count = 1;
	
	public static int binarySearch(int[] arr, int target) {
		// 배열의 중앙위치를 결정
		int centerPoint = arr.length/2;
		
		for (int value : arr) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		System.out.println(centerPoint);
		if (arr[centerPoint] != target) {
			count++;
			// 새로운 탐색 진행방향을 결정
			if(arr[centerPoint] < target) {
				int[] tmpArr = new int[arr.length-(centerPoint+1)];
				int cnt = 1;
				for (int i = centerPoint+1; i < arr.length; i++) {
					
					tmpArr[i-(centerPoint+1)] = arr[centerPoint+cnt];
					cnt++;
				}
				
				binarySearch(tmpArr, target);
			} else {
				int[] tmpArr = new int[arr.length-centerPoint];
				for (int i = 0; i < arr.length-centerPoint; i++) {
					tmpArr[i] = arr[i];
				}
				binarySearch(tmpArr, target);
			}
		}
		
		return count;
	}
	
	
}

// 유튜브채널: 엔지니어대한민국님의 [자료구조 알고리즘] 배열을 이진검색트리로 만들기 in Java 영상 코드
class Tree1 {
	class Node {
		int data;
		Node left;
		// 
		Node right;
		
		Node(int data) {
			this.data = data;
			// data: 4
		}
	}
	Node root;
	
	public void makeTree(int[] a) {
		root = makeTreeR(a, 0, a.length - 1);
	}
	
	// 0 1 2 3 [ 4 5 ] 6 7 8 9 / 4
	// 0 [ 1 2 ] 3 / 1
	public Node makeTreeR(int[] a, int start, int end) {
		if (start > end) return null;
		int mid = (start + end) / 2;
		System.out.println("mid: " + mid);
		Node node = new Node(a[mid]);	// 데이터: 4
										// 데이터: start(0) + end(3) / 2 = 1
			
		node.left = makeTreeR(a, start, mid - 1);	// a: 0~9, start: 0, end: 3 / 0,1,2,3
													// a: 0~9, start: 0, end: 0 / 0 
		node.right = makeTreeR(a, mid + 1, end);	// a: 0~9, start: 5, end: 9 / 5,6,7,8
		
		return node;
	}
	
	public void searchBTree(Node n, int find) {
		if (find < n.data) {
			System.out.println("Data is smaller than " + n.data);
			searchBTree(n.left, find);
		} else if (find > n.data) {
			System.out.println("Data is bigger than " + n.data);
			searchBTree(n.right, find);
		} else {
			System.out.println("Data found!!");
		}
	}
}
