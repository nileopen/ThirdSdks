package io.agora.log;

import android.util.Log;

import io.agora.openlive.BuildConfig;


/**
 * @actor:taotao
 * @DATE: 16/10/14
 */

public class NaLog {

    /**
     * Priority constant for the println method; use Log.v.
     */
    public static final int VERBOSE = Log.VERBOSE;

    /**
     * Priority constant for the println method; use Log.d.
     */
    public static final int DEBUG = Log.DEBUG;

    /**
     * Priority constant for the println method; use Log.i.
     */
    public static final int INFO = Log.INFO;

    /**
     * Priority constant for the println method; use Log.w.
     */
    public static final int WARN = Log.WARN;

    /**
     * Priority constant for the println method; use Log.e.
     */
    public static final int ERROR = Log.ERROR;

    /**
     * Priority constant for the println method.
     */
    public static final int ASSERT = Log.ASSERT;

    /**
     * Priority constant for the println method; default use Log.e
     */
    public static final int DEFAULT = ERROR;

    private static boolean isDebug = BuildConfig.DEBUG;
    private static int mLogLevel = DEFAULT;

    public static void setIsDebug(boolean debug) {
        isDebug = debug;
    }

    public static void setLogLevel(int level) {
        mLogLevel = level;
    }

    public static void e(String tag, String msg, Throwable e) {
        if (isDebug && mLogLevel <= ERROR) {
            Log.e(tag, msg, e);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug && mLogLevel <= ERROR) {
            Log.e(tag, msg);
        }
    }

    public static void w(String tag, String msg, Throwable e) {
        if (isDebug && mLogLevel <= WARN) {
            Log.w(tag, msg, e);
        }
    }

    public static void w(String tag, String msg) {
        if (isDebug && mLogLevel <= WARN) {
            Log.w(tag, msg);
        }
    }

    public static void i(String tag, String msg, Throwable e) {
        if (isDebug && mLogLevel <= INFO) {
            Log.i(tag, msg, e);
        }
    }

    public static void i(String tag, String msg) {
        if (isDebug && mLogLevel <= INFO) {
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable e) {
        if (isDebug && mLogLevel <= DEBUG) {
            Log.d(tag, msg, e);
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug && mLogLevel <= DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void v(String tag, String msg, Throwable e) {
        if (isDebug && mLogLevel <= VERBOSE) {
            Log.v(tag, msg, e);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug && mLogLevel <= VERBOSE) {
            Log.v(tag, msg);
        }
    }
}
