public class Circle extends Shape{
    float radius;
     Circle(String color){
         super(color);
     }
    @Override
    float calculateArea() {
        return (22/7) * this.radius * this.radius;
    }
    void sayHi(){
        System.out.println("HI, i am Circle");
    }
}
