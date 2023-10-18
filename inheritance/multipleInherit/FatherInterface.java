package inheritance.multipleInherit;

public interface FatherInterface {
    String var = "FromTheInterface";

     default void parent(){
         System.out.println(" I am from Interface from father !! ");
    }



}
