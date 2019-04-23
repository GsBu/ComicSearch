package com.example.gs.comicsearch.util;

import android.util.Log;

import com.example.gs.comicsearch.BuildConfig;

/**
 * Created by camdora on 17-3-31. 15:47
 */

public class LogUtil {
    //true：强制显示Log，无论发布、调试版本。默认false：不强制显示Log
    private final static boolean FORCED_DISPALY_LOG = false;

    public static void v(String tag, String message){
        if(BuildConfig.ENABLE_DEBUG || FORCED_DISPALY_LOG){
            Log.v(tag, message);
        }
    }

    public static void d(String tag, String message){
        if(BuildConfig.ENABLE_DEBUG || FORCED_DISPALY_LOG){
            Log.d(tag, message);
        }
    }

    public static void i(String tag, String message){
        if(BuildConfig.ENABLE_DEBUG || FORCED_DISPALY_LOG){
            Log.i(tag, message);
        }
    }

    public static void w(String tag, String message){
        if(BuildConfig.ENABLE_DEBUG || FORCED_DISPALY_LOG){
            Log.w(tag, message);
        }
    }

    public static void w(String tag, String message, Throwable throwable){
        if(BuildConfig.ENABLE_DEBUG || FORCED_DISPALY_LOG){
            Log.w(tag, message, throwable);
        }
    }

    public static void e(String tag, String message){
        if(BuildConfig.ENABLE_DEBUG || FORCED_DISPALY_LOG){
            Log.e(tag, message);
        }
    }

    public static void e(String tag, String message, Throwable throwable){
        if(BuildConfig.ENABLE_DEBUG || FORCED_DISPALY_LOG){
            Log.e(tag, message, throwable);
        }
    }

    /**
     * 分段打印出较长log文本
     * @param log        原log文本
     * @param showCount  规定每段显示的长度（最好不要超过eclipse限制长度）
     */
    public static void showLogCompletion(String tag, String log, int showCount){
        if(log.length() >showCount){
            String show = log.substring(0, showCount);
            LogUtil.i(tag, show+"");
            if((log.length() - showCount)>showCount){//剩下的文本还是大于规定长度
                String partLog = log.substring(showCount,log.length());
                showLogCompletion(tag, partLog, showCount);
            }else{
                String surplusLog = log.substring(showCount, log.length());
                LogUtil.i(tag, surplusLog+"");
            }
        }else{
            LogUtil.i(tag, log+"");
        }
    }
}
