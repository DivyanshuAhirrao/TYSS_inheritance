package inheritance.multilevelinheritance;

public class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    void display(){
        System.out.println("Hieght : "+this.height);
        System.out.println("Base   : "+this.base);
    }

}
