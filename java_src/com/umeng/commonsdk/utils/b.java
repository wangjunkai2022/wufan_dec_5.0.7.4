package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.HashMap;
/* compiled from: PkgInfoUtil.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, PackageInfo> f64585a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static Object f64586b = new Object();

    /* compiled from: PkgInfoUtil.java */
    /* loaded from: classes6.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f64587a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f64587a;
    }

    private b() {
    }

    public PackageInfo a(Context context, String str, int i4) {
        PackageInfo packageInfo;
        synchronized (f64586b) {
            packageInfo = null;
            if (f64585a.containsKey(str)) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", pkgInfo缓存命中，直接返回");
                packageInfo = f64585a.get(str);
            } else {
                try {
                    PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(str, i4);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", 获取pkgInfo并缓存");
                    f64585a.put(str, packageInfo2);
                    packageInfo = packageInfo2;
                } catch (PackageManager.NameNotFoundException unused) {
                    f64585a.put(str, null);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg: " + str + "，目标包未安装。");
                }
            }
        }
        return packageInfo;
    }
}
