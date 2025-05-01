package external.org.apache.commons.lang3.builder;

import external.org.apache.commons.lang3.ObjectUtils;
/* compiled from: ToStringBuilder.java */
/* loaded from: classes6.dex */
public class g implements a<String> {

    /* renamed from: d  reason: collision with root package name */
    private static volatile ToStringStyle f68890d = ToStringStyle.f68853v;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuffer f68891a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f68892b;

    /* renamed from: c  reason: collision with root package name */
    private final ToStringStyle f68893c;

    public g(Object obj) {
        this(obj, null, null);
    }

    public static ToStringStyle Y() {
        return f68890d;
    }

    public static String c0(Object obj) {
        return f.v0(obj);
    }

    public static String d0(Object obj, ToStringStyle toStringStyle) {
        return f.w0(obj, toStringStyle);
    }

    public static String e0(Object obj, ToStringStyle toStringStyle, boolean z4) {
        return f.z0(obj, toStringStyle, z4, false, null);
    }

    public static <T> String f0(T t4, ToStringStyle toStringStyle, boolean z4, Class<? super T> cls) {
        return f.z0(t4, toStringStyle, z4, false, cls);
    }

    public static void g0(ToStringStyle toStringStyle) {
        if (toStringStyle != null) {
            f68890d = toStringStyle;
            return;
        }
        throw new IllegalArgumentException("The style must not be null");
    }

    public g A(String str, int[] iArr, boolean z4) {
        this.f68893c.n(this.f68891a, str, iArr, Boolean.valueOf(z4));
        return this;
    }

    public g B(String str, long[] jArr) {
        this.f68893c.o(this.f68891a, str, jArr, null);
        return this;
    }

    public g C(String str, long[] jArr, boolean z4) {
        this.f68893c.o(this.f68891a, str, jArr, Boolean.valueOf(z4));
        return this;
    }

    public g D(String str, Object[] objArr) {
        this.f68893c.p(this.f68891a, str, objArr, null);
        return this;
    }

    public g E(String str, Object[] objArr, boolean z4) {
        this.f68893c.p(this.f68891a, str, objArr, Boolean.valueOf(z4));
        return this;
    }

    public g F(String str, short[] sArr) {
        this.f68893c.q(this.f68891a, str, sArr, null);
        return this;
    }

    public g G(String str, short[] sArr, boolean z4) {
        this.f68893c.q(this.f68891a, str, sArr, Boolean.valueOf(z4));
        return this;
    }

    public g H(String str, boolean[] zArr) {
        this.f68893c.r(this.f68891a, str, zArr, null);
        return this;
    }

    public g I(String str, boolean[] zArr, boolean z4) {
        this.f68893c.r(this.f68891a, str, zArr, Boolean.valueOf(z4));
        return this;
    }

    public g J(short s4) {
        this.f68893c.h(this.f68891a, null, s4);
        return this;
    }

    public g K(boolean z4) {
        this.f68893c.i(this.f68891a, null, z4);
        return this;
    }

    public g L(byte[] bArr) {
        this.f68893c.j(this.f68891a, null, bArr, null);
        return this;
    }

    public g M(char[] cArr) {
        this.f68893c.k(this.f68891a, null, cArr, null);
        return this;
    }

    public g N(double[] dArr) {
        this.f68893c.l(this.f68891a, null, dArr, null);
        return this;
    }

    public g O(float[] fArr) {
        this.f68893c.m(this.f68891a, null, fArr, null);
        return this;
    }

    public g P(int[] iArr) {
        this.f68893c.n(this.f68891a, null, iArr, null);
        return this;
    }

    public g Q(long[] jArr) {
        this.f68893c.o(this.f68891a, null, jArr, null);
        return this;
    }

    public g R(Object[] objArr) {
        this.f68893c.p(this.f68891a, null, objArr, null);
        return this;
    }

    public g S(short[] sArr) {
        this.f68893c.q(this.f68891a, null, sArr, null);
        return this;
    }

    public g T(boolean[] zArr) {
        this.f68893c.r(this.f68891a, null, zArr, null);
        return this;
    }

    public g U(Object obj) {
        ObjectUtils.k(a0(), obj);
        return this;
    }

