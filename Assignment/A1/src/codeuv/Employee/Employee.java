package codeuv.Employee;

public class Employee {
    //access modifier is set to private to avoid accidental change of employee info
    //info includes name , salary , id
    private String id;
    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

