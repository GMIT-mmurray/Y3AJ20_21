import java.util.Comparator;

public class ByIdComparator implements Comparator<User> {

    public int compare(User first, User second) {

        int result = 0;

        if (first.id < second.id) {
            result = -1;
        }else if (first.id > second.id) {
            result = 1;
        }
        return result;
    }

}