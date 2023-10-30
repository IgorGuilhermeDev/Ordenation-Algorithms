package sortAlgorithms;

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

    public void toCsv(boolean writeColumns) {
        StringBuilder builder = new StringBuilder();
        if (writeColumns)
            this.writeColumns((builder));

        this.writeValues(builder);
        System.out.println((builder.toString()));
    }

    private void writeColumns(StringBuilder builder) {
        builder.append("Nome Do Algoritmo,").append("Tamanho Do Vetor,").append("Ordem Do Vetor,")
                .append("Tempo De Execução").append("\n");
    }

    private void writeValues(StringBuilder builder) {
        builder.append(this.algorithmName).append(",").append(this.vectorLength).append(",")
                .append(this.vectorOrdernation).append(",").append(this.endTime - this.startTime).append(",")
                .append("\n");
    }

}
