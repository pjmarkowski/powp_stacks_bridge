package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi(StackList stackList) {
		super(stackList);
	}

	public StackHanoi() {
	}

	public StackHanoi(StackArray stackArray) {
	}

	public int reportRejected() {
	return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top()) {
			totalRejected++;
		}
		else {
			super.push(in);
		}
	}
}
