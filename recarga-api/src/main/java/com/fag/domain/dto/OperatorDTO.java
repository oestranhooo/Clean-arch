package com.fag.domain.dto;

public class OperatorDTO {

    private Integer category;

    private String name;

    private Integer operatorId;

    private Double maxValue;

    private Double minValue;

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer providerId) {
        this.operatorId = providerId;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

}
