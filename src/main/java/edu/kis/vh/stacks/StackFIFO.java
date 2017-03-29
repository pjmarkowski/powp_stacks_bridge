package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class StackFIFO extends Stack {

	public StackFIFO(StackList stackList) {
		super(stackList);
	}

	public StackFIFO() {
	}

	private final Stack temp = new Stack();

	@Override
	public int pop() {
		while (!isEmpty()) {
			temp.push(super.pop());
		}

		int ret = temp.pop();
		
		while (!temp.isEmpty()) {
			push(temp.pop());
		}

		return ret;
	}
}
