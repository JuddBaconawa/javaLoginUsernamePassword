//imports
import java.util.ArrayList;
import java.util.Arrays;

//account class
public class Account {

    //account class attributes
    private final String username;
    private final char[] password;
    private int userId;

    //how to create an account
    public Account(String username, char[] password) {
        this.username = username;
        this.password = password;
    }

    public static boolean login(String username, char[] password, ArrayList<Account> accounts) {

        //loggin true
        for (Account account: accounts) {
            if(account.getUsername().equals(username) && Arrays.equals(account.getPassword(), password)) {
                return true;
            }
        }

        //added a different return because it wasnt working before, probably due to the boolean.
        return false;

    }
    

    //method to check for the inputed username
    public String getUsername() {
        return username;
    }

    //method to check for the inputed password
    public char[] getPassword() {
        return password;
    }


    //method to check for the inputed userID
    public int getUserID() {
        return userId;
    }
    
}
