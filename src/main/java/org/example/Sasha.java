package org.example;


public class Sasha {
    public static void main(String[] args) {

    }

    /**
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
     * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
     * Return true if the party with the given values is successful, or false otherwise.
     */

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars < 40)
            return false;
        else if ((cigars >= 40 && cigars <= 60) && isWeekend == false)
            return true;
        else if (cigars >= 40 && isWeekend == true)
            return true;
        else return false;
    }

    /**
     * You are driving a little too fast, and a police officer stops you.
     * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
     * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
     * If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
     */

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65)
                return 0;
            else if (speed > 65 && speed <= 85)
                return 1;
            else if (speed > 85)
                return 2;
        } else if (!isBirthday) {
            if (speed <= 60)
                return 0;
            else if (speed > 60 && speed <= 80)
                return 1;
            else if (speed > 80)
                return 2;
        }
        return 0;
    }

    /**
     * The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
     * Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
     */

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6)
            return true;
        else if (a + b == 6 || Math.abs(a - b) == 6)
            return true;
        else return false;
    }

    /**
     * Given a number n, return true if n is in the range 1..10, inclusive.
     * Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
     */

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            if (n <= 1 || n >= 10)
                return true;
            else return false;
        } else if (!outsideMode) {
            if (n >= 1 && n <= 10)
                return true;
            else return false;
        }
        return false;
    }

    /**
     * Given 2 ints, a and b, return their sum.
     * However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
     */

    public static int teenSum(int a, int b) {
        int sum = a + b;
        if (a >= 13 && a <= 19)
            return 19;
        else if (b >= 13 && b <= 19)
            return 19;
        else return sum;
    }

}