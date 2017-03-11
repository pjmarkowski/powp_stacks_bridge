package edu.kis.vh.stacks.list;

class Node {

	private int value;
	private Node prev;
	private Node next;

//Po hermetyzacji tych pól w klasie StackList dostęp do tych pól automatycznie zmienił się na dostęp za pomocą getterow



	Node(int i) {
		setValue(i);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
