package jp.ac.uryukyu.ie.e175703;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    @Test
    public void decreased() {
        boolean productempty = true;
        VendingMachine product1 = new VendingMachine(1,"コーラ", 120, 5);
        for(int i=0; i<5; i++) {
            product1.decreased();
        }
        assertEquals(productempty, product1.isEmpty());
    }
}