package inheritance.superKeyword;

public class Son extends Father {
    String name = "Steve";
    public void sonDataWithSuperKeyword(){
        System.out.println("Father's name "+super.name);
    }
    public void sonDataWithoutSuperKeyword(){
        System.out.println("Father's name "+name);
    }
    Son(){}
    Son(String name){
        this.name = name;
    }
}
