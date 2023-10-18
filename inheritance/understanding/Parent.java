package inheritance.understanding;

public class Parent {
    int a = 10;
    int b;

    {
        a = 20;
        b = 30;
        System.out.println("parent object is loaded");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
