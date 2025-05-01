package com.mob;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.mob.commons.C0811r;
import com.mob.commons.CSCenter;
import com.mob.commons.InternationalDomain;
import com.mob.commons.MobProduct;
import com.mob.commons.s;
import com.mob.commons.u;
import com.mob.commons.v;
import com.mob.commons.x;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
/* loaded from: classes.dex */
public class MobSDK implements PublicMemberKeeper {
    public static final int CHANNEL_APICLOUD = 5;
    public static final int CHANNEL_COCOS = 1;
    public static final int CHANNEL_FLUTTER = 4;
    public static final int CHANNEL_JS = 3;
    public static final int CHANNEL_NATIVE = 0;
    public static final int CHANNEL_QUICKSDK = 6;
    public static final int CHANNEL_REACT_NATIVE = 8;
    public static final int CHANNEL_UNIAPP = 7;
    public static final int CHANNEL_UNITY = 2;
    public static final int SDK_VERSION_CODE;
    public static final String SDK_VERSION_NAME;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Context f56006a;

    static {
        int i4;
        String str = "1.0.0";
        try {
            str = "2024-10-16".replace("-", h0.f27805a);
            i4 = Integer.parseInt("2024-10-16".replace("-", ""));
        } catch (Throwable unused) {
            i4 = 1;
        }
        SDK_VERSION_CODE = i4;
        SDK_VERSION_NAME = str;
    }

    @Deprecated
    public static void canIContinueBusiness(final MobProduct mobProduct, Object obj, final Object obj2) {
        if (obj2 != null) {
            new Thread(new Runnable() { // from class: com.mob.MobSDK.2
                @Override // java.lang.Runnable
                public void run() {
                    if (MobProduct.this == null) {
                        ReflectHelper.invokeInstanceMethodNoThrow(obj2, "onFailure", null, new Throwable("Product can not be null"));
                    } else {
                        ReflectHelper.invokeInstanceMethodNoThrow(obj2, "onComplete", null, Boolean.TRUE);
                    }
                }
            }).start();
            return;
        }
        throw new IllegalArgumentException("callback can not be null");
    }

    public static boolean checkForceHttps() {
        return C0811r.f56461f;
    }

    @Deprecated
    public static String checkRequestUrl(String str) {
        return v.a(str);
    }

    public static boolean checkV6() {
        return C0811r.f56462g;
    }

    @Deprecated
    public static String dynamicModifyUrl(String str) {
        return v.a(str);
    }

    public static String getAppSecret() {
        if (TextUtils.isEmpty(C0811r.f56457b)) {
            return C0811r.f56459d;
        }
        return C0811r.f56457b;
    }

    public static String getAppkey() {
        if (x.h()) {
            return u.a();
        }
        return null;
    }

    public static Context getContext() {
        if (f56006a == null) {
            try {
                Context a5 = v.a();
                if (a5 != null) {
                    init(a5);
                }
            } catch (Throwable unused) {
            }
        }
        return f56006a;
    }

    public static Context getContextSafely() {
        return f56006a;
    }

    public static boolean getDefaultPrivacy() {
        return true;
    }

    public static InternationalDomain getDomain() {
        return C0811r.f56460e == null ? InternationalDomain.DEFAULT : C0811r.f56460e;
    }

    public static int getPrivacyGrantedStatus() {
        return x.c();
    }

    public static synchronized void init(Context context) {
        synchronized (MobSDK.class) {
            init(context, null, null);
        }
    }

    public static final int isAuth() {
        return u.b();
    }

    public static final boolean isForb() {
        return u.d();
    }

    public static final boolean isGppVer() {
        return C0811r.f56464i;
    }

    public static final boolean isMob() {
        return u.c();
    }

    public static void setChannel(MobProduct mobProduct, int i4) {
        if (isForb()) {
            MobLog.getInstance().d("isForb: true", new Object[0]);
        } else {
            s.a().a(mobProduct, i4);
        }
    }

    public static void submitPolicyGrantResult(boolean z4) {
        x.b(z4);
    }

    public static String syncGetBSDM(String str, String str2, String str3, boolean z4) {
        return u.a(str, str2, str3, z4);
    }

    public static void updateMobCustomController(MobCustomController mobCustomController) {
        CSCenter.getInstance().updateCustomController(mobCustomController);
    }

    public static void submitPolicyGrantResult(MobCustomController mobCustomController, boolean z4) {
        submitPolicyGrantResult(z4);
        updateMobCustomController(mobCustomController);
    }

    public static synchronized void init(Context context, String str) {
        synchronized (MobSDK.class) {
            init(context, str, null);
        }
    }

    @Deprecated
    public static void submitPolicyGrantResult(boolean z4, final OperationCallback<Void> operationCallback) {
        x.b(z4);
        if (operationCallback != null) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.MobSDK.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    OperationCallback operationCallback2 = OperationCallback.this;
                    if (operationCallback2 != null) {
                        operationCallback2.onComplete(null);
                        return false;
                    }
                    return false;
                }
            });
        }
    }

    public static synchronized void init(Context context, String str, String str2) {
        synchronized (MobSDK.class) {
            if (context == null) {
                return;
            }
            if (f56006a == null) {
                f56006a = context.getApplicationContext();
                C0811r.f56456a = str;
                C0811r.f56457b = str2;
                u.a(false);
            } else if (!TextUtils.isEmpty(str) && !str.equals(C0811r.f56456a)) {
                C0811r.f56456a = str;
                C0811r.f56457b = str2;
                u.a(true);
            }
        }
    }
}
