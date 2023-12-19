import java.util.Arrays;

public class Person1 {
    public String firstname;
    public String lastname;
    public int age;
    public char sex;
    public String[] interests;

    public Person1(String firstname, String lastname, int age, char sex, String[] interests) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.interests = interests;
    }

    public void display() {
        System.out.println("Name: " + firstname + " Age: " + age + " Sex: " + sex);
        System.out.println("Interests: " + Arrays.toString(interests));
    }

    public static void main(String[] args) {
        String[] interestsArr = {"Learning something new every day", " lying still,", "swimming", "walking"};
        Person1 person1 = new Person1("Aruzhan", "Bakirova", 24, 'F', interestsArr);
        person1.display();
    }

}
