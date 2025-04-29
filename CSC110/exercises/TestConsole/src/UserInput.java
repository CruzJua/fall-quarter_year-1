import java.util.Scanner;

public class UserInput {
    private static Scanner scanLee = new Scanner(System.in);

    public static void run(){
        String retVal = promptForString("Enter your name: ");

        System.out.println("RetVal: " + retVal);
    }
    //Create a method that takes in a prompt and returns the users input IFF the input is not blank
        //if the input was null or blank tell the user the input was bad and prompt again
    public static String promptForString(String prompt){
        String input = null;
        boolean isInvalid = true;

        do {
            System.out.print(prompt);
            input = scanLee.nextLine();
            isInvalid = input == null || input.isBlank();
            if (isInvalid){
                System.out.println("Your input cannot be null, empty, or just blank space. Please, try again.");
            }

        } while (isInvalid);
        return input;

    }
    //If the user fails to take
}
