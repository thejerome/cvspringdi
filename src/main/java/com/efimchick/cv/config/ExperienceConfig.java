package com.efimchick.cv.config;

import com.efimchick.cv.PositionRecord;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

/**
 * Created by Jerome on 12.06.2017.
 */

@Configuration
@ImportResource("classpath:commonValues.xml")
public class ExperienceConfig {

    @Autowired
    private String itmo;
    @Autowired
    private String spb;

    @Bean
    public PositionRecord javaDevPosition(){
        return PositionRecord.builder()
                .sinceYear(2009)
                .untilYear(2016)
                .position("Java Developer")
                .organization(itmo)
                .office("Distance Learning Center")
                .location(spb)
                .additionalInfo("Development and support of AcademicNT LMS" +
                        " and its services.")
                .build();
    }

    @Bean
    public PositionRecord headOfDepPosition(){
        return PositionRecord.builder()
                .sinceYear(2016)
                .position("Head of Software and Technical Support Department")
                .organization(itmo)
                .office("Distance Learning Center")
                .location(spb)
                .additionalInfo("Department planning and management." +
                        " Management of technical infrastructure and support. ")
                .build();
    }
    @Bean
    public PositionRecord assistantProfPosition(){
        return PositionRecord.builder()
                .sinceYear(2017)
                .position("Assistant Professor")
                .organization(itmo)
                .office("Department of Computer Educational Technologies")
                .location(spb)
                .additionalInfo("Teaching of IT disciplines." +
                        " Development of virtual laboratories." +
                        " Writing scientiﬁc articles. ")
                .build();
    }
}
