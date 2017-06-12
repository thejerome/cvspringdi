package com.efimchick.cv;

import com.efimchick.cv.config.EducationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jerome on 12.06.2017.
 */


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EducationConfig.class)
public class EducationTests {

    @Autowired
    private List<PositionRecord> education;


    @Test
    public void testEducationBeanExists(){
        assertNotNull(education);
    }

    @Test
    public void testEducationConsistsOfTwoRecords(){
        assertEquals(2, education.size());
    }

    @Test
    public void testHigherEducation(){
        PositionRecord higherEducation = PositionRecord.builder()
                .sinceYear(2004)
                .untilYear(2010)
                .position("Engineer of IT in education")
                .organization("ITMO University")
                .location("St.Petersburg")
                .additionalInfo("graduated with honors")
                .build();

        assertTrue(education.contains(higherEducation));
    }

    @Test
    public void testPostGraduateEducation(){

        PositionRecord postgraduateEducation = PositionRecord.builder()
                .untilYear(2017)
                .position("Candidate of Technical Sciences (PhD)")
                .organization("ITMO University")
                .location("St.Petersburg")
                .additionalInfo("Models and methods" +
                        " for the design, development and application" +
                        " of RLCP-compatible virtual laboratories" +
                        " for learning management systems." +
                        " 05.13.06 Automation and control" +
                        " of technological processes and manufactures" +
                        " (in education) ")
                .build();

        assertTrue(education.contains(postgraduateEducation));
    }

}
