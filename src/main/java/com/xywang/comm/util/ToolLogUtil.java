package com.xywang.comm.util;

import com.xywang.comm.model.Operation;
import com.xywang.comm.model.ToolLog;

/**
 * @ClassName: ToolLogUtil
 * @Description: 工具日志类，同一线程。
 * 调用startLog和endLog 避免内存泄漏
 * @author xywang
 * @date 2017年11月3日 下午3:46:00
 *
 */
public class ToolLogUtil {
    // 线程变量 日志对象
    private final static ThreadLocal<ToolLog> log = new ThreadLocal<ToolLog>() {
        @Override
        protected ToolLog initialValue() {
            return new ToolLog();
        }
    };
    private final static ThreadLocal<Long> startTime = new ThreadLocal<Long>();

    public static void startLog() {
        startTime.set(System.currentTimeMillis());
        if (null == log.get()) {
            log.set(new ToolLog());
        } else {
            log.get().init();
        }
    }

    public static void operateLog(String logmsg,boolean res,Object...args) {
        log.get().getOperates().add(new Operation(logmsg,res,args));
    }

    public static ToolLog getLog() {
        return log.get();
    }


    /**
     * @Title: endLog
     * @Description: 结束日志释放内存
     * @date:2017年11月3日
     * @return 日志json格式
     * @return_type:String
     * @author:xywang
     */
    public static String endLog() {
        log.get().setTime(
                String.valueOf(System.currentTimeMillis() - startTime.get())+"ms");
        String logMsg = log.get().toString();
        log.remove();
        startTime.remove();
        return logMsg;
    }
}
