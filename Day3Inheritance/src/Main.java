//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        T1_single.Ebook e;
        e = new T1_single.Ebook("IND001", "108727", "How to become Sanyasi in 7 days", "Patashala");
        System.out.println(e.toString());

        T2_multilevel.Oldage o;
        o = new T2_multilevel.Oldage("Jona Liebert", "Male", "IKBNM1545", "Fergueson", 2000);
        System.out.println(o.toString());

        T3_hierarchial.Dog d;
        d = new T3_hierarchial.Dog("Bob the bark", "house,kennel", "bone", "Bob");
        System.out.println(d.toString());

        T3_hierarchial.Cat c;
        c = new T3_hierarchial.Cat("Tom the thief", "pillow", "dried fish", "fish");
        System.out.println(c.toString());
    }
}