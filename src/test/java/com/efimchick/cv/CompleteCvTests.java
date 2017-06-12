package com.efimchick.cv;

import com.efimchick.cv.config.CvConfig;
import com.efimchick.cv.config.EducationConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Jerome on 12.06.2017.
 */


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CvConfig.class)
public class CompleteCvTests {

    @Autowired
    private CurriculumVitae cv;

    @Test
    public void testCvBeanExists(){
        assertNotNull(cv);
    }

    @Test
    public void testCvElementsNotNull(){
        assertNotNull(cv.getPersonalData());
        assertNotNull(cv.getEducation());
        assertNotNull(cv.getExperience());
        assertNotNull(cv.getSkills());
    }


    @Test
    public void testCvCollectionsHaveExpectedSizes(){
        assertEquals(2, cv.getEducation().size());
        assertEquals(3, cv.getExperience().size());
        assertEquals(5, cv.getSkills().size());
    }

}
