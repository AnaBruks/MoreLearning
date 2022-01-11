package OOP;

public class Teacher {
    private String name, subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student student){
        int mark = (int) (2+ Math.random() * 5);
        System.out.println("Преподаватель " + name +  " оценил студента с именем " +  student.getName() +
                " по предмету " + subject +  " на оценку " + mark);
        switch(mark){
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("неудовлетворительно");
        }


    }
}
