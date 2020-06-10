package com.tphy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: xwb
 * @Description: 医院实体类
 * @Date 19:18 2020/6/8
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor")
public class Hospital implements Serializable {
    //科室代码
    @Id
    private Integer ksdm;
    //科室名称
    private String ksmc;
    //修改时间
    private Date updatetime;
}
