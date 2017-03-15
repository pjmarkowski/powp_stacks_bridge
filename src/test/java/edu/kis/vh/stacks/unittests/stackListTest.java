package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.list.StackList;
import org.junit.Assert;
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

        stackList.pushElement(VALUE);

        assertThat(VALUE, is(stackList.peek()));
    }


    @Test
    public void shouldBeEmpty() {
        final boolean RESULT = true;

        final boolean TEST_RESULT = stackList.empty();

        assertThat(TEST_RESULT, is(RESULT));
    }

}
