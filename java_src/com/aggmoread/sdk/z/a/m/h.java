package com.aggmoread.sdk.z.a.m;

import android.content.Context;
/* loaded from: classes2.dex */
public abstract class h {
    public static h a(Context context, String str) {
        return a(context, str, 4096);
    }

    public static h a(Context context, String str, int i4) {
        i iVar = 4096 == i4 ? new i(context) : new i(context);
        iVar.c(str);
        return iVar;
    }

    public abstract String a(String str, String str2);

    public abstract boolean a(String str);

    public abstract void b(String str, String str2);

    public abstract boolean b(String str);

    public abstract void c(String str);
}
