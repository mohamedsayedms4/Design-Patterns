import java.util.Collection;
import java.util.List;

public class EmployeeHierarchyCollection implements IterableCollection{

    private final List<Employee> employees;
    private final String employeeId ;

    public EmployeeHierarchyCollection( String employeeId) {
        this.employees = List.of(
                new Employee("Ahmed","1") ,
                new Employee("Mahmoud","2")
        );
        this.employeeId = employeeId;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeDirectReportIterator() {
        return new EmployeeDirectReportIterator(this);
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeCoWorkerIterator() {
        return new EmployeeCoWorkerIterator(this);
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeSubOrdinateIterator() {
        return new EmployeeSubOrdinateIterator(this);
    }
}
