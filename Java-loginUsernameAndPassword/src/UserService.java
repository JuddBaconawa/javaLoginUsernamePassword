import java.util.ArrayList;
import java.util.Arrays;

public class UserService {

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
	
}
