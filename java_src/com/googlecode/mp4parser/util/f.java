package com.googlecode.mp4parser.util;

import java.util.Objects;
/* compiled from: IntHashMap.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private transient a[] f14218a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f14219b;

    /* renamed from: c  reason: collision with root package name */
    private int f14220c;

    /* renamed from: d  reason: collision with root package name */
    private float f14221d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IntHashMap.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f14222a;

        /* renamed from: b  reason: collision with root package name */
        int f14223b;

        /* renamed from: c  reason: collision with root package name */
        Object f14224c;

        /* renamed from: d  reason: collision with root package name */
        a f14225d;

        protected a(int i4, int i5, Object obj, a aVar) {
            this.f14222a = i4;
            this.f14223b = i5;
            this.f14224c = obj;
            this.f14225d = aVar;
        }
    }

    public f() {
        this(20, 0.75f);
    }

    public synchronized void a() {
        a[] aVarArr = this.f14218a;
        int length = aVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                this.f14219b = 0;
            } else {
                aVarArr[length] = null;
            }
        }
    }

    public boolean b(Object obj) {
        Objects.requireNonNull(obj);
        a[] aVarArr = this.f14218a;
        int length = aVarArr.length;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return false;
            }
            for (a aVar = aVarArr[i4]; aVar != null; aVar = aVar.f14225d) {
                if (aVar.f14224c.equals(obj)) {
                    return true;
                }
            }
            length = i4;
        }
    }

    public boolean c(int i4) {
        a[] aVarArr = this.f14218a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i4) % aVarArr.length]; aVar != null; aVar = aVar.f14225d) {
            if (aVar.f14222a == i4) {
                return true;
            }
        }
        return false;
    }

    public boolean d(Object obj) {
        return b(obj);
    }

    public Object e(int i4) {
        a[] aVarArr = this.f14218a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i4) % aVarArr.length]; aVar != null; aVar = aVar.f14225d) {
            if (aVar.f14222a == i4) {
                return aVar.f14224c;
            }
        }
        return null;
    }

    public boolean f() {
        return this.f14219b == 0;
    }

    public Object g(int i4, Object obj) {
        a[] aVarArr = this.f14218a;
        int i5 = Integer.MAX_VALUE & i4;
        int length = i5 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.f14225d) {
            if (aVar.f14222a == i4) {
                Object obj2 = aVar.f14224c;
                aVar.f14224c = obj;
                return obj2;
            }
        }
        if (this.f14219b >= this.f14220c) {
            h();
            aVarArr = this.f14218a;
            length = i5 % aVarArr.length;
        }
        aVarArr[length] = new a(i4, i4, obj, aVarArr[length]);
        this.f14219b++;
        return null;
    }

    protected void h() {
        a[] aVarArr = this.f14218a;
        int length = aVarArr.length;
        int i4 = (length * 2) + 1;
        a[] aVarArr2 = new a[i4];
        this.f14220c = (int) (i4 * this.f14221d);
        this.f14218a = aVarArr2;
        while (true) {
            int i5 = length - 1;
            if (length <= 0) {
                return;
            }
            a aVar = aVarArr[i5];
            while (aVar != null) {
                a aVar2 = aVar.f14225d;
                int i6 = (aVar.f14222a & Integer.MAX_VALUE) % i4;
                aVar.f14225d = aVarArr2[i6];
                aVarArr2[i6] = aVar;
                aVar = aVar2;
            }
            length = i5;
        }
    }

    public Object i(int i4) {
        a[] aVarArr = this.f14218a;
        int length = (Integer.MAX_VALUE & i4) % aVarArr.length;
        a aVar = null;
        for (a aVar2 = aVarArr[length]; aVar2 != null; aVar2 = aVar2.f14225d) {
            if (aVar2.f14222a == i4) {
                if (aVar != null) {
                    aVar.f14225d = aVar2.f14225d;
                } else {
                    aVarArr[length] = aVar2.f14225d;
                }
                this.f14219b--;
                Object obj = aVar2.f14224c;
                aVar2.f14224c = null;
                return obj;
            }
            aVar = aVar2;
        }
        return null;
    }

    public int j() {
        return this.f14219b;
    }

    public f(int i4) {
        this(i4, 0.75f);
    }

    public f(int i4, float f5) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i4);
        } else if (f5 > 0.0f) {
            i4 = i4 == 0 ? 1 : i4;
            this.f14221d = f5;
            this.f14218a = new a[i4];
            this.f14220c = (int) (i4 * f5);
        } else {
            throw new IllegalArgumentException("Illegal Load: " + f5);
        }
    }
}
