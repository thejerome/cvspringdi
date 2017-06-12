package com.efimchick.cv;

import lombok.*;

import java.time.LocalDate;

/**
 * Created by Jerome on 12.06.2017.
 */

@Getter
@Setter
@ToString
public class PersonalData {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String phone;
}
