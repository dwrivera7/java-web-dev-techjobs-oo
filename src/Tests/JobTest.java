package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;


public class JobTest {

    Job test_job = new Job(
            "Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence")
    );

    @Test
    public void testSettingJobId(){
        Job bungie_job_1 = new Job();
        Job bungie_job_2 = new Job();

        assertEquals(false, bungie_job_1.getId() == bungie_job_2.getId());
        assertEquals(1, bungie_job_2.getId() - bungie_job_1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test_job instanceof Job);

    }

    @Test
    public void testJobsForEquality(){
        Job bungie_job_1 = new Job(
                "Software Engineer",
                new Employer("Bungie"),
                new Location("Bellevue, WA"),
                new PositionType("Full Time"),
                new CoreCompetency("Developer")
        );
        Job bungie_job_2 = new Job(
                "Software Engineer",
                new Employer("Bungie"),
                new Location("Bellevue, WA"),
                new PositionType("Full Time"),
                new CoreCompetency("Developer")
        );

        assertEquals(false, bungie_job_1.equals(bungie_job_2));
    }

    @Test
    public void testForLines(){
        assertEquals(0,test_job.toString().indexOf("\n"));
        assertEquals(test_job.toString().length()-1, test_job.toString().lastIndexOf("\n"));
    }

    @Test
    public void testLocation(){
        assertEquals("Desert",test_job.getLocation().getValue());
    }

    @Test
    public void testToString(){
        Job empty_job = new Job();
        String dna = "Data not available";
        String expected = "\n" +
                "ID: " + 2 + "\n" +
                "Name: " + dna + "\n" +
                "Employer: " + dna + "\n" +
                "Location: " + dna + "\n" +
                "Position Type: " + dna + "\n" +
                "Core Competency: " + dna + "\n";

        assertEquals(expected,empty_job.toString());
    }

    @Test
    public void testAllFieldsFilled(){
        String expected = "\n" +
                "ID: " + 1 + "\n" +
                "Name: " + "Product tester" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "Desert" + "\n" +
                "Position Type: " + "Quality control" + "\n" +
                "Core Competency: " + "Persistence" + "\n";
        assertEquals(expected,test_job.toString());
    }




}
