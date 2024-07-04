import java.sql.SQLOutput;

public class SectionB {
    int rollNo ;
    String studentName ;

    public SectionB(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        SectionB.strength += 1;
    }

    @Override
    public String toString() {
        return "SectionB{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    //static is declared for a variable which is common to all the objects
    static int strength = 0 ;
    static String  specialization ;
    static String classTeacher ;
    //static methods cant access non static methods since static methods are independent of instance or objects .
    // to access we need reference of the class
    //static method or properties are dependent on class
    static void getInfo(){
        SectionB s = new SectionB(000,"");
        s.titleName();
        System.out.println("section B is institution which aims to teach archery for youth");
    }

    void titleName(){
        System.out.println("        Section B          ");
    }

}
