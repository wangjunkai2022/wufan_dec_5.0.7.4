package com.aggmoread.sdk.z.c.a.a.e.q;

import android.content.ContextWrapper;
/* loaded from: classes2.dex */
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3538a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final f f3539b = new b();

    /* loaded from: classes2.dex */
    static class a implements c {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.q.f.c
        public f a(int i4) {
            if (i4 != -1 && 1 == i4) {
                return new com.aggmoread.sdk.z.c.a.a.e.q.b();
            }
            return f.f3539b;
        }
    }

    /* loaded from: classes2.dex */
    static class b implements f {
        b() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.q.f
        public boolean a() {
            return false;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.q.f
        public boolean a(ContextWrapper contextWrapper, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Object... objArr) {
            return false;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.q.f
        public boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        f a(int i4);
    }

    boolean a();

    boolean a(ContextWrapper contextWrapper, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Object... objArr);

    boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar);
}
