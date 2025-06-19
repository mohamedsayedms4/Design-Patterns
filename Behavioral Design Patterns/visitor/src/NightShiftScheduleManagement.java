public class NightShiftScheduleManagement implements ScheduleManagement {

    @Override
    public void generateReport() {
        System.out.println("Generate Report Night Shift Schedule ");
    }

    @Override
    public void calculateOvertime() {
        System.out.println("calculate Overtime Night Day Shift ");
    }

    @Override
    public void manageLeaveRequest() {
        System.out.println("Manage Leave Request Night Shift ");
    }
}
