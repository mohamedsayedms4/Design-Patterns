public class ManageLeaveRequestVisitor implements ScheduleManagementVisitor{
    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Day Shift Schedule Management Visitor");
    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("Night Shift Schedule Management Visitor");
    }

    @Override
    public void visit(RmoteShiftScheduleManagement rmoteShiftScheduleManagement) {
        System.out.println("Rmote Shift Schedule Management Visitor");
    }
}
