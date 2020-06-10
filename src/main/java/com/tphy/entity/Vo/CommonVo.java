package com.tphy.entity.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * @Author: xwb
 * @Description: 通用vo实体类,用于返回两个字符串
 * @Date 11:53 2020/6/9
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonVo implements Serializable {
    private String xx1;
    private String xx2;
}
