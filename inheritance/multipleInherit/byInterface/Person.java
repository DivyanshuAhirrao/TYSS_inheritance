package inheritance.multipleInherit.byInterface;

public class Person implements Walkable,Dance,Run {

    @Override
    public void legs() {
        System.out.println("Yes there are two legs !!");
    }

    @Override
    public void timeConsumed() {
        System.out.println("3 hours !!");
    }

    @Override
    public void caloriesBurned() {
        System.out.println("255 kcal !!");
    }

}
