package com.beizi.fusion.g;

import android.os.Handler;
import android.os.Looper;
/* compiled from: HandlerUtil.java */
/* loaded from: classes2.dex */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f6823a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable, long j4) {
        f6823a.postDelayed(runnable, j4);
    }
}
