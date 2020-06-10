package com.tphy.entity.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: xwb
 * @Description: 匹配表注释和字段名/字段注释
 * @Date 17:18 2020/6/10
*/
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class TableCommentVo implements Serializable {
    private String tableName;  //表名
    private String tableComment;  //表注释
    private String columnName;  //字段名
    private String columnComment;  //字段注释
    private Boolean xxx;  //选项框

    public TableCommentVo() {
    }

    public TableCommentVo(String tableName, String tableComment, String columnName, String columnComment, Boolean xxx) {
        this.tableName = tableName;
        this.tableComment = tableComment;
        this.columnName = columnName;
        this.columnComment = columnComment;
        this.xxx = xxx;
    }

    @Override
    public String toString() {
        return "TableCommentVo{" +
                "tableName='" + tableName + '\'' +
                ", tableComment='" + tableComment + '\'' +
                ", columnName='" + columnName + '\'' +
                ", columnComment='" + columnComment + '\'' +
                ", xxx=" + xxx +
                '}';
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public Boolean getXxx() {
        return xxx;
    }

    public void setXxx(Boolean xxx) {
        this.xxx = xxx;
    }
}
