package view;

import java.util.List;
import java.util.Scanner;
import model.Task;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public int showMenuAndGetChoice() {
        System.out.println("\n===== TASK MANAGER MENU =====");
        System.out.println("1. Create Task");
        System.out.println("2. View Task List");
        System.out.println("3. Mark Task as Complete");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        // Validate input
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // discard invalid input
        }
        return scanner.nextInt();
    }

    public Task getNewTaskDetails() {
        scanner.nextLine();  // consume leftover newline
        System.out.print("Enter Task Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Task Description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter Task Priority (1=High, 2=Medium, 3=Low): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number for priority: ");
            scanner.next(); // discard invalid input
        }
        int priority = scanner.nextInt();

        return new Task(title, desc, priority);
    }

    public void showTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("🚫 No tasks available.");
        } else {
            System.out.println("\n===== TASK LIST =====");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Task ID: " + i);
                System.out.println(tasks.get(i));
            }
        }
    }

    public int getTaskIdToMarkComplete() {
        System.out.print("Enter Task ID to mark as complete: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid Task ID: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
