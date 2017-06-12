package com.efimchick.cv.config;

import com.efimchick.cv.CurriculumVitae;
import com.efimchick.cv.CurriculumVitae.CurriculumVitaeBuilder;
import com.efimchick.cv.PersonalData;
import com.efimchick.cv.PositionRecord;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static com.google.common.collect.ImmutableList.*;

/**
 * Created by Jerome on 12.06.2017.
 */
@Configuration
@Import({
        EducationConfig.class,
        ExperienceConfig.class
})
@ImportResource({
        "personalData.xml",
        "skills.xml"
})
public class CvConfig {

    @Autowired
    private PersonalData personalData;
    @Autowired
    private List<PositionRecord> records;
    @Resource
    private Map<String, List> skills;


    @Bean
    public CurriculumVitae cv(){
        CurriculumVitaeBuilder builder = CurriculumVitae.builder();

        builder.personalData(personalData);

        records.stream().filter(this::isEducationRecord).forEach(builder::educationRecord);
        records.stream().filter(this::isExperienceRecord).forEach(builder::experienceRecord);

        skills.entrySet().stream().forEach(
                e -> builder.skill(e.getKey(), copyOf(e.getValue()))
        );

        return builder.build();
    }

    private boolean isExperienceRecord(PositionRecord r) {
        return r.getOffice() != null;
    }

    private boolean isEducationRecord(PositionRecord r) {
        return r.getOffice() == null;
    }

}
