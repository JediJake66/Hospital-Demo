package Hospital;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    Hospital underTest = new Hospital();
    Doctor doctor = new Doctor("1", "Dr McLovin", "OBGYN");
    Nurse nurse = new Nurse("2", "Nurse Chicka", 5);
    Janitor janitor = new Janitor("3", "Bob", "maternity", true);

    @Test
    public void shouldHireADr() {
        underTest.hire(doctor);
        HospitalEmployee foundDoctor = underTest.findEmployee("1");
        assertEquals("Dr McLovin", foundDoctor.getName());
    }

    @Test
    public void shouldBeAbleToHireMultiplePeople() {
        underTest.hire(doctor);
        underTest.hire(janitor);
        underTest.hire(nurse);
        HospitalEmployee foundDoctor = underTest.findEmployee("1");
        HospitalEmployee foundNurse = underTest.findEmployee("2");
        HospitalEmployee foundJanitor = underTest.findEmployee("3");
        assertEquals("Nurse Chicka", foundNurse.getName());
        assertEquals("Dr McLovin", foundDoctor.getName());
        assertEquals("Bob", foundJanitor.getName());
    }

    @Test
    public void shouldBeAbleToHireCollectionOfPeople() {
        underTest.hire(doctor);
        underTest.hire(janitor);
        underTest.hire(nurse);
        Collection<HospitalEmployee> hiredEmployees = underTest.getAllEmployees();
        assertThat(hiredEmployees, containsInAnyOrder(doctor,nurse,janitor));
    }
    @Test
    public void shouldPrintOutAllMedPersonell(){
        underTest.hire(doctor);
        underTest.hire(janitor);
        underTest.hire(nurse);
        Collection<HospitalEmployee> medicalEmployees = underTest.getMedicalEmployees();
        assertThat(medicalEmployees, containsInAnyOrder(doctor,nurse));
    }
    @Test
    public void shouldAdmitpatient(){
        Patient sickPatient = new Patient();
        Patient sickerPatient = new Patient(5,10);
        underTest.admit(sickPatient);
        underTest.admit(sickerPatient);
        Collection<Patient> admittedPatients = underTest.getAllPatients();
        assertThat(admittedPatients, containsInAnyOrder(sickPatient,sickerPatient));
    }
}
