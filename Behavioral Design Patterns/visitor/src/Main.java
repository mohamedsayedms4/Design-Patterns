//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ScheduleManagement dayShift = new DayShiftScheduleManagement();
        dayShift.calculateOvertime();

        ScheduleManagement nightShift = new NightShiftScheduleManagement();
        nightShift.calculateOvertime();

        

    }
}