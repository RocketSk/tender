import java.util.ArrayList;
import java.util.HashSet;

public class Brigade {
    private ArrayList<Employee> brigade = new ArrayList<>();
    private HashSet<Skills> brigadeSkillsSet = new HashSet<>();
    private double brigadeSalaryWishes = 0;
    private String brigadeName;

    public Brigade(String brigadeName) {
        if (brigadeName == null) {
            throw new IllegalArgumentException("Name of brigade has been NULL");
        }
        this.brigadeName = brigadeName;
    }


    private void addToBrigade(Employee employee) {
        brigade.add(employee);
        brigadeSkillsSet.addAll(employee.getSkills());
        brigadeSalaryWishes += employee.getSalaryWishes();
    }

    public void addEmployeeToBrigade(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee in " + brigadeName + "has been NULL");
        }
        addToBrigade(employee);
    }

    public int getBrigadeSize() {
        return brigade.size();
    }

    public HashSet getBrigadeSkills() {
        return brigadeSkillsSet;
    }

    public double getBrigadeSalaryWishes() {
        return brigadeSalaryWishes;
    }

    public String getBrigadeName() {
        return brigadeName;
    }
}
