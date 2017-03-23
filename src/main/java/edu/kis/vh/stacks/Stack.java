package edu.kis.vh.stacks;

public class Stack {
	private StackArray stackArray;

    public Stack(StackArray stackArray) {
        this.stackArray = stackArray;
    }

    public Stack() {
        this.stackArray = new StackArray();
    }

    public void push(int i) {
        stackArray.push(i);
    }

    public boolean isEmpty() {
        return stackArray.isEmpty();
    }

    public boolean isFull() {
        return stackArray.isFull();
    }

    public int top() {
        return stackArray.top();
    }

    public int pop() {
        return stackArray.pop();
    }

    public int getTotal() {
        return stackArray.getTotal();
    }
}
