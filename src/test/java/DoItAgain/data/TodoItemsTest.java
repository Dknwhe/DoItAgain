package DoItAgain.data;

import DoItAgain.model.Person;
import DoItAgain.model.Todo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodoItemsTest {

    private TodoItems testObject;



    @Before
    public void setUp() throws Exception {
        testObject = new TodoItems();
        testObject.clear();
        TodoSequence.reset();

        testObject.createNewTodo("Hej 1");
        testObject.createNewTodo("Hej 2", new Person(1,"Test","Testsson"));
        testObject.createNewTodo("Hej 3");

    }

    @Test
    public void three_todoItems_are_successfully_stored () {
        assertEquals(3, testObject.size());
    }

    @Test
    public void given_2_findById_return_correct_object () {
        Todo result = testObject.findById(2);

        assertNotNull(result);
        assertEquals(2, result.getTodoId());
        assertEquals("Hej 2", result.getDescription());
        assertFalse(result.isDone());
        assertNotNull(result.getAssignee());
    }

    @Test
    public void findAll_return_array_size_3 () {
        assertEquals(3,testObject.findAll().length);

    }
}
