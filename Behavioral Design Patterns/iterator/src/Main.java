//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        EmployeeHierarchyCollection employeeHierarchyCollection =
                new EmployeeHierarchyCollection("test");

        var iterator = employeeHierarchyCollection.createEmployeeDirectReportIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getNext().getName());
        }
    }
}