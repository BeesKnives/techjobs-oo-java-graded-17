package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {
    //Fields: job1, job2, job1Print(toString override), job1Array(split toString into array, index 0-7)
    Job job1 = new Job("name1", new Employer("employer1"), new Location("location1"), new PositionType("position1"), new CoreCompetency("competency1"));
    Job job2 = new Job("name2", new Employer("employer2"), new Location("location2"), new PositionType("position2"), new CoreCompetency("competency2"));
    String job1Print = job1.toString(); //get string of output of job
    String[] job1Array = job1Print.split(System.lineSeparator(), -1); //split output into array, separated by the new lines(-1 as limit stops it from cutting out trailing empty items). Should have index of 0-7



    @Test
    public void testSettingJobId(){
        assertNotEquals(job1.getId(), job2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName());
        assertEquals("ACME",job.getEmployer().getValue());
        assertEquals("Desert",job.getLocation().getValue());
        assertEquals("Quality control",job.getPositionType().getValue());
        assertEquals("Persistence",job.getCoreCompetency().getValue());

        assertTrue(job.getName() instanceof String);  //_____________________________talk to TA's abt this'
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

    }


    @Test
    public void testJobsForEquality(){

        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        //Be sure to use assertEquals to verify that these characters are correct,
        // and to use the exact formatting

        assertEquals("",job1Array[0]); //check beginning
        assertEquals("",job1Array[7]); //check end
        //lineSeparator()
        //ID:  _______
        //Name: _______
        //Employer: _______
        //Location: _______
        //Position Type: _______
        //Core Competency: _______
        //lineSeparator()
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){

        assertEquals("ID: 6", job1Array[1]);
        assertEquals("Name: name1", job1Array[2]);
        assertEquals("Employer: employer1", job1Array[3]);
        assertEquals("Location: location1", job1Array[4]);
        assertEquals("Position Type: position1", job1Array[5]);
        assertEquals("Core Competency: competency1", job1Array[6]);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        //If a field is empty, the method should add, “Data not available” after the label.

        Job jobNull = new Job("", new Employer("employer1"), new Location("location1"), new PositionType("position1"), new CoreCompetency("competency1"));
        String jobNullPrint = jobNull.toString(); //get string of output of job

        assertTrue(jobNullPrint.contains("Data not available")); //contains err msg b/c name is empty



    }


}
