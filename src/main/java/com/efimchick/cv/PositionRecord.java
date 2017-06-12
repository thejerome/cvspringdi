package com.efimchick.cv;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Jerome on 12.06.2017.
 */


@Data
@Builder
@EqualsAndHashCode
@ToString
public class PositionRecord{

    private int sinceYear;
    private int untilYear;
    private String position;
    private String organization;
    private String office;
    private String location;
    private String additionalInfo;

}
