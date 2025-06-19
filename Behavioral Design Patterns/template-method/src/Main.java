//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        CVReportGeneration pdf = new WordCVReportGeneration();
       GeneratedReport generatedReport = pdf.generateCVReport("F:\\Ultimate Design Patterns\\07 - Template Method");

        System.out.println(generatedReport.isPassed());
    }
}