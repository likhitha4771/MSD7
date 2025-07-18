import controller.TaskController;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        TaskController controller = new TaskController(view);
        controller.start();
    }
}
