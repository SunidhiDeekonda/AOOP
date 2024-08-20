package ToDoListApplicationUsingListInterface;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Buy groceries");
        toDoList.addTask("Clean the house");
        toDoList.displayTasks();

        toDoList.updateTask(0, "Buy groceries and cook dinner");
        toDoList.displayTasks();

        toDoList.removeTask(1);
        toDoList.displayTasks();
    }
}

