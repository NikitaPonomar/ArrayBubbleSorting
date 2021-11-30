import java.util.Scanner;

public class Main {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    public static void main(String[] args) {
        int[] notSortedArray = getIntegers();

        printArray(notSortedArray);
        printArray(sortIntegers(notSortedArray));

    }


    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please advise the amount of integer numbers, you want to sort");
        int length = scanner.nextInt();
        int[] notSortedArray = new int[length];
        System.out.println("Please input " + notSortedArray.length + " integer numbers");
        for (int i = 0; i < notSortedArray.length; i++) {
            notSortedArray[i] = scanner.nextInt();
        }
        return notSortedArray;
    }

    public static void printArray(int[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            System.out.println("The element " + i + " of array = " + anyArray[i]);
        }
    }

    public static int[] sortIntegers(int[] notSortedArray) {
        int[] sortedArray = notSortedArray;
        if (sortedArray.length == 1) {
            System.out.println("Array is sorted in decreasing order");
            return sortedArray;
        }
        int count;
        int tmp;

        do {
            count = 0;
            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i - 1] < sortedArray[i]) {
                    count++;
                    tmp = sortedArray[i - 1];
                    sortedArray[i - 1] = sortedArray[i];
                    sortedArray[i] = tmp;
                }
            }

        } while (count > 0);
        System.out.println("Array is sorted in decreasing order");
        return sortedArray;
    }

}
