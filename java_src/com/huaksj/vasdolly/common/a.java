package com.huaksj.vasdolly.common;

import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import java.nio.ByteBuffer;
/* compiled from: ApkSectionInfo.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    static int f14461g = 536870912;

    /* renamed from: a  reason: collision with root package name */
    private boolean f14462a = true;

    /* renamed from: b  reason: collision with root package name */
    public long f14463b;

    /* renamed from: c  reason: collision with root package name */
    public c<ByteBuffer, Long> f14464c;

    /* renamed from: d  reason: collision with root package name */
    public c<ByteBuffer, Long> f14465d;

    /* renamed from: e  reason: collision with root package name */
    public c<ByteBuffer, Long> f14466e;

    /* renamed from: f  reason: collision with root package name */
    public c<ByteBuffer, Long> f14467f;

    public void a() throws SignatureNotFoundException {
        long f5 = com.huaksj.vasdolly.common.apk.a.f(this.f14467f.b(), this.f14467f.c().longValue());
        if (f5 == this.f14466e.c().longValue()) {
            return;
        }
        throw new RuntimeException("CentralDirOffset mismatch , EocdCentralDirOffset : " + f5 + ", centralDirOffset : " + this.f14466e.c());
    }

    public void b() throws SignatureNotFoundException {
        boolean z4 = this.f14462a;
        if ((z4 || this.f14464c != null) && this.f14465d != null && this.f14466e != null && this.f14467f != null) {
            if ((z4 || (this.f14464c.c().longValue() == 0 && ((long) this.f14464c.b().remaining()) == this.f14465d.c().longValue())) && ((long) this.f14465d.b().remaining()) + this.f14465d.c().longValue() == this.f14466e.c().longValue() && ((long) this.f14466e.b().remaining()) + this.f14466e.c().longValue() == this.f14467f.c().longValue() && ((long) this.f14467f.b().remaining()) + this.f14467f.c().longValue() == this.f14463b) {
                a();
                return;
            }
            throw new RuntimeException("ApkSectionInfo paramters is not valid : " + toString());
        }
        throw new RuntimeException("ApkSectionInfo paramters is not valid : " + toString());
    }

    public boolean c() {
        return this.f14462a;
    }

    public void d() {
        c<ByteBuffer, Long> cVar = this.f14464c;
        if (cVar != null) {
            cVar.b().rewind();
        }
        c<ByteBuffer, Long> cVar2 = this.f14465d;
        if (cVar2 != null) {
            cVar2.b().rewind();
        }
        c<ByteBuffer, Long> cVar3 = this.f14466e;
        if (cVar3 != null) {
            cVar3.b().rewind();
        }
        c<ByteBuffer, Long> cVar4 = this.f14467f;
        if (cVar4 != null) {
            cVar4.b().rewind();
        }
    }

    public void e(boolean z4) {
    }

    public String toString() {
        return "lowMemory : " + this.f14462a + "\n apkSize : " + this.f14463b + "\n contentEntry : " + this.f14464c + "\n schemeV2Block : " + this.f14465d + "\n centralDir : " + this.f14466e + "\n eocd : " + this.f14467f;
    }
}
