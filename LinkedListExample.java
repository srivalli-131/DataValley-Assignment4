import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int compareTo(Employee another) {
        int nmcmpr = this.name.compareTo(another.name);
        if (nmcmpr!= 0) {
            return nmcmpr;
        }
        // If names are the same, compare based on salary
        return Double.compare(this.salary, another.salary);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Employee> emp = new LinkedList<>();
        emp.add(new Employee(1, "Sai", "Developer", 20000));
        emp.add(new Employee(2, "Sri", "Tester", 60000));
        emp.add(new Employee(3, "Nani", "Trainer", 45000));
        emp.add(new Employee(4, "Chinna", "Analyst", 55000));
        emp.add(new Employee(5, "Charlie", "Designer", 40000));

        // Sort the list
        Collections.sort(emp);

        // Print the sorted list
        System.out.println("Sort based on the name and salary:");
        for (Employee empy : emp) {
            System.out.println(empy);
        }
    }
}