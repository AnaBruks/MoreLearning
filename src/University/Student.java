package University;

public class Student extends Human{
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo(){
        System.out.println("Этот Студент с именем " + super.getName());

    }
}
