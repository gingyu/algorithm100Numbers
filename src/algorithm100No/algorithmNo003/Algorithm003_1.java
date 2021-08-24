package algorithm100No.algorithmNo003;

import java.util.ArrayList;
import java.util.List;

/**
 * ����Ž���� ����Ͽ� ����ū�� �Ǵ� ������������ Ž���Ͻÿ�.
 * 
 * - �ش繮���� �˰��� ����Ǯ�̸� �ߴ��ϰ�
 * - ���� ���б����� �������� �˰��� ���Ǹ� ã�ƺ���
 * - ������ ������ �������.
 *  
 * - ����: A1 = {8,3,65,21,62,78,4,31,25}
 * - ����: A2 = {87,7,5,3,6,2,43,5,2,76,24}
 * 
 * - A1���� ����Ž������ 62 ã��
 * - A2���� ����Ž������ 24 ã��
 * 
 * ����Ž��: �迭�� ���ҵ��� ������� ������ �� �߰��������� �ִ��϶� ������ ��� ���Ҹ� �ּ��϶� ���ʿ��� ��� ���Ҹ� ����ؼ�
 * �ش� �����ǰ��� ���ذ����� Ŭ���� ���������� �������� �������� Ž���� �����Ѵ�
 * 
 */

public class Algorithm003_1 {
	static int count = 1;
	
	public static int binarySearch(int[] arr, int target) {
		// �迭�� �߾���ġ�� ����
		int centerPoint = arr.length/2;
		
		for (int value : arr) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		System.out.println(centerPoint);
		if (arr[centerPoint] != target) {
			count++;
			// ���ο� Ž�� ��������� ����
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

// ��Ʃ��ä��: �����Ͼ���ѹα����� [�ڷᱸ�� �˰���] �迭�� �����˻�Ʈ���� ����� in Java ���� �ڵ�
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
		Node node = new Node(a[mid]);	// ������: 4
										// ������: start(0) + end(3) / 2 = 1
			
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
