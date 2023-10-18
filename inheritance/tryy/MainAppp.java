package inheritance.tryy;

public class MainAppp {
    public static void main(String[] args) {

        Child c = new Child();
        c.info1();
        System.out.println();
        c.name = "Dadu";
        c.age = 21;

        Child c1 = new Child();
        c1.name="Gemme";
        c1.age = 22;

        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c.name);
        System.out.println(c.age);

        System.out.println();
        c1.info1();
        System.out.println();
        c1.info2();
        System.out.println();
        c.infor();

    }
}
