package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.StackHanoi;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Piotr on 16.03.2017.
 */
public class stackHanoiTest {

    StackHanoi stackHanoi = new StackHanoi();

    @Test
    public void shouldReportReject() {
        final int REJECTED = 0;

        final int TEST_REJECTED = stackHanoi.reportRejected();

        assertThat(TEST_REJECTED, is(REJECTED));
    }

    @Test
    public void shouldPushReject() {
        final int REJECTED_AFTER_PUSH = 1;

        stackHanoi.push(1);
        stackHanoi.push(10);
        final int TEST_REJECTED = stackHanoi.reportRejected();

        assertThat(TEST_REJECTED, is(REJECTED_AFTER_PUSH));
    }
}
