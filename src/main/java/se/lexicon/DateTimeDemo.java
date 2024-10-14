package se.lexicon;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {
        String date = "2024-10-14";
        System.out.println(date + 1);

        LocalDate today = LocalDate.parse("2024-01-14");
        // how to access the tomorrow date?
        System.out.println(today);
        System.out.println(today.plusDays(20));


        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);
        LocalTime lectureTime = LocalTime.parse("09:00");
        System.out.println("lectureTime = " + lectureTime);


        LocalDate localDate = LocalDate.parse("2021-01-01");
        System.out.println(localDate.isLeapYear());




        //LocalDate birthDate = LocalDate.parse("2020-01-01");
        //System.out.println("birthDate = " + birthDate);
        //System.out.println();


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);


        LocalDate feb25th = LocalDate.parse("2022-02-25");
        System.out.println(feb25th.format(DateTimeFormatter.BASIC_ISO_DATE));// 20220225
        System.out.println(feb25th.format(DateTimeFormatter.ISO_DATE));// 2022-02-25









    }

}
