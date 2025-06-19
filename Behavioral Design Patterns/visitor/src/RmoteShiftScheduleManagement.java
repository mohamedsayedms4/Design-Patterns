public class RmoteShiftScheduleManagement implements ScheduleManagement {

    @Override
    public void generateReport() {
        System.out.println("Generate Report Night Remote Schedule ");
    }

    @Override
    public void calculateOvertime() {
        System.out.println("calculate Overtime Remote Day Shift ");
    }

    @Override
    public void acceptVisitor(ScheduleManagementVisitor scheduleManagementVisitor) {
        scheduleManagementVisitor.visit(this);
    }
}
