import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("\n  _____          _        _     _      _        \n" +
                    " |_   _|___   __| | ___  | |   (_) ___| |_  ___ \n" +
                    "   | | / _ \\ / _` |/ _ \\ | |__ | |(_-<|  _|/ -_)\n" +
                    "   |_| \\___/ \\__,_|\\___/ |____||_|/__/ \\__|\\___|\n" +
                    "                                                ");
            System.out.println("1. Aufgabe hinzufügen");
            System.out.println("2. Aufgaben anzeigen");
            System.out.println("3. Aufgabe als erledigt markieren");
            System.out.println("4. Aufgabe löschen");
            System.out.println("5. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Eingabepuffer leeren

            switch (choice) {
                case 1:
                    System.out.print("Geben Sie die Aufgabe ein: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    toDoList.displayTasks();
                    break;
                case 3:
                    System.out.print("Geben Sie die Nummer der zu erledigenden Aufgabe ein: ");
                    int completeIndex = scanner.nextInt() - 1;
                    toDoList.markTaskAsCompleted(completeIndex);
                    break;
                case 4:
                    System.out.print("Geben Sie die Nummer der zu löschenden Aufgabe ein: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    toDoList.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Anwendung wird beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Auswahl. Bitte erneut versuchen.");
            }
        }
    }
}