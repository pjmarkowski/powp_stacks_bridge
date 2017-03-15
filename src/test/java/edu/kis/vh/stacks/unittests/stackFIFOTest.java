package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Piotr on 16.03.2017.
 */
public class stackFIFOTest {

    private StackFIFO stackFIFO = new StackFIFO();

    @Test
    public void shouldPopElement() {
        final int VALUE = 3;

        stackFIFO.push(VALUE);
        final int TEST_VALUE = stackFIFO.pop();

        assertThat(VALUE, is(TEST_VALUE));
    }

}
