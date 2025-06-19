public interface IterableCollection {

    EmployeeHierarchyIterator createEmployeeDirectReportIterator();
    EmployeeHierarchyIterator createEmployeeCoWorkerIterator();
    EmployeeHierarchyIterator createEmployeeSubOrdinateIterator();
}
