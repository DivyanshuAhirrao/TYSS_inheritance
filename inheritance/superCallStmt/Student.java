package inheritance.superCallStmt;

public class Student extends Person{
    int sid;
    Student(){};
    Student(int sid, String name){
        super(name);
        this.sid = sid;
    }

}
