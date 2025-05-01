package w3;

import java.util.ArrayList;
import net.lingala.zip4j.exception.ZipException;
/* compiled from: FileHeader.java */
/* loaded from: classes7.dex */
public class h {
    private ArrayList A;
    private boolean B;

    /* renamed from: a  reason: collision with root package name */
    private int f73436a;

    /* renamed from: b  reason: collision with root package name */
    private int f73437b;

    /* renamed from: c  reason: collision with root package name */
    private int f73438c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f73439d;

    /* renamed from: e  reason: collision with root package name */
    private int f73440e;

    /* renamed from: f  reason: collision with root package name */
    private int f73441f;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f73443h;

    /* renamed from: i  reason: collision with root package name */
    private long f73444i;

    /* renamed from: k  reason: collision with root package name */
    private int f73446k;

    /* renamed from: l  reason: collision with root package name */
    private int f73447l;

    /* renamed from: m  reason: collision with root package name */
    private int f73448m;

    /* renamed from: n  reason: collision with root package name */
    private int f73449n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f73450o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f73451p;

    /* renamed from: q  reason: collision with root package name */
    private long f73452q;

    /* renamed from: r  reason: collision with root package name */
    private String f73453r;

    /* renamed from: s  reason: collision with root package name */
    private String f73454s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f73455t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f73456u;

    /* renamed from: w  reason: collision with root package name */
    private char[] f73458w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f73459x;

    /* renamed from: y  reason: collision with root package name */
    private n f73460y;

    /* renamed from: z  reason: collision with root package name */
    private a f73461z;

    /* renamed from: v  reason: collision with root package name */
    private int f73457v = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f73442g = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f73445j = 0;

    public n A() {
        return this.f73460y;
    }

    public boolean B() {
        return this.f73459x;
    }

    public boolean C() {
        return this.f73455t;
    }

    public boolean D() {
        return this.f73456u;
    }

    public boolean E() {
        return this.B;
    }

    public void F(a aVar) {
        this.f73461z = aVar;
    }

    public void G(long j4) {
        this.f73444i = j4;
    }

    public void H(int i4) {
        this.f73440e = i4;
    }

    public void I(long j4) {
        this.f73442g = j4;
    }

    public void J(byte[] bArr) {
        this.f73443h = bArr;
    }

    public void K(boolean z4) {
        this.f73459x = z4;
    }

    public void L(boolean z4) {
        this.f73455t = z4;
    }

    public void M(int i4) {
        this.f73449n = i4;
    }

    public void N(boolean z4) {
        this.f73456u = z4;
    }

    public void O(int i4) {
        this.f73457v = i4;
    }

    public void P(byte[] bArr) {
        this.f73451p = bArr;
    }

    public void Q(ArrayList arrayList) {
        this.A = arrayList;
    }

    public void R(int i4) {
        this.f73447l = i4;
    }

    public void S(String str) {
        this.f73454s = str;
    }

    public void T(int i4) {
        this.f73448m = i4;
    }

    public void U(String str) {
        this.f73453r = str;
    }

    public void V(int i4) {
        this.f73446k = i4;
    }

    public void W(boolean z4) {
        this.B = z4;
    }

    public void X(byte[] bArr) {
        this.f73439d = bArr;
    }

    public void Y(byte[] bArr) {
        this.f73450o = bArr;
    }

    public void Z(int i4) {
        this.f73441f = i4;
    }

    public void a(o oVar, String str, k kVar, String str2, x3.a aVar, boolean z4) throws ZipException {
        if (oVar != null) {
            if (net.lingala.zip4j.util.h.f(str)) {
                new net.lingala.zip4j.unzip.c(oVar).f(this, str, kVar, str2, aVar, z4);
                return;
            }
            throw new ZipException("Invalid output path");
        }
        throw new ZipException("input zipModel is null");
    }

    public void a0(long j4) {
        this.f73452q = j4;
    }

    public void b(o oVar, String str, k kVar, x3.a aVar, boolean z4) throws ZipException {
        a(oVar, str, kVar, null, aVar, z4);
    }

    public void b0(char[] cArr) {
        this.f73458w = cArr;
    }

    public void c(o oVar, String str, x3.a aVar, boolean z4) throws ZipException {
        b(oVar, str, null, aVar, z4);
    }

    public void c0(int i4) {
        this.f73436a = i4;
    }

    public a d() {
        return this.f73461z;
    }

    public void d0(long j4) {
        this.f73445j = j4;
    }

    public long e() {
        return this.f73444i;
    }

    public void e0(int i4) {
        this.f73437b = i4;
    }

    public int f() {
        return this.f73440e;
    }

    public void f0(int i4) {
        this.f73438c = i4;
    }

    public long g() {
        return this.f73442g & 4294967295L;
    }

    public void g0(n nVar) {
        this.f73460y = nVar;
    }

    public byte[] h() {
        return this.f73443h;
    }

    public int i() {
        return this.f73449n;
    }

    public int j() {
        return this.f73457v;
    }

    public byte[] k() {
        return this.f73451p;
    }

    public ArrayList l() {
        return this.A;
    }

    public int m() {
        return this.f73447l;
    }

    public String n() {
        return this.f73454s;
    }

    public int o() {
        return this.f73448m;
    }

    public String p() {
        return this.f73453r;
    }

    public int q() {
        return this.f73446k;
    }

    public byte[] r() {
        return this.f73439d;
    }

    public byte[] s() {
        return this.f73450o;
    }

    public int t() {
        return this.f73441f;
    }

    public long u() {
        return this.f73452q;
    }

    public char[] v() {
        return this.f73458w;
    }

    public int w() {
        return this.f73436a;
    }

    public long x() {
        return this.f73445j;
    }

    public int y() {
        return this.f73437b;
    }

    public int z() {
        return this.f73438c;
    }
}
