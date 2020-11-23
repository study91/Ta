package com.study91.ta.common;

import android.app.Application;
import android.content.Context;

/**
 * App全局类
 * App启动时需要加载此类：
 * 在AndroidManifest.xml文件中添加：android:name=".common.App"
 */
public class App extends Application {
    private static Context context; //应用程序上下文

    /**
     * 获取全局应用程序上下文
     * @return 应用程序上下文
     */
    public static Context getContext() {
        return App.context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        App.context = getApplicationContext(); //应用程序上下文
    }
}
