// Class: WorkingGamer
public class WorkingGamer implements Person, Employee, Gamer {
    private String name;
    private int age;
    private String employeeID;
    private String jobRole;
    private String nickname;
    private String[] games;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String getJobRole() {
        return jobRole;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void setGames(String[] games) {
        this.games = games;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public String[] getGames() {
        return games;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
        System.out.println("Employee ID: " + getEmployeeID() + ", Job Role: " + getJobRole());
        System.out.println("Nickname: " + getNickname() + ", Games: " + String.join(", ", getGames()));
    }

    public static void main(String[] args) {


    }
}

