package chuong2.phan9;

import java.time.LocalDateTime;

public class Lesson29Ex4 {
    public static void main(String[] args) {
        var currentTime = LocalDateTime.now();
        System.out.printf("Năm: %ty%n", currentTime);
        System.out.printf("Năm: %tY\n", currentTime);
        System.out.printf("Tháng: %tb\n", currentTime);
        System.out.printf("Tháng: %tB\n", currentTime);
        System.out.printf("Ngày: %td\n", currentTime);
        System.out.printf("Ngày: %tD\n", currentTime);
        System.out.printf("Giờ: %tH\n", currentTime);
        System.out.printf("Phút: %tM\n", currentTime);
        System.out.printf("Giây: %tS\n", currentTime);
        System.out.printf("Mili giây: %tL\n", currentTime);
        System.out.printf("%td %tm %tY %tH:%tM:%tS.%tL",
                currentTime, currentTime, currentTime,
                currentTime, currentTime, currentTime,
                currentTime);

    }

}
