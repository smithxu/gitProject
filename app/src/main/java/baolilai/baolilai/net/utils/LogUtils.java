package baolilai.baolilai.net.utils;

import android.util.Log;

import baolilai.baolilai.constant.Constant;


/**
 * 用途: 日志管理类
 */

public class LogUtils {
    public static void D(String tag, String msg){
        if (Constant.DEBUG){
            Log.d(tag,msg);
        }
    }
    public static void D(String msg){
        if (Constant.DEBUG){
            Log.d("gan-yunpai-tms====>",msg);
        }
    }
}
