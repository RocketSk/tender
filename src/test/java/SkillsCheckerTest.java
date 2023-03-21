import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SkillsCheckerTest {

    @Test
    public void getAbleBrigade() {
        SkillsChecker checker = new SkillsChecker();
        Employee sam = new Employee(1700);
        ArrayList tenderList = new ArrayList();
        sam.addSkill(Skills.WINDOWS_INSTALLATION);
        sam.addSkill(Skills.DOORS_INSTALLATION);
        sam.addSkill(Skills.TILE_LAYING);
        sam.addSkill(Skills.LEVELING_THE_WALLS);
        sam.addSkill(Skills.WARNING);
        sam.addSkill(Skills.CLOUDING_THE_ROOF);
        sam.addSkill(Skills.FLOOR_SCREED);
        Employee felix = new Employee(1850);
        felix.addSkill(Skills.FLOOR_SCREED);
        felix.addSkill(Skills.DOORS_INSTALLATION);
        Brigade winnersBrigade = new Brigade("Winners");
        Brigade losersBrigade = new Brigade("Losers");
        winnersBrigade.addEmployeeToBrigade(sam);
        winnersBrigade.addEmployeeToBrigade(felix);
        tenderList.add(winnersBrigade);
        tenderList.add(losersBrigade);

        int expected = 1;
        int actual = checker.getAbleBrigade(tenderList).size();
        Brigade actualBrigade = (Brigade) checker.getAbleBrigade(tenderList).get(0);
        Assert.assertEquals(winnersBrigade,actualBrigade);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAbleBrigadeIllegalArgumentExceptionBrigadeListIsNULL(){
        SkillsChecker checker = new SkillsChecker();
        ArrayList brigadeList = null;
        checker.getAbleBrigade(brigadeList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAbleBrigadeIllegalArgumentExceptionNotApproveBrigade(){
        SkillsChecker checker = new SkillsChecker();
        Employee sam = new Employee(1700);
        ArrayList tenderList = new ArrayList();
        sam.addSkill(Skills.WINDOWS_INSTALLATION);
        sam.addSkill(Skills.DOORS_INSTALLATION);
        Brigade winnersBrigade = new Brigade("Winners");
        winnersBrigade.addEmployeeToBrigade(sam);
        tenderList.add(winnersBrigade);

        checker.getAbleBrigade(tenderList);
    }
}