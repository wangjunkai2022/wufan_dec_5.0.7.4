package com.airbnb.lottie;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TextDelegate.java */
/* loaded from: classes2.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f4389a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final LottieAnimationView f4390b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f4391c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4392d;

    @VisibleForTesting
    z0() {
        this.f4389a = new HashMap();
        this.f4392d = true;
        this.f4390b = null;
        this.f4391c = null;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f4390b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.f4391c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String c(String str, String str2) {
        if (this.f4392d && this.f4389a.containsKey(str2)) {
            return this.f4389a.get(str2);
        }
        String b5 = b(str, str2);
        if (this.f4392d) {
            this.f4389a.put(str2, b5);
        }
        return b5;
    }

    public void e() {
        this.f4389a.clear();
        d();
    }

    public void f(String str) {
        this.f4389a.remove(str);
        d();
    }

    public void g(boolean z4) {
        this.f4392d = z4;
    }

    public void h(String str, String str2) {
        this.f4389a.put(str, str2);
        d();
    }

    public z0(LottieAnimationView lottieAnimationView) {
        this.f4389a = new HashMap();
        this.f4392d = true;
        this.f4390b = lottieAnimationView;
        this.f4391c = null;
    }

    public z0(LottieDrawable lottieDrawable) {
        this.f4389a = new HashMap();
        this.f4392d = true;
        this.f4391c = lottieDrawable;
        this.f4390b = null;
    }
}
