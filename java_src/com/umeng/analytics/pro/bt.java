package com.umeng.analytics.pro;
/* compiled from: ShortStack.java */
/* loaded from: classes6.dex */
public class bt {

    /* renamed from: a  reason: collision with root package name */
    private short[] f63531a;

    /* renamed from: b  reason: collision with root package name */
    private int f63532b = -1;

    public bt(int i4) {
        this.f63531a = new short[i4];
    }

    private void d() {
        short[] sArr = this.f63531a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f63531a = sArr2;
    }

    public short a() {
        short[] sArr = this.f63531a;
        int i4 = this.f63532b;
        this.f63532b = i4 - 1;
        return sArr[i4];
    }

    public short b() {
        return this.f63531a[this.f63532b];
    }

    public void c() {
        this.f63532b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i4 = 0; i4 < this.f63531a.length; i4++) {
            if (i4 != 0) {
                sb.append(" ");
            }
            if (i4 == this.f63532b) {
                sb.append(">>");
            }
            sb.append((int) this.f63531a[i4]);
            if (i4 == this.f63532b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    public void a(short s4) {
        if (this.f63531a.length == this.f63532b + 1) {
            d();
        }
        short[] sArr = this.f63531a;
        int i4 = this.f63532b + 1;
        this.f63532b = i4;
        sArr[i4] = s4;
    }
}
