public class finalKeyword {
     class Parent {
        int parentID ;
         void sayHi(){
            System.out.println("NAMASKAR...");
        }
    }
    class Child extends Parent {
        int childID ;
        void sayHi(){
            System.out.println("YO YO HIP HOP ");
        }
    }
    public static void main(String[] args) {
        final int var = 10;

        //final variables cant be changed once intialized
        //final methods cant be override
        //final class cant be inherited
        System.out.println(var);
    }
}
