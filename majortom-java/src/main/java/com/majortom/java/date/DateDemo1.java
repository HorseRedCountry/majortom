package com.majortom.java.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/6 13:25
 */
public class DateDemo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(2022, Calendar.MARCH,1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, 1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(calendar.getTime());
        Date rawTime = calendar.getTime();
        System.out.println(rawTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(rawTime));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

    }
}
