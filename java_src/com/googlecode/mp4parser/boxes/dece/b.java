package com.googlecode.mp4parser.boxes.dece;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: BaseLocationBox.java */
/* loaded from: classes3.dex */
public class b extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: u  reason: collision with root package name */
    public static final String f13800u = "bloc";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13801v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13802w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13803x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13804y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13805z = null;

    /* renamed from: s  reason: collision with root package name */
    String f13806s;

    /* renamed from: t  reason: collision with root package name */
    String f13807t;

    static {
        s();
    }

    public b() {
        super(f13800u);
        this.f13806s = "";
        this.f13807t = "";
    }

    private static /* synthetic */ void s() {
        e eVar = new e("BaseLocationBox.java", b.class);
        f13801v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        f13802w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 48);
        f13803x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        f13804y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        f13805z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "equals", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", "boolean"), 86);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", TTDownloadField.TT_HASHCODE, "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", MethodReflectParams.INT), 100);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        String g4 = g.g(byteBuffer);
        this.f13806s = g4;
        byteBuffer.get(new byte[(256 - l.c(g4)) - 1]);
        String g5 = g.g(byteBuffer);
        this.f13807t = g5;
        byteBuffer.get(new byte[(256 - l.c(g5)) - 1]);
        byteBuffer.get(new byte[512]);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(l.b(this.f13806s));
        byteBuffer.put(new byte[256 - l.c(this.f13806s)]);
        byteBuffer.put(l.b(this.f13807t));
        byteBuffer.put(new byte[256 - l.c(this.f13807t)]);
        byteBuffer.put(new byte[512]);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 1028L;
    }

    public boolean equals(Object obj) {
        j.b().c(e.w(f13805z, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f13806s;
        if (str == null ? bVar.f13806s == null : str.equals(bVar.f13806s)) {
            String str2 = this.f13807t;
            String str3 = bVar.f13807t;
            return str2 == null ? str3 == null : str2.equals(str3);
        }
        return false;
    }

    public int hashCode() {
        j.b().c(e.v(A, this, this));
        String str = this.f13806s;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13807t;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        j.b().c(e.v(B, this, this));
        return "BaseLocationBox{baseLocation='" + this.f13806s + "', purchaseLocation='" + this.f13807t + "'}";
    }

    public String v() {
        j.b().c(e.v(f13801v, this, this));
        return this.f13806s;
    }

    public String w() {
        j.b().c(e.v(f13803x, this, this));
        return this.f13807t;
    }

    public void x(String str) {
        j.b().c(e.w(f13802w, this, this, str));
        this.f13806s = str;
    }

    public void y(String str) {
        j.b().c(e.w(f13804y, this, this, str));
        this.f13807t = str;
    }

    public b(String str, String str2) {
        super(f13800u);
        this.f13806s = "";
        this.f13807t = "";
        this.f13806s = str;
        this.f13807t = str2;
    }
}
