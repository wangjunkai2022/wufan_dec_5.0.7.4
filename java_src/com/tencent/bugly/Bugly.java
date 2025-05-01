package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes3.dex */
public class Bugly {
    public static final String SDK_IS_DEV = "false";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f62162a = false;
    public static Context applicationContext = null;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f62163b = {"BuglyCrashModule", "BuglyRqdModule", "BuglyBetaModule"};

    /* renamed from: c  reason: collision with root package name */
    private static String[] f62164c = {"BuglyRqdModule", "BuglyCrashModule", "BuglyBetaModule"};
    public static boolean enable = true;
    public static Boolean isDev;

    public static synchronized String getAppChannel() {
        byte[] bArr;
        synchronized (Bugly.class) {
            com.tencent.bugly.crashreport.common.info.a b5 = com.tencent.bugly.crashreport.common.info.a.b();
            if (b5 == null) {
                return null;
            }
            if (TextUtils.isEmpty(b5.f62261l)) {
                p a5 = p.a();
                if (a5 == null) {
                    return b5.f62261l;
                }
                Map<String, byte[]> a6 = a5.a(556, (o) null, true);
                if (a6 != null && (bArr = a6.get("app_channel")) != null) {
                    return new String(bArr);
                }
            }
            return b5.f62261l;
        }
    }

    public static void init(Context context, String str, boolean z4) {
        init(context, str, z4, null);
    }

    public static boolean isDev() {
        if (isDev == null) {
            isDev = Boolean.valueOf(Boolean.parseBoolean(SDK_IS_DEV.replace("@", "")));
        }
        return isDev.booleanValue();
    }

    public static synchronized void init(Context context, String str, boolean z4, BuglyStrategy buglyStrategy) {
        String[] strArr;
        synchronized (Bugly.class) {
            if (f62162a) {
                return;
            }
            f62162a = true;
            Context a5 = z.a(context);
            applicationContext = a5;
            if (a5 == null) {
                String str2 = x.f62732a;
                return;
            }
            if (isDev()) {
                f62163b = f62164c;
            }
            for (String str3 : f62163b) {
                if (str3.equals("BuglyCrashModule")) {
                    b.a(CrashModule.getInstance());
                } else if (!str3.equals("BuglyBetaModule") && !str3.equals("BuglyRqdModule")) {
                    str3.equals("BuglyFeedbackModule");
                }
            }
            b.f62191a = enable;
            b.a(applicationContext, str, z4, buglyStrategy);
        }
    }
}
