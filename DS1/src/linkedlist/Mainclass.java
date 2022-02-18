package linkedlist;

class Node extends Object {
	Object data;
	Node rLink;

	public Node(Object data, Node rLink) {
		super();
		this.data = data;
		this.rLink = rLink;
	}

	@Override
	public String toString() {
		return "" + data;
	}
}

public class Mainclass {

	public static void main(String[] args) {
		Node n1 = new Node(10, null);
		Node n2 = new Node(20, null);

		n1.rLink = n2;

		System.out.println(n1);

	}

}
