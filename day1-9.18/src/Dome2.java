public class Dome2 {
    public static void main(String[] args) {
        Student.setSchoolname("GDUF");
        System.out.println(Student.getSchoolname());
        Student lihua = new Student("GDUf","lihua");
        System.out.println(lihua.getName());
        System.out.println(lihua.getSchoolname());
    }
}
class Student{
    private static String schoolname;
    private String name;
    public Student(String schoolname,String name){
        this.name=name;
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchoolname() {
        return schoolname;
    }

    public static void setSchoolname(String schoolname) {
        Student.schoolname = schoolname;
    }
}