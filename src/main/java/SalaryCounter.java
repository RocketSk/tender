import java.util.ArrayList;

public class SalaryCounter {
    private double salaryBudget;
    private ArrayList<Brigade> budgetBrigade = new ArrayList<>();

    SalaryCounter(double salaryBudget){
        this.salaryBudget = salaryBudget;
    }

    private ArrayList<Brigade> gettingBrigadeSalarySuggesting(ArrayList<Brigade> brigades) {
        if (brigades == null) {
            throw new IllegalArgumentException("Brigade has been NULL");
        }
        for (int i = 0; i < brigades.size(); i++) {
            Brigade currentBrigade = brigades.get(i);
            if (currentBrigade.getBrigadeSalaryWishes() <= salaryBudget) {
                budgetBrigade.add(currentBrigade);
            }
        }
        if (budgetBrigade.size() > 0) {
            return budgetBrigade;
        }
        throw new IllegalArgumentException("Not cheap brigades");
    }

    public ArrayList<Brigade> getBudgetBrigadeArray(ArrayList<Brigade> budgetBrigadesArray) {
        return gettingBrigadeSalarySuggesting(budgetBrigadesArray);
    }
}