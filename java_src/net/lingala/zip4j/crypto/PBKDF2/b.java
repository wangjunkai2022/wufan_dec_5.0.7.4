package net.lingala.zip4j.crypto.PBKDF2;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: MacBasedPRF.java */
/* loaded from: classes7.dex */
public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    protected Mac f71727a;

    /* renamed from: b  reason: collision with root package name */
    protected int f71728b;

    /* renamed from: c  reason: collision with root package name */
    protected String f71729c;

    public b(String str) {
        this.f71729c = str;
        try {
            Mac mac = Mac.getInstance(str);
            this.f71727a = mac;
            this.f71728b = mac.getMacLength();
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.f
    public int a() {
        return this.f71728b;
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.f
    public void b(byte[] bArr) {
        try {
            this.f71727a.init(new SecretKeySpec(bArr, this.f71729c));
        } catch (InvalidKeyException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.f
    public byte[] c(byte[] bArr) {
        return this.f71727a.doFinal(bArr);
    }

    public byte[] d() {
        return this.f71727a.doFinal();
    }

    public void update(byte[] bArr) {
        try {
            this.f71727a.update(bArr);
        } catch (IllegalStateException e5) {
            throw new RuntimeException(e5);
        }
    }

    public void update(byte[] bArr, int i4, int i5) {
        try {
            this.f71727a.update(bArr, i4, i5);
        } catch (IllegalStateException e5) {
            throw new RuntimeException(e5);
        }
    }

    public b(String str, String str2) {
        this.f71729c = str;
        try {
            Mac mac = Mac.getInstance(str, str2);
            this.f71727a = mac;
            this.f71728b = mac.getMacLength();
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchProviderException e6) {
            throw new RuntimeException(e6);
        }
    }
}
