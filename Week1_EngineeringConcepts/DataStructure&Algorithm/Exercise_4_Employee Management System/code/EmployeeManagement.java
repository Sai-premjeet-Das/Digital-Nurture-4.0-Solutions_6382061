class Employee {
    int employeeId;
    String name;
    String position;
    double salary;
    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name +", Position: " + position + ", Salary: " + salary;
    }
}
public class EmployeeManagement {
    private Employee[] employees;
    private int count;
    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Added: " + emp);
        } else {
            System.out.println("Employee list is full!");
        }
    }
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }
    public void displayEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Deleted employee ID: " + id);
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void main(String[] args) {
        EmployeeManagement manager = new EmployeeManagement(5);
        manager.addEmployee(new Employee(1, "Alice", "Manager", 60000));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 45000));
        manager.addEmployee(new Employee(3, "Charlie", "HR", 35000));
        manager.displayEmployees();
        Employee found = manager.searchEmployee(2);
        System.out.println(found != null ? "Found: " + found : "Not found");
        manager.deleteEmployee(2);
        manager.displayEmployees();
    }
}