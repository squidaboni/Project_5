package bsu.comp152;

public class Main {
    public static void main(String[] args) {
        /* Quick array test without a file input
        double[] mainArray = {2.0, 3.0, 5.0, 3.0, 8.0};
        for (int i = 0; i < mainArray.length; i++){
            System.out.println(mainArray[i] + " ");
        }
        arraySort(mainArray);
        System.out.println();
        for (int i = 0; i < mainArray.length; i++){
            System.out.println(mainArray[i] + " ");
        }

         */
    }

    /**
     * Method written by Josh Sheputa, Bridgewater State, jsheputa@student.bridgew.edu, 4/12/23
     * Takes a double array, then sequentially sorts them from smallest to largest value
     * @param inputArray given array to sort
     *
     */
    public static void arraySort(double[] inputArray){
        //integer iterable, 2nd iterable, whole index progress
        int i, index, minIndex;
        //minimum value for minIndex to end of array
        double minValue;
        //for every item in array, and for every item within the specified bounds
        for (i = 0; i < (inputArray.length-1); i++){
            minIndex = i;
            minValue = inputArray[i];
            for(index = i + 1; index < inputArray.length; index++){
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
}