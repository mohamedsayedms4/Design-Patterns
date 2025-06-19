import java.util.List;

public class EmployeeHierarchyCollection {

    private final List<Employee> employees;
    private final String employeeId ;
    private int currentDircectIndex =0 ;
    private int currentCoworkerIndex =0 ;
    private int currentSubOrdinateIndex =0;

    public EmployeeHierarchyCollection( String employeeId) {
        this.employees = List.of(
                new Employee("Ahmed","1") ,
                new Employee("Mahmoud","2")
        );
        this.employeeId = employeeId;
    }

    public boolean hasNextEmployeeDirectReport(){
        return currentDircectIndex < employees.size();
    }
    public Employee getNextDirectReportTo() {
        System.out.println("Get Next Direct Report To DFS / BFS");
        if(!hasNextEmployeeDirectReport()){
            return null;
        }
        return employees.get(currentDircectIndex++);
    }




    public boolean hasNextEmployeeCoworker(){
        return currentCoworkerIndex < employees.size();
    }
    public Employee getNextDirectCoworker() {
        System.out.println("Get Next Direct Report To DFS / BFS");
        if(!hasNextEmployeeCoworker()){
            return null;
        }
        return employees.get(currentCoworkerIndex++);
    }


    public boolean hasNextEmployeeSubOrdinate(){
        return currentCoworkerIndex < employees.size();
    }
    public Employee getNextDirectSubOrdinate() {
        System.out.println("Get Next Direct Report To DFS / BFS");
        if(!hasNextEmployeeCoworker()){
            return null;
        }
        return employees.get(currentCoworkerIndex++);
    }
}
