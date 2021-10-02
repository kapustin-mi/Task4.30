package cs.vsu.ru.kapustin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readNumber();
        int palindrome = findNumber(n);

        printPalindrome(palindrome);
    }

    private static int readNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the serial number of the palindrome you are interested in: ");
        int num;
        while (!scn.hasNextInt()) {
            System.out.print("Invalid value! Please, try again: ");
            scn.next();
        }
        num = scn.nextInt();

        if (num <= 0) {
            System.out.println("Error! The number must be positive. Please, try again...");
            return readNumber();
        }

        return num;
    }


    private static int findNumber(int n) {
        int serialNum = 0, num = -1;

            while (serialNum != n) {
                num++;
                if (checkPalindrome(num)) {
                    serialNum++;
                }
            }

        return num;
    }

    private static boolean checkPalindrome(int num) {
        int newNum = 0, remainder;
        int oldNum = num;

        while (num != 0) {
            remainder = num % 10;
            newNum = newNum * 10 + remainder;
            num /= 10;
        }

        return newNum == oldNum;
    }

    private static void printPalindrome(int palindrome) {
        System.out.print("Your palindrome is " + palindrome);
    }
}