package inheritance.complex;

public class ClassB extends ClassA{
    @Override
    public void doSometing() {
        System.out.println("Implementation from B");
    }

    int b = 50;
    public void methodB(){
        System.out.println("Hi you must know me !!");
    }
}
