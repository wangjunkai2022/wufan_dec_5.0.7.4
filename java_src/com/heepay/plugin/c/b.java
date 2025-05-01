package com.heepay.plugin.c;
/* loaded from: classes3.dex */
public class b {
    public static String a(Exception exc) {
        StackTraceElement[] stackTrace;
        String str = exc.getMessage() + ":\n";
        for (int i4 = 0; i4 < exc.getStackTrace().length; i4++) {
            str = str + stackTrace[i4].toString() + "\n";
        }
        return str;
    }

    public static void a(Exception exc, String str) {
        c.e("Exception", str + "产生了例外：" + a(exc));
    }
}
