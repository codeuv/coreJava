public abstract class Shape {
    String color ;
    boolean border;
    //can have attriburtes and constructors
    Shape(String color){
        this.color = color ;
    }

    //can have concrete methods
    final void border(){
        this.border = true;
        System.out.println("ADDED BORDER");
    }

    void sayHi(){
        System.out.println("HI, i am shape");
    }

    //abstract method
    abstract float calculateArea();
}
