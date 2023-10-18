package inheritance.multipleInherit;

public class MainApp {
    public static void main(String[] args) {
        Son s= new Son();

        s.parent();
        s.age = 21;
        s.name = "Demo";
        s.parent();
        s.parent();
        System.out.println(s.age);
        System.out.println(s.name);
        s.parent();
    }
}
