package com.tphy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author: xwb
 * @Description: 医生实体类
 * @Date 19:20 2020/6/8
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor") //使实体类名=表名
public class Doctor implements Serializable {
    //医生代码
    @Id //设置主键
    private Integer ysdm;
    //医生名称
    //@Column(name = "ysmc01")
    private String ysmc;
    //科室代码
    private Integer ksdm;
    //医生工资
    private Double salary;
}
