import java.util.*;

/**
 * Represents a task in the to-do list.
 */
class Task {
    private String description;
    private String category;
    private String dueDate;
    private boolean isCompleted;

    /**
     * Constructor to initialize a task.
     *
     * @param description Task description
     * @param category    Category of the task (Work, Personal, School, etc.)
     * @param dueDate     Due date in YYYY-MM-DD format
     */
    public Task(String description, String category, String dueDate) {
        this.description = description;
        this.category = category;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    /**
     * Marks the task as completed.
     */
    public void markCompleted() {
        this.isCompleted = true;
    }

    /**
     * Returns the formatted string representation of a task.
     */
    @Override
    public String toString() {
        return "[" + (isCompleted ? "✔" : " ") + "] " + description +
                " (Category: " + category + ", Due: " + dueDate + ")";
    }
}

/**
 * Manages the to-do list operations.
 */
public class ToDoListApp {
    private static List<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Main menu loop that drives the application.
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========= TO-DO LIST APPLICATION =========");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskCompleted();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    /**
     * Adds a new task to the list.
     */
    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine().trim();

        if (description.isEmpty()) {
            System.out.println("Task description cannot be empty!");
            return;
        }

        System.out.print("Enter category (Work/Personal/School/etc.): ");
        String category = scanner.nextLine().trim();

        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine().trim();

        tasks.add(new Task(description, category, dueDate));
        System.out.println("Task added successfully.");
    }

    /**
     * Displays the list of tasks.
     */
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("\nYour To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    /**
     * Marks a selected task as completed.
     */
    private static void markTaskCompleted() {
        viewTasks();
        if (tasks.isEmpty())
            return;

        System.out.print("Enter task number to mark as completed: ");
        int index;
        try {
            index = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }

        if (index > 0 && index <= tasks.size()) {
            tasks.get(index - 1).markCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
