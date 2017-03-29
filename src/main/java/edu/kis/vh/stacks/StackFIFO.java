package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

public class StackFIFO extends Stack {

	public StackFIFO(StackList stackList) {
		super(stackList);
	}

	public StackFIFO() {
	}

	private final Stack temp = new Stack(new StackList());

	public StackFIFO(StackArray stackArray) {
	}

	/**
	 * Najlepszym wyborem bedzie uzycie StackList
	 */

	@Override public int pop() {
		return 0;
	}
}
