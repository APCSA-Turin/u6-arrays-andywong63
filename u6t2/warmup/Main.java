package u6t2.warmup;

public class Main {
    public static void main(String[] args) {

        // Part A (Review)
        // here is a string:
        String myString = "JAVA IS FUN";

        // use a for loop to print out each character
        // of the string, one character per line, like this:
        // J
        // A
        // V
        // ...
        // and so on:
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.substring(i, i + 1));
        }

        // PART B
        // now here is an array of integers:
        int[] nums = { 15, 8, 10, 12, 7, 9, 4 };

        // figure out how to similarly use a for loop to print
        // each element in the array, one number per line:
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
