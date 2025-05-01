package com.beizi.fusion.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.model.ResponseInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: CrashHandler.java */
/* loaded from: classes2.dex */
public class r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static r f7007a = new r();

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f7008b;

    /* renamed from: c  reason: collision with root package name */
    private Context f7009c;

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        String obj = stringWriter.toString();
        a(obj);
        b(obj);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            a(th);
        } catch (Exception e5) {
            e5.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7008b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
        }
    }

    public static r a() {
        return f7007a;
    }

    public void a(Context context) {
        this.f7008b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f7009c = context.getApplicationContext();
    }

    private void a(String str) {
        String a5;
        String a6;
        try {
            PackageInfo packageInfo = this.f7009c.getPackageManager().getPackageInfo(this.f7009c.getPackageName(), 1);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("appId", com.beizi.fusion.d.b.a().b());
            jSONObject.put("packageName", this.f7009c.getPackageName());
            jSONObject.put(TTDownloadField.TT_VERSION_NAME, packageInfo.versionName);
            jSONObject.put(TTDownloadField.TT_VERSION_CODE, String.valueOf(packageInfo.versionCode));
            jSONObject.put("sdkVersion", "4.90.4.4");
            jSONObject2.put("osVersion", Build.VERSION.RELEASE + "_" + Build.VERSION.SDK_INT);
            jSONObject2.put("vendor", Build.MANUFACTURER);
            jSONObject2.put("model", Build.MODEL);
            jSONObject.put(com.alipay.sdk.packet.d.f4907p, jSONObject2);
            jSONObject.put("crashMessage", str);
            if (!TextUtils.isEmpty(ResponseInfo.getInstance(this.f7009c).getCrashUrl()) && ResponseInfo.getInstance(this.f7009c).getCrashUrl().startsWith(com.facebook.common.util.f.f10923a)) {
                a5 = ResponseInfo.getInstance(this.f7009c).getCrashUrl();
            } else {
                a5 = f.a(BeiZis.getTransferProtocol() ? "aHR0cHM6Ly9hcGktaHRwLmJlaXppLmJpei9tYi9zZGsvY3Jhc2gvdjE=" : "aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAwL21iL3Nkay9jcmFzaC92MQ==");
                if (TextUtils.isEmpty(a5)) {
                    return;
                }
            }
            if (TextUtils.isEmpty(a5) || (a6 = ab.a(a5, jSONObject.toString().getBytes())) == null) {
                return;
            }
            af.a("lance", "post:" + a6);
        } catch (PackageManager.NameNotFoundException e5) {
            e = e5;
            e.printStackTrace();
        } catch (JSONException e6) {
            e = e6;
            e.printStackTrace();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    private void b(String str) {
        Context context;
        try {
            context = this.f7009c;
        } catch (Exception unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            return;
        }
        File a5 = j.a(context);
        af.a("BeiZis", "CrashHandler storagePath == " + a5);
        if (a5 != null) {
            String str2 = a5.getPath() + "/Beizi/log/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            String format = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS").format(new Date(System.currentTimeMillis()));
            File file2 = new File(str2 + "crash_" + format + ".trace");
            file2.createNewFile();
            FileWriter fileWriter = new FileWriter(file2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(format);
            bufferedWriter.write("\r\n");
            bufferedWriter.write("------------------crash----------------------");
            bufferedWriter.write("\r\n");
            bufferedWriter.write(str);
            bufferedWriter.write("\r\n");
            bufferedWriter.write("-------------------end-----------------------");
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        }
        af.a("lance", "writeLog ok");
    }

    private boolean a(final Throwable th) {
        if (th == null) {
            return false;
        }
        new Thread(new Runnable() { // from class: com.beizi.fusion.g.r.1
            @Override // java.lang.Runnable
            public void run() {
                Looper.prepare();
                r.this.b(th);
                Looper.loop();
            }
        }).start();
        try {
            Thread.sleep(1000L);
            return true;
        } catch (InterruptedException e5) {
            e5.printStackTrace();
            return true;
        }
    }
}
