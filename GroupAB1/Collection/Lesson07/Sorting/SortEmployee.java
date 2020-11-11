import java.util.Arrays;

public class SortEmployee {
    public static void main(String[] args) {
        //sorting object array
        EmployeeComparable[] empArr = new EmployeeComparable[4];
        empArr[0] = new EmployeeComparable(10, "Mikey", 25, 10000);
        empArr[1] = new EmployeeComparable(20, "Arun", 29, 20000);
        empArr[2] = new EmployeeComparable(5, "Lisa", 35, 5000);
        empArr[3] = new EmployeeComparable(1, "Pankaj", 32, 50000);

//sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));
    }
}
