package com.netease.nis.quicklogin.utils;

import android.annotation.SuppressLint;
import android.content.Context;
/* compiled from: StatisticsUploader.java */
/* loaded from: classes5.dex */
public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static volatile f f57613b;

    /* renamed from: a  reason: collision with root package name */
    private final a f57614a = new a();

    /* compiled from: StatisticsUploader.java */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f57615a;
    }

    private f() {
    }

    public static f a() {
        if (f57613b == null) {
            synchronized (g.class) {
                if (f57613b == null) {
                    f57613b = new f();
                }
            }
        }
        return f57613b;
    }

    public void a(String str) {
        this.f57614a.f57615a = str;
    }

    public f a(Context context) {
        context.getApplicationContext();
        return this;
    }
}
