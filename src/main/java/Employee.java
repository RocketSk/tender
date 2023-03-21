import java.util.HashSet;

public class Employee {
    private double salaryWishes;
    private HashSet<Skills> skills = new HashSet<>();

    Employee(double salaryWishes) {
        this.salaryWishes = salaryWishes;
    }

    public HashSet<Skills> getSkills() {
        return skills;
    }

    public double getSalaryWishes() {
        return salaryWishes;
    }

    public void addSkill(Skills skill) {
        skills.add(skill);
    }
}
