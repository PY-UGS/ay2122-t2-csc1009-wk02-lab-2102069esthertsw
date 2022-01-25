package com.esther.lab.wk02;

import java.util.Scanner;

public class Q4Zodiac {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int index = (input.nextInt())%12;
        String zodiac = "null";
        switch(index){
            case 0:
                zodiac = "monkey";
                break;
            case 1:
                zodiac = "rooster";
                break;
            case 2:
                zodiac = "dog";
                break;
            case 3:
                zodiac = "pig";
                break;
            case 4:
                zodiac = "rat";
                break;
            case 5:
                zodiac = "ox";
                break;
            case 6:
                zodiac = "tiger";
                break;
            case 7:
                zodiac = "rabbit";
                break;
            case 8:
                zodiac = "dragon";
                break;
            case 9:
                zodiac = "snake";
                break;
            case 10:
                zodiac = "horse";
                break;
            case 11:
                zodiac = "sheep";
                break;
            }
        System.out.println(zodiac);
    }
}

