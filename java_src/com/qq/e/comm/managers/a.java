package com.qq.e.comm.managers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.qq.e.ads.dfa.GDTAppDialogClickListener;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.devtool.DevTools;
import com.qq.e.comm.managers.plugin.PM;
import com.qq.e.comm.managers.plugin.e;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.GDTLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes5.dex */
public class a implements IGDTAdManager {

    /* renamed from: g  reason: collision with root package name */
    public static final ExecutorService f59829g = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f59830a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f59831b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Context f59832c;

    /* renamed from: d  reason: collision with root package name */
    private volatile PM f59833d;

    /* renamed from: e  reason: collision with root package name */
    private volatile DevTools f59834e;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f59835f;

    /* renamed from: com.qq.e.comm.managers.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0602a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GDTAdSdk.OnStartListener f59836b;

        RunnableC0602a(GDTAdSdk.OnStartListener onStartListener) {
            this.f59836b = onStartListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                POFactory pOFactory = a.this.f59833d.getPOFactory(false, false);
                if (pOFactory != null) {
                    pOFactory.start(a.this.f59833d.getStartCaller(1));
                    GDTAdSdk.OnStartListener onStartListener = this.f59836b;
                    if (onStartListener != null) {
                        onStartListener.onStartSuccess();
                    }
                } else {
                    GDTAdSdk.OnStartListener onStartListener2 = this.f59836b;
                    if (onStartListener2 != null) {
                        onStartListener2.onStartFailed(new Exception("GDTAdSdk start异常"));
                    }
                }
            } catch (e e5) {
                GDTLogger.e(e5.getMessage(), e5);
                GDTAdSdk.OnStartListener onStartListener3 = this.f59836b;
                if (onStartListener3 != null) {
                    onStartListener3.onStartFailed(e5);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static a f59838a = new a(null);
    }

    private a() {
        this.f59830a = false;
        this.f59831b = false;
    }

    /* synthetic */ a(RunnableC0602a runnableC0602a) {
        this();
    }

    public static a b() {
        return b.f59838a;
    }

    public String a() {
        return this.f59835f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(GDTAdSdk.OnStartListener onStartListener) {
        if (this.f59830a) {
            f59829g.submit(new RunnableC0602a(onStartListener));
            return;
        }
        GDTLogger.e("在调用start方法前请先调用initWithoutStart方法");
        if (onStartListener != null) {
            onStartListener.onStartFailed(new Exception("在调用start方法前请先调用initWithoutStart方法"));
        }
    }

    public PM c() {
        return this.f59833d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean c(Context context, String str, boolean z4) {
        if (Build.VERSION.SDK_INT < 14) {
            GDTLogger.e("GDTADManager初始化错误，SDK不支持Android 4.0以下版本");
            return false;
        } else if (this.f59830a) {
            return true;
        } else {
            if (context == null || TextUtils.isEmpty(str)) {
                GDTLogger.e("GDTADManager初始化错误，context和appId不能为空");
                return false;
            }
            this.f59835f = str;
            this.f59832c = context.getApplicationContext();
            this.f59833d = new PM(this.f59832c, null);
            f59829g.submit(new com.qq.e.comm.managers.b(this, z4));
            this.f59830a = true;
            return true;
        }
    }

    public boolean d() {
        if (this.f59830a) {
            return true;
        }
        GDTLogger.e("SDK 尚未初始化，请在 Application 中调用 GDTAdSdk.initWithoutStart() 初始化");
        return false;
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public String getBuyerId(Map<String, Object> map) {
        if (d()) {
            try {
                return this.f59833d.getPOFactory().getBuyerId(map);
            } catch (Exception e5) {
                GDTLogger.e("SDK 初始化异常", e5);
                return "";
            }
        }
        return "";
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public DevTools getDevTools() {
        if (this.f59834e == null) {
            this.f59834e = new DevTools();
        }
        return this.f59834e;
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public String getSDKInfo(String str) {
        if (d()) {
            try {
                return this.f59833d.getPOFactory().getSDKInfo(str);
            } catch (Exception e5) {
                GDTLogger.e("SDK 初始化异常", e5);
                return "";
            }
        }
        return "";
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public int showOpenOrInstallAppDialog(GDTAppDialogClickListener gDTAppDialogClickListener) {
        if (this.f59831b) {
            try {
                return this.f59833d.getPOFactory().showOpenOrInstallAppDialog(gDTAppDialogClickListener);
            } catch (Exception e5) {
                GDTLogger.e("SDK 初始化异常", e5);
                return 0;
            }
        }
        return 0;
    }
}
