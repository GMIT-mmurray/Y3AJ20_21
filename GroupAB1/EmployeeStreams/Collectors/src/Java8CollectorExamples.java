import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Java 8 Collectors api Examples
 *
 * @author Venkatesh
 *
 */
public class Java8CollectorExamples {

    public static void main(String[] args) {

// Creating a Employee List - Example

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100, "Sundar", 47, "North America", 450000));
        employeeList.add(new Employee(200, "Pichai", 25, "North America", 50000));
        employeeList.add(new Employee(300, "Larry", 30, "Asia", 450000));
        employeeList.add(new Employee(400, "Page", 59, "Africa", 450000));

// Collectors.toList() Example

        List<String> namesList = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(namesList);

// Collectors.toSet() Example
        Set<String> regionSet = employeeList.stream().map(e -> e.getRegion()).collect(Collectors.toSet());
        System.out.println(regionSet);
        regionSet.add("hello");
        System.out.println(regionSet);

// Collectors.toUnmodifiableSet() Example

        Set<Double> unmodifiableSet = employeeList.stream().map(e -> e.getSal())
                                                           .collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiableSet);
// unmodifiableSet.add(10983d);

// employeeList.add(null);

        Set<Employee> empSet = employeeList.stream().collect(Collectors.toUnmodifiableSet());

// Collectors.toUnmodifiableList(() Example
// employeeList.add(null);
        List<Double> unmodifiableList = employeeList.stream()
                                                    .map(e -> e.getSal())
                                                    .collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableList);

// Collectors.toCollection() Example

        List<String> namesLinkedList = employeeList.stream().map(e -> e.getName())
                                                            .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(namesLinkedList);

        Set<String> regionTreeSet = employeeList.stream().map(e -> e.getRegion())
                                                         .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(regionTreeSet);

// Collectors.toMap() Example
        Map<Integer, Employee> empMap = employeeList.stream()
                                                    .collect(Collectors.toMap((e) -> e.getId(), Function.identity()));
        System.out.println(empMap);

// with duplicate key. uncomment to work with toMap() for duplicate merger.
        employeeList.add(new Employee(400, "Larry Page", 159, "Africa", 1450000));

        Map<Integer, Employee> empDupMap = employeeList.stream()
                                                       .collect(Collectors.toMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empDupMap);

// Collectors.toUnmodifiableMap() Example
        Map<Integer, Employee> empUnmodifiedMap = employeeList.stream()
                                                              .collect(Collectors.toMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empUnmodifiedMap);

// Collector.summingInt() Example

        int sumOfEmpIds = employeeList.stream().collect(Collectors.summingInt((Employee e) -> e.getId()));
        System.out.println("Collectors.summingInt : " + sumOfEmpIds);

// Collector.summingInt() Example

        double sumOfEmpSalss = employeeList.stream().collect(Collectors.summingDouble((Employee e) -> e.getSal()));
        System.out.println("Collectors.summingDouble : " + sumOfEmpSalss);

// Collectors.averagingInt() / averagingLong() / averagingDouble() Examples

        double avgOfEmpSalss = employeeList.stream().collect(Collectors.averagingDouble((Employee e) -> e.getSal()));
        System.out.println("Collectors.averagingDouble avg sal: " + avgOfEmpSalss);

// Collectors.counting() Example

        long count = employeeList.stream().collect(Collectors.counting());
        System.out.println("Collectors.counting() : Count : " + count);

// Collectors.joining() Example
        String joinedStr = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining());
        System.out.println("joinedStr by using joining() method : " + joinedStr);

        String joinedDelimiterStr = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining(" * "));
        System.out.println("joinedDelimiterStr by using joining(Delimiter) method : " + joinedDelimiterStr);

        String joinePrePostStr = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining("*", "@", "|"));
        System.out.println("joinePrePostStr by using joining(Delimiter) method : " + joinePrePostStr);

// Collectors.groupingBy() Example
        Map<String, List<Employee>> groupByRegion = employeeList.stream()
                                                                .collect(Collectors.groupingBy((Employee e) -> e.getRegion()));
        System.out.println("groupByRegion :: " + groupByRegion);

// groupingBy for set.
        Map<String, Set<Employee>> groupByRegionSet = employeeList.stream()
                .collect(Collectors.groupingBy((Employee e) -> e.getRegion(), Collectors.toSet()));
        System.out.println("groupByRegionSet :: " + groupByRegionSet);

// Collectors.partitioningBy() Example
        Map<Boolean, List<Employee>> partitionByAge = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        System.out.println("partitionByAge :: " + partitionByAge);

// Set as Map value
        Map<Boolean, Set<Employee>> partitionByAgeSet = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30, Collectors.toSet()));

// LinkedList as Map value
        Map<Boolean, LinkedList<Employee>> partitionByAgeLinedList = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30, Collectors.toCollection(LinkedList::new)));

// TreeSet as Map value
        /*
         * Map<Boolean, TreeSet<Employee>> partitionByAgeTreeSet = employeeList.stream()
         * .collect(Collectors.partitioningBy(e -> e.getAge() > 30,
         * Collectors.toCollection(TreeSet::new)));
         */

