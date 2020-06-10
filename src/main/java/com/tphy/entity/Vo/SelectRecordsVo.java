package com.tphy.entity.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: xwb
 * @Description: 接收后台返回不定个字段对应的记录
 * @Date 11:53 2020/6/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectRecordsVo implements Serializable {
    //格式[{订单编号:[11,22,33]},{订单人员:[张三,李四,王二]}]
    //
    private Map<String,List<String>> recordMap;

}
