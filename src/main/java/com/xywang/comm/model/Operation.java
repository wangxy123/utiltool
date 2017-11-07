package com.xywang.comm.model;

import com.alibaba.fastjson.JSON;
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
    private String operatePara;
    private boolean operationRes;
    private String time;

    public Operation(String _operation,boolean _res,Object...args){
        this.operationName = _operation;
        this.operationRes = _res;
        this.operatePara= JSON.toJSONString(args);
        this.time = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
    }
}
