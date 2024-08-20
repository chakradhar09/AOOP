package TODO;

import java.util.ArrayList;
import java.util.List;

public class TODO {
    private final List<String> todo;

    public TODO(){
        this.todo = new ArrayList<>();
    }

    public boolean isTask(String task){

        return todo.contains(task);
    }
    public boolean isTask(int position){

        return position < todo.size();
    }

    public boolean addTask(String task){

        return todo.add(task);
    }
    public String updateTask(int position, String task){

        return todo.set(position, task);
    }
    public boolean removeTask(String task){

        return todo.remove(task);
    }
    public boolean removeTaskAll(){

        return todo.removeAll(todo);
    }
    public void listAll(){
        for(String i: todo)
            System.out.println(i);
    }
}
