public class SortResult {
    private Long startTime;
    private Long endTime;
    private Integer vectorLength;
    private String algorithmName;

    public SortResult(){

    }

    public SortResult(Long startTime, Long endTime, Integer vectorLength, String algorithmName) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.vectorLength = vectorLength;
        this.algorithmName = algorithmName;
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


}