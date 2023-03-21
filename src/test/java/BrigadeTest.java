import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class BrigadeTest {

    @Test
    public void addEmployeeToBrigade() {
        Brigade brigade = new Brigade("Lol");
        Employee sam = new Employee(40000);
        brigade.addEmployeeToBrigade(sam);
        int expected = 1;
        int actual = brigade.getBrigadeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEmployeeToBrigadeIllegalArgumentExceptionEmployeeIsNULL() {
        Brigade brigade = new Brigade("Lol");
        Employee sam = null;
        brigade.addEmployeeToBrigade(sam);
    }

    @Test
    public void getBrigadeSkills() {
        Brigade brigade = new Brigade("Lol");
        Employee sam = new Employee(40000);
        sam.addSkill(Skills.WINDOWS_INSTALLATION);
        sam.addSkill(Skills.DOORS_INSTALLATION);
        brigade.addEmployeeToBrigade(sam);
        int expected = 2;
        int actual = brigade.getBrigadeSkills().size();
        HashSet brigadeSkillsExpected = new HashSet();
        brigadeSkillsExpected.add(Skills.WINDOWS_INSTALLATION);
        brigadeSkillsExpected.add(Skills.DOORS_INSTALLATION);
        HashSet brigadeSkillsActual = brigade.getBrigadeSkills();
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(brigadeSkillsExpected, brigadeSkillsActual);
    }

    @Test
    public void getBrigadeSalaryWishes() {
        Brigade brigade = new Brigade("Lol");
        Employee sam = new Employee(40000);
        brigade.addEmployeeToBrigade(sam);
        double expected = 40000;
        double actual = brigade.getBrigadeSalaryWishes();
        Assert.assertEquals(expected,actual,0.00000001);
    }

    @Test
    public void getBrigadeName() {
        Brigade brigade = new Brigade("Lol");
        String expected = "Lol";
        String actual = brigade.getBrigadeName();
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBrigadeNameIllegalArgumentExceptionNameIsNULL() {
        Brigade brigade = new Brigade(null);
    }


}