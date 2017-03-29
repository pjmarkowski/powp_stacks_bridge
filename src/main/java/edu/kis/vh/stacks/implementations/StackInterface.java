package edu.kis.vh.stacks.implementations;

/**
 * Created by Piotr on 23.03.2017.
 */
public interface StackInterface {

    int EMPTY_STACK = 0;

    void push(int i);

    boolean isEmpty();

    //TODO: jezeli funkcja isFull zawsze zwraca false to znaczy ze nie jest potrzebna albo zostala zle zainplementowana
    boolean isFull();

    int top();

    int pop();
    /**
     * dzieki przesunieciu wspolnych stalych klas StackArray i StackList do interfejsu wystarczylo teraz zmienic wartosc zmiennej EMPTY_STACK w jednym miejscu
     */
}
