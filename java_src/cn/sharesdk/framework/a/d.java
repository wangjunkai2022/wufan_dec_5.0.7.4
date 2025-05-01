package cn.sharesdk.framework.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.e;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.f;
import com.mob.MobSDK;
import com.mob.commons.CSCenter;
import com.mob.commons.SHARESDK;
import com.mob.commons.authorize.DeviceAuthorizer;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.FileLocker;
import java.io.File;
import java.util.Calendar;
/* compiled from: StatisticsLogger.java */
/* loaded from: classes2.dex */
public class d extends f {

    /* renamed from: b  reason: collision with root package name */
    private static d f923b;

    /* renamed from: d  reason: collision with root package name */
    private Handler f925d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f926e;

    /* renamed from: f  reason: collision with root package name */
    private long f927f;

    /* renamed from: g  reason: collision with root package name */
    private File f928g;

    /* renamed from: c  reason: collision with root package name */
    private a f924c = a.a();

    /* renamed from: h  reason: collision with root package name */
    private FileLocker f929h = new FileLocker();

    private d() {
        File file = new File(MobSDK.getContext().getFilesDir(), ".statistics");
        this.f928g = file;
        if (file.exists()) {
            return;
        }
        try {
            this.f928g.createNewFile();
        } catch (Exception e5) {
            SSDKLog.b().a(e5);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f923b == null) {
                f923b = new d();
            }
            dVar = f923b;
        }
        return dVar;
    }

    public void b(cn.sharesdk.framework.a.b.c cVar) {
        try {
            if (MobSDK.isMob() && this.f926e) {
                a(cVar, new ShareSDKCallback<cn.sharesdk.framework.a.b.c>() { // from class: cn.sharesdk.framework.a.d.4
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(cn.sharesdk.framework.a.b.c cVar2) {
                        if (cVar2.g()) {
                            Message message = new Message();
                            message.what = 3;
                            message.obj = cVar2;
                            try {
                                ((f) d.this).f1059a.sendMessage(message);
                                return;
                            } catch (Throwable th) {
                                SSDKLog.b().a(th);
                                return;
                            }
                        }
                        SSDKLog b5 = SSDKLog.b();
                        b5.a("Drop event: " + cVar2.toString(), new Object[0]);
                    }
                });
            }
        } catch (Throwable th) {
            SSDKLog b5 = SSDKLog.b();
            b5.a("logStart " + th, new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.utils.f
    protected void c(Message message) {
        if (this.f926e) {
            e eVar = new e();
            eVar.f892a = System.currentTimeMillis() - this.f927f;
            a(eVar);
            this.f926e = false;
            try {
                this.f925d.sendEmptyMessage(1);
            } catch (Throwable th) {
                SSDKLog.b().a(th);
            }
            f923b = null;
            this.f1059a.getLooper().quit();
        }
    }

    public void a(Handler handler) {
        this.f925d = handler;
    }

    @Override // cn.sharesdk.framework.utils.f
    protected void a(Message message) {
        if (this.f926e) {
            return;
        }
        this.f926e = true;
        try {
            this.f929h.setLockFile(this.f928g.getAbsolutePath());
            if (this.f929h.lock(false)) {
                new Thread(new Runnable() { // from class: cn.sharesdk.framework.a.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            d.this.f924c.a(DeviceAuthorizer.authorize(new SHARESDK()));
                        } catch (Exception e5) {
                            SSDKLog.b().a(e5);
                        }
                    }
                }).start();
                this.f924c.a(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.a.d.2
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(Boolean bool) {
                        if (bool == null || !bool.booleanValue()) {
                            return;
                        }
                        d.this.f924c.a(((f) d.this).f1059a);
                    }
                });
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
    }

    @Override // cn.sharesdk.framework.utils.f
    protected void b(Message message) {
        int i4 = message.what;
        if (i4 == 2) {
            try {
                DH.requester(MobSDK.getContext()).getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.d.6
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        String networkType = dHResponse.getNetworkType();
                        if ("none".equals(networkType) || TextUtils.isEmpty(networkType)) {
                            return;
                        }
                        d.this.f924c.b();
                    }
                });
            } catch (Throwable th) {
                SSDKLog.b().a(th);
            }
        } else if (i4 == 3) {
            Object obj = message.obj;
            if (obj != null) {
                c((cn.sharesdk.framework.a.b.c) obj);
                this.f1059a.removeMessages(2);
                this.f1059a.sendEmptyMessageDelayed(2, 2000L);
            }
        } else if (i4 != 4) {
        } else {
            long longValue = cn.sharesdk.framework.a.a.e.a().h().longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(longValue);
            int i5 = calendar.get(1);
            int i6 = calendar.get(2);
            int i7 = calendar.get(5);
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i8 = calendar.get(1);
            int i9 = calendar.get(2);
            int i10 = calendar.get(5);
            if (i5 == i8 && i6 == i9 && i7 == i10) {
                return;
            }
            this.f924c.a(this.f1059a);
        }
    }

    private void c(cn.sharesdk.framework.a.b.c cVar) {
        try {
            boolean b5 = b();
            if (((cVar instanceof cn.sharesdk.framework.a.b.f) || (cVar instanceof cn.sharesdk.framework.a.b.b)) && !b5) {
                SSDKLog.b().b("SH AU LOG FALSE");
                return;
            }
            this.f924c.a(cVar);
            cVar.h();
        }
    }

    public void a(final cn.sharesdk.framework.a.b.c cVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread() { // from class: cn.sharesdk.framework.a.d.3
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    d.this.b(cVar);
                }
            }.start();
        } else {
            b(cVar);
        }
    }

    private void a(final cn.sharesdk.framework.a.b.c cVar, final ShareSDKCallback<cn.sharesdk.framework.a.b.c> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getDeviceData().getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.d.5
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    cVar.f878f = DeviceAuthorizer.authorize(new SHARESDK());
                    cVar.f879g = DH.SyncMtd.getPackageName();
                    cVar.f880h = DH.SyncMtd.getAppVersion();
                    cVar.f881i = String.valueOf(ShareSDK.SDK_VERSION_CODE);
                    cVar.f882j = DH.SyncMtd.getPlatformCode();
                    cVar.f883k = dHResponse.getDetailNetworkTypeForStatic();
                    if (TextUtils.isEmpty(MobSDK.getAppkey())) {
                        SSDKLog.b().b("ShareSDKCore", "Your appKey of ShareSDK is null , this will cause its data won't be count!");
                    } else if (!"cn.sharesdk.demo".equals(cVar.f879g) && ("api20".equals(MobSDK.getAppkey()) || "androidv1101".equals(MobSDK.getAppkey()))) {
                        SSDKLog.b().b("ShareSDKCore", "Your app is using the appkey of ShareSDK Demo, this will cause its data won't be count!");
                    }
                    cVar.f884l = dHResponse.getDeviceData();
                    shareSDKCallback.onCallback(cVar);
                } catch (Throwable th) {
                    SSDKLog.b().a(th);
                }
            }
        });
    }

    private boolean b() {
        try {
            boolean isSocietyPlatformDataEnable = CSCenter.getInstance().isSocietyPlatformDataEnable();
            SSDKLog b5 = SSDKLog.b();
            b5.a("platformDataEnable:" + isSocietyPlatformDataEnable, new Object[0]);
            return isSocietyPlatformDataEnable;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return true;
        }
    }
}
