import java.io.IOException;
import java.util.Vector;

public class IterateOnUsersVector {
    
    public static void main(String [] args) throws IOException {
        Vector<User> users = UsersLoader.loadUsersInVector(args[0]);
        for (User userAsObject : users) {
             System.out.printf("%s - %s\n", userAsObject.name, userAsObject.email);
        }
    }

}