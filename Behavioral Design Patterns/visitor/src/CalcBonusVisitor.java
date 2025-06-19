public class CalcBonusVisitor implements ScheduleManagementVisitor{

    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Day shift schedule management is called");
    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("Night shift schedule management is called");
    }

    @Override
    public void visit(RmoteShiftScheduleManagement rmoteShiftScheduleManagement) {
        System.out.println("Rmote shift schedule management is called");
    }
}
