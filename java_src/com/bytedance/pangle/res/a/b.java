package com.bytedance.pangle.res.a;

import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    g f8528c;

    /* renamed from: i  reason: collision with root package name */
    private final h f8534i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f8535j;

    /* renamed from: l  reason: collision with root package name */
    private int[] f8537l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8539n;

    /* renamed from: o  reason: collision with root package name */
    private int f8540o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f8541p;

    /* renamed from: q  reason: collision with root package name */
    private int f8542q;

    /* renamed from: a  reason: collision with root package name */
    HashMap<Integer, Integer> f8526a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    boolean f8527b = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8536k = false;

    /* renamed from: m  reason: collision with root package name */
    private final a f8538m = new a();

    /* renamed from: d  reason: collision with root package name */
    int f8529d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f8530e = 1;

    /* renamed from: f  reason: collision with root package name */
    int f8531f = 2;

    /* renamed from: g  reason: collision with root package name */
    int f8532g = 3;

    /* renamed from: h  reason: collision with root package name */
    int f8533h = 4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int[] f8543a = new int[32];

        /* renamed from: b  reason: collision with root package name */
        int f8544b;

        /* renamed from: c  reason: collision with root package name */
        int f8545c;

        public final void a() {
            b();
            int i4 = this.f8544b;
            int[] iArr = this.f8543a;
            iArr[i4] = 0;
            iArr[i4 + 1] = 0;
            this.f8544b = i4 + 2;
            this.f8545c++;
        }

        final void b() {
            int[] iArr = this.f8543a;
            int length = iArr.length;
            int i4 = this.f8544b;
            int i5 = length - i4;
            if (i5 > 2) {
                return;
            }
            int[] iArr2 = new int[(iArr.length + i5) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.f8543a = iArr2;
        }
    }

    public b(byte[] bArr, h hVar) {
        this.f8534i = hVar;
        this.f8535j = bArr;
        c();
    }

    private void c() {
        this.f8540o = -1;
        this.f8541p = null;
        this.f8542q = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0297, code lost:
        throw new java.io.IOException("Invalid chunk type (" + r6 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
        throw new java.io.IOException("Invalid resource ids size (" + r6 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.res.a.b.d():void");
    }

    public final void a() {
        if (this.f8536k) {
            this.f8536k = false;
            this.f8528c = null;
            this.f8537l = null;
            a aVar = this.f8538m;
            aVar.f8544b = 0;
            aVar.f8545c = 0;
            c();
        }
    }

    public final int b() {
        if (this.f8528c != null) {
            try {
                d();
                return this.f8540o;
            } catch (IOException e5) {
                a();
                throw e5;
            }
        }
        throw new RuntimeException("Parser is not opened.");
    }
}
