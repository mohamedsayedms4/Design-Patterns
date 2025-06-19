public class EmployeeDirectReportIterator implements  EmployeeHierarchyIterator{
    private  final EmployeeHierarchyCollection employeeHierarchyCollection;
    private int currentDircectIndex =0 ;

    public EmployeeDirectReportIterator(EmployeeHierarchyCollection employeeHierarchyCollection) {
        this.employeeHierarchyCollection = employeeHierarchyCollection;
    }

    @Override
    public boolean hasNext() {

        return employeeHierarchyCollection.getEmployees().size() > currentDircectIndex;
    }

    @Override
    public Employee getNext() {
        System.out.println("Get Next Direct Report To DFS / BFS");
        if(!hasNext()){
            return null;
        }
        return employeeHierarchyCollection.getEmployees().get(currentDircectIndex++);    }
}
