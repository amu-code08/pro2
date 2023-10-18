import java.util.HashMap;
import java.util.Map;

public class UserCredentialsManager {
    private Map<String, String> userCredentials;

    public UserCredentialsManager() {
        userCredentials = new HashMap<>();
    }

    public void addUserCredentials(String username, String password) {
        if(!userCredentials.containsKey(username))
            userCredentials.put(username, password);
    }

    public boolean checkCredentials(String username, String password) {
        String storedPassword = userCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}