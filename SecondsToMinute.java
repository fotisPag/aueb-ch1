package gr.aueb.cf.ch1;


import java.util.Scanner;

public class SecondsToMinute {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        final int DAY= 36000 * 24;
        final int HOUR = 3600;
        final int MINUTE = 60;

        int inputSeconds = 0;
        int days = 0, hours=0, minutes=0;
        int remainingSeconds = 0;

        System.out.println("Please insert the count of Seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds %= DAY;

        hours = remainingSeconds / HOUR;
        remainingSeconds %= HOUR;

        minutes = remainingSeconds / MINUTE;
        remainingSeconds %= MINUTE;


        System.out.printf("Input seconds: %d = %d Days, %d Hours, %d Minutes, %d Seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);

    }
}
