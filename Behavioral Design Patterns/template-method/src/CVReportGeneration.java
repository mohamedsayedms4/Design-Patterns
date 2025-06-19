public interface CVReportGeneration {

    GeneratedReport generateCVReport(String cvFilePath);

    File readFile(String filePath);

    Data extractData(File file);

    AnalyzedData anlyzedData(Data data);
}
