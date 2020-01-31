package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

public class JobTest {

    Job test_job_1;
    Job test_job_2;
    Job test_job_3;

    @Before
    public void createJobObject() {
        test_job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_3 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testGettingName() {
        //test_job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", test_job_1.getName());
    }

    @Test
    public void testSettingJobId(){
        assertEquals( 1, test_job_1.getId());
        assertEquals( 2, test_job_2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", test_job_1.getName());
        assertEquals("ACME", test_job_1.getEmployer().getValue());
        assertEquals("Desert", test_job_1.getLocation().getValue());
        assertEquals("Quality control", test_job_1.getPositionType().getValue());
        assertEquals("ACME", test_job_1.getEmployer().getValue());
        assertEquals("Persistence", test_job_1.getCoreCompetency().getValue());
        assertTrue(test_job_1.getEmployer() instanceof Employer);
        assertTrue(test_job_1.getLocation() instanceof Location);
        assertTrue(test_job_1.getPositionType() instanceof PositionType);
        assertTrue(test_job_1.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job_1.equals(test_job_2));
    }
    @Test
    public void testToStringStartsWithBlankLine(){
        assertThat (test_job_1.toString(), startsWith ("\n"));
        assertThat (test_job_1.toString(), endsWith ("\n"));
    }
//    @Test
//    public void dataNotAvailableIfEmpty(){
//        assertThat (test_job_1.toString(), startsWith ("\n"));
//        assertThat (test_job_1.toString(), endsWith ("\n"));
//    }
    @Test
    public void dataNotAvailableIfaFieldIsEmpty(){
        assertTrue (test_job_3.toString().contains("Employer: Data not available"));

    }


}