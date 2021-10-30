package Hospital;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrTest {
    Doctor underTest = new Doctor("1", "name", "speciality");
    Patient sickPatient = new Patient();


    @Test
    public void shouldIncreasePatientHealthFrom10to20() {
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20, healthLevel);

    }

    @Test
    public void shouldDecreaseBloodLevel() {
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);

    }

    @Test
    public void shouldExpectSalaryOf90K() {
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }
}