// Collectors.toConcurrentMap() Example
        Map<Integer, Employee> empConcurrentMap = employeeList.stream()
                .collect(Collectors.toConcurrentMap((e) -> e.getId(), Function.identity()));
        System.out.println(empConcurrentMap);

// with duplicate key. uncomment to work with toMap() for duplicate merger.
// employeeList.add(new Employee(400, "Larry Page", 59, "Africa", 450000));

        Map<Integer, Employee> empDupConcurrentMap = employeeList.stream()
                .collect(Collectors.toConcurrentMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empDupMap);

// Collectors.filtering() Example
        List<Employee> filteredEmpList = employeeList.stream()
                .collect(Collectors.filtering((Employee e) -> e.getAge() > 30, Collectors.toList()));
        System.out.println("Collectors.filtering() - filteredEmpList : " + filteredEmpList);

// Collectors.flatMapping() Example

        LineItem lineItem1 = new LineItem(1001, "Item 1", new Date(2010, 07, 01));
        LineItem lineItem2 = new LineItem(1002, "Item 2", new Date(2020, 07, 01));
        LineItem lineItem3 = new LineItem(1003, "Item 3", new Date(2030, 07, 01));
        LineItem lineItem4 = new LineItem(1004, "Item 4", new Date(2040, 07, 01));
        LineItem lineItem5 = new LineItem(1005, "Item 5", new Date(2050, 07, 01));

        List<LineItem> lineItemsList1 = new ArrayList<>();
        lineItemsList1.add(lineItem1);
        lineItemsList1.add(lineItem2);
        lineItemsList1.add(lineItem3);
        lineItemsList1.add(lineItem4);
        lineItemsList1.add(lineItem5);

        Customer customer1 = new Customer(100, "Customer 1", true, "M", lineItemsList1);

        LineItem lineItem6 = new LineItem(2001, "Item 6", new Date(2010, 07, 01));
        LineItem lineItem7 = new LineItem(2002, "Item 7", new Date(2020, 07, 01));

        List<LineItem> lineItemsList2 = new ArrayList<>();
        lineItemsList2.add(lineItem6);
        lineItemsList2.add(lineItem7);

        Customer customer2 = new Customer(200, "Customer 2", true, "F", lineItemsList2);

        LineItem lineItem8 = new LineItem(2003, "Item 8", new Date(2040, 07, 01));
        LineItem lineItem9 = new LineItem(3004, "Item 9", new Date(2070, 07, 01));
        LineItem lineItem10 = new LineItem(3005, "Item 10", new Date(2200, 07, 01));

        List<LineItem> lineItemsList3 = new ArrayList<>();
        lineItemsList3.add(lineItem8);
        lineItemsList3.add(lineItem9);
        lineItemsList3.add(lineItem10);

        Customer customer3 = new Customer(300, "Customer 3", true, "M", lineItemsList3);
        Customer customer4 = new Customer(400, "Customer 4", true, "F", new ArrayList<LineItem>());

        List<Customer> customersList = new ArrayList<>();
        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(customer4);

        Map<String, Set<LineItem>> itemsByGender = customersList.stream()
                .collect(Collectors.groupingBy((Customer c) -> c.getGender(),
                        Collectors.flatMapping(customer -> customer.getLineItems().stream(), Collectors.toSet())));
        System.out.println("itemsByGender : " + itemsByGender);

        Map<String, Long> itemsCountByGender = customersList.stream()
                .collect(Collectors.groupingBy((Customer c) -> c.getGender(),
                                                                            Collectors.flatMapping(customer -> customer.getLineItems().stream(), Collectors.counting())));
        System.out.println("itemsCountByGender " + itemsCountByGender);

// Collectors.maxBy() Example
        Comparator<Employee> empComparator = (e1, e2) -> e1.getId() - e2.getId();
        Optional<Employee> empMaxOptional = employeeList.stream().collect(Collectors.maxBy(empComparator));
        if (empMaxOptional.isPresent()) {
            System.out.println("Max Emp : " + empMaxOptional.get());
        }

// Collectors.minBy() Example
        Optional<Employee> empminOptional = employeeList.stream().collect(Collectors.minBy(empComparator));
        if (empminOptional.isPresent()) {
            System.out.println("Min Emp : " + empminOptional.get());
        }

// Collectors.reducing() Example
        Optional<Employee> reducingOptinal = employeeList.stream()
                .collect(Collectors.reducing(BinaryOperator.minBy(empComparator)));
        if (reducingOptinal.isPresent()) {
            System.out.println("Min Emp using reducing() method : " + reducingOptinal.get());
        }

// Collectors.summarizingDouble() Example
        DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream()
                .collect(Collectors.summarizingDouble((Employee e) -> e.getSal()));
        System.out.println("Statistics summary on employees salary : " + doubleSummaryStatistics);

// Converting 1 to 100 numbers into Stream integer.
        List<Integer> intList = new ArrayList<>();
        IntStream.range(1, 100).forEach(i -> intList.add(i));

// Calling teeing method.
        Double average = intList.stream().collect(
                Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (sum, n) -> sum / n));

        System.out.println("Average of first 100 numbers: " + average);

    }
}