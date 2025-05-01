package com.aggmoread.sdk.z.a.j;

import android.text.TextUtils;
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static f f2204a = new f();

    public static f a() {
        return f2204a;
    }

    public int a(String str) {
        String a5 = com.aggmoread.sdk.z.a.m.f.a().a(str);
        if (TextUtils.isEmpty(a5)) {
            return 0;
        }
        return Integer.parseInt(a5);
    }

    public void a(String str, int i4) {
        com.aggmoread.sdk.z.a.m.f.a().a(str, String.valueOf(i4));
    }
}
