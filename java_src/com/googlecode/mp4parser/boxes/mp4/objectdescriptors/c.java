package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;
/* compiled from: BitReaderBuffer.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f13929a;

    /* renamed from: b  reason: collision with root package name */
    int f13930b;

    /* renamed from: c  reason: collision with root package name */
    int f13931c;

    public c(ByteBuffer byteBuffer) {
        this.f13929a = byteBuffer;
        this.f13930b = byteBuffer.position();
    }

    public int a() {
        int i4 = 8 - (this.f13931c % 8);
        if (i4 == 8) {
            i4 = 0;
        }
        c(i4);
        return i4;
    }

    public int b() {
        return this.f13931c;
    }

    public int c(int i4) {
        int c5;
        int i5 = this.f13929a.get(this.f13930b + (this.f13931c / 8));
        if (i5 < 0) {
            i5 += 256;
        }
        int i6 = this.f13931c;
        int i7 = 8 - (i6 % 8);
        if (i4 <= i7) {
            c5 = ((i5 << (i6 % 8)) & 255) >> ((i6 % 8) + (i7 - i4));
            this.f13931c = i6 + i4;
        } else {
            int i8 = i4 - i7;
            c5 = (c(i7) << i8) + c(i8);
        }
        ByteBuffer byteBuffer = this.f13929a;
        int i9 = this.f13930b;
        double d5 = this.f13931c;
        Double.isNaN(d5);
        byteBuffer.position(i9 + ((int) Math.ceil(d5 / 8.0d)));
        return c5;
    }

    public boolean d() {
        return c(1) == 1;
    }

    public int e() {
        return (this.f13929a.limit() * 8) - this.f13931c;
    }
}
