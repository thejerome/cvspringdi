package com.efimchick.cv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Jerome on 12.06.2017.
 */


@RunWith(SpringRunner.class)
@ContextConfiguration("/personalData.xml")
public class PersonalDataTests {

    @Autowired
    private PersonalData personalData;


    @Test
    public void testPersonalDataBeanExists(){
        assertNotNull(personalData);
    }

    @Test
    public void testProperties(){
        assertEquals("Evgenii", personalData.getFirstName());
        assertEquals("Efimchik", personalData.getLastName());
        assertEquals("+7(921)386-99-39", personalData.getPhone());
        assertEquals("eugene.efimchick@gmail.com", personalData.getEmail());
        assertEquals(LocalDate.of(1987, 9, 8), personalData.getDateOfBirth());
    }

}
