package com.qq.e.comm.managers.plugin;

import com.tencent.bugly.crashreport.CrashReport;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f59861a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f59862b;

    public static void a(Throwable th, String str) {
        try {
            Exception exc = new Exception("插件错误：" + str, th);
            if (f59862b) {
                return;
            }
            if (f59861a == null) {
                Method declaredMethod = CrashReport.class.getDeclaredMethod("postCatchedException", Throwable.class);
                f59861a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f59861a.invoke(null, exc);
        } catch (Throwable unused) {
            f59862b = true;
        }
    }
}
