import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main implements MyFirstFunctionalInterface{

    public static void main(String[] args) {

       /* List<String> pointList = new ArrayList();
        pointList.add("1");
        pointList.add("2");
        pointList.add("3");
        pointList.add("0");
        pointList.add("-11");
        pointList.add("fklfjfkjgbsf;dgjs;lgjw;sr'o2");

        pointList.forEach(x -> System.out.println(x));

        JButton button =  new JButton("Submit");
        button.addActionListener(e ->  System.out.println("Click event triggered !!"));
     //////////////////////////////////////////////////////////////////////////////////////////

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

        stream.forEach(System.out::println);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream.forEach(p -> System.out.println(p));
///////////////////////////////////////////////////////////////////////////////////////////////////
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream2 = list.stream();
        stream.forEach(p -> System.out.println(p));*/
////////////////////////////////////////////////////////////////////////////////////////////////
        Stream.generate(() -> (new Random()).nextInt(100)).limit(20).forEach(System.out::println);

        //randomNumbers.limit(20).forEach(System.out::println);
///////////////////////////////////////////////////////////////////////////////////////////////
/*        List<Integer> list = new ArrayList<>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        List<Integer> evenNumbersList = list.stream()
                                            .filter(i -> i%2 == 0)
                                            .collect(Collectors.toList());

        System.out.print(evenNumbersList);*/
///////////////////////////////////////////////////////////////////////////////
        List<Integer> list1 = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list1.add(i);
        }

        Integer[] evenNumbersArr = list1.stream()
                                        .filter(i -> i%2 == 0)
                                        .toArray(Integer[]::new);

        System.out.print(evenNumbersArr);

    }



    @Override
    public void firstWork() {
        System.out.println("First work");
    }
    @Override
    public  String toString () {
        return  "m";
    }

}
