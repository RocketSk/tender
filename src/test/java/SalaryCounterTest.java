import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
public class SalaryCounterTest {

    @Test
    public void getBudgetBrigadeArray() {
        SalaryCounter counter = new SalaryCounter(20000);
        ArrayList tenderBrigadeList = new ArrayList();
        Brigade brigadeCheap = new Brigade("Cheap");
        Brigade brigadeExpensive = new Brigade("Expensive");
        Employee sam = new Employee(20000.01);
        Employee felix = new Employee(19999.99);
        brigadeCheap.addEmployeeToBrigade(felix);
        brigadeExpensive.addEmployeeToBrigade(sam);
        tenderBrigadeList.add(brigadeCheap);
        tenderBrigadeList.add(brigadeExpensive);
        int expected = 1;
        int actual = counter.getBudgetBrigadeArray(tenderBrigadeList).size();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(brigadeCheap,counter.getBudgetBrigadeArray(tenderBrigadeList).get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBudgetBrigadeArrayIllegalArgumentExceptionBrigadesListIsNULL() {
        SalaryCounter counter = new SalaryCounter(20000);
        ArrayList tenderBrigadeList = null;
        counter.getBudgetBrigadeArray(tenderBrigadeList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBudgetBrigadeArrayIllegalArgumentExceptionNotCheapBrigades() {
        SalaryCounter counter = new SalaryCounter(20000);
        ArrayList tenderBrigadeList = new ArrayList();
        Brigade brigadeCheap = new Brigade("Cheap");
        Brigade brigadeExpensive = new Brigade("Expensive");
        Employee sam = new Employee(29000);
        Employee felix = new Employee(21000);
        brigadeCheap.addEmployeeToBrigade(felix);
        brigadeExpensive.addEmployeeToBrigade(sam);
        tenderBrigadeList.add(brigadeCheap);
        tenderBrigadeList.add(brigadeExpensive);
        int expected = 1;
        int actual = counter.getBudgetBrigadeArray(tenderBrigadeList).size();
        Assert.assertEquals(expected,actual);
    }
}