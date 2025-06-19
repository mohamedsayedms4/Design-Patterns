public class ImageCVReportGeneration implements CVReportGeneration {

    @Override
    public GeneratedReport generateCVReport(String cvFilePath) {
        var file = readFile(cvFilePath);
        var extractedData = extractData(file);
        var analyzeData = anlyzedData(extractedData);
        return generateReportOf(analyzeData);
    }

    private GeneratedReport generateReportOf(AnalyzedData analyzeData) {
        System.out.println("generating Report from :"+analyzeData);
        return new GeneratedReport(true);
    }

    @Override
    public File readFile(String filePath) {
        System.out.println("Reading file from: " + filePath);
        return null;
    }

    @Override
    public Data extractData(File file) {
        System.out.println("Extracting data from image: " + file);
        return null;
    }

    @Override
    public AnalyzedData anlyzedData(Data data) {
        System.out.println("Analyzing data from image: " + data);
        return null;
    }
}
