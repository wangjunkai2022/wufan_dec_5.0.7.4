package com.airbnb.lottie.utils;

import com.airbnb.lottie.q0;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LogcatLogger.java */
/* loaded from: classes2.dex */
public class c implements q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f4304a = new HashSet();

    @Override // com.airbnb.lottie.q0
    public void a(String str) {
        b(str, null);
    }

    @Override // com.airbnb.lottie.q0
    public void b(String str, Throwable th) {
        Set<String> set = f4304a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    @Override // com.airbnb.lottie.q0
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.q0
    public void error(String str, Throwable th) {
        boolean z4 = com.airbnb.lottie.e.f3834a;
    }

    @Override // com.airbnb.lottie.q0
    public void debug(String str, Throwable th) {
        boolean z4 = com.airbnb.lottie.e.f3834a;
    }
}
