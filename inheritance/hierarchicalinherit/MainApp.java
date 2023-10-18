package inheritance.hierarchicalinherit;

public class MainApp {
    public static void main(String[] args) {
        Cardiologist c = new Cardiologist();
        c.name= "Dhruv";
        c.dlno = 52369521;
        c.heartSpecialist();
        c.pulseCheckUp();
        System.out.println(c.name);
        System.out.println(c.dlno);
        System.out.println("-----------------------------");

        Orthologist o = new Orthologist();
        o.name = "Chandu";
        o.dlno = 99999555;
        o.orthoSpecialist();
        o.pulseCheckUp();
        System.out.println(o.name);
        System.out.println(o.dlno);
        System.out.println("-----------------------------");

        Gynacologist g= new Gynacologist();
        g.name = "Govind";
        g.dlno = 667222333;
        g.intestineSpecialist();
        g.pulseCheckUp();
        System.out.println(g.name);
        System.out.println(g.dlno);

    }
}
