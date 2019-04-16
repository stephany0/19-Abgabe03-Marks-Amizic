package at.fhj.iit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoanCalculatorTest {

    private LoanCalculator loan;

    /**
     * init a LoanCalculator instance
     */
    @Before
    public void setUp() {
        //SETUP PHASE
        loan = new LoanCalculator(1000, 1, 2);
    }

    /**
     * tests LoanCalculator function monthlyPayment
     * use the function
     * use assertEquals to verify the result
     * may also be helpful:
     * https://onlinerechner.haude.at/Kreditrechner
     */
    @Test
    public void monthlyPayment() {
        //EXERCISE PHASE
        double value = loan.monthlyPayment();

        //VERIFY PHASE
        assertEquals(84.2388656175, 84.2388656175, 0.001);
    }
    /**
     * tests LoanCalculator function totalAmountOwed
     * use the function
     * use assertEquals to verify the result
     * may also be helpful:
     * https://onlinerechner.haude.at/Kreditrechner
     */
    @Test
    public void totalAmountOwed() {
        //EXERCISE PHASE
        double value = loan.totalAmountOwed();

        //VERIFY PHASE
        assertEquals(1010.8663874099, 1010.8663874099, 0.001);
    }
    /**
     * tests LoanCalculator function totalInterestOwed
     * use the function
     * use assertEquals to verify the result
     * may also be helpful:
     * https://onlinerechner.haude.at/Kreditrechner
     */
    @Test
    public void totalInterestOwed() {
        //EXERCISE PHASE
        double value = loan.totalInterestOwed();

        

        //VERIFY PHASE
        assertEquals(10.8663874099, 10.8663874099, 0.001);
    }
}