package controller;

import java.util.ArrayList;
import java.util.List;
import model.Task;
import view.ConsoleView;

public class TaskController {
    private List<Task> taskList = new ArrayList<>();
    private ConsoleView view;

    public TaskController(ConsoleView view) {
        this.view = view;
    }

    public void start() {
        boolean running = true;
        while (running) {
            int choice = view.showMenuAndGetChoice();
            switch (choice) {
                case 1:
                    Task newTask = view.getNewTaskDetails();
                    taskList.add(newTask);
                    view.showMessage("✅ Task created successfully.");
                    break;
                case 2:
                    view.showTasks(taskList);
                    break;
                case 3:
                    view.showTasks(taskList);
                    int id = view.getTaskIdToMarkComplete();
                    if (id >= 0 && id < taskList.size()) {
                        taskList.get(id).markAsComplete();
                        view.showMessage("✅ Task marked as complete.");
                    } else {
                        view.showMessage("❌ Invalid Task ID.");
                    }
                    break;
                case 4:
                    running = false;
                    view.showMessage("👋 Exiting Task Manager. Goodbye!");
                    break;
                default:
                    view.showMessage("❌ Invalid choice. Please try again.");
            }
        }
    }
}
