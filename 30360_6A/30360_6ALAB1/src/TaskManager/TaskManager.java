package TaskManager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<String> taskManager;

    public TaskManager(){
        this.taskManager =new ArrayList<>();
    }

    public boolean isTask(String task){

        return taskManager.contains(task);
    }
    public String isTask(int position){

        return taskManager.get(position);
    }

    public boolean addTask(String task){

        return taskManager.add(task);
    }
    public String updateTask(int position, String newTask){

        return taskManager.set(position, newTask);
    }
    public void listTasks(){
        for(String i: taskManager)
            System.out.println(i);
    }
    public boolean removeTask(String task){

        return taskManager.remove(task);
    }
}
