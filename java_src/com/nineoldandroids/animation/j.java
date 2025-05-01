package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
/* compiled from: Keyframe.java */
/* loaded from: classes5.dex */
public abstract class j implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    float f57714b;

    /* renamed from: c  reason: collision with root package name */
    Class f57715c;

    /* renamed from: d  reason: collision with root package name */
    private Interpolator f57716d = null;

    /* renamed from: e  reason: collision with root package name */
    boolean f57717e = false;

    /* compiled from: Keyframe.java */
    /* loaded from: classes5.dex */
    static class c extends j {

        /* renamed from: f  reason: collision with root package name */
        Object f57720f;

        c(float f5, Object obj) {
            this.f57714b = f5;
            this.f57720f = obj;
            boolean z4 = obj != null;
            this.f57717e = z4;
            this.f57715c = z4 ? obj.getClass() : Object.class;
        }

        @Override // com.nineoldandroids.animation.j
        public Object d() {
            return this.f57720f;
        }

        @Override // com.nineoldandroids.animation.j
        public void n(Object obj) {
            this.f57720f = obj;
            this.f57717e = obj != null;
        }

        @Override // com.nineoldandroids.animation.j
        /* renamed from: o */
        public c clone() {
            c cVar = new c(b(), this.f57720f);
            cVar.m(c());
            return cVar;
        }
    }

    public static j f(float f5) {
        return new a(f5);
    }

    public static j g(float f5, float f6) {
        return new a(f5, f6);
    }

    public static j h(float f5) {
        return new b(f5);
    }

    public static j i(float f5, int i4) {
        return new b(f5, i4);
    }

    public static j j(float f5) {
        return new c(f5, null);
    }

    public static j k(float f5, Object obj) {
        return new c(f5, obj);
    }

    @Override // 
    /* renamed from: a */
    public abstract j clone();

    public float b() {
        return this.f57714b;
    }

    public Interpolator c() {
        return this.f57716d;
    }

    public abstract Object d();

    public boolean e() {
        return this.f57717e;
    }

    public Class getType() {
        return this.f57715c;
    }

    public void l(float f5) {
        this.f57714b = f5;
    }

    public void m(Interpolator interpolator) {
        this.f57716d = interpolator;
    }

    public abstract void n(Object obj);

    /* compiled from: Keyframe.java */
    /* loaded from: classes5.dex */
    static class a extends j {

        /* renamed from: f  reason: collision with root package name */
        float f57718f;

        a(float f5, float f6) {
            this.f57714b = f5;
            this.f57718f = f6;
            this.f57715c = Float.TYPE;
            this.f57717e = true;
        }

        @Override // com.nineoldandroids.animation.j
        public Object d() {
            return Float.valueOf(this.f57718f);
        }

        @Override // com.nineoldandroids.animation.j
        public void n(Object obj) {
            if (obj == null || obj.getClass() != Float.class) {
                return;
            }
            this.f57718f = ((Float) obj).floatValue();
            this.f57717e = true;
        }

        @Override // com.nineoldandroids.animation.j
        /* renamed from: o */
        public a clone() {
            a aVar = new a(b(), this.f57718f);
            aVar.m(c());
            return aVar;
        }

        public float p() {
            return this.f57718f;
        }

        a(float f5) {
            this.f57714b = f5;
            this.f57715c = Float.TYPE;
        }
    }

    /* compiled from: Keyframe.java */
    /* loaded from: classes5.dex */
    static class b extends j {

        /* renamed from: f  reason: collision with root package name */
        int f57719f;

        b(float f5, int i4) {
            this.f57714b = f5;
            this.f57719f = i4;
            this.f57715c = Integer.TYPE;
            this.f57717e = true;
        }

        @Override // com.nineoldandroids.animation.j
        public Object d() {
            return Integer.valueOf(this.f57719f);
        }

        @Override // com.nineoldandroids.animation.j
        public void n(Object obj) {
            if (obj == null || obj.getClass() != Integer.class) {
                return;
            }
            this.f57719f = ((Integer) obj).intValue();
            this.f57717e = true;
        }

        @Override // com.nineoldandroids.animation.j
        /* renamed from: o */
        public b clone() {
            b bVar = new b(b(), this.f57719f);
            bVar.m(c());
            return bVar;
        }

        public int p() {
            return this.f57719f;
        }

        b(float f5) {
            this.f57714b = f5;
            this.f57715c = Integer.TYPE;
        }
    }
}
