package com.company;

// There are some System.out.println() methods, that helps to debug

public class SortDesc {
    public static int sortDesc(final int num) {
        int ranks = 0;
        int num1 = num;
        // count of decimal digits in the num
        while (true) {
            num1 /= 10;
            ranks++;
            System.out.println(num1 + "\t" + "\t" + ranks);
            if (num1 == 0) break;
        }

        num1 = num;
        int remain;
        int index = 0;
        int number[] = new int[ranks]; //creating an array for the required number of digits
        // filling this array with numbers of num
        while (true) {
            remain = num1 % 10;
            number[index] = remain;
            num1 /= 10;
            System.out.println(num1 + "\t" + remain + "\t" + index + "\t" + number[index]);
            index++;
            if (num1 == 0) break;
        }
        // "bubble" sorting
        for (int i = 1; i < number.length; i++) {
            for (int j = number.length - 1; j >= i; j--) {
                if (number[j - 1] < number[j]) {
                    int helper = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = helper;
                }
            }
        }
        num1 = 0;
        // gathering together all numbers
        for (int i = 0; i < number.length; i++) num1 = num1 * 10 + number[i];
        System.out.println(num1);

        return num1;
    }
}
