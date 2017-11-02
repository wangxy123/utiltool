package com.xywang.comm.util;

import com.xywang.comm.model.Operation;
import com.xywang.comm.model.WebLog;

/**
 * 接口日志记录工具类
 *
 * @author xywang
 * @create 2017-11-02 23:05
 **/
public class WebLogUtil {
    private final static ThreadLocal<WebLog> log = new ThreadLocal<WebLog>(){
      @Override
      protected WebLog initialValue(){
          return new WebLog();
      }
    };

    public static void operateLog(String logmsg,boolean res){
        log.get().getOperation().add(new Operation(logmsg,res));
    }

    public static WebLog getLog(){
        return log.get();
    }
}
