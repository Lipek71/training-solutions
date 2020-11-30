package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todoLists = new ArrayList<>();

    public void addTodo(String caption) {
        todoLists.add(new Todo(caption));
    }

    public void finishTodos(String caption) {
        for (Todo todo : todoLists){
            if(todo.getCaption().equals(caption)){
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish){
        for(String caption: todosToFinish){
            finishTodos(caption);
        }
    }

    public List<String> todosToFinish(){
        List<String> todosToFinish = new ArrayList<>();
        for(Todo todo : todoLists){
            if (!todo.isFinished()){
                todosToFinish.add(todo.getCaption());
            }
        }
        return todosToFinish;
    }

    public int numberOfFinishedTodos(){
        int count=0;
        for(Todo todo:todoLists){
            if(todo.isFinished()){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return todoLists.toString();
    }
}
