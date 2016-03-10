package javatutorial;

import java.util.Scanner;

public class userInput {
    public static void run() {
        Scanner user_input = new Scanner( System.in);
        
        String space = " ";
        
        String first_name;
        System.out.print("Enter your first name: ");
        first_name = user_input.next();
        
        String middle_name;
        System.out.print("Enter your middle name: ");
        middle_name = user_input.next();
        
        String last_name;
        System.out.print("Enter your last name: ");
        last_name = user_input.next();
        
        System.out.println("\n" + "Welcome " + first_name + space + middle_name + space + last_name);
    }
    
}
