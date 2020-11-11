import java.util.Comparator;

public class EmployeeComparatorByIdAndName implements Comparator<EmployeeFinalVersion> {

    @Override
    public int compare(EmployeeFinalVersion o1, EmployeeFinalVersion o2) {
        int flag = o1.getId() - o2.getId();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }

}