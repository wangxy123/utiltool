package com.xywang.comm.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * web 日志类
 *
 * @author xywang
 * @create 2017-11-02 22:50
 **/
@Data
public class WebLog {
    private String url;
    private String httpMethod;
    private String ip;
    private String classMethod;
    private String webArgs;
    private List<Operation> operation;
    private String res;
    private String time;
    private String errorMsg;
    public WebLog(){
        this.operation = new ArrayList<Operation>();

    }
}
