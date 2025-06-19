public class DayShiftScheduleManagement implements ScheduleManagement {
    @Override
    public void generateReport() {
        System.out.println("Generate Report Day Shift Schedule ");
    }

    @Override
    public void calculateOvertime() {
        System.out.println("calculate Overtime for Day Shift ");
    }

    @Override
    public void manageLeaveRequest() {
        System.out.println("Manage Leave Request Day Shift ");
    }
}
