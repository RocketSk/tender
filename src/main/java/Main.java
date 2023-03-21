import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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

        Employee vlad = new Employee(19000);
        vlad.addSkill(Skills.WINDOWS_INSTALLATION);
        vlad.addSkill(Skills.DOORS_INSTALLATION);
        vlad.addSkill(Skills.CLOUDING_THE_ROOF);
        vlad.addSkill(Skills.FLOOR_SCREED);
        vlad.addSkill(Skills.TILE_LAYING);
        vlad.addSkill(Skills.LEVELING_THE_WALLS);
        vlad.addSkill(Skills.WARNING);


        Brigade brigade_one = new Brigade("Brigade one");
        brigade_one.addEmployeeToBrigade(sam);
        brigade_one.addEmployeeToBrigade(jason);

        Brigade brigade_two = new Brigade("Brigade two");
        brigade_two.addEmployeeToBrigade(john);
        brigade_two.addEmployeeToBrigade(jason);

        Brigade brigade_able = new Brigade("Able three");
        brigade_able.addEmployeeToBrigade(john);
        brigade_able.addEmployeeToBrigade(zaur);
        brigade_able.addEmployeeToBrigade(markus);

        Brigade main_brigade = new Brigade("Main brigade");
        main_brigade.addEmployeeToBrigade(vlad);

        ArrayList<Brigade> tenderList = new ArrayList<>();
        tenderList.add(brigade_one);
        tenderList.add(brigade_two);
        tenderList.add(brigade_able);
        tenderList.add(main_brigade);

        System.out.println("Лучшая бригада которая соответствует параметрам это: ");

        System.out.println(tender.getBestSuggestion(tenderList).getBrigadeName());
    }
}
