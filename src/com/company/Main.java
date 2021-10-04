package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean chYear = year >= 0;
        boolean chMonth = month > 0 && month <= 12;
        boolean chDay = day > 0 && day <= 31 && day != 2;
        if (month == 2 && year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            chDay = day > 0 && day <= 29;
        } else if (month == 2) {
            chDay = day > 0 && day <= 28;
        } else if (month == 4 || month == 6 || month == 9 || month ==11  ) {
            chDay = day > 0 && day <= 30;
        }
        if (chDay == true && chMonth == true && chYear == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

