package com.papa91.arc.ext;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.papa91.arc.ext.Log;
/* loaded from: classes5.dex */
public class ThreadManager {
    private static final int THREAD_COUNT = 4;
    private static final int THREAD_LOG = 2;
    private static final int THREAD_MAIN = 1;
    private static final int THREAD_UI = 0;
    private static final int THREAD_WRITE = 3;
    private static final Handler[] handlers;
    private static final Looper[] loopers;

    /* loaded from: classes5.dex */
    private static class HandlerThreadEx extends HandlerThread {
        public HandlerThreadEx(String str) {
            super(str);
        }
    }

    static {
        HandlerThreadEx handlerThreadEx = new HandlerThreadEx("Main");
        handlerThreadEx.start();
        HandlerThreadEx handlerThreadEx2 = new HandlerThreadEx("Log");
        handlerThreadEx2.start();
        HandlerThreadEx handlerThreadEx3 = new HandlerThreadEx("Write");
        handlerThreadEx3.start();
        Looper[] looperArr = {Looper.getMainLooper(), handlerThreadEx.getLooper(), handlerThreadEx2.getLooper(), handlerThreadEx3.getLooper()};
        Handler[] handlerArr = {new Handler(looperArr[0]), new Handler(looperArr[1]), new Handler(looperArr[2]), new Handler(looperArr[3])};
        loopers = looperArr;
        handlers = handlerArr;
    }

    @TargetApi(18)
    public static void exit() {
        int i4 = 0;
        while (true) {
            Looper[] looperArr = loopers;
            if (i4 >= looperArr.length) {
                return;
            }
            if (i4 != 0) {
                Looper looper = looperArr[i4];
                try {
                    looper.quitSafely();
                } catch (NoSuchMethodError unused) {
                    looper.quit();
                }
            }
            i4++;
        }
    }

    private static Handler getHandler(int i4) {
        return handlers[i4];
    }

    public static Handler getHandlerLogThread() {
        return getHandler(2);
    }

    public static Handler getHandlerMainThread() {
        return getHandler(1);
    }

    public static Handler getHandlerUiThread() {
        return getHandler(0);
    }

    public static Handler getHandlerWriteThread() {
        return getHandler(3);
    }

    private static Looper getLooper(int i4) {
        return loopers[i4];
    }

    public static Looper getLooperLogThread() {
        return getLooper(2);
    }

    public static Looper getLooperMainThread() {
        return getLooper(1);
    }

    public static Looper getLooperUiThread() {
        return getLooper(0);
    }

    public static Looper getLooperWriteThread() {
        return getLooper(3);
    }

    public static boolean isInLogThread() {
        return isInThread(2);
    }

    public static boolean isInMainThread() {
        return isInThread(1);
    }

    private static boolean isInThread(int i4) {
        return Looper.myLooper() == loopers[i4];
    }

    public static boolean isInUiThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isInWriteThread() {
        return isInThread(3);
    }

    private static void run(int i4, Runnable runnable, boolean z4) {
        Looper[] looperArr = loopers;
        if (looperArr == null) {
            Log.LogWrapper.e(Log.TAG, Log.BAD_IMPLEMENTATION, new NullPointerException("loopers"));
        } else if (looperArr[i4] == null) {
            Log.LogWrapper.e(Log.TAG, Log.BAD_IMPLEMENTATION, new NullPointerException("loopers[" + i4 + ']'));
        } else if (Looper.myLooper() == looperArr[i4] && !z4) {
            runnable.run();
        } else {
            handlers[i4].post(runnable);
        }
    }

    public static void runOnLogThread(Runnable runnable) {
        try {
            run(2, runnable, false);
        } catch (Throwable th) {
            Log.LogWrapper.e(Log.TAG, Log.BAD_IMPLEMENTATION, th);
        }
    }

    public static void runOnMainThread(Runnable runnable) {
        run(1, runnable, false);
    }

    public static void runOnUiThread(Runnable runnable) {
        run(0, runnable, false);
    }

    public static void runOnWriteThread(Runnable runnable) {
        run(3, runnable, false);
    }
}
