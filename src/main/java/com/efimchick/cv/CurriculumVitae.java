package com.efimchick.cv;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;
import java.util.Map;

/**
 * Created by Jerome on 12.06.2017.
 */

@Data
@Builder
public class CurriculumVitae {
    private PersonalData personalData;

    @Singular("educationRecord")
    private List<PositionRecord> education;
    @Singular("experienceRecord")
    private List<PositionRecord> experience;
    @Singular
    private Map<String,List<String>> skills;

}
