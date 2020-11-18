import java.util.Comparator;

public class EmployeeFinalVersion implements Comparable<EmployeeFinalVersion> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public EmployeeFinalVersion(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeFinalVersion emp) {
        //let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.getId());
    }

    @Override
    //this is required to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

    /**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<EmployeeFinalVersion> SalaryComparator = new Comparator<EmployeeFinalVersion>() {
        @Override
        public int compare(EmployeeFinalVersion e1, EmployeeFinalVersion e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    public static Comparator<EmployeeFinalVersion> SalaryComparatorDec = new Comparator<EmployeeFinalVersion>() {
        @Override
        public int compare(EmployeeFinalVersion e1, EmployeeFinalVersion e2) {
            return (int) (e2.getSalary() -e1.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<EmployeeFinalVersion> AgeComparator = new Comparator<EmployeeFinalVersion>() {

        @Override
        public int compare(EmployeeFinalVersion e1, EmployeeFinalVersion e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<EmployeeFinalVersion> NameComparator = new Comparator<EmployeeFinalVersion>() {
        @Override
        public int compare(EmployeeFinalVersion e1, EmployeeFinalVersion e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
}