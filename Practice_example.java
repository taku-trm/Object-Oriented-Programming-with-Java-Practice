class Employee {
    private int age;
    private String designation;
    private String Name;

    public Employee(String name) {

        Name = name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        System.out.println("The age of the employee is: " + age);
        return age;
    }

    public void setDesignation(String desig) {
        designation = desig;
    }

    public String getDesignation() {
        System.out.println("The employee designation is: " + designation);
        return designation;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee age is: " + age);
        System.out.println("Employee designation is: " + designation);
    }
}

public class Practice_example {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John");
        employee1.setAge(20);
        employee1.setDesignation("Engineer");
        employee1.displayEmployeeDetails();

        Employee employee2 = new Employee("James");

        employee2.setAge(35);
        employee2.setDesignation("CFO");

        employee2.displayEmployeeDetails();
    }
}
