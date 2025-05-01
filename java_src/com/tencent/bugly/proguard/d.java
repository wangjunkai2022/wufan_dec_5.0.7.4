package com.tencent.bugly.proguard;

import com.join.mgps.Util.h0;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class d extends c {

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, byte[]> f62618f;

    /* renamed from: g  reason: collision with root package name */
    private static HashMap<String, HashMap<String, byte[]>> f62619g;

    /* renamed from: e  reason: collision with root package name */
    private f f62620e;

    public d() {
        f fVar = new f();
        this.f62620e = fVar;
        fVar.f62625a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.c, com.tencent.bugly.proguard.a
    public final <T> void a(String str, T t4) {
        if (!str.startsWith(h0.f27805a)) {
            super.a(str, (String) t4);
            return;
        }
        throw new IllegalArgumentException("put name can not startwith . , now is " + str);
    }

    public final void b(String str) {
        this.f62620e.f62627c = str;
    }

    @Override // com.tencent.bugly.proguard.c
    public final void c() {
        super.c();
        this.f62620e.f62625a = (short) 3;
    }

    public final void c(String str) {
        this.f62620e.f62628d = str;
    }

    @Override // com.tencent.bugly.proguard.c, com.tencent.bugly.proguard.a
    public final byte[] a() {
        f fVar = this.f62620e;
        if (fVar.f62625a == 2) {
            if (!fVar.f62627c.equals("")) {
                if (this.f62620e.f62628d.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (fVar.f62627c == null) {
                fVar.f62627c = "";
            }
            if (fVar.f62628d == null) {
                fVar.f62628d = "";
            }
        }
        j jVar = new j(0);
        jVar.a(this.f62492b);
        if (this.f62620e.f62625a == 2) {
            jVar.a((Map) this.f62491a, 0);
        } else {
            jVar.a((Map) ((c) this).f62615d, 0);
        }
        this.f62620e.f62629e = l.a(jVar.a());
        j jVar2 = new j(0);
        jVar2.a(this.f62492b);
        this.f62620e.a(jVar2);
        byte[] a5 = l.a(jVar2.a());
        int length = a5.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a5).flip();
        return allocate.array();
    }

    @Override // com.tencent.bugly.proguard.c, com.tencent.bugly.proguard.a
    public final void a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                i iVar = new i(bArr, 4);
                iVar.a(this.f62492b);
                this.f62620e.a(iVar);
                f fVar = this.f62620e;
                if (fVar.f62625a == 3) {
                    i iVar2 = new i(fVar.f62629e);
                    iVar2.a(this.f62492b);
                    if (f62618f == null) {
                        HashMap<String, byte[]> hashMap = new HashMap<>();
                        f62618f = hashMap;
                        hashMap.put("", new byte[0]);
                    }
                    ((c) this).f62615d = iVar2.a((Map) f62618f, 0, false);
                    return;
                }
                i iVar3 = new i(fVar.f62629e);
                iVar3.a(this.f62492b);
                if (f62619g == null) {
                    f62619g = new HashMap<>();
                    HashMap<String, byte[]> hashMap2 = new HashMap<>();
                    hashMap2.put("", new byte[0]);
                    f62619g.put("", hashMap2);
                }
                this.f62491a = iVar3.a((Map) f62619g, 0, false);
                new HashMap();
                return;
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }

    public final void a(int i4) {
        this.f62620e.f62626b = 1;
    }
}
