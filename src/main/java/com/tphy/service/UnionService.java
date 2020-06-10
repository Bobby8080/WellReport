package com.tphy.service;

import com.tphy.entity.Hospital;
import com.tphy.entity.Vo.CommonVo;
import com.tphy.entity.Vo.TableCommentVo;

import java.util.HashMap;
import java.util.List;

public interface UnionService {

    List<Hospital> selectAll();

    String selectDatabase();

    List<CommonVo> selectAllTables();

    List<CommonVo> selectAllFields(String table);

    void selectRecords(String xxx);

    List<TableCommentVo> selectAllComments(String table);
}
