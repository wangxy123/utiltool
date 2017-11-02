package com.xywang.comm.model;

import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Date;

/**
 * 操作类
 *
 * @author xywang
 * @create 2017-11-02 22:58
 **/
public class Operation {
    private String operationName;
    private boolean operationRes;
    private String time;

    public Operation(String _operation,boolean _res){
        this.operationName = _operation;
        this.operationRes = _res;
        this.time = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
    }
}
