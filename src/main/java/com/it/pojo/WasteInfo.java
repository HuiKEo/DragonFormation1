package com.it.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class WasteInfo {
    private Integer id;

    private String batchCode;

    private String wasteName;

    private Integer wasteCategory;

    private String amount;

    private String measure;

    private String sourceEnterprise;

    private String sourceWorkshop;

    private String sourceMachine;

    private String feature;

    private String operator;

    private Date createTime;

    private Integer isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    public String getWasteName() {
        return wasteName;
    }

    public void setWasteName(String wasteName) {
        this.wasteName = wasteName == null ? null : wasteName.trim();
    }

    public Integer getWasteCategory() {
        return wasteCategory;
    }

    public void setWasteCategory(Integer wasteCategory) {
        this.wasteCategory = wasteCategory;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    public String getSourceEnterprise() {
        return sourceEnterprise;
    }

    public void setSourceEnterprise(String sourceEnterprise) {
        this.sourceEnterprise = sourceEnterprise == null ? null : sourceEnterprise.trim();
    }

    public String getSourceWorkshop() {
        return sourceWorkshop;
    }

    public void setSourceWorkshop(String sourceWorkshop) {
        this.sourceWorkshop = sourceWorkshop == null ? null : sourceWorkshop.trim();
    }

    public String getSourceMachine() {
        return sourceMachine;
    }

    public void setSourceMachine(String sourceMachine) {
        this.sourceMachine = sourceMachine == null ? null : sourceMachine.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}