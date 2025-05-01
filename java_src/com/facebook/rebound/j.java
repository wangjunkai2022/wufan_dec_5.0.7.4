package com.facebook.rebound;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: SpringChain.java */
/* loaded from: classes2.dex */
public class j implements m {

    /* renamed from: i  reason: collision with root package name */
    private static final int f12614i = 40;

    /* renamed from: j  reason: collision with root package name */
    private static final int f12615j = 6;

    /* renamed from: k  reason: collision with root package name */
    private static final int f12616k = 70;

    /* renamed from: l  reason: collision with root package name */
    private static final int f12617l = 10;

    /* renamed from: b  reason: collision with root package name */
    private final o f12619b;

    /* renamed from: c  reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f12620c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArrayList<i> f12621d;

    /* renamed from: e  reason: collision with root package name */
    private int f12622e;

    /* renamed from: f  reason: collision with root package name */
    private final k f12623f;

    /* renamed from: g  reason: collision with root package name */
    private final k f12624g;

    /* renamed from: h  reason: collision with root package name */
    private static final l f12613h = l.c();

    /* renamed from: m  reason: collision with root package name */
    private static int f12618m = 0;

    private j() {
        this(40, 6, 70, 10);
    }

    public static j f() {
        return new j();
    }

    public static j g(int i4, int i5, int i6, int i7) {
        return new j(i4, i5, i6, i7);
    }

    @Override // com.facebook.rebound.m
    public void a(i iVar) {
        int i4;
        int i5;
        int indexOf = this.f12621d.indexOf(iVar);
        m mVar = this.f12620c.get(indexOf);
        int i6 = this.f12622e;
        if (indexOf == i6) {
            i5 = indexOf - 1;
            i4 = indexOf + 1;
        } else if (indexOf < i6) {
            i5 = indexOf - 1;
            i4 = -1;
        } else {
            i4 = indexOf > i6 ? indexOf + 1 : -1;
            i5 = -1;
        }
        if (i4 > -1 && i4 < this.f12621d.size()) {
            this.f12621d.get(i4).x(iVar.f());
        }
        if (i5 > -1 && i5 < this.f12621d.size()) {
            this.f12621d.get(i5).x(iVar.f());
        }
        mVar.a(iVar);
    }

    @Override // com.facebook.rebound.m
    public void b(i iVar) {
        this.f12620c.get(this.f12621d.indexOf(iVar)).b(iVar);
    }

    @Override // com.facebook.rebound.m
    public void c(i iVar) {
        this.f12620c.get(this.f12621d.indexOf(iVar)).c(iVar);
    }

    @Override // com.facebook.rebound.m
    public void d(i iVar) {
        this.f12620c.get(this.f12621d.indexOf(iVar)).d(iVar);
    }

    public j e(m mVar) {
        this.f12621d.add(this.f12619b.d().a(this).B(this.f12624g));
        this.f12620c.add(mVar);
        return this;
    }

    public List<i> h() {
        return this.f12621d;
    }

    public k i() {
        return this.f12624g;
    }

    public i j() {
        return this.f12621d.get(this.f12622e);
    }

    public k k() {
        return this.f12623f;
    }

    public j l(int i4) {
        this.f12622e = i4;
        if (this.f12621d.get(i4) == null) {
            return null;
        }
        for (i iVar : this.f12619b.f()) {
            iVar.B(this.f12624g);
        }
        j().B(this.f12623f);
        return this;
    }

    private j(int i4, int i5, int i6, int i7) {
        this.f12619b = o.m();
        this.f12620c = new CopyOnWriteArrayList<>();
        this.f12621d = new CopyOnWriteArrayList<>();
        this.f12622e = -1;
        k b5 = k.b(i4, i5);
        this.f12623f = b5;
        k b6 = k.b(i6, i7);
        this.f12624g = b6;
        l lVar = f12613h;
        StringBuilder sb = new StringBuilder();
        sb.append("main spring ");
        int i8 = f12618m;
        f12618m = i8 + 1;
        sb.append(i8);
        lVar.a(b5, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("attachment spring ");
        int i9 = f12618m;
        f12618m = i9 + 1;
        sb2.append(i9);
        lVar.a(b6, sb2.toString());
    }
}
