package cn.sharesdk.framework;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.sharesdk.framework.loopshare.LoopSharePasswordListener;
import cn.sharesdk.framework.loopshare.LoopShareResultListener;
import cn.sharesdk.framework.loopshare.MoblinkActionListener;
import cn.sharesdk.framework.loopshare.watermark.ReadQrImageListener;
import cn.sharesdk.framework.loopshare.watermark.WaterMarkListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.k;
import com.mob.MobSDK;
import com.mob.commons.ForbThrowable;
import com.mob.commons.dialog.PolicyThrowable;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class ShareSDK {
    public static final String SDK_TAG = "SHARESDK";
    public static final int SDK_VERSION_CODE;
    public static final String SDK_VERSION_NAME = "3.10.22";
    public static final String SHARESDK_MOBLINK_RESTORE = "sharesdk_moblink_restore";

    /* renamed from: a  reason: collision with root package name */
    private static i f780a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f781b = true;

    /* renamed from: c  reason: collision with root package name */
    private static String f782c;

    /* renamed from: d  reason: collision with root package name */
    private static HashMap<String, Object> f783d;

    /* renamed from: e  reason: collision with root package name */
    private static List<HashMap<String, Object>> f784e;

    /* renamed from: f  reason: collision with root package name */
    private static int f785f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f786g;

    static {
        int i4 = 0;
        for (String str : SDK_VERSION_NAME.split("\\.")) {
            i4 = (i4 * 100) + Integer.parseInt(str);
        }
        SDK_VERSION_CODE = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static String a(Bitmap bitmap) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static String a(String str) {
        return null;
    }

    public static void closeDebug() {
        f781b = false;
    }

    public static void deleteCache() {
        try {
            k();
            i iVar = f780a;
            if (iVar != null) {
                iVar.g();
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK deleteCache catch ", new Object[0]);
        }
    }

    public static void deleteCacheAsync() {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.1
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.g();
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK deleteCache catch ", new Object[0]);
                }
            }
        });
    }

    public static Activity getAuthActivity() {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK getAuthActivity catch ", new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }

    public static void getAuthActivityAsync(final ShareSDKCallback<Activity> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.14
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK getAuthActivity catch ", new Object[0]);
                }
                Activity a5 = ShareSDK.f780a != null ? ShareSDK.f780a.a() : null;
                ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(a5);
                }
            }
        });
    }

    @Deprecated
    public static HashMap<String, Object> getCustomDataFromLoopShare() {
        return null;
    }

    public static String getDevinfo(String str, String str2) {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK getDevinfo catch ", new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.b(str, str2);
        }
        return null;
    }

    public static void getDevinfoAsync(final String str, final String str2, final ShareSDKCallback<String> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.19
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK getDevinfo catch ", new Object[0]);
                }
                String b5 = ShareSDK.f780a != null ? ShareSDK.f780a.b(str, str2) : "";
                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(b5);
                }
            }
        });
    }

    @Deprecated
    public static boolean getEnableAuthTag() {
        return false;
    }

    @Deprecated
    public static void getFirstQrImage(Context context, ReadQrImageListener readQrImageListener) {
    }

    public static void getNetworkDevinfoAsync(final int i4, final String str, final ShareSDKCallback<String> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.20
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK getNetworkDevinfo catch ", new Object[0]);
                }
                String a5 = ShareSDK.f780a != null ? ShareSDK.f780a.a(i4, str) : "";
                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(a5);
                }
            }
        });
    }

    public static Platform getPlatform(String str) {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK ensureInit getPlatform catch", new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.a(str);
        }
        SSDKLog.b().a("ShareSDK use defaultPlatform", new Object[0]);
        return Platform.getDefaultPlatform();
    }

    public static void getPlatformAsync(final String str, final ShareSDKCallback<Platform> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.3
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK ensureInit getPlatform catch", new Object[0]);
                }
                Platform defaultPlatform = Platform.getDefaultPlatform();
                if (ShareSDK.f780a != null) {
                    defaultPlatform = ShareSDK.f780a.a(str);
                } else {
                    SSDKLog.b().a("ShareSDK use defaultPlatform", new Object[0]);
                }
                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(defaultPlatform);
                }
            }
        });
    }

    public static Platform[] getPlatformList() {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK getPlatformList catch ", new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    public static void getPlatformListAsync(final ShareSDKCallback<Platform[]> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.2
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    Platform[] d5 = ShareSDK.f780a != null ? ShareSDK.f780a.d() : null;
                    ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(d5);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK getPlatformList catch ", new Object[0]);
                }
            }
        });
    }

    @Deprecated
    public static Bitmap getQRCodeBitmap(String str, int i4, int i5) throws Throwable {
        return null;
    }

    public static <T extends Service> T getService(Class<T> cls) throws Throwable {
        k();
        i iVar = f780a;
        if (iVar != null) {
            return (T) iVar.c(cls);
        }
        return null;
    }

    public static <T extends Service> void getServiceAsync(final Class<T> cls, final ShareSDKCallback<T> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.26
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                        if (shareSDKCallback2 != null) {
                            shareSDKCallback2.onCallback(ShareSDK.f780a.c(cls));
                        }
                    } else {
                        ShareSDKCallback shareSDKCallback3 = ShareSDKCallback.this;
                        if (shareSDKCallback3 != null) {
                            shareSDKCallback3.onCallback(null);
                        }
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("ShareSDK getServiceAsync" + th, new Object[0]);
                }
            }
        });
    }

    static /* synthetic */ int h() {
        int i4 = f785f;
        f785f = i4 + 1;
        return i4;
    }

    public static boolean isDebug() {
        return f781b;
    }

    public static boolean isFBInstagram() {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog b5 = SSDKLog.b();
            b5.a("ShareSDK isFBInstagram catch: " + th, new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.b();
        }
        return false;
    }

    public static void isFBInstagramAsync(final ShareSDKCallback<Boolean> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.16
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("ShareSDK isFBInstagram catch: " + th, new Object[0]);
                }
                boolean b6 = ShareSDK.f780a != null ? ShareSDK.f780a.b() : false;
                ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(Boolean.valueOf(b6));
                }
            }
        });
    }

    public static void isNetworkDevinfoRequestedAsync(final ShareSDKCallback<Boolean> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.21
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK isNetworkDevinfoRequested is catch ", new Object[0]);
                }
                boolean f5 = ShareSDK.f780a != null ? ShareSDK.f780a.f() : false;
                ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(Boolean.valueOf(f5));
                }
            }
        });
    }

    public static boolean isRemoveCookieOnAuthorize() {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog b5 = SSDKLog.b();
            b5.a("ShareSDK isRemoveCookieOnAuthorize catch: " + th, new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.e();
        }
        return false;
    }

    public static void isRemoveCookieOnAuthorizeAsync(final ShareSDKCallback<Boolean> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.12
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("ShareSDK isRemoveCookieOnAuthorize catch: " + th, new Object[0]);
                }
                boolean e5 = ShareSDK.f780a != null ? ShareSDK.f780a.e() : false;
                ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(Boolean.valueOf(e5));
                }
            }
        });
    }

    private static boolean j() throws Throwable {
        if (!MobSDK.isForb()) {
            if (!f786g) {
                f786g = true;
                cn.sharesdk.framework.utils.i.a();
            }
            int isAuth = MobSDK.isAuth();
            if (isAuth == 1 || isAuth == 2) {
                return true;
            }
            throw new PolicyThrowable();
        }
        throw new ForbThrowable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void k() throws Throwable {
        synchronized (ShareSDK.class) {
            j();
            if (f780a == null) {
                i iVar = new i();
                iVar.c();
                f780a = iVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        new Thread(new Runnable() { // from class: cn.sharesdk.framework.ShareSDK.8
            @Override // java.lang.Runnable
            public void run() {
                Looper.prepare();
                final Handler handler = new Handler(Looper.myLooper()) { // from class: cn.sharesdk.framework.ShareSDK.8.1
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        super.handleMessage(message);
                        if (message == null || message.what != 3) {
                            return;
                        }
                        try {
                            ShareSDK.k();
                            if (ShareSDK.f780a != null) {
                                if (ShareSDK.f783d == null || ShareSDK.f783d.size() <= 0) {
                                    ShareSDK.f780a.a(ShareSDK.f784e);
                                } else {
                                    ShareSDK.f780a.a(ShareSDK.f782c, ShareSDK.f783d);
                                }
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                };
                handler.post(new Runnable() { // from class: cn.sharesdk.framework.ShareSDK.8.2
                    @Override // java.lang.Runnable
                    public void run() {
                        int isAuth = MobSDK.isAuth();
                        if (isAuth == 0) {
                            ShareSDK.h();
                            if (ShareSDK.f785f == 90) {
                                handler.removeCallbacks(this);
                                return;
                            }
                            SSDKLog.b().d("ShareSDK , Privacy Agreement is not agree, Please agree to the privacy agreement first ", new Object[0]);
                            handler.postDelayed(this, 500L);
                        } else if (isAuth != 1 && isAuth != 2) {
                            handler.removeCallbacks(this);
                        } else if (MobSDK.isForb()) {
                        } else {
                            handler.removeCallbacks(this);
                            Message obtain = Message.obtain();
                            obtain.what = 3;
                            handler.sendMessage(obtain);
                        }
                    }
                });
                Looper.loop();
            }
        }).start();
    }

    public static void logApiEvent(final String str, final int i4) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.5
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(str, i4);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK logApiEvent catch ", new Object[0]);
                }
            }
        });
    }

    public static void logDemoEvent(final int i4, final Platform platform) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.4
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(i4, platform);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK logDemoEvent catch ", new Object[0]);
                }
            }
        });
    }

    @Deprecated
    public static void makeVideoWaterMark(String str, String str2, String str3, String str4, WaterMarkListener waterMarkListener) {
    }

    @Deprecated
    public static void mobLinkGetMobID(HashMap<String, Object> hashMap, MoblinkActionListener moblinkActionListener) {
    }

    public static String platformIdToName(int i4) {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog b5 = SSDKLog.b();
            b5.a("ShareSDK platformIdToName catch: " + th, new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.c(i4);
        }
        return null;
    }

    public static void platformIdToNameAsync(final int i4, final ShareSDKCallback<String> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.9
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("ShareSDK platformIdToName catch: " + th, new Object[0]);
                }
                String c5 = ShareSDK.f780a != null ? ShareSDK.f780a.c(i4) : "";
                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(c5);
                }
            }
        });
    }

    public static int platformNameToId(String str) {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK platformNameToId catch ", new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.b(str);
        }
        return -1;
    }

    public static void platformNameToIdAsync(final String str, final ShareSDKCallback<Integer> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.10
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK platformNameToId catch ", new Object[0]);
                }
                int b5 = ShareSDK.f780a != null ? ShareSDK.f780a.b(str) : -1;
                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(Integer.valueOf(b5));
                }
            }
        });
    }

    @Deprecated
    public static void prepareLoopShare(LoopShareResultListener loopShareResultListener) {
    }

    @Deprecated
    public static void preparePassWord(HashMap<String, Object> hashMap, String str, LoopSharePasswordListener loopSharePasswordListener) {
    }

    @Deprecated
    public static void readPassWord(boolean z4, LoopSharePasswordListener loopSharePasswordListener) {
    }

    public static void registerPlatformAsync(final Class<? extends CustomPlatform> cls) throws Throwable {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.27
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                ShareSDK.k();
                if (ShareSDK.f780a != null) {
                    ShareSDK.f780a.d(cls);
                }
            }
        });
    }

    public static void registerService(final Class<? extends Service> cls) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.11
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(cls);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK  registerService catch ", new Object[0]);
                }
            }
        });
    }

    public static void removeCookieOnAuthorize(boolean z4) {
        try {
            k();
            i iVar = f780a;
            if (iVar != null) {
                iVar.b(z4);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK removeCookieOnAuthorize catch ", new Object[0]);
        }
    }

    public static void removeCookieOnAuthorizeAsync(final boolean z4) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.31
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.b(z4);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK removeCookieOnAuthorize catch ", new Object[0]);
                }
            }
        });
    }

    public static void setActivity(Activity activity) {
        try {
            k();
            i iVar = f780a;
            if (iVar != null) {
                iVar.a(activity);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK setActivity is catch ", new Object[0]);
        }
    }

    public static void setActivityAsync(final Activity activity) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.13
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(activity);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK setActivity is catch ", new Object[0]);
                }
            }
        });
    }

    public static void setCloseGppService(final boolean z4) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.25
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    cn.sharesdk.framework.a.a.e.a().b(z4);
                } catch (Throwable th) {
                    SSDKLog.b().a(th);
                }
            }
        });
    }

    public static void setConnTimeout(int i4) {
        try {
            k();
            i iVar = f780a;
            if (iVar != null) {
                iVar.a(i4);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK setConnTimeout catch", new Object[0]);
        }
    }

    public static void setConnTimeoutAsync(final int i4) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.29
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(i4);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK setConnTimeout catch", new Object[0]);
                }
            }
        });
    }

    @Deprecated
    public static void setEnableAuthTag(boolean z4) {
    }

    public static void setFBInstagram(boolean z4) {
        try {
            k();
            i iVar = f780a;
            if (iVar != null) {
                iVar.a(z4);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK setFBInstagram catch ", new Object[0]);
        }
    }

    public static void setFBInstagramAsync(final boolean z4) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.15
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(z4);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK setFBInstagram catch ", new Object[0]);
                }
            }
        });
    }

    public static void setPlatformDevInfo(String str, HashMap<String, Object> hashMap) {
        try {
            f782c = str;
            f783d = hashMap;
            if (!MobSDK.isForb() && MobSDK.isAuth() == 1) {
                k();
                i iVar = f780a;
                if (iVar != null) {
                    iVar.a(str, hashMap);
                }
            } else {
                l();
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK setPlatformDevInfo catch ", new Object[0]);
        }
    }

    public static void setPlatformDevInfoAsync(final String str, final HashMap<String, Object> hashMap) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.6
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    String unused = ShareSDK.f782c = str;
                    HashMap unused2 = ShareSDK.f783d = hashMap;
                    if (MobSDK.isForb() || MobSDK.isAuth() != 1) {
                        ShareSDK.l();
                    } else {
                        ShareSDK.k();
                        if (ShareSDK.f780a != null) {
                            ShareSDK.f780a.a(str, hashMap);
                        }
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK setPlatformDevInfo catch ", new Object[0]);
                }
            }
        });
    }

    public static void setPlatformDevInfos(List<HashMap<String, Object>> list) {
        try {
            f784e = list;
            if (!MobSDK.isForb() && MobSDK.isAuth() == 1) {
                k();
                i iVar = f780a;
                if (iVar != null) {
                    iVar.a(f784e);
                }
            } else {
                l();
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK setPlatformDevInfo catch ", new Object[0]);
        }
    }

    public static void setPlatformDevInfosAsync(final List<HashMap<String, Object>> list) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.7
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    List unused = ShareSDK.f784e = list;
                    if (MobSDK.isForb() || MobSDK.isAuth() != 1) {
                        ShareSDK.l();
                    } else {
                        ShareSDK.k();
                        if (ShareSDK.f780a != null) {
                            ShareSDK.f780a.a(ShareSDK.f784e);
                        }
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK setPlatformDevInfo catch ", new Object[0]);
                }
            }
        });
    }

    public static void setReadTimeout(int i4) {
        try {
            k();
            i iVar = f780a;
            if (iVar != null) {
                iVar.b(i4);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK setReadTimeout catch", new Object[0]);
        }
    }

    public static void setReadTimeoutAsync(final int i4) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.30
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.b(i4);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK setReadTimeout catch", new Object[0]);
                }
            }
        });
    }

    public static void unregisterPlatform(final Class<? extends CustomPlatform> cls) throws Throwable {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.28
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                ShareSDK.k();
                if (ShareSDK.f780a != null) {
                    ShareSDK.f780a.e(cls);
                }
            }
        });
    }

    public static void unregisterService(final Class<? extends Service> cls) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.22
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.b(cls);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK  unregisterService catch ", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final String str, final String str2) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.17
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(str, str2);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK copyDevinfo ", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final int i4, final int i5) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.18
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                    if (ShareSDK.f780a != null) {
                        ShareSDK.f780a.a(i4, i5);
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK copyNetworkDevinfo catch ", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i4, String str) {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK getNetworkDevinfo catch ", new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.a(i4, str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        try {
            k();
        } catch (Throwable th) {
            SSDKLog.b().a(th, "ShareSDK isNetworkDevinfoRequested is catch ", new Object[0]);
        }
        i iVar = f780a;
        if (iVar != null) {
            return iVar.f();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final ShareSDKCallback<Boolean> shareSDKCallback) throws Throwable {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.23
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                ShareSDK.k();
                if (ShareSDK.f780a != null) {
                    ShareSDK.f780a.a(ShareSDKCallback.this);
                    return;
                }
                ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(Boolean.FALSE);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final String str, final boolean z4, final int i4, final String str2, final ShareSDKCallback<String> shareSDKCallback) {
        k.a(new k.a() { // from class: cn.sharesdk.framework.ShareSDK.24
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    ShareSDK.k();
                } catch (Throwable th) {
                    SSDKLog.b().a(th, "ShareSDK getShortLink catch ", new Object[0]);
                }
                if (ShareSDK.f780a != null) {
                    ShareSDK.f780a.a(str, z4, i4, str2, shareSDKCallback);
                    return;
                }
                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(str);
                }
            }
        });
    }
}
