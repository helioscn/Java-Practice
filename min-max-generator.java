import java.util.Scanner;

public class Practice {
    private static Scanner sc = new Scanner(System.in);

    // Call to return the highest number in given array
    private static int getMax (int[] array) {
        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // Call to return the lowest number in given array
    private static int getMin (int[] array) {
        int min = 100;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    // Main
    public static void main (String args[]) {
        int num = sc.nextInt();             // Get from user the amount of numbers to generate
        int[] randNums = new int[num];      // Make a new array
        int maxNum;                         // Highest number in array of generated numbers
        int minNum;                         // Lowest number in array of generated numbers

        // Generate random numbers to fill array 'randNums'
        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = (int)(Math.random() * 100) + 1;
        }

        maxNum = getMax(randNums);
        minNum = getMin(randNums);

        System.out.println(maxNum + ", " + minNum);
    }
}
