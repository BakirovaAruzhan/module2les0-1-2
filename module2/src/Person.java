
import java.util.Objects;

public class Person {
    public String name;
    public int age;

    public Person() {
        this.name =null;
        this.age = 0;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    public String toString() {
        return "Person\n" + "Name:" + name + "\n Age:" + age;
    }

    public static void main(String[] args) {
        Person person1=new Person();
        Person person2= new Person("Aruzhan", 24);

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println("Повторы:"+ person1.equals(person2));
    }

}