package _继承;

public class Cat extends Animal{
        private char sex;
    Cat(String name, int age,char sex) {
        super(name, age);
        this.sex = sex;
    }
    public void cat(){
        System.out.println("miaomiaomiao");
      //  System.out.println(super.name);   private无法直接访问
    }

    public void setSex(char sex) {
            this.sex = sex;
    }
    public char getSex() {
        return sex;
    }
}
