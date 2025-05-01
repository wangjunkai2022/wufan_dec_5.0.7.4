package com.join.mgps.base;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
/* compiled from: LoadMoreView.java */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f46218c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f46219d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f46220e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f46221f = 4;

    /* renamed from: a  reason: collision with root package name */
    private int f46222a = 1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f46223b = false;

    private void k(BaseViewHolder baseViewHolder, boolean z4) {
        int c5 = c();
        if (c5 != 0) {
            baseViewHolder.setGone(c5, z4);
        }
    }

    private void l(BaseViewHolder baseViewHolder, boolean z4) {
        baseViewHolder.setGone(d(), z4);
    }

    private void m(BaseViewHolder baseViewHolder, boolean z4) {
        baseViewHolder.setGone(f(), z4);
    }

    public void a(BaseViewHolder baseViewHolder) {
        int i4 = this.f46222a;
        if (i4 == 1) {
            m(baseViewHolder, false);
            l(baseViewHolder, false);
            k(baseViewHolder, false);
        } else if (i4 == 2) {
            m(baseViewHolder, true);
            l(baseViewHolder, false);
            k(baseViewHolder, false);
        } else if (i4 == 3) {
            m(baseViewHolder, false);
            l(baseViewHolder, true);
            k(baseViewHolder, false);
        } else if (i4 != 4) {
        } else {
            m(baseViewHolder, false);
            l(baseViewHolder, false);
            k(baseViewHolder, true);
        }
    }

    @LayoutRes
    public abstract int b();

    @IdRes
    protected abstract int c();

    @IdRes
    protected abstract int d();

    public int e() {
        return this.f46222a;
    }

    @IdRes
    protected abstract int f();

    @Deprecated
    public boolean g() {
        return this.f46223b;
    }

    public final boolean h() {
        if (c() == 0) {
            return true;
        }
        return this.f46223b;
    }

    public final void i(boolean z4) {
        this.f46223b = z4;
    }

    public void j(int i4) {
        this.f46222a = i4;
    }
}
