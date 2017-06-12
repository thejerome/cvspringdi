package com.efimchick.cv.converters;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Jerome on 12.06.2017.
 */
public class CustomLocalDateConverter extends PropertyEditorSupport{

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(LocalDate.from(formatter.parse(text)));
    }
}
