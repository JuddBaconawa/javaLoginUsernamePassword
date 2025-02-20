//packages
//java- nk

//imports
import java.util.ArrayList;
import java.util.Scanner;

//main class called App
public class App {

    //main method
    public static void main(String[] args) throws Exception {
        
        //declare scanner for inputs
        Scanner scanner = new Scanner(System.in);

        //arraylist account created to store username and password
        ArrayList <Account> account = new ArrayList<>();

        //added an admin and a user account
        account.add(new Account("admin", "password01".toCharArray()));
        account.add(new Account("user01", "password02".toCharArray()));

        //boolean
        boolean loggedIn = false;

        //while loop to make sure it goes back to the menu
        while (!loggedIn) {
            //prompts for 
            System.out.println("Enter username: ");
            String username = scanner.nextLine().trim();

            System.out.println("Enter password: ");
            String password = scanner.nextLine().trim();

            //if statement to make sure that the input isnt empty
            if (username.isBlank() || password.isEmpty()) {
                System.out.println("Empty input!");
                
            }

            //authentication check
            loggedIn = UserService.login(username, password.toCharArray(), account);

            //if statement to handle login
            if (loggedIn) {
                System.out.println("Log in succesful");
                System.out.println("Welcome back " + username);
            } else {
                System.out.println("Invalid input!");
                pressAnyKeyToContinue(scanner);
            }

            //Arrays.fill(password, '\0');

        }




        //scanner close
        scanner.close();
    }

    //method to continue from a stop
    private static void pressAnyKeyToContinue(Scanner scanner) {
        System.out.println("Press any key to continue.");
        scanner.nextLine();
    }

    //method to exit
    private static void pressAnyKeyToExit(Scanner scanner) {
        System.out.println("Press any key to exit");
        scanner.nextLine();
    }

}
    