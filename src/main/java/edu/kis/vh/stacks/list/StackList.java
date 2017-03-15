package edu.kis.vh.stacks.list;

/**
 * @author Piotr
 *
 */
public class StackList {

	private Node last;

	/**
	 *
	 * @param i element do wypchniecia
	 */

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 *
	 * @return zwraca true jesli jest pusty
	 */

	public boolean empty() {
		return last == null;
	}

	/**
	 *
	 * @return zawsze zwraca false
	 */
	public boolean full() {
		return false;
	}

	/**
	 *
	 * @return zwraca -1 gdy pusty w przeciwnym razie zwraca wartosc
	 */
	public int peek() {
		if (empty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
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


