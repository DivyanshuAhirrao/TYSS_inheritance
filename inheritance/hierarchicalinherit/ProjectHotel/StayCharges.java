package inheritance.hierarchicalinherit.ProjectHotel;

public class StayCharges {
    double price;
    double sum;

    StayCharges(double price){
        this.price = price;
    }

    public double calculateRate(int noOfNights){
        sum = price *= noOfNights;
        return sum;
    }

}
