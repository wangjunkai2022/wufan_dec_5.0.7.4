package com.facebook.drawee.view;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.h;
import java.util.ArrayList;
import o0.b;
/* compiled from: MultiDraweeHolder.java */
/* loaded from: classes2.dex */
public class d<DH extends o0.b> {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    boolean f11383a = false;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    ArrayList<b<DH>> f11384b = new ArrayList<>();

    public void a(int i4, b<DH> bVar) {
        h.i(bVar);
        h.g(i4, this.f11384b.size() + 1);
        this.f11384b.add(i4, bVar);
        if (this.f11383a) {
            bVar.m();
        }
    }

    public void b(b<DH> bVar) {
        a(this.f11384b.size(), bVar);
    }

    public void c() {
        if (this.f11383a) {
            for (int i4 = 0; i4 < this.f11384b.size(); i4++) {
                this.f11384b.get(i4).n();
            }
        }
        this.f11384b.clear();
    }

    public void d(Canvas canvas) {
        for (int i4 = 0; i4 < this.f11384b.size(); i4++) {
            Drawable i5 = e(i4).i();
            if (i5 != null) {
                i5.draw(canvas);
            }
        }
    }

    public b<DH> e(int i4) {
        return this.f11384b.get(i4);
    }

    public void f() {
        if (this.f11383a) {
            return;
        }
        this.f11383a = true;
        for (int i4 = 0; i4 < this.f11384b.size(); i4++) {
            this.f11384b.get(i4).m();
        }
    }

    public void g() {
        if (this.f11383a) {
            this.f11383a = false;
            for (int i4 = 0; i4 < this.f11384b.size(); i4++) {
                this.f11384b.get(i4).n();
            }
        }
    }

    public boolean h(MotionEvent motionEvent) {
        for (int i4 = 0; i4 < this.f11384b.size(); i4++) {
            if (this.f11384b.get(i4).o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public void i(int i4) {
        b<DH> bVar = this.f11384b.get(i4);
        if (this.f11383a) {
            bVar.n();
        }
        this.f11384b.remove(i4);
    }

    public int j() {
        return this.f11384b.size();
    }

    public boolean k(Drawable drawable) {
        for (int i4 = 0; i4 < this.f11384b.size(); i4++) {
            if (drawable == e(i4).i()) {
                return true;
            }
        }
        return false;
    }
}
