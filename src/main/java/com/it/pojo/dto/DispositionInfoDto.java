package com.it.pojo.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class DispositionInfoDto {

    private String name;

    private String licence;

    private Integer status;

    //创建最小日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minTime;
    //创建最大日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxTime;

    private Integer isdeleted;


}
