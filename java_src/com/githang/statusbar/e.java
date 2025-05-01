package com.githang.statusbar;

import android.os.Build;
/* compiled from: StatusBarExclude.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static boolean f13026a;

    public static void a() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
        } catch (NoSuchMethodException unused) {
            f13026a |= Build.BRAND.contains("Meizu");
        }
    }
}
