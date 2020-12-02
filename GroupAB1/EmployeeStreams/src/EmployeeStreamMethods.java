import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeStreamMethods {
    private static String fileName = "test.txt";

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private static List<Employee> empList = Arrays.asList(arrayOfEmps);
    private static EmployeeRepository employeeRepository = new EmployeeRepository(empList);


    public static void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(fileName));
    }



    
    public void whenBuildStreamFromElements_ObtainStream() {
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        List<Employee> empStream = empStreamBuilder.build().collect(Collectors.toList());
        System.out.println(empStreamBuilder);
        System.out.println(empStream);
        }

    
    public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);
        System.out.println(empList);
        for (int i =0; i < arrayOfEmps.length;i++)
            System.out.println(arrayOfEmps[i]);

        empList.stream()
               .forEach(e -> e.salaryIncrement(10.0));

        System.out.println(empList);
        for (int i =0; i < arrayOfEmps.length;i++)
            System.out.println(arrayOfEmps[i]);

    }

    
    public void whenIncrementSalaryUsingPeek_thenApplyNewSalary() {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream()
                .peek(e -> e.salaryIncrement(10.0))
                .peek(System.out::println)
                .collect(Collectors.toList());

         }

    
    public void whenMapIdToEmployees_thenGetEmployeeStream() {
        Integer[] empIds = { 1, 2, 3 };

        List<Employee> employees = Stream.of(empIds)
                                         .map((i) -> employeeRepository.findById(i))
                                         .collect(Collectors.toList());

         }

    
    public void whenFlatMapEmployeeNames_thenGetNameStream() {
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                                                  .flatMap(Collection::stream)
                                                  .collect(Collectors.toList());

           }

    
    public void whenFilterEmployees_thenGetFilteredStream() {
        Integer[] empIds = { 1, 2, 3, 4 };

        List<Employee> employees = Stream.of(empIds)
                                         .map(employeeRepository::findById)
                                         .filter(e -> e != null)
                                         .filter(e -> e.getSalary() > 200000)
                                         .collect(Collectors.toList());

       }

    
    public void whenFindFirst_thenGetFirstEmployeeInStream() {
        Integer[] empIds = { 1, 2, 3, 4 };

        Employee employee = Stream.of(empIds)
                                  .map(employeeRepository::findById)
                                  .filter(e -> e != null)
                                  .filter(e -> e.getSalary() > 1000000)
                                  .findFirst()
                                  .orElse(null);

     }

    
    public void whenCollectStreamToList_thenGetList() {
        List<Employee> employees = empList.stream().collect(Collectors.toList());

      }

    
    public void whenStreamToArray_thenGetArray() {
        Employee[] employees = empList.stream().toArray(Employee[]::new);

       }

    
    public void whenStreamCount_thenGetElementCount() {
        Long empCount = empList.stream()
                               .filter(e -> e.getSalary() > 200000)
                               .count();

        }

    
    public void whenLimitInfiniteStream_thenGetFiniteElements() {
        Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = infiniteStream.skip(3)
                                              .limit(5)
                                              .collect(Collectors.toList());


    }

    
    public void whenSortStream_thenGetSortedStream() {
        List<Employee> employees = empList.stream()
                                          .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                                          .collect(Collectors.toList());

       }


    
    public void whenFindMin_thenGetMinElementFromStream() {
        Employee firstEmp = empList.stream()
                .min((e1, e2) -> e1.getId() - e2.getId())
                .orElseThrow(NoSuchElementException::new);

        }

    
    public void whenFindMax_thenGetMaxElementFromStream() {
        Employee maxSalEmp = empList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

           }

    
    public void whenApplyDistinct_thenRemoveDuplicatesFromStream() {
        List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());

       }

    
    public void whenApplyMatch_thenReturnBoolean() {
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);

        }

    
    public void whenFindMaxOnIntStream_thenGetMaxInteger() {
        Integer latestEmpId = empList.stream()
                .mapToInt(Employee::getId)
                .max()
                .orElseThrow(NoSuchElementException::new);

        }

    
    public void whenApplySumOnIntStream_thenGetSum() {
        Double avgSal = empList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElseThrow(NoSuchElementException::new);

        }

    
    public void whenApplyReduceOnStream_thenGetValue() {
        Double sumSal = empList.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        }

    
    public void whenCollectByJoining_thenGetJoinedString() {
        String empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "))
                .toString();

        }

    
    public void whenCollectBySet_thenGetSet() {
        Set<String> empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());

        }

    
    public void whenToVectorCollection_thenGetVector() {
        Vector<String> empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(Vector::new));

       }

    
    public void whenApplySummarizing_thenGetBasicStats() {
        DoubleSummaryStatistics stats = empList.stream()
                                               .collect(Collectors
                                               .summarizingDouble(Employee::getSalary));

         }

    
    public void whenApplySummaryStatistics_thenGetBasicStats() {
        DoubleSummaryStatistics stats = empList.stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();

        }

    
    public void whenStreamPartition_thenGetMap() {
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
                Collectors.partitioningBy(i -> i % 2 == 0));

        }

    
    public void whenStreamGroupingBy_thenGetMap() {
        Map<Character, List<Employee>> groupByAlphabet = empList.stream().collect(
                Collectors.groupingBy(e -> new Character(e.getName().charAt(0))));

        }

    
    public void whenStreamMapping_thenGetMap() {
        Map<Character, List<Integer>> idGroupedByAlphabet = empList.stream().collect(
                Collectors.groupingBy(e -> new Character(e.getName().charAt(0)),
                        Collectors.mapping(Employee::getId, Collectors.toList())));

        }

    
    public void whenStreamReducing_thenGetValue() {
        Double percentage = 10.0;
        Double salIncrOverhead = empList.stream().collect(Collectors.reducing(
                0.0, e -> e.getSalary() * percentage / 100, (s1, s2) -> s1 + s2));

        }

    
    public void whenStreamGroupingAndReducing_thenGetMap() {
        Comparator<Employee> byNameLength = Comparator.comparing(Employee::getName);

        Map<Character, Optional<Employee>> longestNameByAlphabet = empList.stream().collect(
                Collectors.groupingBy(e -> new Character(e.getName().charAt(0)),
                        Collectors.reducing(BinaryOperator.maxBy(byNameLength))));

        }

    
    public void whenParallelStream_thenPerformOperationsInParallel() {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream()
               .parallel()
               .forEach(e -> e.salaryIncrement(10.0));

        }

    
    public void whenGenerateStream_thenGetInfiniteStream() {
        Stream.generate(Math::random).limit(5)
                                     .forEach(System.out::println);
    }

    
    public void whenIterateStream_thenGetInfiniteStream() {
        Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = evenNumStream.limit(5)
                                             .collect(Collectors.toList());

        }

    
    public void whenStreamToFile_thenGetFile() throws IOException {
        String[] words = {
                "hello",
                "refer",
                "world",
                "level"
        };

        try (PrintWriter pw = new PrintWriter(
             Files.newBufferedWriter(Paths.get(fileName)))) {
               Stream.of(words).forEach(pw::println);
        }
    }

    private List<String> getPalindrome(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() == length)
                     .filter(s -> s.compareToIgnoreCase(new StringBuilder(s).reverse().toString()) == 0)
                     .collect(Collectors.toList());
    }

    
    public void whenFileToStream_thenGetStream() throws IOException {
        whenStreamToFile_thenGetFile();

        List<String> str = getPalindrome(Files.lines(Paths.get(fileName)), 5);
        }
}
