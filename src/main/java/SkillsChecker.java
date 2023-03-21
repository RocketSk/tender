import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkillsChecker {
    private List<Skills> requiredSkills = Arrays.asList(Skills.values());
    private ArrayList<Brigade> ableBrigades = new ArrayList<>();

    private ArrayList<Brigade> siftingInappropriateBrigades(ArrayList<Brigade> brigadesList) {
        if (brigadesList == null) {
            throw new IllegalArgumentException("Brigade list in SkillsChecker has been NULL");
        }
        for (int i = 0; i < brigadesList.size(); i++) {
            Brigade currentBrigade = brigadesList.get(i);
            if (currentBrigade.getBrigadeSkills().size() == requiredSkills.size()) {
                ableBrigades.add(currentBrigade);
            }
        }
        if (ableBrigades.size() == 0) {
            throw new IllegalArgumentException("Sorry, but we can't found brigade with requirement skills");
        }
        return ableBrigades;
    }

    public ArrayList<Brigade> getAbleBrigade(ArrayList<Brigade> brigadesList) {
        return siftingInappropriateBrigades(brigadesList);
    }
}
