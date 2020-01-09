package DoItAgain.data;

import DoItAgain.model.Person;
import DoItAgain.model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static Todo[] todoItems;

    static {
        todoItems = new Todo[0];
    }

    public void clear () {
        todoItems = new Todo[0];
    }

    public int size() {
        return todoItems.length;
    }

    public Todo[] findAll () {
        return Arrays.copyOf(todoItems, todoItems.length);
    }

    public Todo findById (int todoId) {
        for(Todo todo : todoItems) {
            if(todo.getTodoId() == todoId) {
                return todo;
            }
        }
        return null;
    }

    public Todo createNewTodo (String description) {
        Todo newTodo = new Todo(TodoSequence.nextTodoId(), description);
        return addToArray(newTodo);

    }

    private Todo addToArray(Todo newTodo) {
        Todo[] temp = new Todo[todoItems.length +1];
        for(int i= 0; i<temp.length; i++) {
            if(i == temp.length-1) {
                temp[i] = newTodo;
            } else {
                temp[i] = todoItems[i];
            }
        }

        todoItems = temp;
        return newTodo;
    }

    public Todo createNewTodo (String description, Person assignee) {
        Todo newTodo = createNewTodo(description);
        newTodo.setAssignee(assignee);
        return newTodo;
    }


}
