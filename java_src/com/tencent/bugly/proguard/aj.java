package com.tencent.bugly.proguard;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class aj extends k implements Cloneable {

    /* renamed from: d  reason: collision with root package name */
    private static byte[] f62514d;

    /* renamed from: a  reason: collision with root package name */
    private byte f62515a;

    /* renamed from: b  reason: collision with root package name */
    private String f62516b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f62517c;

    public aj() {
        this.f62515a = (byte) 0;
        this.f62516b = "";
        this.f62517c = null;
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62515a, 0);
        jVar.a(this.f62516b, 1);
        byte[] bArr = this.f62517c;
        if (bArr != null) {
            jVar.a(bArr, 2);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
    }

    public aj(byte b5, String str, byte[] bArr) {
        this.f62515a = (byte) 0;
        this.f62516b = "";
        this.f62517c = null;
        this.f62515a = b5;
        this.f62516b = str;
        this.f62517c = bArr;
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62515a = iVar.a(this.f62515a, 0, true);
        this.f62516b = iVar.b(1, true);
        if (f62514d == null) {
            f62514d = r0;
            byte[] bArr = {0};
        }
        this.f62517c = iVar.c(2, false);
    }
}
