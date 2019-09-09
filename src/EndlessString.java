import java.util.Scanner;

public class EndlessString {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.println("enter a number");
        userInput = keyboard.nextLine();


        while (userInput.equals("")){
            System.out.println("break");
            userInput =keyboard.next();
        }

    }

    }