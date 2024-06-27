public class Employee {
     private int id = 0 ;
     private String name = "";

     public void setId(int id) {
          this.id = id;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     @Override
     public String toString() {
          return "Employee{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  '}';
     }
}
