package com.efimchick.cv.config;

import com.efimchick.cv.PositionRecord;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import java.util.Collections;
import java.util.List;

/**
 * Created by Jerome on 12.06.2017.
 */

@Configuration
@ImportResource("classpath:commonValues.xml")
public class EducationConfig {

    @Autowired
    private String itmo;

    @Autowired
    private String spb;

    @Bean
    public PositionRecord higherEducation(){

        return PositionRecord.builder()
                .sinceYear(2004)
                .untilYear(2010)
                .position("Engineer of IT in education")
                .organization(itmo)
                .location(spb)
                .additionalInfo("graduated with honors")
                .build();
    }

    @Bean
    public PositionRecord postgraduateEducation(){

        return PositionRecord.builder()
                .untilYear(2017)
                .position("Candidate of Technical Sciences (PhD)")
                .organization(itmo)
                .location(spb)
                .additionalInfo("Models and methods" +
                        " for the design, development and application" +
                        " of RLCP-compatible virtual laboratories" +
                        " for learning management systems." +
                        " 05.13.06 Automation and control" +
                        " of technological processes and manufactures" +
                        " (in education) ")
                .build();
    }

}
