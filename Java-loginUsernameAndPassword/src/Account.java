//imports
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
    

    //method to check for the inputed username
    public String getUsername() {
        return username;
    }

    //method to check for the inputed password
    public char[] getPassword() {
        //return password; <== old version, new one promotes security by preventing exposure of the   password 
        return Arrays.copyOf(password, password.length);
    }


    //method to check for the inputed userID
    public int getUserID() {
        return userId;
    }
    
}
