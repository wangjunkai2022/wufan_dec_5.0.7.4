package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.umeng.analytics.pro.bm;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;
import net.lingala.zip4j.util.e;
/* compiled from: HeaderHelper.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f64455a;

    /* renamed from: b  reason: collision with root package name */
    private String f64456b;

    /* renamed from: c  reason: collision with root package name */
    private String f64457c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeaderHelper.java */
    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0675a {

        /* renamed from: a  reason: collision with root package name */
        private static final a f64458a = new a();

        private C0675a() {
        }
    }

    public static a a(Context context) {
        if (f64455a == null && context != null) {
            f64455a = context.getApplicationContext();
        }
        return C0675a.f64458a;
    }

    private void f(String str) {
        try {
            String replaceAll = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", e.F0);
            this.f64456b = replaceAll + e.F0 + "Android " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f64455a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f64455a, th);
        }
    }

    private void g(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] split = str2.split("&=");
            StringBuilder sb = new StringBuilder();
            sb.append(bm.aU);
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    String substring = str3.substring(0, 2);
                    if (substring.endsWith(SimpleComparison.EQUAL_TO_OPERATION)) {
                        substring = substring.replace(SimpleComparison.EQUAL_TO_OPERATION, "");
                    }
                    sb.append(substring);
                }
            }
            this.f64457c = sb.toString();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f64455a, th);
        }
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(bm.aM);
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(bm.aH);
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(bm.aK);
    }

    public void e(String str) {
        String substring = str.substring(0, str.indexOf(95));
        g(substring);
        f(substring);
    }

    private a() {
        this.f64456b = null;
        this.f64457c = null;
    }

    public String b() {
        return this.f64456b;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("a");
    }

    public String a() {
        return this.f64457c;
    }
}
