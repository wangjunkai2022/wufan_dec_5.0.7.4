package com.bytedance.pangle.f.a;
/* loaded from: classes2.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    int[] f8379a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    int f8380b;

    /* renamed from: c  reason: collision with root package name */
    int f8381c;

    public final void a() {
        b();
        int i4 = this.f8380b;
        int[] iArr = this.f8379a;
        iArr[i4] = 0;
        iArr[i4 + 1] = 0;
        this.f8380b = i4 + 2;
        this.f8381c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int[] iArr = this.f8379a;
        int length = iArr.length;
        int i4 = this.f8380b;
        int i5 = length - i4;
        if (i5 <= 2) {
            int[] iArr2 = new int[(iArr.length + i5) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.f8379a = iArr2;
        }
    }
}
