public class EmployeeCoWorkerIterator implements EmployeeHierarchyIterator {
    private int currentCoworkerIndex =0 ;

    private final EmployeeHierarchyCollection employeeHierarchyCollection;

    public EmployeeCoWorkerIterator(EmployeeHierarchyCollection employeeHierarchyCollection) {
        this.employeeHierarchyCollection = employeeHierarchyCollection;
    }

    @Override
    public boolean hasNext() {
        return currentCoworkerIndex < employeeHierarchyCollection.getEmployees().size();
    }

    @Override
    public Employee getNext() {
        System.out.println("Get Next Direct Report To DFS / BFS");
        if(!hasNext()){
            return null;
        }
        return employeeHierarchyCollection.getEmployees().get(currentCoworkerIndex++);    }
}
