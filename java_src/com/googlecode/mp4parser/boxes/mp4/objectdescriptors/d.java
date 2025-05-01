package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import androidx.core.view.InputDeviceCompat;
import java.nio.ByteBuffer;
/* compiled from: BitWriterBuffer.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f13932d = false;

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f13933a;

    /* renamed from: b  reason: collision with root package name */
    int f13934b;

    /* renamed from: c  reason: collision with root package name */
    int f13935c = 0;

    public d(ByteBuffer byteBuffer) {
        this.f13933a = byteBuffer;
        this.f13934b = byteBuffer.position();
    }

    public void a(int i4, int i5) {
        int i6 = this.f13935c;
        int i7 = 8 - (i6 % 8);
        if (i5 <= i7) {
            int i8 = this.f13933a.get(this.f13934b + (i6 / 8));
            if (i8 < 0) {
                i8 += 256;
            }
            int i9 = i8 + (i4 << (i7 - i5));
            ByteBuffer byteBuffer = this.f13933a;
            int i10 = this.f13934b + (this.f13935c / 8);
            if (i9 > 127) {
                i9 += InputDeviceCompat.SOURCE_ANY;
            }
            byteBuffer.put(i10, (byte) i9);
            this.f13935c += i5;
        } else {
            int i11 = i5 - i7;
            a(i4 >> i11, i7);
            a(i4 & ((1 << i11) - 1), i11);
        }
        ByteBuffer byteBuffer2 = this.f13933a;
        int i12 = this.f13934b;
        int i13 = this.f13935c;
        byteBuffer2.position(i12 + (i13 / 8) + (i13 % 8 <= 0 ? 0 : 1));
    }
}
