import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
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

        memberNames.stream()
                   .filter((s) -> s.startsWith("A"))
                   .map(String::toUpperCase)
                   .forEach(System.out::println);

        memberNames.stream()
                   .sorted()
                   .map(String::toUpperCase)
                   .forEach(System.out::println);

        List<String> memNamesInUppercase = memberNames.stream()
                                                      .sorted()
                                                      .peek(System.out::println)
                                                      .map(String::toUpperCase)
                                                      .peek(System.out::println)
                                                      .collect(Collectors.toList());

       String[]  memNamesInUppercaseArray = memberNames.stream()
                                                       .sorted()
                                                       .peek(System.out::println)
                                                       .map(String::toUpperCase)
                                                       .peek(System.out::println)
                                                       .toArray(String[]::new);

        System.out.print(memNamesInUppercase);

        boolean matchedResult = memberNames.stream()
                                           .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                                   .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                                   .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        long totalMatched = memberNames.stream()
                                       .filter((s) -> s.startsWith("A"))
                                       .count();

        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

        String firstMatchedName = memberNames.stream()
                                             .filter((s) -> s.startsWith("L"))
                                             .findFirst()
                                             .get();

        System.out.println(firstMatchedName);


        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);

        List<Integer> newList = evenNumInfiniteStream
                .skip(5)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(newList);


        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                                                     .flatMap(x -> x.stream())
                                                     .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);
    }


}

