package com.netease.nis.basesdk.crash;

import android.os.Process;
import android.util.Log;
import com.netease.nis.basesdk.HttpUtil;
import com.netease.nis.basesdk.Logger;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public abstract class BaseJavaCrashHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private String f57356a = "https://crash.163.com/uploadCrashLogInfo.do";

    /* renamed from: b  reason: collision with root package name */
    private String f57357b = "https://crash.163.com/client/api/uploadStartUpInfo.do";

    /* renamed from: c  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f57358c;

    /* renamed from: d  reason: collision with root package name */
    private CrashStore f57359d;

    /* loaded from: classes5.dex */
    class a implements HttpUtil.ResponseCallBack {
        a(BaseJavaCrashHandler baseJavaCrashHandler) {
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            Logger.i("BaseJavaCrashHandler", "start error" + str);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            Logger.i("BaseJavaCrashHandler", "start success");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements HttpUtil.ResponseCallBack {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57360a;

        b(String str) {
            this.f57360a = str;
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            Logger.e("upload crash info failed,error code:" + i4 + " msg:" + str);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            Logger.d("upload crash info success" + this.f57360a);
            BaseJavaCrashHandler.this.f57359d.delete(this.f57360a);
        }
    }

    protected abstract Map<String, String> buildCrashInfo(String str);

    protected abstract Map<String, String> buildStartInfo();

    public void initialize(String str) {
        this.f57358c = Thread.getDefaultUncaughtExceptionHandler();
        try {
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception e5) {
            Logger.e("BaseJavaCrashHandler", "JavaCrashHandler setDefaultUncaughtExceptionHandler failed" + e5.getMessage());
        }
        CrashStore crashStore = CrashStore.getInstance();
        this.f57359d = crashStore;
        crashStore.initialize(str);
        if (buildStartInfo() != null) {
            new Thread(new StartReportRunnable(buildStartInfo(), this.f57357b, new a(this))).start();
        }
        a();
    }

    protected boolean interceptHandleException(Throwable th) {
        return false;
    }

    public void setStartUrl(String str) {
        this.f57357b = str;
    }

    public void setUploadUrl(String str) {
        this.f57356a = str;
    }

    public void testCrash() {
        throw new RuntimeException("test java exception");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f57358c;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        try {
            if (!interceptHandleException(th)) {
                a(thread, th);
            }
        } catch (Exception e5) {
            Logger.e("BaseJavaCrashHandler", "JavaCrashHandler handleException failed" + e5.getMessage());
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f57358c;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    private void a() {
        Logger.d("check and report crash info");
        File[] loadJava = this.f57359d.loadJava();
        if (loadJava.length > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 5, 5L, TimeUnit.SECONDS, new ArrayBlockingQueue(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
            for (File file : loadJava) {
                try {
                    threadPoolExecutor.execute(a(this.f57359d.parse(file.getAbsolutePath()), file.getAbsolutePath()));
                } catch (UnsupportedEncodingException unused) {
                    Logger.e("BaseJavaCrashHandler", "logInfo encode error");
                }
            }
        }
    }

    private void a(Thread thread, Throwable th) {
        try {
            a(this.f57359d.store(Log.getStackTraceString(th)).getAbsolutePath());
        } catch (UnsupportedEncodingException unused) {
            Logger.e("BaseJavaCrashHandler", "logInfo encode error");
        }
    }

    private void a(String str) {
        String parse = this.f57359d.parse(str);
        Logger.d(parse);
        Thread thread = new Thread(a(parse, str));
        thread.start();
        try {
            thread.join(3000L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            Logger.e("quick upload isInterrupted");
        }
    }

    private CrashReportRunnable a(String str, String str2) {
        return new CrashReportRunnable(buildCrashInfo(str), this.f57356a, new b(str2));
    }
}
