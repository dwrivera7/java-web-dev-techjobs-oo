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

}
