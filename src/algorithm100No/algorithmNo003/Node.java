package algorithm100No.algorithmNo003;

public class Node {
	private int left;
	private int right;
	private int[] target;
	
	
	public Node(int left, int right, int[] target) {
		this.left = left;
		this.right = right;
		this.target = target;
	}
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}

	public int[] getTarget() {
		return target;
	}

	public void setTarget(int[] target) {
		this.target = target;
	}
	
}
