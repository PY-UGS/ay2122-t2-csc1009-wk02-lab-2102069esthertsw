package com.esther.lab.wk02;

public class Q3GMT
{
    long totalMilliseconds = System.currentTimeMillis();
    double totalSeconds = totalMilliseconds/1000;
    double totalMinutes = totalSeconds/60;
    double totalHours = totalMinutes/60;

    int currentSeconds = (int)totalSeconds%60;
    int currentMinutes = (int)totalMinutes%60;
    int currentHour = (int)totalHours%24;

    public static void main(String[] args)
    {
        Q3GMT time = new Q3GMT();
        System.out.println("Current time is: " + time.currentHour + ":" + time.currentMinutes + ":" + time.currentSeconds + " GMT");
    }   //  currentHour/Minute/Second had to be declared as static, otherwise they wouldn't print. why?
        // previously didn't create an object, was using the variables straight from the class oops
}