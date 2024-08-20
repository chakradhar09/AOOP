import TaskManager.TaskManager;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static TaskManager taskManager = new TaskManager();

    public static void menu(){
        System.out.println("|       Menu        |");
        System.out.println("Add Task (add)");
        System.out.println("Update Task (update)");
        System.out.println("Remove Task (remove)");
        System.out.println("List Tasks (list)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command, task;
        int position;

        menu();
        do{
            System.out.print("> ");
            command = input.next();
            if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("add")){
                System.out.print("Add Task: ");
                input.nextLine();
                task = input.nextLine();
                if(taskManager.isTask(task))
                    System.out.println("Task Already Exits");
                else{
                    if(taskManager.addTask(task))
                        System.out.println("Task added successfully");
                    else
                        System.out.println("Unable to add task");
                }
            }
            else if(command.equalsIgnoreCase("update")){
                System.out.print("Position: ");
                position = input.nextInt();
                if(Objects.nonNull(taskManager.isTask(position))){
                    System.out.print("New Task: ");
                    input.nextLine();
                    task = input.nextLine();
                    if(Objects.isNull(taskManager.updateTask(position, task)))
                        System.out.println("Failed to update task");
                    else
                        System.out.println("Task updated successfully");
                }
                else
                    System.out.println("Task dose not exist");
            }
            else if(command.equalsIgnoreCase("list"))
                taskManager.listTasks();
            else if(command.equalsIgnoreCase("remove")){
                System.out.print("Task: ");
                input.nextLine();
                task = input.nextLine();
                if(taskManager.isTask(task)){
                    if(taskManager.removeTask(task))
                        System.out.println("Task successfully removed");
                    else
                        System.out.println("Failed to remove task");
                }
                else
                    System.out.println("Task dose not exist");
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
