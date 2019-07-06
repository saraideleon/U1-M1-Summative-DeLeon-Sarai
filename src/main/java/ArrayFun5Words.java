import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];

        System.out.println("Please enter 5 words");
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner1.nextLine();
            System.out.println(array[i]);
        }
    }
}