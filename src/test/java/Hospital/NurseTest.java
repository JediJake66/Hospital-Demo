package Hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    Patient sickPatient = new Patient();
    Nurse underTest2 = new Nurse("2", "name", 5);



    @Test
    public void shouldIncresePatientHealthFrom10to25() {
        underTest2.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(25, healthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevel2() {
        underTest2.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }
    @Test
    public void shouldExpectSalaryOf50K() {
        int salary = underTest2.calculatePay();
        assertEquals(50000, salary);
    }
}
