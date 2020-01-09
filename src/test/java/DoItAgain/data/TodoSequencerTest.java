package DoItAgain.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoSequencerTest {
    @Before
    public void setUp() throws Exception {
        TodoSequence.reset();

    }

    @Test
    public void nextTodoId_is_1() {
        assertEquals(1, TodoSequence.nextTodoId());
    }
}
