package org.launchcode.techjobs_oo.Tests;

import org.junit.*;
import org.launchcode.techjobs_oo.*;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

public  class JobTest {



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
    public void testSettingJobId(){
        assertEquals( test_job_1.getId(), test_job_1.getId());
        assertEquals( test_job_1.getId() + 1, test_job_2.getId());
    }

    @Test
    public void testGettingName() {
        //test_job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", test_job_1.getName());
    }


    @Test
    public void testJobConstructorSetsAllFields(){
       // assertEquals("Product tester", test_job_1.getName());
        assertEquals("ACME", test_job_1.getEmployer().getValue());
        assertEquals("Desert", test_job_1.getLocation().getValue());
        assertEquals("Quality control", test_job_1.getPositionType().getValue());
        assertEquals("ACME", test_job_1.getEmployer().getValue());
        assertEquals("Persistence", test_job_1.getCoreCompetency().getValue());
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

    @Test
    public void dataNotAvailableIfaFieldIsEmpty(){
        assertTrue (test_job_3.toString().contains("Employer: Data not available"));

    }


}