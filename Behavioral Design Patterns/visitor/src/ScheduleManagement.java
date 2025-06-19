public interface ScheduleManagement {

    void generateReport();

    void calculateOvertime();


    void acceptVisitor(ScheduleManagementVisitor scheduleManagementVisitor);

}
