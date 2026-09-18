public class Dome1 {
    public static void main(String[] args) {
    animal al1 = new animal();
    al1.setName("xiaobai");
    String a = al1.getName();
    int b = al1.getAge();
    System.out.println(a);
    System.out.println(b);
    System.out.println();
    animal al2 = new animal("xiaohei",18,'男');
    b = al2.getAge();
    a = al2.getName();
    char c = al2.getSex();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println();
    animal al3 = new animal("xiaohei",18);
    b = al3.getAge();
    a = al3.getName();
    System.out.println(a);
    System.out.println(b);
    }
}
class animal{
    private String name;
    private int age;
    private char sex;
    public animal(){

    }
    public animal(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}