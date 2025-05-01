package com.nineoldandroids.animation;

import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ObjectAnimator.java */
/* loaded from: classes5.dex */
public final class l extends q {
    private static final boolean R = false;
    private static final Map<String, com.nineoldandroids.util.c> S;
    private Object O;
    private String P;
    private com.nineoldandroids.util.c Q;

    static {
        HashMap hashMap = new HashMap();
        S = hashMap;
        hashMap.put("alpha", m.f57727a);
        hashMap.put("pivotX", m.f57728b);
        hashMap.put("pivotY", m.f57729c);
        hashMap.put("translationX", m.f57730d);
        hashMap.put("translationY", m.f57731e);
        hashMap.put(Key.ROTATION, m.f57732f);
        hashMap.put("rotationX", m.f57733g);
        hashMap.put("rotationY", m.f57734h);
        hashMap.put("scaleX", m.f57735i);
        hashMap.put("scaleY", m.f57736j);
        hashMap.put("scrollX", m.f57737k);
        hashMap.put("scrollY", m.f57738l);
        hashMap.put("x", m.f57739m);
        hashMap.put("y", m.f57740n);
    }

    public l() {
    }

    public static <T> l q0(T t4, com.nineoldandroids.util.c<T, Float> cVar, float... fArr) {
        l lVar = new l(t4, cVar);
        lVar.e0(fArr);
        return lVar;
    }

    public static l r0(Object obj, String str, float... fArr) {
        l lVar = new l(obj, str);
        lVar.e0(fArr);
        return lVar;
    }

    public static <T> l s0(T t4, com.nineoldandroids.util.c<T, Integer> cVar, int... iArr) {
        l lVar = new l(t4, cVar);
        lVar.g0(iArr);
        return lVar;
    }

    public static l t0(Object obj, String str, int... iArr) {
        l lVar = new l(obj, str);
        lVar.g0(iArr);
        return lVar;
    }

    public static <T, V> l u0(T t4, com.nineoldandroids.util.c<T, V> cVar, p<V> pVar, V... vArr) {
        l lVar = new l(t4, cVar);
        lVar.h0(vArr);
        lVar.d0(pVar);
        return lVar;
    }

    public static l v0(Object obj, String str, p pVar, Object... objArr) {
        l lVar = new l(obj, str);
        lVar.h0(objArr);
        lVar.d0(pVar);
        return lVar;
    }

    public static l w0(Object obj, n... nVarArr) {
        l lVar = new l();
        lVar.O = obj;
        lVar.k0(nVarArr);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.nineoldandroids.animation.q
    public void D(float f5) {
        super.D(f5);
        int length = this.f57786t.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f57786t[i4].p(this.O);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.nineoldandroids.animation.q
    public void T() {
        if (this.f57779m) {
            return;
        }
        if (this.Q == null && com.nineoldandroids.view.animation.a.f57796r && (this.O instanceof View)) {
            Map<String, com.nineoldandroids.util.c> map = S;
            if (map.containsKey(this.P)) {
                y0(map.get(this.P));
            }
        }
        int length = this.f57786t.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f57786t[i4].A(this.O);
        }
        super.T();
    }

    @Override // com.nineoldandroids.animation.q
    public void e0(float... fArr) {
        n[] nVarArr = this.f57786t;
        if (nVarArr != null && nVarArr.length != 0) {
            super.e0(fArr);
            return;
        }
        com.nineoldandroids.util.c cVar = this.Q;
        if (cVar != null) {
            k0(n.h(cVar, fArr));
        } else {
            k0(n.i(this.P, fArr));
        }
    }

    @Override // com.nineoldandroids.animation.q
    public void g0(int... iArr) {
        n[] nVarArr = this.f57786t;
        if (nVarArr != null && nVarArr.length != 0) {
            super.g0(iArr);
            return;
        }
        com.nineoldandroids.util.c cVar = this.Q;
        if (cVar != null) {
            k0(n.j(cVar, iArr));
        } else {
            k0(n.k(this.P, iArr));
        }
    }

    @Override // com.nineoldandroids.animation.q
    public void h0(Object... objArr) {
        n[] nVarArr = this.f57786t;
        if (nVarArr != null && nVarArr.length != 0) {
            super.h0(objArr);
            return;
        }
        com.nineoldandroids.util.c cVar = this.Q;
        if (cVar != null) {
            k0(n.n(cVar, null, objArr));
        } else {
            k0(n.o(this.P, null, objArr));
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void n(Object obj) {
        Object obj2 = this.O;
        if (obj2 != obj) {
            this.O = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.f57779m = false;
            }
        }
    }

    @Override // com.nineoldandroids.animation.q, com.nineoldandroids.animation.a
    /* renamed from: n0 */
    public l clone() {
        return (l) super.clone();
    }

    @Override // com.nineoldandroids.animation.a
    public void o() {
        T();
        int length = this.f57786t.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f57786t[i4].x(this.O);
        }
    }

    public String o0() {
        return this.P;
    }

    @Override // com.nineoldandroids.animation.a
    public void p() {
        T();
        int length = this.f57786t.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f57786t[i4].C(this.O);
        }
    }

    public Object p0() {
        return this.O;
    }

    @Override // com.nineoldandroids.animation.q, com.nineoldandroids.animation.a
    public void q() {
        super.q();
    }

    @Override // com.nineoldandroids.animation.q
    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.O;
        if (this.f57786t != null) {
            for (int i4 = 0; i4 < this.f57786t.length; i4++) {
                str = str + "\n    " + this.f57786t[i4].toString();
            }
        }
        return str;
    }

    @Override // com.nineoldandroids.animation.q, com.nineoldandroids.animation.a
    /* renamed from: x0 */
    public l k(long j4) {
        super.k(j4);
        return this;
    }

    public void y0(com.nineoldandroids.util.c cVar) {
        n[] nVarArr = this.f57786t;
        if (nVarArr != null) {
            n nVar = nVarArr[0];
            String f5 = nVar.f();
            nVar.v(cVar);
            this.f57787u.remove(f5);
            this.f57787u.put(this.P, nVar);
        }
        if (this.Q != null) {
            this.P = cVar.b();
        }
        this.Q = cVar;
        this.f57779m = false;
    }

    public void z0(String str) {
        n[] nVarArr = this.f57786t;
        if (nVarArr != null) {
            n nVar = nVarArr[0];
            String f5 = nVar.f();
            nVar.w(str);
            this.f57787u.remove(f5);
            this.f57787u.put(str, nVar);
        }
        this.P = str;
        this.f57779m = false;
    }

    private l(Object obj, String str) {
        this.O = obj;
        z0(str);
    }

    private <T> l(T t4, com.nineoldandroids.util.c<T, ?> cVar) {
        this.O = t4;
        y0(cVar);
    }
}
