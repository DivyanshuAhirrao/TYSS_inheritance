package inheritance.hybridinherit.p1;

public class MainApp {
    public static void main(String[] args) {
        Grandson gs = new Grandson();
        GrandDaughter gd = new GrandDaughter();
        Son s = new Son();

        gs.age = 12;
        gd.age  = 13;
        gd.name = "Adina";
        gs.name = "Henry";
        gs.role();
        gd.role();

        System.out.println(gs.name);
        System.out.println(gs.age);
        System.out.println("-----------");
        System.out.println(gd.name);
        System.out.println(gd.age);

    }
}
