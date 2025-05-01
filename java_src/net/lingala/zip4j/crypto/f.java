package net.lingala.zip4j.crypto;

import java.util.Objects;
import java.util.Random;
import net.lingala.zip4j.exception.ZipException;
/* compiled from: StandardEncrypter.java */
/* loaded from: classes7.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private net.lingala.zip4j.crypto.engine.b f71783a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f71784b;

    public f(char[] cArr, int i4) throws ZipException {
        if (cArr != null && cArr.length > 0) {
            this.f71783a = new net.lingala.zip4j.crypto.engine.b();
            this.f71784b = new byte[12];
            f(cArr, i4);
            return;
        }
        throw new ZipException("input password is null or empty in standard encrpyter constructor");
    }

    private void f(char[] cArr, int i4) throws ZipException {
        if (cArr != null && cArr.length > 0) {
            this.f71783a.c(cArr);
            this.f71784b = d(12);
            this.f71783a.c(cArr);
            byte[] bArr = this.f71784b;
            bArr[11] = (byte) (i4 >>> 24);
            bArr[10] = (byte) (i4 >>> 16);
            if (bArr.length >= 12) {
                b(bArr);
                return;
            }
            throw new ZipException("invalid header bytes generated, cannot perform standard encryption");
        }
        throw new ZipException("input password is null or empty, cannot initialize standard encrypter");
    }

    @Override // net.lingala.zip4j.crypto.d
    public int a(byte[] bArr, int i4, int i5) throws ZipException {
        if (i5 >= 0) {
            for (int i6 = i4; i6 < i4 + i5; i6++) {
                try {
                    bArr[i6] = c(bArr[i6]);
                } catch (Exception e5) {
                    throw new ZipException(e5);
                }
            }
            return i5;
        }
        throw new ZipException("invalid length specified to decrpyt data");
    }

    @Override // net.lingala.zip4j.crypto.d
    public int b(byte[] bArr) throws ZipException {
        Objects.requireNonNull(bArr);
        return a(bArr, 0, bArr.length);
    }

    protected byte c(byte b5) {
        byte b6 = (byte) ((this.f71783a.b() & 255) ^ b5);
        this.f71783a.d(b5);
        return b6;
    }

    protected byte[] d(int i4) throws ZipException {
        if (i4 > 0) {
            byte[] bArr = new byte[i4];
            Random random = new Random();
            for (int i5 = 0; i5 < i4; i5++) {
                bArr[i5] = c((byte) random.nextInt(256));
            }
            return bArr;
        }
        throw new ZipException("size is either 0 or less than 0, cannot generate header for standard encryptor");
    }

    public byte[] e() {
        return this.f71784b;
    }
}
