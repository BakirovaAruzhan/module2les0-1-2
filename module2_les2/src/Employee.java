public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void setAnnualSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Зарплата должна быть больше нуля для установки годового оклада.");
        }
    }

    public String toString() {
        return "Работник:" + "\n" +
                "Id: " + id + "\n" +
                "FirstName: " + firstName + "\n" +
                "Lastname: " + lastName + "\n" +
                "Name: " + getName() + "\n" +
                "Salary: " + salary + "\n" +
                "Annual Salary: " + getAnnualSalary();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println(employee1.toString());
        System.out.println();

        Employee employee2 = new Employee(1254, "Aruzhan", "Bakirova", 15000);
        employee2.setAnnualSalary(15000);
        System.out.println(employee2.toString());
    }
}