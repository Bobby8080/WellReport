package com.tphy.controller;

import com.alibaba.fastjson.JSONObject;
import com.tphy.entity.Hospital;
import com.tphy.entity.Vo.CommonVo;
import com.tphy.entity.Vo.SelectRecordsVo;
import com.tphy.entity.Vo.TableCommentVo;
import com.tphy.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: xwb
 * @Description: 多表联合查询
 * @Date 10:07 2020/6/9
*/

@RestController
@RequestMapping("union")
public class UnionController {
    @Autowired
    private UnionService unionService;

    //查询所有医院
    @RequestMapping("selectAll")
    public List<Hospital> selectAllHospital(){
        return unionService.selectAll();
    }

    //查询当前当前登录用户
    @RequestMapping("selectDatabase")
    public String selectDatabase(){
        return unionService.selectDatabase();
    }

    //查询当前数据库下所有表和注释(默认按照拼音正序)
    @RequestMapping(" ")
    public List<CommonVo> selectAllTables(){
        return unionService.selectAllTables();
    }

    //查询指定表下所有字段和注释(默认按照拼音正序)
    @RequestMapping("selectAllFields")
    public List<CommonVo> selectAllFields(String table){
        return unionService.selectAllFields(table);
    }

    //根据表名,查询出表名对应的注释名;查询出字段名和注释
    @RequestMapping("selectAllComments")
    public List<TableCommentVo> selectAllComments(String table){
        return unionService.selectAllComments(table);
    }

        /*//根据字段参数和字段所属表,联表查询出记录
        @RequestMapping("selectRecords")
        public void selectRecords(String xxx){
            unionService.selectRecords(xxx);
            //后台返回值类型:
            //["A表":["ksdm""ksmc""xlh"]]
            //select <if 字段是否为空></if>

        }*/

}
