public class Task {

    public String description;
    public String type;
    public String assignee;
    public String issuer;
    public String issueDate;


    public Task(String description, String type, String assignee, String issuer, String issueDate) {
        this.description = description;
        if (!type.equals("normal") && !type.equals("major")&& !type.equals("critical")){
            System.out.println("Недопустимое значение для типа. Допустимые значения: normal, major, critical.");

        }

        this.type=type;
        this.assignee=assignee;
        this.issuer=issuer;
        this.issueDate=issueDate;

    }


    public String getDescription(){
        return description;

    }

    public String getAssignee() {
        return assignee;
    }

    public String getType(){
        return type;
    }

    public String getIssuer(){
        return issuer;
    }
    public String getIssueDate(){
        return issueDate;
    }

    public String toString() {
        return "Описание: " + getDescription() + "\n" +
                "Тип: " + getType() + "\n" +
                "Исполнитель: " + getAssignee() + "\n" +
                "Инициатор: " + getIssuer() + "\n" +
                "Дата создания: " + getIssueDate() + "\n";
    }

    public static void main(String[] arg){
        Task task1=new Task("Task 1.","normal","Aruzhan","Dayana","12.12.2023.");
        Task task2=new Task("Task 2.","major","Assel","Altynay","13.12.2023");
        Task task3=new Task("Task3.", "criticall","Dilnaz","Toty","14.12.2023");

        System.out.println("Задача 1:\n" + task1);
        System.out.println("\nЗадача 2:\n" + task2);
        System.out.println("\nЗадача 3:\n" + task3);
    }



}
