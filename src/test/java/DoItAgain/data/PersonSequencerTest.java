package DoItAgain.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonSequencerTest {

    @Before
    public void setUp() throws Exception {
        PersonSequencer.reset();

    }

    @Test
    public void nextId_is_1() {
        assertEquals(1,PersonSequencer.nextPersonId());
    }
}
