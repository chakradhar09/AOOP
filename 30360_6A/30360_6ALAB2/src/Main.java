import TODO.TODO;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static TODO todo = new TODO();

    static void menu(){
        System.out.println("|            Menu           |");
        System.out.println("Add Task to TO-DO list (add)");
        System.out.println("Update task in TO-DO list (update)");
        System.out.println("Remove task in TO-DO list (remove)");
        System.out.println("Remove all tasks in TO-DO list (all)");
        System.out.println("List TO-DO list (list)");
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
                if(todo.isTask(task))
                    System.out.println("Duplicate Task Entered");
                else{
                    if(todo.addTask(task))
                        System.out.println("Task Added Successfully");
                    else
                        System.out.println("Failed to Add Task");
                }
            }
            else if(command.equalsIgnoreCase("update")){
                System.out.print("Position: ");
                position = input.nextInt();
                if(todo.isTask(position)){
                    System.out.print("Updated Task: ");
                    input.nextLine();
                    task = input.nextLine();
                    if(!todo.isTask(task)){
                        if (Objects.nonNull(todo.updateTask(position, task)))
                            System.out.println("Task Updated Successfully ");
                        else
                            System.out.println("Failed to Update Task");
                    }
                    else
                        System.out.println("Duplicate Task Entered");
                }
                else
                    System.out.println("Invalid Position");
            }
            else if(command.equalsIgnoreCase("remove")){
                System.out.print("Task to remove: ");
                input.nextLine();
                task = input.nextLine();
                if(todo.isTask(task)){
                    if(todo.removeTask(task))
                        System.out.println("Task Removed Successfully");
                    else
                        System.out.println("Failed ot Remove the Task");
                }
                else
                    System.out.println("Task Dose not exist");
            }
            else if(command.equalsIgnoreCase("all")){
                if(todo.removeTaskAll())
                    System.out.println("Removed all Tasks");
                else
                    System.out.println("Failed to Remove All Tasks");
            }
            else if(command.equalsIgnoreCase("list"))
                todo.listAll();
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
