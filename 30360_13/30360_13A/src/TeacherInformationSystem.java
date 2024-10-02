import TeacherDataBase.TeacherDatabase;

import java.util.Scanner;

public class TeacherInformationSystem {
    static TeacherDatabase teacherDatabase;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String url, user, password, name, address;
        int id;

        System.out.print("MySQL DataBase URL: ");
        url = input.next();
        System.out.print("User: ");
        user = input.next();
        System.out.print("Password: ");
        password = input.next();

        teacherDatabase = new TeacherDatabase(url, user, password);

        System.out.print("Teacher ID: ");
        id = input.nextInt();

        input.nextLine();

        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Address: ");
        address = input.nextLine();

        teacherDatabase.insertTeacherInfo(id, name, address);
    }
}
