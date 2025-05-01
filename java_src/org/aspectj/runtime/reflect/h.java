package org.aspectj.runtime.reflect;

import org.aspectj.lang.c;
import org.aspectj.lang.reflect.z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JoinPointImpl.java */
/* loaded from: classes7.dex */
public class h implements org.aspectj.lang.d {

    /* renamed from: n  reason: collision with root package name */
    Object f72257n;

    /* renamed from: o  reason: collision with root package name */
    Object f72258o;

    /* renamed from: p  reason: collision with root package name */
    Object[] f72259p;

    /* renamed from: q  reason: collision with root package name */
    c.b f72260q;

    /* renamed from: r  reason: collision with root package name */
    private org.aspectj.runtime.internal.a f72261r;

    /* compiled from: JoinPointImpl.java */
    /* loaded from: classes7.dex */
    static class a extends b implements c.a {
        public a(int i4, String str, org.aspectj.lang.e eVar, z zVar) {
            super(i4, str, eVar, zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JoinPointImpl.java */
    /* loaded from: classes7.dex */
    public static class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        String f72262a;

        /* renamed from: b  reason: collision with root package name */
        org.aspectj.lang.e f72263b;

        /* renamed from: c  reason: collision with root package name */
        z f72264c;

        /* renamed from: d  reason: collision with root package name */
        private int f72265d;

        public b(int i4, String str, org.aspectj.lang.e eVar, z zVar) {
            this.f72262a = str;
            this.f72263b = eVar;
            this.f72264c = zVar;
            this.f72265d = i4;
        }

        String a(n nVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(nVar.d(getKind()));
            stringBuffer.append("(");
            stringBuffer.append(((l) h()).E(nVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // org.aspectj.lang.c.b
        public final String b() {
            return a(n.f72285j);
        }

        @Override // org.aspectj.lang.c.b
        public final String f() {
            return a(n.f72287l);
        }

        @Override // org.aspectj.lang.c.b
        public z g() {
            return this.f72264c;
        }

        @Override // org.aspectj.lang.c.b
        public int getId() {
            return this.f72265d;
        }

        @Override // org.aspectj.lang.c.b
        public String getKind() {
            return this.f72262a;
        }

        @Override // org.aspectj.lang.c.b
        public org.aspectj.lang.e h() {
            return this.f72263b;
        }

        @Override // org.aspectj.lang.c.b
        public final String toString() {
            return a(n.f72286k);
        }
    }

    public h(c.b bVar, Object obj, Object obj2, Object[] objArr) {
        this.f72260q = bVar;
        this.f72257n = obj;
        this.f72258o = obj2;
        this.f72259p = objArr;
    }

    @Override // org.aspectj.lang.c
    public Object[] J() {
        if (this.f72259p == null) {
            this.f72259p = new Object[0];
        }
        Object[] objArr = this.f72259p;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // org.aspectj.lang.c
    public c.b a() {
        return this.f72260q;
    }

    @Override // org.aspectj.lang.c
    public final String b() {
        return this.f72260q.b();
    }

    @Override // org.aspectj.lang.c
    public Object c() {
        return this.f72258o;
    }

    @Override // org.aspectj.lang.d
    public Object d() throws Throwable {
        org.aspectj.runtime.internal.a aVar = this.f72261r;
        if (aVar == null) {
            return null;
        }
        return aVar.f(aVar.c());
    }

    @Override // org.aspectj.lang.d
    public Object e(Object[] objArr) throws Throwable {
        org.aspectj.runtime.internal.a aVar = this.f72261r;
        if (aVar == null) {
            return null;
        }
        int a5 = aVar.a();
        int i4 = 1;
        boolean z4 = (65536 & a5) != 0;
        int i5 = (a5 & 4096) != 0 ? 1 : 0;
        int i6 = (a5 & 256) != 0 ? 1 : 0;
        boolean z5 = (a5 & 16) != 0;
        boolean z6 = (a5 & 1) != 0;
        Object[] c5 = this.f72261r.c();
        int i7 = i5 + 0 + ((!z5 || z4) ? 0 : 1);
        if (i5 == 0 || i6 == 0) {
            i4 = 0;
        } else {
            c5[0] = objArr[0];
        }
        if (z5 && z6) {
            if (z4) {
                i4 = i6 + 1;
                c5[0] = objArr[i6];
            } else {
                i4 = i5 + 1;
                c5[i5] = objArr[i5];
            }
        }
        for (int i8 = i4; i8 < objArr.length; i8++) {
            c5[(i8 - i4) + i7] = objArr[i8];
        }
        return this.f72261r.f(c5);
    }

    @Override // org.aspectj.lang.c
    public final String f() {
        return this.f72260q.f();
    }

    @Override // org.aspectj.lang.c
    public z g() {
        return this.f72260q.g();
    }

    @Override // org.aspectj.lang.c
    public String getKind() {
        return this.f72260q.getKind();
    }

    @Override // org.aspectj.lang.c
    public org.aspectj.lang.e h() {
        return this.f72260q.h();
    }

    @Override // org.aspectj.lang.c
    public Object i() {
        return this.f72257n;
    }

    @Override // org.aspectj.lang.d
    public void j(org.aspectj.runtime.internal.a aVar) {
        this.f72261r = aVar;
    }

    @Override // org.aspectj.lang.c
    public final String toString() {
        return this.f72260q.toString();
    }
}
