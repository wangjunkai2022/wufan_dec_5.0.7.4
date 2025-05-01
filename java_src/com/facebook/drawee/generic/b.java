package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.internal.h;
import com.facebook.drawee.drawable.r;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: GenericDraweeHierarchyBuilder.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: t  reason: collision with root package name */
    public static final int f11333t = 300;

    /* renamed from: u  reason: collision with root package name */
    public static final r.c f11334u = r.c.f11299f;

    /* renamed from: v  reason: collision with root package name */
    public static final r.c f11335v = r.c.f11300g;

    /* renamed from: a  reason: collision with root package name */
    private Resources f11336a;

    /* renamed from: b  reason: collision with root package name */
    private int f11337b;

    /* renamed from: c  reason: collision with root package name */
    private float f11338c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f11339d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private r.c f11340e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f11341f;

    /* renamed from: g  reason: collision with root package name */
    private r.c f11342g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f11343h;

    /* renamed from: i  reason: collision with root package name */
    private r.c f11344i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f11345j;

    /* renamed from: k  reason: collision with root package name */
    private r.c f11346k;

    /* renamed from: l  reason: collision with root package name */
    private r.c f11347l;

    /* renamed from: m  reason: collision with root package name */
    private Matrix f11348m;

    /* renamed from: n  reason: collision with root package name */
    private PointF f11349n;

    /* renamed from: o  reason: collision with root package name */
    private ColorFilter f11350o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f11351p;

    /* renamed from: q  reason: collision with root package name */
    private List<Drawable> f11352q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f11353r;

    /* renamed from: s  reason: collision with root package name */
    private RoundingParams f11354s;

    public b(Resources resources) {
        this.f11336a = resources;
        s();
    }

    private void Z() {
        List<Drawable> list = this.f11352q;
        if (list != null) {
            for (Drawable drawable : list) {
                h.i(drawable);
            }
        }
    }

    private void s() {
        this.f11337b = 300;
        this.f11338c = 0.0f;
        this.f11339d = null;
        r.c cVar = f11334u;
        this.f11340e = cVar;
        this.f11341f = null;
        this.f11342g = cVar;
        this.f11343h = null;
        this.f11344i = cVar;
        this.f11345j = null;
        this.f11346k = cVar;
        this.f11347l = f11335v;
        this.f11348m = null;
        this.f11349n = null;
        this.f11350o = null;
        this.f11351p = null;
        this.f11352q = null;
        this.f11353r = null;
        this.f11354s = null;
    }

    public static b t(Resources resources) {
        return new b(resources);
    }

    public b A(int i4) {
        this.f11337b = i4;
        return this;
    }

    public b B(int i4) {
        this.f11343h = this.f11336a.getDrawable(i4);
        return this;
    }

    public b C(int i4, @Nullable r.c cVar) {
        this.f11343h = this.f11336a.getDrawable(i4);
        this.f11344i = cVar;
        return this;
    }

    public b D(@Nullable Drawable drawable) {
        this.f11343h = drawable;
        return this;
    }

    public b E(Drawable drawable, @Nullable r.c cVar) {
        this.f11343h = drawable;
        this.f11344i = cVar;
        return this;
    }

    public b F(@Nullable r.c cVar) {
        this.f11344i = cVar;
        return this;
    }

    public b G(@Nullable Drawable drawable) {
        if (drawable == null) {
            this.f11352q = null;
        } else {
            this.f11352q = Arrays.asList(drawable);
        }
        return this;
    }

    public b H(@Nullable List<Drawable> list) {
        this.f11352q = list;
        return this;
    }

    public b I(int i4) {
        this.f11339d = this.f11336a.getDrawable(i4);
        return this;
    }

    public b J(int i4, @Nullable r.c cVar) {
        this.f11339d = this.f11336a.getDrawable(i4);
        this.f11340e = cVar;
        return this;
    }

    public b K(@Nullable Drawable drawable) {
        this.f11339d = drawable;
        return this;
    }

    public b L(Drawable drawable, @Nullable r.c cVar) {
        this.f11339d = drawable;
        this.f11340e = cVar;
        return this;
    }

    public b M(@Nullable r.c cVar) {
        this.f11340e = cVar;
        return this;
    }

    public b N(@Nullable Drawable drawable) {
        if (drawable == null) {
            this.f11353r = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f11353r = stateListDrawable;
        }
        return this;
    }

    public b O(int i4) {
        this.f11345j = this.f11336a.getDrawable(i4);
        return this;
    }

    public b P(int i4, @Nullable r.c cVar) {
        this.f11345j = this.f11336a.getDrawable(i4);
        this.f11346k = cVar;
        return this;
    }

    public b Q(@Nullable Drawable drawable) {
        this.f11345j = drawable;
        return this;
    }

    public b R(Drawable drawable, @Nullable r.c cVar) {
        this.f11345j = drawable;
        this.f11346k = cVar;
        return this;
    }

    public b S(@Nullable r.c cVar) {
        this.f11346k = cVar;
        return this;
    }

    public b T(int i4) {
        this.f11341f = this.f11336a.getDrawable(i4);
        return this;
    }

    public b U(int i4, @Nullable r.c cVar) {
        this.f11341f = this.f11336a.getDrawable(i4);
        this.f11342g = cVar;
        return this;
    }

    public b V(@Nullable Drawable drawable) {
        this.f11341f = drawable;
        return this;
    }

    public b W(Drawable drawable, @Nullable r.c cVar) {
        this.f11341f = drawable;
        this.f11342g = cVar;
        return this;
    }

    public b X(@Nullable r.c cVar) {
        this.f11342g = cVar;
        return this;
    }

    public b Y(@Nullable RoundingParams roundingParams) {
        this.f11354s = roundingParams;
        return this;
    }

    public a a() {
        Z();
        return new a(this);
    }

    @Nullable
    public ColorFilter b() {
        return this.f11350o;
    }

    @Nullable
    public PointF c() {
        return this.f11349n;
    }

    @Nullable
    public r.c d() {
        return this.f11347l;
    }

    @Nullable
    public Drawable e() {
        return this.f11351p;
    }

    public float f() {
        return this.f11338c;
    }

    public int g() {
        return this.f11337b;
    }

    public Resources getResources() {
        return this.f11336a;
    }

    @Nullable
    public Drawable h() {
        return this.f11343h;
    }

    @Nullable
    public r.c i() {
        return this.f11344i;
    }

    @Nullable
    public List<Drawable> j() {
        return this.f11352q;
    }

    @Nullable
    public Drawable k() {
        return this.f11339d;
    }

    @Nullable
    public r.c l() {
        return this.f11340e;
    }

    @Nullable
    public Drawable m() {
        return this.f11353r;
    }

    @Nullable
    public Drawable n() {
        return this.f11345j;
    }

    @Nullable
    public r.c o() {
        return this.f11346k;
    }

    @Nullable
    public Drawable p() {
        return this.f11341f;
    }

    @Nullable
    public r.c q() {
        return this.f11342g;
    }

    @Nullable
    public RoundingParams r() {
        return this.f11354s;
    }

    public b u() {
        s();
        return this;
    }

    public b v(@Nullable ColorFilter colorFilter) {
        this.f11350o = colorFilter;
        return this;
    }

    public b w(@Nullable PointF pointF) {
        this.f11349n = pointF;
        return this;
    }

    public b x(@Nullable r.c cVar) {
        this.f11347l = cVar;
        this.f11348m = null;
        return this;
    }

    public b y(@Nullable Drawable drawable) {
        this.f11351p = drawable;
        return this;
    }

    public b z(float f5) {
        this.f11338c = f5;
        return this;
    }
}
