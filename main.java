import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Staff> staffMembers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Staff");
            System.out.println("4. View Staff");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    students.add(new Student(sid, sname, course));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Enter Staff ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Staff Name: ");
                    String tname = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    staffMembers.add(new Staff(tid, tname, dept));
                    System.out.println("Staff added successfully!");
                    break;

                case 4:
                    for (Staff t : staffMembers) {
                        System.out.println(t);
                    }
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}