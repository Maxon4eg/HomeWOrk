package org.example;

/**
 * Hello world!
 */
public class Oksana {
    public static void main(String[] args) {


    }

    /**
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
     * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
     * Return true if the party with the given values is successful, or false otherwise.
     * <p>
     * cigarParty(30, false) → false
     * cigarParty(50, false) → true
     * cigarParty(70, true) → true
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        boolean success;
        if (isWeekend) {
            if (cigars >= 40) {
                success = true;
            } else success = false;
        } else {
            if (cigars <= 60 && cigars >= 40) {
                success = true;
            } else {
                success = false;
            }
        }
        System.out.println(success);
        return success;
    }

    /**
     * You are driving a little too fast, and a police officer stops you.
     * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
     * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
     * If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
     * <p>
     * caughtSpeeding(60, false) → 0
     * caughtSpeeding(65, false) → 1
     * caughtSpeeding(65, true) → 0
     */

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int result, birthdayAllowedSpeedIncrease = 0;
        if (isBirthday) {
            birthdayAllowedSpeedIncrease = 5;
        }
        if (speed <= 60 + birthdayAllowedSpeedIncrease) {
            result = 0;
        } else if (speed <= 80 + birthdayAllowedSpeedIncrease) {
            result = 1;
        } else {
            result = 2;
        }
        System.out.println(result);
        return result;
    }

    /**
     * The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
     * Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
     * <p>
     * love6(6, 4) → true
     * love6(4, 5) → false
     * love6(1, 5) → true
     */
    public boolean love6(int a, int b) {
        int c = a - b;
        int d = b - a;
        boolean love6Result = (a == 6 || b == 6 || (a + b) == 6 || Math.abs(c) == 6 || Math.abs(d) == 6);
        System.out.println("There must be 6 " + love6Result);
        return love6Result;

    }

    /**
     * Given a number n, return true if n is in the range 1..10, inclusive.
     * Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
     * <p>
     * in1To10(5, false) → true
     * in1To10(11, false) → false
     * in1To10(11, true) → true
     */
    public boolean in1To10(int n, boolean outsideMode) {
        boolean resultIn1Top10 = false;
        if (outsideMode) {
            if ((n <= 1) || (n >= 10))
                resultIn1Top10 = true;
        } else {
            resultIn1Top10 = (n >= 1) && (n <= 10);

        }
        System.out.println("Result of in1To10 " + resultIn1Top10);
        return resultIn1Top10;

    }

    /**
     * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
     * So if either value is a teen, just return 19.
     * <p>
     * teenSum(3, 4) → 7
     * teenSum(10, 13) → 19
     * teenSum(13, 2) → 19
     */

    public int teenSum(int a, int b) {
        int sum = a + b;
        int resultTeenSum;
        if ((sum >= 13) && (sum <= 19))
            resultTeenSum = 19;
        else
            resultTeenSum = sum;
        System.out.println("teenSum " + resultTeenSum);
        return resultTeenSum;

    }
}
