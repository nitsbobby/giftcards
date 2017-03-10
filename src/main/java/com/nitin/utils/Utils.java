package com.nitin.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by tempnisha on 2017-03-09.
 */
public class Utils {

    public static Date convertStringIntoLocalDateFormat() {
        return convertStringIntoLocalDateFormat();
    }

    public static Date convertStringIntoLocalDateFormat(String dateOrNull) {
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy", Locale.ENGLISH);

        try {
            return dateFormat.parse(dateOrNull);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
