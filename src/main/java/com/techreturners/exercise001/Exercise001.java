package com.techreturners.exercise001;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    public static void main(String[] args) {
        Exercise001 ex1 = new Exercise001();
        int result = ex1.singles(new int []{4, 5, 7, 5, 4, 8});
        System.out.println("Result is " + result);
    }

    public int singles(int [] arr){
        // The function takes an array as the parameter
        // Loop through and compare item with all others
        int sum = 0;
        boolean unique;

        for (int i=0; i<arr.length; i++)
        {
            System.out.println("Starting position: " + i + " value: " + arr[i]);
            int item=arr[i];
            unique = true;

            for (int y=0; y<arr.length; y++)
            {
                if (i==y)
                    continue;

                System.out.println("Comparing position: " + y + " value: " + arr[y] + " to value: " + item);
                if (item == arr[y]){
                    unique = false;
                    System.out.println("Value: " + item + " is not unique, skipping");
                    break;
                }
            }    
            if (unique == true) {
                System.out.println("Value: " + item + " is unique, adding to total");
                sum = sum + item;  
                System.out.println("Sum is now: " + sum);
            }
        }
        return sum;
    }
}
