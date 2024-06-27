//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Demonstaration of Encapsulation
        //Encapsulation : concept of OOPS , bundle or group the attributes and behaviour into a single class
        //Attributes - variable / data members
        //Behaviour - methods or function
        Employee e = new Employee();

        System.out.println("Before");
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.toString());
        System.out.println("Setting the attributes for it ...");
        e.setId(333);
        e.setName("Chris Gayle");
        System.out.println("After");
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.toString());

    }
}