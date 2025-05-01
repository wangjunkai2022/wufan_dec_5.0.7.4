package com.xuanyu.stickyheader;

import android.view.View;
import androidx.core.view.ViewCompat;
/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes6.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private final View f68460a;

    /* renamed from: b  reason: collision with root package name */
    private int f68461b;

    /* renamed from: c  reason: collision with root package name */
    private int f68462c;

    /* renamed from: d  reason: collision with root package name */
    private int f68463d;

    /* renamed from: e  reason: collision with root package name */
    private int f68464e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f68465f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f68466g = true;

    public j(View view) {
        this.f68460a = view;
    }

    void a() {
        View view = this.f68460a;
        ViewCompat.offsetTopAndBottom(view, this.f68463d - (view.getTop() - this.f68461b));
        View view2 = this.f68460a;
        ViewCompat.offsetLeftAndRight(view2, this.f68464e - (view2.getLeft() - this.f68462c));
    }

    public int b() {
        return this.f68462c;
    }

    public int c() {
        return this.f68461b;
    }

    public int d() {
        return this.f68464e;
    }

    public int e() {
        return this.f68463d;
    }

    public boolean f() {
        return this.f68466g;
    }

    public boolean g() {
        return this.f68465f;
    }

    void h() {
        this.f68461b = this.f68460a.getTop();
        this.f68462c = this.f68460a.getLeft();
    }

    public void i(boolean z4) {
        this.f68466g = z4;
    }

    public boolean j(int i4) {
        if (!this.f68466g || this.f68464e == i4) {
            return false;
        }
        this.f68464e = i4;
        a();
        return true;
    }

    public boolean k(int i4) {
        if (!this.f68465f || this.f68463d == i4) {
            return false;
        }
        this.f68463d = i4;
        a();
        return true;
    }

    public void l(boolean z4) {
        this.f68465f = z4;
    }
}
