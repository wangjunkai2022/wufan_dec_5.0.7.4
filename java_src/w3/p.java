package w3;

import java.util.TimeZone;
/* compiled from: ZipParameters.java */
/* loaded from: classes7.dex */
public class p implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private int f73534c;

    /* renamed from: g  reason: collision with root package name */
    private char[] f73538g;

    /* renamed from: j  reason: collision with root package name */
    private String f73541j;

    /* renamed from: l  reason: collision with root package name */
    private int f73543l;

    /* renamed from: m  reason: collision with root package name */
    private String f73544m;

    /* renamed from: n  reason: collision with root package name */
    private String f73545n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f73546o;

    /* renamed from: b  reason: collision with root package name */
    private int f73533b = 8;

    /* renamed from: d  reason: collision with root package name */
    private boolean f73535d = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f73537f = true;

    /* renamed from: e  reason: collision with root package name */
    private int f73536e = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f73539h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f73540i = true;

    /* renamed from: k  reason: collision with root package name */
    private TimeZone f73542k = TimeZone.getDefault();

    public void A(boolean z4) {
        this.f73546o = z4;
    }

    public void B(int i4) {
        this.f73543l = i4;
    }

    public void C(TimeZone timeZone) {
        this.f73542k = timeZone;
    }

    public int a() {
        return this.f73539h;
    }

    public int b() {
        return this.f73534c;
    }

    public int c() {
        return this.f73533b;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String d() {
        return this.f73544m;
    }

    public int e() {
        return this.f73536e;
    }

    public String f() {
        return this.f73545n;
    }

    public char[] g() {
        return this.f73538g;
    }

    public String h() {
        return this.f73541j;
    }

    public int i() {
        return this.f73543l;
    }

    public TimeZone j() {
        return this.f73542k;
    }

    public boolean k() {
        return this.f73535d;
    }

    public boolean l() {
        return this.f73540i;
    }

    public boolean m() {
        return this.f73537f;
    }

    public boolean n() {
        return this.f73546o;
    }

    public void o(int i4) {
        this.f73539h = i4;
    }

    public void p(int i4) {
        this.f73534c = i4;
    }

    public void q(int i4) {
        this.f73533b = i4;
    }

    public void r(String str) {
        this.f73544m = str;
    }

    public void s(boolean z4) {
        this.f73535d = z4;
    }

    public void t(int i4) {
        this.f73536e = i4;
    }

    public void u(String str) {
        this.f73545n = str;
    }

    public void v(boolean z4) {
        this.f73540i = z4;
    }

    public void w(String str) {
        if (str == null) {
            return;
        }
        x(str.toCharArray());
    }

    public void x(char[] cArr) {
        this.f73538g = cArr;
    }

    public void y(boolean z4) {
        this.f73537f = z4;
    }

    public void z(String str) {
        if (net.lingala.zip4j.util.h.A(str)) {
            if (!str.endsWith("\\") && !str.endsWith(net.lingala.zip4j.util.e.F0)) {
                StringBuffer stringBuffer = new StringBuffer(str);
                stringBuffer.append(net.lingala.zip4j.util.e.E0);
                str = stringBuffer.toString();
            }
            str = str.replaceAll("\\\\", net.lingala.zip4j.util.e.F0);
        }
        this.f73541j = str;
    }
}
