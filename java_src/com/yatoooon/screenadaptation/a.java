package com.yatoooon.screenadaptation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: AbsLoadViewHelper.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected float f68467a;

    /* renamed from: b  reason: collision with root package name */
    protected float f68468b;

    /* renamed from: c  reason: collision with root package name */
    protected float f68469c;

    /* renamed from: d  reason: collision with root package name */
    protected float f68470d;

    /* renamed from: e  reason: collision with root package name */
    protected int f68471e;

    /* renamed from: f  reason: collision with root package name */
    protected int f68472f;

    /* renamed from: g  reason: collision with root package name */
    protected float f68473g;

    /* renamed from: h  reason: collision with root package name */
    protected String f68474h;

    public a(Context context, int i4, int i5, float f5, String str) {
        this.f68471e = i4;
        this.f68472f = i5;
        this.f68473g = f5;
        this.f68474h = str;
        j(context);
    }

    private void j(Context context) {
        float[] a5 = b.a(context);
        if (a5.length == 4) {
            this.f68469c = a5[0];
            this.f68470d = a5[1];
            this.f68467a = a5[2];
            this.f68468b = a5[3];
        }
    }

    public abstract int a(int i4);

    public abstract void b(View view);

    public abstract void c(View view);

    public abstract void d(View view);

    public abstract void e(View view);

    public void f(View view) {
        g(view, new k3.c());
    }

    public final void g(View view, k3.b bVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            bVar.a(viewGroup, this);
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                if (viewGroup.getChildAt(i4) instanceof ViewGroup) {
                    g(viewGroup.getChildAt(i4), bVar);
                } else {
                    bVar.a(viewGroup.getChildAt(i4), this);
                }
            }
            return;
        }
        bVar.a(view, this);
    }

    public abstract void h(View view);

    public void i(Context context) {
        j(context);
    }
}
