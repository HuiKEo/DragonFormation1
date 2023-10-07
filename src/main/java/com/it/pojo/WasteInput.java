package com.it.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
public class WasteInput {
    private Integer id;

    private Integer wasteId;

    private Integer warehouseId;

    private Integer containerId;

    private String batchCode;

    private Date storageDate;

    private Integer amount;

    private String measure;

    private String handler;

    private Date createTime;

    private Integer isdeleted;


}