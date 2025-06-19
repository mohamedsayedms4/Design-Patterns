public class EmployeeSubOrdinateIterator implements EmployeeHierarchyIterator{
    private int currentSubOrdinateIndex =0;

    private final EmployeeHierarchyCollection employeeHierarchyCollection;

    public EmployeeSubOrdinateIterator(EmployeeHierarchyCollection employeeHierarchyCollection) {
        this.employeeHierarchyCollection = employeeHierarchyCollection;
    }

    @Override
    public boolean hasNext() {
        return employeeHierarchyCollection.getEmployees().size() > currentSubOrdinateIndex;
    }

    @Override
    public Employee getNext() {
        System.out.println("Get Next Direct Report To DFS / BFS");
        if(!hasNext()){
            return null;
        }
        return employeeHierarchyCollection.getEmployees().get(currentSubOrdinateIndex++);    }
}
