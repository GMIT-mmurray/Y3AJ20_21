import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaObjectSortingFinalContainers
{

    /**
     * This class shows how to sort custom objects array/list
     * implementing Comparable and Comparator interfaces
     * @param args
     */
    public static void main(String[] args) {

        //sorting custom object array
        ArrayList<EmployeeFinalVersion> empArr = new ArrayList<>();
        empArr.add(new EmployeeFinalVersion(10, "Mikey", 25, 10000));
        empArr.add(new EmployeeFinalVersion(20, "Arun", 29, 20000));
        empArr.add(new EmployeeFinalVersion(5, "Lisa", 35, 5000));
        empArr.add(new EmployeeFinalVersion(1, "Pankaj", 32, 50000));

        //sorting employees array using Comparable interface implementation
        Collections.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+(empArr));

        //sort employees array using Comparator by Salary
        Collections.sort(empArr, EmployeeFinalVersion.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+(empArr));

        //sort employees array using Comparator by Salary Dec order
        Collections.sort(empArr, EmployeeFinalVersion.SalaryComparatorDec);
        System.out.println("Employees list sorted by Salary Descending Order:\n"+(empArr));

        //sort employees array using Comparator by Age
        Collections.sort(empArr, EmployeeFinalVersion.AgeComparator);
        System.out.println("Employees list sorted by Age:\n"+(empArr));

        //sort employees array using Comparator by Name
        Collections.sort(empArr, EmployeeFinalVersion.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+(empArr));

        //Employees list sorted by ID and then name using Comparator class
        empArr.remove(2);
        empArr.add( new EmployeeFinalVersion(1, "Mikey", 25, 10000));
        Collections.sort(empArr, new EmployeeComparatorByIdAndName());
        System.out.println("Employees list sorted by ID and Name:\n"+(empArr));
    }

}