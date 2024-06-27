package codeuv.Employee;

public class Manager extends Employee{
    private String branch;
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "branch='" + branch + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
