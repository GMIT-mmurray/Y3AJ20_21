import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> pointList = new ArrayList();

        pointList.add("1");
        pointList.add("2");
        pointList.add("5");
        pointList.add("0");

        //  pointList.forEach(p -> System.out.println(p));

        JButton button = new JButton("Submit");
        button.addActionListener(event -> System.out.println("Button Pressed"));
     /**************************************************************************/
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));

     /*************************************************************************/

        Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream1.forEach(p -> System.out.println(p));

     /*************************************************************************/
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream2 = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}

