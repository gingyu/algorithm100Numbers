package algorithm100No.algorithmNo003;

import algorithm100No.algorithmNo003.Tree1.Node;

//유튜브채널: 엔지니어대한민국님의 [자료구조 알고리즘] 배열을 이진검색트리로 만들기 in Java 영상 코드
public class Tree {
	class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
		}
	}
	public Node root;
	
	public void makeTree(int[] a) {
		root = makeTreeR(a, 0, a.length - 1);
	}

	public Node makeTreeR(int[] a, int start, int end) {
		if (start > end) return null;
		int mid = (start + end) / 2;
		System.out.println("mid: " + mid + " end: " + (mid - 1));
		Node node = new Node(a[mid]);
			
		node.left = makeTreeR(a, start, mid - 1);	// 1 left: a: 0~9, start: 0, end: 3 / 0,1,2,3
		node.right = makeTreeR(a, mid + 1, end);	// 1 right: a: 0~9, start: 5, end: 9 / 5,6,7,8
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
