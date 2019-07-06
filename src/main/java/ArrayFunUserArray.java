import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        //Your code must read 5 ints from the user, put them in an array, and print the array elements to the screen.
        System.out.print("Please enter 5 numbers.");

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
        array[i] = scanner.nextInt();
        System.out.println(array[i]);
        }
    }
}
