public class Dome2 {
    public static void main(String[] args) {
        Student.setSchool("GDUF");
        System.out.println(Student.getSchool());
        Student lihua = new Student("GDUf","lihua");
        System.out.println(lihua.getName());
        System.out.println(Student.getSchool());
    }
}
class Student{
    private static String school;
    private String name;
    public Student(String school, String name){
        this.name=name;
        Student.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }
}