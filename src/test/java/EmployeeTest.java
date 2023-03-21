import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class EmployeeTest {

    @Test
    public void getSkills() {
        Employee sam = new Employee(1300);
        sam.addSkill(Skills.LEVELING_THE_WALLS);
        sam.addSkill(Skills.TILE_LAYING);
        HashSet expected = new HashSet();
        expected.add(Skills.LEVELING_THE_WALLS);
        expected.add(Skills.TILE_LAYING);
        HashSet actual = sam.getSkills();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSalary_wishes() {
        Employee sam = new Employee(1300);
        double expected = 1300;
        double actual = sam.getSalaryWishes();
        Assert.assertEquals(expected,actual,0.0000001);
    }

    @Test
    public void addSkill() {
        Employee sam = new Employee(1300);
        sam.addSkill(Skills.LEVELING_THE_WALLS);
        int expected = 1;
        int actual = sam.getSkills().size();
        Assert.assertEquals(expected,actual);
    }
}