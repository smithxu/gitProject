package baolilai.baolilai.application;

import android.support.multidex.MultiDexApplication;


import com.squareup.leakcanary.LeakCanary;

import baolilai.baolilai.constant.Constant;
import baolilai.baolilai.util.image.ImageLoaderConfig;


/**
 * 描述：当前Application，用来初始化数据
 */

public class MyApplication extends MultiDexApplication {
    private static MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        if(!Constant.DEBUG)//如果不是在调试，将启用异常扑捉器
        CrashHandler.getInstance().init(getApplicationContext());//初始化全局异常扑捉器
        ImageLoaderConfig.initImageLoader(this, (Constant.BASE_IMAGE_CACHE));
        this.instance = this;
        LeakCanary.install(this);
    }
    public static MyApplication getInstance() {
        return instance;
    }
}
