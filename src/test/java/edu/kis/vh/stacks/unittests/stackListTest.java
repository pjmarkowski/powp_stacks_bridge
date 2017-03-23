package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.implementations.StackList;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Piotr on 15.03.2017.
 */
public class stackListTest {
    private StackList stackList = new StackList();

    @Test
    public void shouldPushElement() {
        final int VALUE = 3;

        stackList.push(VALUE);

        assertThat(VALUE, is(stackList.top()));
    }


    @Test
    public void shouldBeEmpty() {
        final boolean RESULT = true;

        final boolean TEST_RESULT = stackList.isEmpty();

        assertThat(TEST_RESULT, is(RESULT));
    }

    @Test
    public void shouldNotBeFull() {
        final boolean RESULT = false;

        final boolean TEST_RESULT = stackList.isFull();

        assertThat(TEST_RESULT, is(RESULT));
    }

    @Test
    public void shouldPeekElement() {
        final int VALUE = 3;

        stackList.push(VALUE);
        final int TEST_VALUE = stackList.top();

        assertThat(TEST_VALUE, is(VALUE));
    }

    @Test
    public void shouldPopElement() {
        final int VALUE = 3;

        stackList.push(VALUE);
        final int TEST_VALUE = stackList.pop();

        assertThat(TEST_VALUE, is(VALUE));
    }

    @Test
    public void shouldBeEmptyWhilePopElement() {
        final int EMPTY_STACK_VALUE = -1;

        final int TEST_VALUE = stackList.pop();

        assertThat(TEST_VALUE, is(EMPTY_STACK_VALUE));
    }
}
