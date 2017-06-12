package com.efimchick.cv;

import com.efimchick.cv.config.EducationConfig;
import com.efimchick.cv.config.ExperienceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jerome on 12.06.2017.
 */


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ExperienceConfig.class)
public class ExperienceTests {

    @Autowired
    private List<PositionRecord> experience;


    @Test
    public void testExperienceBeanExists(){
        assertNotNull(experience);
    }

    @Test
    public void testExperienceConsistsOfThreeRecords(){
        assertEquals(3, experience.size());
    }

    @Test
    public void testJavaDev(){
        PositionRecord position = PositionRecord.builder()
                .sinceYear(2009)
                .untilYear(2016)
                .position("Java Developer")
                .organization("ITMO University")
                .office("Distance Learning Center")
                .location("St.Petersburg")
                .additionalInfo("Development and support of AcademicNT LMS" +
                        " and its services.")
                .build();

        assertTrue(experience.contains(position));
    }

    @Test
    public void testHeadOfDep(){

        PositionRecord position = PositionRecord.builder()
                .sinceYear(2016)
                .position("Head of Software and Technical Support Department")
                .organization("ITMO University")
                .office("Distance Learning Center")
                .location("St.Petersburg")
                .additionalInfo("Department planning and management." +
                        " Management of technical infrastructure and support. ")
                .build();

        assertTrue(experience.contains(position));
    }

    @Test
    public void testAssistantProf(){

        PositionRecord position = PositionRecord.builder()
                .sinceYear(2017)
                .position("Assistant Professor")
                .organization("ITMO University")
                .office("Department of Computer Educational Technologies")
                .location("St.Petersburg")
                .additionalInfo("Teaching of IT disciplines." +
                        " Development of virtual laboratories." +
                        " Writing scientiﬁc articles. ")
                .build();

        assertTrue(experience.contains(position));
    }

}
