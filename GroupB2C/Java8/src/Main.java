import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
/*        List<String> pointList = new ArrayList();

        pointList.add("1");
        pointList.add("2");
        pointList.add("5");
        pointList.add("0");

        //  pointList.forEach(p -> System.out.println(p));

        JButton button = new JButton("Submit");
        button.addActionListener(event -> System.out.println("Button Pressed"));
     *//**************************************************************************//*
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));
        stream.forEach(System.out::println);

     *//*************************************************************************//*

        Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream1.forEach(p -> System.out.println(p));

     *//*************************************************************************//*
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream2 = list.stream();
        stream.forEach(p -> System.out.println(p));
        *//*************************************************************************/

        //Stream.generate(() -> (new Random()).nextInt(100)).limit(100).forEach(System.out::println);

        /*************************************************************************/

/*
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 100; i++){
            list.add(i);
        }

        List<Integer> evenNumbersList =  list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);

        Integer[] evenNumbersArr =  list.stream().filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);*/

        /*************************************************************************/

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

    }


}

