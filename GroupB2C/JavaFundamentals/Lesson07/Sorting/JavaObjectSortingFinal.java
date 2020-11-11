import java.util.Arrays;
import java.util.Collections;

public class JavaObjectSortingFinal {

    /**
     * This class shows how to sort custom objects array/list
     * implementing Comparable and Comparator interfaces
     * @param args
     */
    public static void main(String[] args) {

        //sorting custom object array
        EmployeeFinalVersion[] empArr = new EmployeeFinalVersion[4];
        empArr[0] = new EmployeeFinalVersion(10, "Mikey", 25, 10000);
        empArr[1] = new EmployeeFinalVersion(20, "Arun", 29, 20000);
        empArr[2] = new EmployeeFinalVersion(5, "Lisa", 35, 5000);
        empArr[3] = new EmployeeFinalVersion(1, "Pankaj", 32, 50000);
        
        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, EmployeeFinalVersion.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

        //sort employees array using Comparator by Salary Dec order
        Arrays.sort(empArr, EmployeeFinalVersion.SalaryComparatorDec);
        System.out.println("Employees list sorted by Salary Descending Order:\n"+Arrays.toString(empArr));

        //sort employees array using Comparator by Age
        Arrays.sort(empArr, EmployeeFinalVersion.AgeComparator);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, EmployeeFinalVersion.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
        
        //Employees list sorted by ID and then name using Comparator class
        empArr[0] = new EmployeeFinalVersion(1, "Mikey", 25, 10000);
        Arrays.sort(empArr, new EmployeeComparatorByIdAndName());
        System.out.println("Employees list sorted by ID and Name:\n"+Arrays.toString(empArr));
    }

}