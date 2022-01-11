package University;

public class University {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivan Ibalovich", "math");
        Student student = new Student("Durak Huyovich", "STSI-12");
        System.out.println(teacher.getSubject() + "\n" + student.getGroup());
        teacher.printInfo();
        student.printInfo();
    }
}
