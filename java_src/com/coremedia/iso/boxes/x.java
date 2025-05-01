package com.coremedia.iso.boxes;

import com.android.dex.DexFormat;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.c;
/* compiled from: HandlerBox.java */
/* loaded from: classes2.dex */
public class x extends com.googlecode.mp4parser.c {
    public static final Map<String, String> A;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;

    /* renamed from: z  reason: collision with root package name */
    public static final String f10003z = "hdlr";

    /* renamed from: s  reason: collision with root package name */
    private String f10004s;

    /* renamed from: t  reason: collision with root package name */
    private String f10005t;

    /* renamed from: u  reason: collision with root package name */
    private long f10006u;

    /* renamed from: v  reason: collision with root package name */
    private long f10007v;

    /* renamed from: w  reason: collision with root package name */
    private long f10008w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10009x;

    /* renamed from: y  reason: collision with root package name */
    private long f10010y;

    static {
        s();
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        A = Collections.unmodifiableMap(hashMap);
    }

    public x() {
        super(f10003z);
        this.f10005t = null;
        this.f10009x = true;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("HandlerBox.java", x.class);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f10010y = com.coremedia.iso.g.l(byteBuffer);
        this.f10004s = com.coremedia.iso.g.b(byteBuffer);
        this.f10006u = com.coremedia.iso.g.l(byteBuffer);
        this.f10007v = com.coremedia.iso.g.l(byteBuffer);
        this.f10008w = com.coremedia.iso.g.l(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            String h4 = com.coremedia.iso.g.h(byteBuffer, byteBuffer.remaining());
            this.f10005t = h4;
            if (h4.endsWith(DexFormat.MAGIC_SUFFIX)) {
                String str = this.f10005t;
                this.f10005t = str.substring(0, str.length() - 1);
                this.f10009x = true;
                return;
            }
            this.f10009x = false;
            return;
        }
        this.f10009x = false;
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f10010y);
        byteBuffer.put(com.coremedia.iso.f.C(this.f10004s));
        com.coremedia.iso.i.i(byteBuffer, this.f10006u);
        com.coremedia.iso.i.i(byteBuffer, this.f10007v);
        com.coremedia.iso.i.i(byteBuffer, this.f10008w);
        String str = this.f10005t;
        if (str != null) {
            byteBuffer.put(com.coremedia.iso.l.b(str));
        }
        if (this.f10009x) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        int c5;
        if (this.f10009x) {
            c5 = com.coremedia.iso.l.c(this.f10005t) + 25;
        } else {
            c5 = com.coremedia.iso.l.c(this.f10005t) + 24;
        }
        return c5;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return "HandlerBox[handlerType=" + v() + ";name=" + x() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f10004s;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        Map<String, String> map = A;
        return map.get(this.f10004s) != null ? map.get(this.f10004s) : "Unknown Handler Type";
    }

    public String x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f10005t;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, str));
        this.f10004s = str;
    }

    public void z(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, str));
        this.f10005t = str;
    }
}
