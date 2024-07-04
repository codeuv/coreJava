public class Square extends Shape{
    float side ;
    Square(String color){
        super(color);
    }
    @Override
    float calculateArea() {
        return side * side;
    }
    void sayHi(){
        System.out.println("HI, i am Square");
    }
}
