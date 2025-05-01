package com.aggmoread.sdk.z.c.a.a.e.q;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static final String f3540a = "g";

    /* renamed from: b  reason: collision with root package name */
    static boolean f3541b = true;

    public static boolean a(String[] strArr) {
        if (f3541b || strArr == null) {
            return true;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3540a, "---- contains enter , classPrefix = " + Arrays.toString(strArr));
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length - 1;
        for (int i4 = 0; i4 < length; i4++) {
            String className = stackTrace[i4].getClassName();
            for (String str : strArr) {
                if (className.startsWith(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("className = ");
                    sb.append(className);
                    sb.append(" , count = ");
                    sb.append(i4 - 3);
                    sb.append(" , len = ");
                    sb.append(length);
                    com.aggmoread.sdk.z.c.a.a.e.e.b("xxxx", sb.toString());
                    return true;
                }
            }
        }
        return false;
    }
}
