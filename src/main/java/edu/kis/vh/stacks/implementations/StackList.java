package edu.kis.vh.stacks.implementations;

/**
 * @author Piotr
 *
 */
public class StackList implements StackInterface {

	private Node last;

    /**
	 *
	 * @param i element do wypchniecia
	 */

	@Override public void push(int i) {
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

	@Override public boolean isEmpty() {
		return last == null;
	}

	/**
	 *
	 * @return zawsze zwraca false
	 */
	//TODO: jezeli funkcja isFull zawsze zwraca false to znaczy ze nie jest potrzebna albo zostala zle zainplementowana
	@Override public boolean isFull() {
		return false;
	}

	/**
	 *
	 * @return zwraca -1 gdy pusty w przeciwnym razie zwraca wartosc
	 */
	@Override public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.getValue();
	}

	@Override public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
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
