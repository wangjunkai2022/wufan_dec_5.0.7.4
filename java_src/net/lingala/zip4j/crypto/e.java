package net.lingala.zip4j.crypto;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import net.lingala.zip4j.exception.ZipException;
import w3.h;
/* compiled from: StandardDecrypter.java */
/* loaded from: classes7.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private h f71769a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f71770b = new byte[4];

    /* renamed from: c  reason: collision with root package name */
    private net.lingala.zip4j.crypto.engine.b f71771c;

    public e(h hVar, byte[] bArr) throws ZipException {
        if (hVar != null) {
            this.f71769a = hVar;
            this.f71771c = new net.lingala.zip4j.crypto.engine.b();
            c(bArr);
            return;
        }
        throw new ZipException("one of more of the input parameters were null in StandardDecryptor");
    }

    @Override // net.lingala.zip4j.crypto.c
    public int a(byte[] bArr) throws ZipException {
        return b(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.crypto.c
    public int b(byte[] bArr, int i4, int i5) throws ZipException {
        if (i4 < 0 || i5 < 0) {
            throw new ZipException("one of the input parameters were null in standard decrpyt data");
        }
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            try {
                byte b5 = (byte) (((bArr[i6] & 255) ^ this.f71771c.b()) & 255);
                this.f71771c.d(b5);
                bArr[i6] = b5;
            } catch (Exception e5) {
                throw new ZipException(e5);
            }
        }
        return i5;
    }

    public void c(byte[] bArr) throws ZipException {
        byte[] h4 = this.f71769a.h();
        byte[] bArr2 = this.f71770b;
        bArr2[3] = (byte) (h4[3] & 255);
        bArr2[2] = (byte) ((h4[3] >> 8) & 255);
        bArr2[1] = (byte) ((h4[3] >> 16) & 255);
        int i4 = 0;
        bArr2[0] = (byte) ((h4[3] >> BinaryMemcacheOpcodes.FLUSHQ) & 255);
        if (bArr2[2] <= 0 && bArr2[1] <= 0 && bArr2[0] <= 0) {
            if (this.f71769a.v() != null && this.f71769a.v().length > 0) {
                this.f71771c.c(this.f71769a.v());
                try {
                    byte b5 = bArr[0];
                    while (i4 < 12) {
                        net.lingala.zip4j.crypto.engine.b bVar = this.f71771c;
                        bVar.d((byte) (bVar.b() ^ b5));
                        i4++;
                        if (i4 != 12) {
                            b5 = bArr[i4];
                        }
                    }
                    return;
                } catch (Exception e5) {
                    throw new ZipException(e5);
                }
            }
            throw new ZipException("Wrong password!", 5);
        }
        throw new IllegalStateException("Invalid CRC in File Header");
    }
}
