package com.it.pojo.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class DriverDto {
    private String licensePlate;
    private String type;
    private Integer minCapacity;
    private Integer maxCapacity;
    private String measure;
    //创建最小日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minCreateTime;
    //创建最大日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxCreateTime;
}
