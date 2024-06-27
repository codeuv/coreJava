package codeuv.Employee;

public class Developer extends Employee{
    private String project;
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}