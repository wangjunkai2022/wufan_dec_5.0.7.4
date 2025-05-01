package com.papa.controller.core.hardware;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
/* compiled from: GamepadHardwareId.java */
/* loaded from: classes5.dex */
public class b extends a {

    /* renamed from: p  reason: collision with root package name */
    private byte[] f58138p;

    public b() {
    }

    @Override // com.papa.controller.core.hardware.a
    public byte[] a() {
        return super.b(new byte[]{BinaryMemcacheOpcodes.REPLACEQ});
    }

    public byte[] k() {
        return this.f58138p;
    }

    public void l(byte[] bArr) {
        this.f58138p = bArr;
    }

    public b(byte[] bArr) {
        super(bArr);
        if (this.f58137d == 20) {
            int i4 = this.f58136c - 5;
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 5, bArr2, 0, i4);
            this.f58138p = bArr2;
        }
    }
}
