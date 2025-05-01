package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: Animator.java */
/* loaded from: classes5.dex */
public abstract class a implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    ArrayList<InterfaceC0575a> f57659b = null;

    /* compiled from: Animator.java */
    /* renamed from: com.nineoldandroids.animation.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0575a {
        void a(a aVar);

        void b(a aVar);

        void c(a aVar);

        void d(a aVar);
    }

    public void a(InterfaceC0575a interfaceC0575a) {
        if (this.f57659b == null) {
            this.f57659b = new ArrayList<>();
        }
        this.f57659b.add(interfaceC0575a);
    }

    @Override // 
    /* renamed from: b */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            ArrayList<InterfaceC0575a> arrayList = this.f57659b;
            if (arrayList != null) {
                aVar.f57659b = new ArrayList<>();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    aVar.f57659b.add(arrayList.get(i4));
                }
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public void c() {
    }

    public void cancel() {
    }

    public abstract long d();

    public ArrayList<InterfaceC0575a> e() {
        return this.f57659b;
    }

    public abstract long f();

    public abstract boolean g();

    public boolean h() {
        return g();
    }

    public void i() {
        ArrayList<InterfaceC0575a> arrayList = this.f57659b;
        if (arrayList != null) {
            arrayList.clear();
            this.f57659b = null;
        }
    }

    public void j(InterfaceC0575a interfaceC0575a) {
        ArrayList<InterfaceC0575a> arrayList = this.f57659b;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC0575a);
        if (this.f57659b.size() == 0) {
            this.f57659b = null;
        }
    }

    public abstract a k(long j4);

    public abstract void l(Interpolator interpolator);

    public abstract void m(long j4);

    public void n(Object obj) {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }
}
