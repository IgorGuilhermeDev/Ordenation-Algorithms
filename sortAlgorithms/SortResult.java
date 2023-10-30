package sortAlgorithms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import enumerator.OrdenationType;

public class SortResult {
    private Long startTime;
    private Long endTime;
    private Integer vectorLength;
    private String algorithmName;
    private OrdenationType vectorOrdernation;

    public SortResult() {

    }

    public SortResult(Long startTime, Long endTime, Integer vectorLength, String algorithmName,
            OrdenationType ordenation) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.vectorLength = vectorLength;
        this.algorithmName = algorithmName;
        this.vectorOrdernation = ordenation;
    }

    public OrdenationType getVectorOrdernation() {
        return vectorOrdernation;
    }

    public void setVectorOrdernation(OrdenationType vectorOrdernation) {
        this.vectorOrdernation = vectorOrdernation;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getVectorLength() {
        return vectorLength;
    }

    public void setVectorLength(Integer vectorLength) {
        this.vectorLength = vectorLength;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public void toCsv(boolean writeHeader, String filePath) {

        boolean fileExists = this.createFile(filePath);
        if (fileExists) {
            StringBuilder builder = new StringBuilder();
            if (writeHeader)
                this.writeColumns((builder));

            this.writeValues(builder);
            this.save(filePath, builder.toString());
        }
    }

    private boolean createFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                boolean created = file.createNewFile();
                if (!created) {

                    System.out.println("File creation failed.");
                    return false;
                }
            }

            return true;
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            return false;
        }
    }

    private void writeColumns(StringBuilder builder) {
        builder.append("Nome Do Algoritmo,").append("Tamanho Do Vetor,").append("Ordem Do Vetor,")
                .append("Tempo De Execução").append("\n");
    }

    private void writeValues(StringBuilder builder) {
        Locale desiredLocale = new Locale("en", "US");
        DecimalFormatSymbols customSymbols = new DecimalFormatSymbols(desiredLocale);
        DecimalFormat decimalFormat = new DecimalFormat("0.############", customSymbols);
        builder.append(this.algorithmName).append(",").append(this.vectorLength).append(",")
                .append(this.vectorOrdernation).append(",")
                .append(decimalFormat.format(((double) (this.endTime - this.startTime) / 1_000_000_000)))
                .append("\n");
    }

    private void save(String filePath, String fileContent) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(fileContent);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