    public g V(String str) {
        if (str != null) {
            this.f68893c.j0(this.f68891a, str);
        }
        return this;
    }

    public g W(String str) {
        if (str != null) {
            this.f68893c.k0(this.f68891a, str);
        }
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: X */
    public String build() {
        return toString();
    }

    public Object Z() {
        return this.f68892b;
    }

    public g a(byte b5) {
        this.f68893c.a(this.f68891a, null, b5);
        return this;
    }

    public StringBuffer a0() {
        return this.f68891a;
    }

    public g b(char c5) {
        this.f68893c.b(this.f68891a, null, c5);
        return this;
    }

    public ToStringStyle b0() {
        return this.f68893c;
    }

    public g c(double d5) {
        this.f68893c.c(this.f68891a, null, d5);
        return this;
    }

    public g d(float f5) {
        this.f68893c.d(this.f68891a, null, f5);
        return this;
    }

    public g e(int i4) {
        this.f68893c.e(this.f68891a, null, i4);
        return this;
    }

    public g f(long j4) {
        this.f68893c.f(this.f68891a, null, j4);
        return this;
    }

    public g g(Object obj) {
        this.f68893c.g(this.f68891a, null, obj, null);
        return this;
    }

    public g h(String str, byte b5) {
        this.f68893c.a(this.f68891a, str, b5);
        return this;
    }

    public g i(String str, char c5) {
        this.f68893c.b(this.f68891a, str, c5);
        return this;
    }

    public g j(String str, double d5) {
        this.f68893c.c(this.f68891a, str, d5);
        return this;
    }

    public g k(String str, float f5) {
        this.f68893c.d(this.f68891a, str, f5);
        return this;
    }

    public g l(String str, int i4) {
        this.f68893c.e(this.f68891a, str, i4);
        return this;
    }

    public g m(String str, long j4) {
        this.f68893c.f(this.f68891a, str, j4);
        return this;
    }

    public g n(String str, Object obj) {
        this.f68893c.g(this.f68891a, str, obj, null);
        return this;
    }

    public g o(String str, Object obj, boolean z4) {
        this.f68893c.g(this.f68891a, str, obj, Boolean.valueOf(z4));
        return this;
    }

    public g p(String str, short s4) {
        this.f68893c.h(this.f68891a, str, s4);
        return this;
    }

    public g q(String str, boolean z4) {
        this.f68893c.i(this.f68891a, str, z4);
        return this;
    }

    public g r(String str, byte[] bArr) {
        this.f68893c.j(this.f68891a, str, bArr, null);
        return this;
    }

    public g s(String str, byte[] bArr, boolean z4) {
        this.f68893c.j(this.f68891a, str, bArr, Boolean.valueOf(z4));
        return this;
    }

    public g t(String str, char[] cArr) {
        this.f68893c.k(this.f68891a, str, cArr, null);
        return this;
    }

    public String toString() {
        if (Z() == null) {
            a0().append(b0().s0());
        } else {
            this.f68893c.Q(a0(), Z());
        }
        return a0().toString();
    }

    public g u(String str, char[] cArr, boolean z4) {
        this.f68893c.k(this.f68891a, str, cArr, Boolean.valueOf(z4));
        return this;
    }

    public g v(String str, double[] dArr) {
        this.f68893c.l(this.f68891a, str, dArr, null);
        return this;
    }

    public g w(String str, double[] dArr, boolean z4) {
        this.f68893c.l(this.f68891a, str, dArr, Boolean.valueOf(z4));
        return this;
    }

    public g x(String str, float[] fArr) {
        this.f68893c.m(this.f68891a, str, fArr, null);
        return this;
    }

    public g y(String str, float[] fArr, boolean z4) {
        this.f68893c.m(this.f68891a, str, fArr, Boolean.valueOf(z4));
        return this;
    }

    public g z(String str, int[] iArr) {
        this.f68893c.n(this.f68891a, str, iArr, null);
        return this;
    }

    public g(Object obj, ToStringStyle toStringStyle) {
        this(obj, toStringStyle, null);
    }

    public g(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        toStringStyle = toStringStyle == null ? Y() : toStringStyle;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f68891a = stringBuffer;
        this.f68893c = toStringStyle;
        this.f68892b = obj;
        toStringStyle.X(stringBuffer, obj);
    }
}
