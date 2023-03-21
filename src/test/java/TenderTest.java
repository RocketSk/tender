import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TenderTest {

    @Test
    public void getBestSuggestion() {
        Tender tender = new Tender();

        Employee john = new Employee(1290);
        john.addSkill(Skills.CLOUDING_THE_ROOF);

        Employee sam = new Employee(40000);
        sam.addSkill(Skills.WINDOWS_INSTALLATION);
        sam.addSkill(Skills.DOORS_INSTALLATION);
        sam.addSkill(Skills.CLOUDING_THE_ROOF);

        Employee zaur = new Employee(1800);
        zaur.addSkill(Skills.WINDOWS_INSTALLATION);
        zaur.addSkill(Skills.DOORS_INSTALLATION);
        zaur.addSkill(Skills.CLOUDING_THE_ROOF);

        Employee markus = new Employee(1800);
        markus.addSkill(Skills.TILE_LAYING);
        markus.addSkill(Skills.FLOOR_SCREED);
        markus.addSkill(Skills.LEVELING_THE_WALLS);
        markus.addSkill(Skills.WARNING);

        Employee jason = new Employee(1800);
        jason.addSkill(Skills.WINDOWS_INSTALLATION);
        jason.addSkill(Skills.DOORS_INSTALLATION);
        jason.addSkill(Skills.CLOUDING_THE_ROOF);

        Employee jackOfAllTrades = new Employee(19000);
        jackOfAllTrades.addSkill(Skills.WINDOWS_INSTALLATION);
        jackOfAllTrades.addSkill(Skills.DOORS_INSTALLATION);
        jackOfAllTrades.addSkill(Skills.CLOUDING_THE_ROOF);
        jackOfAllTrades.addSkill(Skills.FLOOR_SCREED);
        jackOfAllTrades.addSkill(Skills.TILE_LAYING);
        jackOfAllTrades.addSkill(Skills.LEVELING_THE_WALLS);
        jackOfAllTrades.addSkill(Skills.WARNING);


        Brigade brigade_one = new Brigade("Brigade one");
        brigade_one.addEmployeeToBrigade(sam);
        brigade_one.addEmployeeToBrigade(jason);

        Brigade brigade_two = new Brigade("Brigade two");
        brigade_two.addEmployeeToBrigade(john);
        brigade_two.addEmployeeToBrigade(jason);

        Brigade brigade_three = new Brigade("Brigade three");
        brigade_three.addEmployeeToBrigade(john);
        brigade_three.addEmployeeToBrigade(zaur);
        brigade_three.addEmployeeToBrigade(markus);

        Brigade unbelievable_brigade = new Brigade("Unbelievable brigade");
        unbelievable_brigade.addEmployeeToBrigade(jackOfAllTrades);

        ArrayList<Brigade> tenderList = new ArrayList<>();
        tenderList.add(brigade_one);
        tenderList.add(brigade_two);
        tenderList.add(brigade_three);
        tenderList.add(unbelievable_brigade);

        System.out.print("Best suggestion from: ");
        System.out.println(tender.getBestSuggestion(tenderList).getBrigadeName());
        
        Brigade expected = brigade_three;
        Brigade actual = tender.getBestSuggestion(tenderList);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBestSuggestionIllegalArgumentExceptionTenderListIsNULL(){
        Tender tender = new Tender();
        ArrayList tenderList = null;
        tender.getBestSuggestion(tenderList);
    }

}