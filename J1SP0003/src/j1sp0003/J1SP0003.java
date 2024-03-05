package j1sp0003;

import java.util.Scanner;

/**
 * insertion sort
 *
 * @author Admin
 */
public class J1SP0003 {

    public static final Scanner in = new Scanner(System.in);

    // Check user input a number integer
    public static int checkInputInt() {
        // Loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a number");
                System.out.print("Enter again: ");
            }
        }
    }

    // Allow user input number of array
    public static int inputSizeOfArray() {
        System.out.print("Enter number of array: ");
        int n = checkInputInt();
        return n;
    }

    // Allow user input value of array
    public static int[] inputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = checkInputInt();
        }
        return a;
    }

    // Sort array by insertion sort
    public static void sortArrayByInsertionSort(int[] a) {
        int len = a.length;
        System.out.print("Unsorted array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < len; i++) {
            int key = a[i];
            int j = i - 1;

            // Move elements of a[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    // Display array after sort
    public static void print(int[] a) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = inputSizeOfArray();
        int[] a = inputValueOfArray(n);
        sortArrayByInsertionSort(a);
        print(a);
    }
}
