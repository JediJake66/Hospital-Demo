package Hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {
    Surgeon underTest = new Surgeon("3", "name", "speciality",true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreseHealth10To20(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20,healthLevel);
    }
    @Test
    public void shouldReturn100k(){
       int salary = underTest.calculatePay();
       assertEquals(100000,salary);
    }

}
