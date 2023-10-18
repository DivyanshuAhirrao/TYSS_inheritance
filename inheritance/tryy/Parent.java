package inheritance.tryy;

public class Parent {

    String name;
    static int age;

    static
    {
        System.out.println("Hello I am First Initializer");
        Child c = new Child();
        c.info1();
    }
    static {
        System.out.println("Hello I am Second Initializer");
    }

    public void infor(){
        System.out.println("I am method from parent !!");
    }
}
