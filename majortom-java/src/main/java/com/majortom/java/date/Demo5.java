package com.majortom.java.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2024/5/27 11:25
 **/
public class Demo5 {
    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        long currentTime = System.currentTimeMillis();
//        System.out.println(currentTime);
//        System.out.println(simpleDateFormat.format(currentTime));
        System.out.println(getTime());
    }

    private static String getTime(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime minus = now.minusDays(1);
       return minus.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        return minus.format(new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm:ss.SSS").toFormatter());
//        return minus.toString();
    }

}
