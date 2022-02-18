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

class SinglyLinkedList extends Object {
	Node head;
	Node tail;
	int size;

	public void add(Object data) {
		Node newNode = new Node(data, null);

		if (size == 0) {
			head = newNode;
			tail = newNode;
			size++;
			return;
		}

		tail.rLink = newNode;
		tail = newNode;
		size++;

	}

	public void add(Object data, int index) {
		Node newNode = new Node(data, null);

		Node curr = head;

		while (getSize() < index) {
			curr = curr.rLink;
		}

		newNode.rLink = curr.rLink;

		curr.rLink = newNode;

		size++;
	}

	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(index + " is out of bounds");
		}

		else if (index == 0) {
			return head.data;
		} else if (index == size - 1) {
			return tail.data;
		}

		else {
			Node n1 = head.rLink;

			for (int pos = 1; pos < index; pos++) {
				n1 = n1.rLink;
			}

			return n1.data;
		}

	}

	public void reverseList() {
		Object a[] = new Object[size];
		Node n1 = head;

		for (int i = 0; i < size; i++) {
			a[i] = n1.data;
			n1 = n1.rLink;
		}

		for (int i = size - 1; i >= 0; i--)
			System.out.print(" " + a[i]);
	}

	public Object getHead() {
		return head.data;
	}

	public Object getTail() {
		return tail.data;
	}

	public int getSize() {
		return size;
	}
	
	public void update(Object data,int index)
	{
		
	}
	
	public void delete(int index)
	{
		
	}

	@Override
	public String toString() {
		String str = "";
		
		Node curr = head;

		while (curr != null) {
			str = str + curr.data + " ";
			curr = curr.rLink;
		}

		return "["+str+"]";
	}
}

public class Mainclass {

	public static void main(String[] args) {

		SinglyLinkedList sl = new SinglyLinkedList();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		
		sl.update(361, 1);
		System.out.println(sl);
	}

}
