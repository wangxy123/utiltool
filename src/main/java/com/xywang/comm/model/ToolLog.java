package com.xywang.comm.model;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 工具 日志类
 *
 * @author xywang
 * @create 2017-11-02 22:50
 **/
@Data
public class ToolLog {
    private String args;
    private List<Operation> operates;
    private String res;
    private String error;
    private String time;

    public ToolLog() {
        operates = new ArrayList<Operation>();
    }

    public void init() {
        time = "";
        error="";
        res="";
        args="";
        operates.clear();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
