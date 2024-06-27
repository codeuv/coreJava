public class T3_hierarchial {
    static class Animal{
        String name ;
        String habitat ;
        String food ;

        public Animal(String name, String habitat, String food) {
            this.name = name;
            this.habitat = habitat;
            this.food = food;
        }

        void makeSound(){
            System.out.println("...No sound...");
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", habitat='" + habitat + '\'' +
                    ", food='" + food + '\'' +
                    '}';
        }
    }

    static class Dog extends Animal{
        String pet_name = "";

        public Dog(String name, String habitat, String food, String pet_name) {
            super(name, habitat, food);
            this.pet_name = pet_name;
        }

        void makeSound(){
            System.out.println("Bow Bow Bow");
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class Cat extends Animal{
        String fav_food = "";

        public Cat(String name, String habitat, String food, String fav_food) {
            super(name, habitat, food);
            this.fav_food = fav_food;
        }

        @Override
        void makeSound() {
            System.out.println("Meow Meow Meow");
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "fav_food='" + fav_food + '\'' +
                    ", name='" + name + '\'' +
                    ", habitat='" + habitat + '\'' +
                    ", food='" + food + '\'' +
                    '}';
        }
    }
}
