package org.example;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started ! ");

        int[] theArrayOfIntegers = new int[5];

        String[] theArrayOfStrings = {"firstString", "SecondString ", "thirdString"};

        theArrayOfIntegers[0] = 10;
        theArrayOfIntegers[1] = 20;
        theArrayOfIntegers[2] = 30;
        theArrayOfIntegers[3] = 40;
        theArrayOfIntegers[4] = 50;
//
        for (int peremennaya : theArrayOfIntegers){
            System.out.println("the peremennaya is " + peremennaya);

        }

        for (int i = 0; i < theArrayOfIntegers.length; i++) {
            System.out.println(
                    theArrayOfIntegers[i]   );
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("the iterator  is " + i);
        }



        int stopInteger = 0;
        boolean isNotEnd = true;

        while (isNotEnd) {
            System.out.println("working with int " + stopInteger);

            if (stopInteger == 5){
                isNotEnd = false;
            } else {
                stopInteger++;
            }
        }

        System.out.println("Program Finished ! ");
    }

    /**
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
     * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
     * Return true if the party with the given values is successful, or false otherwise.
     *
     * @param cigars
     * @param isWeekend
     * @return
     */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        boolean result = false;

        //your code goes here


        return result;
    }

}
