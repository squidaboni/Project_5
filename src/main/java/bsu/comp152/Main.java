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

    public static void arraySort(double[] inputArray){
        int i, index, minIndex;
        double minValue;
        for (i = 0; i < (inputArray.length-1); i++)
        {
            minIndex = i;
            minValue = inputArray[i];
            for(index = i + 1; index < inputArray.length; index++)
            {
                if (inputArray[index] < minValue)
                {
                    minValue = inputArray[index];
                    minIndex = index;
    }
            }
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = minValue;
        }
    }
}