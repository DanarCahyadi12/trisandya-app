package com.example.mantrahindu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private static LocalDate currentDate = LocalDate.now();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
    private static String formatedDate = currentDate.format(formatter);
    private static String date = formatedDate.split("-")[0];
    private static String month = formatedDate.split("-")[1];

    private static String[] months = {
            "Januari",
            "Februari",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember"

    };

    public static String getCurrentDate() {
        return date + " " + months[Integer.parseInt(month)-1] + " " + currentDate.getYear();
    }
}
