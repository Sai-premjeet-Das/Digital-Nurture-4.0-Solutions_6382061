class Node {
    Task task;
    Node next;
    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
class Task {
    int taskId;
    String taskName;
    String status;
    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }
    public String toString() {
        return "ID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}
public class TaskManagement {
    private Node head;
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        System.out.println("Task added: " + task);
    }
    public Task searchTask(int id) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.taskId == id) return curr.task;
            curr = curr.next;
        }
        return null;
    }
    public void displayTasks() {
        System.out.println("=== Task List ===");
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }
    public void deleteTask(int id) {
        if (head == null) return;
        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task deleted with ID: " + id);
            return;
        }
        Node curr = head;
        while (curr.next != null && curr.next.task.taskId != id) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
            System.out.println("Task deleted with ID: " + id);
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void main(String[] args) {
        TaskManagement manager = new TaskManagement();
        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Write backend", "In Progress"));
        manager.addTask(new Task(3, "Test system", "Not Started"));
        manager.displayTasks();
        Task found = manager.searchTask(2);
        System.out.println(found != null ? "Found: " + found : "Not found");
        manager.deleteTask(2);
        manager.displayTasks();
    }
}