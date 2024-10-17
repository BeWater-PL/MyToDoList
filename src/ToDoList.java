import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDoItem> items;

    public ToDoList() {
        items = new ArrayList<>();
    }

    public void addTask(String task) {
        items.add(new ToDoItem(task));
    }

    public void displayTasks() {
        if (items.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden.");
            return;
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ": " + items.get(i));
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).markAsCompleted();
        } else {
            System.out.println("Ungültiger Index.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        } else {
            System.out.println("Ungültiger Index.");
        }
    }
}
