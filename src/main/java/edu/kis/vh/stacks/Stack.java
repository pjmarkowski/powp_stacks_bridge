package edu.kis.vh.stacks;

public class Stack {
	private final int SIZE = 12;
	private final int EMPTY_STACK = -1;
	private int[] items = new int[SIZE];
	private int total = EMPTY_STACK;

	public void push(int i) {
		if (!isFull())
		items[++total] = i;
	}

	public boolean isEmpty() {
			return total == EMPTY_STACK;
		}

	public boolean isFull() {
				return total == 11;
			}

	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK;
		}
		return items[total];
	}

	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK;
		}
		return items[total--];
	}

	public int getTotal() {
		return total;
	}
}
