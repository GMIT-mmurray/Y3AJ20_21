import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
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

       // System.out.print(evenNumbersArr);

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream()
                   .filter((s) -> s.startsWith("A"))
                   .forEach(System.out::println);

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
                                                      .map(String::toUpperCase)
                                                      .collect(Collectors.toList());

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

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> newList = list.stream()
                                    .peek(System.out::println)
                                    .collect(Collectors.toList());

        System.out.println(newList);

        Collection<String> list2 = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

// Get collection without duplicate i.e. distinct only
        List<String> distinctElements = list2.stream()
                                             .distinct()
                                             .collect(Collectors.toList());

//Let's verify distinct elements
        System.out.println(distinctElements);

        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);

        List<Integer> newList1 = evenNumInfiniteStream.skip(5)
                                                      .limit(10)
                                                      .collect(Collectors.toList());
                                 System.out.println(newList1);

        List<Integer> list11 = Arrays.asList(1,2,3);
        List<Integer> list21 = Arrays.asList(4,5,6);
        List<Integer> list31 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list11, list21, list31);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                                                     .flatMap(x -> x.stream())
                                                     .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);

        List<Integer> list41 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        Optional<Integer> minNumber = list41.stream()
                                            .min((i, j) -> i.compareTo(j));

        System.out.println(minNumber.get());


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
