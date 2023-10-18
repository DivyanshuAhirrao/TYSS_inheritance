package inheritance.multilevelinheritance;

public class Driver1 {
    public static void main(String[] args) {

       RightAngleTriangle r1 = new RightAngleTriangle(12.2,65.56);
        System.out.println(r1.area);
        System.out.println(r1.base);
        System.out.println(r1.height);
        r1.computeArea();
        r1.display();
    }
}
