package com.aggmoread.sdk.z.c.a.a.e.q;

import android.content.ContextWrapper;
import android.text.TextUtils;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.aggmoread.sdk.z.c.a.a.e.m;
/* loaded from: classes2.dex */
public abstract class c implements f {

    /* renamed from: c  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.d.b.e f3534c;

    /* renamed from: d  reason: collision with root package name */
    protected String f3535d;

    @Override // com.aggmoread.sdk.z.c.a.a.e.q.f
    public boolean a() {
        return b();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.e.q.f
    public boolean a(ContextWrapper contextWrapper, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Object... objArr) {
        if (eVar != null && contextWrapper != null) {
            String b5 = b(eVar);
            if (TextUtils.isEmpty(b5)) {
                return false;
            }
            String c5 = c();
            if (TextUtils.isEmpty(c5)) {
                return false;
            }
            try {
                a.a(contextWrapper, b5, c5, eVar);
                this.f3534c = eVar;
                this.f3535d = b5;
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.e.q.f
    public boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        if (eVar == null) {
            return false;
        }
        return m.a(j.f3429q, eVar);
    }

    protected String b(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        com.aggmoread.sdk.z.c.a.a.e.f fVar;
        if (eVar == null || (fVar = eVar.f3309c) == null) {
            return null;
        }
        return fVar.c(e.c.f3323b0);
    }

    public boolean b() {
        return (this.f3534c == null || TextUtils.isEmpty(this.f3535d)) ? false : true;
    }

    protected abstract String c();
}
