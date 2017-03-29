package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackInterface;
import edu.kis.vh.stacks.implementations.StackList;

public class Stack {
	private StackInterface stackList;

    public Stack(StackList stackList) {
        this.stackList = stackList;
    }

    public Stack() {
        this.stackList = new StackList();
    }

    public Stack(StackArray stackArray) {

    }

    public void push(int i) {
        stackList.push(i);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public boolean isFull() {
        return stackList.isFull();
    }

    public int top() {
        return stackList.top();
    }

    public int pop() {
        return stackList.pop();
    }
}

/***
 * Dzieki takiemu rozwiazaniu mozna uzyc jednej z 2 klas StackArray lub StackList
 */
