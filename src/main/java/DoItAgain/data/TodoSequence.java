package DoItAgain.data;

public class TodoSequence {

    private static int todoId;

    public static int nextTodoId () {
        return ++todoId;

    }

    public static void  reset() {
        todoId = 0;
    }



}
