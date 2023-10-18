package inheritance.complex;

public class MainApp {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ClassB cb = new ClassB();
        ClassC cc = new ClassC();

        System.out.println(cc.ind);

        System.out.println(cc.b);

        cc.test();

    }
}
