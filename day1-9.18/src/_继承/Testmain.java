package _继承;

public class Testmain {
    public static void main(String[] args) {
        Cat XH = new Cat("xiaohua", 1, 'm');
        XH.cat();
        XH.setSex('公');
        System.out.println(XH.getSex());
        System.out.println(XH.getName());
        Animal xh = new Animal("xiaohei", 1);
   //   Animal xhe = new Animal("xiaohei", 1);
        System.out.println(xh.getAge());
    }
}
