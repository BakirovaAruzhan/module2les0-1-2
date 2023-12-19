public class Student {
    public String name;
    public int age;
    public int id;
    public int assessmentInMath;
    public int assessmentInBiology;
    public int assessmentOTRussianLang;

    public Student(String name, int age, int id, int assessmentInMath, int assessmentInBiology, int assessmentOTRussianLang) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.assessmentInMath = assessmentInMath;
        this.assessmentInBiology = assessmentInBiology;
        this.assessmentOTRussianLang = assessmentOTRussianLang;
    }

    @Override
    public String toString() {
        return "Student-1" + "name'" + name + '\'' + ", id:" + id + ",age:" + age + ", assessmentInMath:" + assessmentInMath + ", assessmentInBiology:" + assessmentInBiology + ", assessmentOTRussianLang:" + assessmentOTRussianLang;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Aruzhan", 24, 16342, 3, 5, 5);
        Student student2 = new Student("Nursat", 21, 1478596, 5, 4, 5);
        System.out.println("information about the student;");
        System.out.println(student1);
        System.out.println("information about the student;");
        System.out.println(student2);
    }
}


