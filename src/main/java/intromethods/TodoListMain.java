package intromethods;

import java.util.Arrays;
import java.util.List;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTodo("Telefon");
        todoList.addTodo("Locsolás");
        todoList.addTodo("Meeting");
        todoList.addTodo("Telefon");
        todoList.addTodo("Ebéd");
        todoList.addTodo("Meeting");
        todoList.addTodo("Telefon");
        todoList.addTodo("Kutya");
        todoList.addTodo("Vacsora");
        todoList.addTodo("Meccs");

        System.out.println(todoList.todosToFinish());
        todoList.finishTodos("Telefon");
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());
        List<String> todosToFinish = Arrays.asList("Meeting", "Ebéd", "Vacsora");
        todoList.finishAllTodos(todosToFinish);
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());
    }
}
