package com.hqs.util;


import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class TestDateFormat {
    @Test
    public void s() {
        System.out.println ( DateFormat.dateFormat (new Date ()));
    }
    @Test
    public void d(){
        try {
            System.out.println (DateFormat.dateParse ("09/17/2020 - 15:45") );
        } catch (ParseException e) {
            e.printStackTrace ( );
        }
    }
}
