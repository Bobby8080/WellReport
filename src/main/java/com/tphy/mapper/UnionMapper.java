package com.tphy.mapper;

import com.tphy.entity.Hospital;
import com.tphy.entity.Vo.CommonVo;
import com.tphy.entity.Vo.TableCommentVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.HashMap;
import java.util.List;

public interface UnionMapper extends BaseMapper<Hospital> {

    String selectDatabase();

    List<CommonVo> selectAllTables();

    List<CommonVo> selectAllFields(String table);

    List<TableCommentVo> selectAllComments(String table);
}
