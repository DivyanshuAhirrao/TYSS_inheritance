package inheritance.tryy;

public class Child extends Parent{
    public void info1(){
        System.out.println("Yaa I am Child M1 !!");
        age=21;
        name= "Ginua";
        System.out.println(age +"\n"+name);
    }

    public void info2(){
        System.out.println("Yaa I am Child M2 !!");
        age=28;
        name= "Jimmy";
        System.out.println(age +"\n"+name);
    }

    public static void staticAge(){
        age = 23;
        System.out.println(age);
    }



}
