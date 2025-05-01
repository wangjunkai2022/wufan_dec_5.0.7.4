package com.alipay.apmobilesecuritysdk.d;

import a3.c;
import android.content.Context;
/* loaded from: classes2.dex */
public final class b {
    public static String a(Context context) {
        try {
            return (String) c.class.getMethod("getUtdid", Context.class).invoke(null, context);
        } catch (Exception unused) {
            return "";
        }
    }
}
