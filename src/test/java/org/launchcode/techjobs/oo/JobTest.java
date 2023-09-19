package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job job1 = new Job("name1", new Employer("employer1"), new Location("location1"), new PositionType("position1"), new CoreCompetency("competency1"));
        Job job2 = new Job("name2", new Employer("employer2"), new Location("location2"), new PositionType("position2"), new CoreCompetency("competency2"));

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
        Job job1 = new Job("name1", new Employer("employer1"), new Location("location1"), new PositionType("position1"), new CoreCompetency("competency1"));
        Job job2 = new Job("name1", new Employer("employer1"), new Location("location1"), new PositionType("position1"), new CoreCompetency("competency1"));

        assertFalse(job1.equals(job2));

    }



}
