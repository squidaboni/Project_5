package bsu.comp152;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File myFile = new File("dataIn.txt");
        Scanner inputFile = new Scanner(myFile);


        ArrayList<Double> numbers = new ArrayList<>();
        while (inputFile.hasNext()) {
            numbers.add(inputFile.nextDouble());
        }

        double[] numberArray = new double[numbers.size()];


        for (int i = 0; i < numbers.size(); i++) {
            numberArray[i] = numbers.get(i);
        }

        //sort the array
        arraySort(numberArray);

        /* Quick Test without data in
        Below is a test using Josh's and Madelyne's methods on a test array
        double[] testArray = {9, 3, 5, 4, 2, 7};

        arraySort(testArray);
        String outString = String.valueOf(medianValue(testArray));
        System.out.println(outString);
         */


        /*
         * written by Josh Sheputa
         */
        //File outFile = new File("dataOut.txt");
        String outString = String.valueOf(medianValue(numberArray));
        FileWriter outWriter = new FileWriter("dataOut.txt");
        outWriter.write(outString + "\n");
        outWriter.close();
        System.out.println("Successfully wrote to file");

    }

    /**
     * Method written by Josh Sheputa, Bridgewater State, jsheputa@student.bridgew.edu, 4/12/23
     * Takes a double array, then sequentially sorts them from smallest to largest value
     *
     * @param inputArray given array to sort
     */
    public static void arraySort(double[] inputArray) {
        //integer iterable, 2nd iterable, whole index progress
        int i, index, minIndex;
        //minimum value for minIndex to end of array
        double minValue;
        //for every item in array, and for every item within the specified bounds
        for (i = 0; i < (inputArray.length - 1); i++) {
            minIndex = i;
            minValue = inputArray[i];
            for (index = i + 1; index < inputArray.length; index++) {
                //check if index value is lesser than current minimum, set as new minimum if true
                if (inputArray[index] < minValue) {
                    minValue = inputArray[index];
                    minIndex = index;
                }
            }
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = minValue;
        }
    }

    /**
     * Method finds the median value in an array of sorted numbers
     *
     * @param array - sorted array from Josh's method
     * @return returns the median value to be entered into dataOut file
     */
    public static double medianValue(double[] array) {

        double median;
        int middle;
        int sizeArray = array.length; // find size of array

        // determine if it is even or odd (length%2 = 1, odd, length%2 = 0, even)
        if (sizeArray % 2 == 0) { // if even, find middle two numbers, find their average
            middle = sizeArray / 2;
            median = ((array[middle] + array[middle - 1]) / 2);
        } else { // if odd, find middle number
            middle = sizeArray / 2;
            median = array[middle];
        }

        return median; // Return median value (to be written to new file)
    }

}