public class Employee {
    public String name;
    public int id;
    public int wages;

    public Employee(String name, int id, int wages) {
        this.name = name;
        this.id = id;
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "Employee:\n" + "Имя работника:" + name + "\nID:" + id + "\nЗарплата:" + wages;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee otherEmployee = (Employee) obj;

        return id == otherEmployee.id;
    }


    public static void main(String[] arg) {
        Employee employee1 = new Employee("Aru", 14896, 10000);
        Employee employee2 = new Employee("Altyn", 14963, 15000);
        Employee employee3 = new Employee("Aru", 14896, 10000);


        System.out.println("Employee 1:\n" + employee1);
        System.out.println("Employee 2:\n" + employee2);

        System.out.println("Результаты сравнения:");
        System.out.println("employee1 равен employee2: " + employee1.equals(employee2));
        System.out.println("employee1 равен employee3: " + employee1.equals(employee3));
    }
}
