package test.day0_self_practice.DateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateMethods {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy/HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println(formatDateTime);

    }
}
