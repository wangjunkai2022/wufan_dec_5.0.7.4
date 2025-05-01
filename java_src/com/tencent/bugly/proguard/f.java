package com.tencent.bugly.proguard;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class f extends k {

    /* renamed from: e  reason: collision with root package name */
    public byte[] f62629e;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f62633i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, String> f62634j;

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ boolean f62624m = true;

    /* renamed from: k  reason: collision with root package name */
    private static byte[] f62622k = null;

    /* renamed from: l  reason: collision with root package name */
    private static Map<String, String> f62623l = null;

    /* renamed from: a  reason: collision with root package name */
    public short f62625a = 0;

    /* renamed from: f  reason: collision with root package name */
    private byte f62630f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f62631g = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f62626b = 0;

    /* renamed from: c  reason: collision with root package name */
    public String f62627c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f62628d = null;

    /* renamed from: h  reason: collision with root package name */
    private int f62632h = 0;

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62625a, 1);
        jVar.a(this.f62630f, 2);
        jVar.a(this.f62631g, 3);
        jVar.a(this.f62626b, 4);
        jVar.a(this.f62627c, 5);
        jVar.a(this.f62628d, 6);
        jVar.a(this.f62629e, 7);
        jVar.a(this.f62632h, 8);
        jVar.a((Map) this.f62633i, 9);
        jVar.a((Map) this.f62634j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f62624m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        f fVar = (f) obj;
        return l.a(1, (int) fVar.f62625a) && l.a(1, (int) fVar.f62630f) && l.a(1, fVar.f62631g) && l.a(1, fVar.f62626b) && l.a((Object) 1, (Object) fVar.f62627c) && l.a((Object) 1, (Object) fVar.f62628d) && l.a((Object) 1, (Object) fVar.f62629e) && l.a(1, fVar.f62632h) && l.a((Object) 1, (Object) fVar.f62633i) && l.a((Object) 1, (Object) fVar.f62634j);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        try {
            this.f62625a = iVar.a(this.f62625a, 1, true);
            this.f62630f = iVar.a(this.f62630f, 2, true);
            this.f62631g = iVar.a(this.f62631g, 3, true);
            this.f62626b = iVar.a(this.f62626b, 4, true);
            this.f62627c = iVar.b(5, true);
            this.f62628d = iVar.b(6, true);
            if (f62622k == null) {
                f62622k = new byte[]{0};
            }
            this.f62629e = iVar.c(7, true);
            this.f62632h = iVar.a(this.f62632h, 8, true);
            if (f62623l == null) {
                HashMap hashMap = new HashMap();
                f62623l = hashMap;
                hashMap.put("", "");
            }
            this.f62633i = (Map) iVar.a((i) f62623l, 9, true);
            if (f62623l == null) {
                HashMap hashMap2 = new HashMap();
                f62623l = hashMap2;
                hashMap2.put("", "");
            }
            this.f62634j = (Map) iVar.a((i) f62623l, 10, true);
        } catch (Exception e5) {
            e5.printStackTrace();
            PrintStream printStream = System.out;
            printStream.println("RequestPacket decode error " + e.a(this.f62629e));
            throw new RuntimeException(e5);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
        h hVar = new h(sb, i4);
        hVar.a(this.f62625a, "iVersion");
        hVar.a(this.f62630f, "cPacketType");
        hVar.a(this.f62631g, "iMessageType");
        hVar.a(this.f62626b, "iRequestId");
        hVar.a(this.f62627c, "sServantName");
        hVar.a(this.f62628d, "sFuncName");
        hVar.a(this.f62629e, "sBuffer");
        hVar.a(this.f62632h, "iTimeout");
        hVar.a((Map) this.f62633i, "context");
        hVar.a((Map) this.f62634j, "status");
    }
}
