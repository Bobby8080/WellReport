package com.tphy.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.tphy.entity.Hospital;
import com.tphy.entity.Vo.CommonVo;
import com.tphy.entity.Vo.TableCommentVo;
import com.tphy.mapper.UnionMapper;
import com.tphy.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class UnionServiceImpl implements UnionService {
    @Autowired
    private UnionMapper unionMapper;

    @Override
    public List<Hospital> selectAll() {
        return unionMapper.selectAll();
    }

    //查询当前登录用户
    @Override
    public String selectDatabase() {
        return unionMapper.selectDatabase();
    }

    @Override
    public List<CommonVo> selectAllTables() {
        return unionMapper.selectAllTables();
    }

    @Override
    public List<CommonVo> selectAllFields(String table) {
        return unionMapper.selectAllFields(table);
    }

    @Override
    public void selectRecords(String xxx) {
        //解析xxx,获取其中的表名和列名
        //xxx:{"表名A":["字段1","字段2"],"表名B":["字段1","字段2"]}
        Map<String,List<String>> maps = (Map) JSONObject.parse(xxx);
        for (String key : maps.keySet()) {
            System.out.println(key); //获取每个key,对应的是表名
            System.out.println(maps.get(key).toString()); //获取每个key对应的值,对应的是字段名
        }
        //select key1,key2 from key1.value1,key1.value2
    }

    //给实体类中的内容添加xxx=false
    @Override
    public List<TableCommentVo> selectAllComments(String table) {
        List<TableCommentVo> commentVoList = unionMapper.selectAllComments(table);
        System.out.println(commentVoList);
        for (TableCommentVo vo : commentVoList) {
            vo.setXxx(false);
        }
        return commentVoList;
    }
}
