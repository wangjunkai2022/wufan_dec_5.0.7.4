package net.lingala.zip4j.crypto.PBKDF2;
/* compiled from: PBKDF2Parameters.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    protected byte[] f71732a;

    /* renamed from: b  reason: collision with root package name */
    protected int f71733b;

    /* renamed from: c  reason: collision with root package name */
    protected String f71734c;

    /* renamed from: d  reason: collision with root package name */
    protected String f71735d;

    /* renamed from: e  reason: collision with root package name */
    protected byte[] f71736e;

    public e() {
        this.f71734c = null;
        this.f71735d = "UTF-8";
        this.f71732a = null;
        this.f71733b = 1000;
        this.f71736e = null;
    }

    public byte[] a() {
        return this.f71736e;
    }

    public String b() {
        return this.f71734c;
    }

    public String c() {
        return this.f71735d;
    }

    public int d() {
        return this.f71733b;
    }

    public byte[] e() {
        return this.f71732a;
    }

    public void f(byte[] bArr) {
        this.f71736e = bArr;
    }

    public void g(String str) {
        this.f71734c = str;
    }

    public void h(String str) {
        this.f71735d = str;
    }

    public void i(int i4) {
        this.f71733b = i4;
    }

    public void j(byte[] bArr) {
        this.f71732a = bArr;
    }

    public e(String str, String str2, byte[] bArr, int i4) {
        this.f71734c = str;
        this.f71735d = str2;
        this.f71732a = bArr;
        this.f71733b = i4;
        this.f71736e = null;
    }

    public e(String str, String str2, byte[] bArr, int i4, byte[] bArr2) {
        this.f71734c = str;
        this.f71735d = str2;
        this.f71732a = bArr;
        this.f71733b = i4;
        this.f71736e = bArr2;
    }
}
