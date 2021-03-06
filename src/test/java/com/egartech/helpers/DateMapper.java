package com.egartech.helpers;

import cucumber.api.Transformer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by alander on 27.04.18.
 */
public class DateMapper extends Transformer<LocalDate> {

    @Override
    public LocalDate transform(String date) {

        //Not too sure about the date pattern though, check it out if it gives correct result
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return LocalDate.parse(date, formatter);
    }

}