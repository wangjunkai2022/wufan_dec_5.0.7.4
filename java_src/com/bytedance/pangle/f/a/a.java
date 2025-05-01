package com.bytedance.pangle.f.a;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    int f8365a;

    /* renamed from: b  reason: collision with root package name */
    b f8366b;

    /* renamed from: c  reason: collision with root package name */
    int[] f8367c;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8373i;

    /* renamed from: k  reason: collision with root package name */
    private f f8375k;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8374j = false;

    /* renamed from: l  reason: collision with root package name */
    private final c f8376l = new c();

    /* renamed from: d  reason: collision with root package name */
    int f8368d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f8369e = 1;

    /* renamed from: f  reason: collision with root package name */
    int f8370f = 2;

    /* renamed from: g  reason: collision with root package name */
    int f8371g = 3;

    /* renamed from: h  reason: collision with root package name */
    int f8372h = 4;

    public a() {
        c();
    }

    private int e(int i4) {
        if (this.f8365a == 2) {
            int i5 = i4 * 5;
            if (i5 < this.f8367c.length) {
                return i5;
            }
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i4 + ").");
        }
        throw new IndexOutOfBoundsException("Current event is not START_TAG.");
    }

    public final void a() {
        if (this.f8374j) {
            this.f8374j = false;
            b bVar = this.f8366b;
            InputStream inputStream = bVar.f8377a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                bVar.a((InputStream) null);
            }
            this.f8375k = null;
            this.f8366b = null;
            c cVar = this.f8376l;
            cVar.f8380b = 0;
            cVar.f8381c = 0;
            c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
        throw new java.io.IOException("Invalid resource ids size (" + r1 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0221, code lost:
        throw new java.io.IOException("Invalid chunk type (" + r1 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.f.a.a.b():int");
    }

    public final int c(int i4) {
        return this.f8367c[e(i4) + 4];
    }

    public final String d(int i4) {
        int e5 = e(i4);
        int[] iArr = this.f8367c;
        if (iArr[e5 + 3] == 3) {
            return this.f8375k.a(iArr[e5 + 2]);
        }
        return "";
    }

    private void c() {
        this.f8367c = null;
        this.f8365a = -1;
    }

    public final String a(int i4) {
        int i5 = this.f8367c[e(i4) + 1];
        return i5 == -1 ? "" : this.f8375k.a(i5);
    }

    public final int b(int i4) {
        return this.f8367c[e(i4) + 3];
    }
}
