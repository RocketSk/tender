import java.util.ArrayList;

import static java.util.Comparator.comparing;

public class Tender {

    private SalaryCounter salaryCounter = new SalaryCounter(20000);
    private SkillsChecker skillsChecker = new SkillsChecker();

    private ArrayList<Brigade> getSuitableBrigades(ArrayList<Brigade> candidateBrigade) {
        if (candidateBrigade == null) {
            throw new IllegalArgumentException("Brigade list in candidateBrigade has been NULL");
        }
        return skillsChecker.getAbleBrigade(salaryCounter.getBudgetBrigadeArray(candidateBrigade));
    }

    public Brigade getBestSuggestion(ArrayList<Brigade> candidateBrigade) {
        ArrayList<Brigade> goodBrigades = getSuitableBrigades(candidateBrigade);
        goodBrigades.sort(comparing(Brigade::getBrigadeSalaryWishes));
        return goodBrigades.get(0);
    }
}
