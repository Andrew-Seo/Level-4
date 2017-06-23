package BinaryTree;

public class Node {
	Node right;
	Node left;
	Object data;

	Object getData() {
		return data;
	}

	void setData(Object s) {
		s = data;
	}

	Node getLeftNode() {
		return left;
	}

	Node getRightNode() {
		return right;
	}

	void setleftNode(Node left) {
		this.left = left;
	}

	void setRightNode(Node right) {
		this.right = right;
	}
}
