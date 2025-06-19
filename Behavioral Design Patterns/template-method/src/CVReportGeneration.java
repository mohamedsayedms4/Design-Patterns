public abstract class CVReportGeneration {

   public  GeneratedReport generateCVReport(String cvFilePath){
        var file = readFile(cvFilePath);
        var extractedData = extractData(file);
        var analyzeData = anlyzedData(extractedData);
        return generateReportOf(analyzeData);
    }


    private File readFile(String filePath) {
        System.out.println("Reading file from: " + filePath);
        return null;
    }
    protected abstract Data extractData(File file);



    private AnalyzedData anlyzedData(Data data) {
        System.out.println("Analyzing data from image: " + data);
        return null;
    }

    private GeneratedReport generateReportOf(AnalyzedData analyzeData) {
        System.out.println("generating Report from :"+analyzeData);
        return new GeneratedReport(true);
    }

}
