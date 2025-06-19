import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<ScheduleManagement> scheduleManagements = List.of(
                new DayShiftScheduleManagement(),
                new NightShiftScheduleManagement(),
                new RmoteShiftScheduleManagement()
        );

        scheduleManagements.forEach(scheduleManagement -> {
            scheduleManagement.generateReport();
            scheduleManagement.calculateOvertime();
            scheduleManagement.acceptVisitor(new ManageLeaveRequestVisitor());
            scheduleManagement.acceptVisitor(new CalcBonusVisitor());
            System.out.println("----------------------------------");
        });


    }
}