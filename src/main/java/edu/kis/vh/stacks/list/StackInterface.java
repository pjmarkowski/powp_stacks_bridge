package edu.kis.vh.stacks.list;

/**
 * Created by Piotr on 23.03.2017.
 */
public interface StackInterface {

    void push(int i);

    boolean isEmpty();

    //TODO: jezeli funkcja isFull zawsze zwraca false to znaczy ze nie jest potrzebna albo zostala zle zainplementowana
    boolean isFull();

    int top();

    int pop();
}
