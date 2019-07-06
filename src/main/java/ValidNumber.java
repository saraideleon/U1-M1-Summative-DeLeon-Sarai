import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;
        while(! valid ) {
            System.out.print("Enter number between 1 and 10. ");
            number = scanner.nextInt();
            if(number >= 1 && number <= 10){
                valid = true;
                System.out.println(number);

            } else {
                System.out.println("You must enter a number between 1 and 10, please try again.");
            }
        }
    }
}
