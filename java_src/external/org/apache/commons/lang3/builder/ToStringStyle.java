package external.org.apache.commons.lang3.builder;

import com.j256.ormlite.stmt.query.SimpleComparison;
import external.org.apache.commons.lang3.ObjectUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes6.dex */
public abstract class ToStringStyle implements Serializable {
    private static final long serialVersionUID = -2587890625525655916L;

    /* renamed from: b  reason: collision with root package name */
    private boolean f68858b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f68859c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f68860d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f68861e = true;

    /* renamed from: f  reason: collision with root package name */
    private String f68862f = "[";

    /* renamed from: g  reason: collision with root package name */
    private String f68863g = "]";

    /* renamed from: h  reason: collision with root package name */
    private String f68864h = SimpleComparison.EQUAL_TO_OPERATION;

    /* renamed from: i  reason: collision with root package name */
    private boolean f68865i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f68866j = false;

    /* renamed from: k  reason: collision with root package name */
    private String f68867k = ",";

    /* renamed from: l  reason: collision with root package name */
    private String f68868l = "{";

    /* renamed from: m  reason: collision with root package name */
    private String f68869m = ",";

    /* renamed from: n  reason: collision with root package name */
    private boolean f68870n = true;

    /* renamed from: o  reason: collision with root package name */
    private String f68871o = "}";

    /* renamed from: p  reason: collision with root package name */
    private boolean f68872p = true;

    /* renamed from: q  reason: collision with root package name */
    private String f68873q = "<null>";

    /* renamed from: r  reason: collision with root package name */
    private String f68874r = "<size=";

    /* renamed from: s  reason: collision with root package name */
    private String f68875s = SimpleComparison.GREATER_THAN_OPERATION;

    /* renamed from: t  reason: collision with root package name */
    private String f68876t = SimpleComparison.LESS_THAN_OPERATION;

    /* renamed from: u  reason: collision with root package name */
    private String f68877u = SimpleComparison.GREATER_THAN_OPERATION;

    /* renamed from: v  reason: collision with root package name */
    public static final ToStringStyle f68853v = new DefaultToStringStyle();

    /* renamed from: w  reason: collision with root package name */
    public static final ToStringStyle f68854w = new MultiLineToStringStyle();

    /* renamed from: x  reason: collision with root package name */
    public static final ToStringStyle f68855x = new NoFieldNameToStringStyle();

    /* renamed from: y  reason: collision with root package name */
    public static final ToStringStyle f68856y = new ShortPrefixToStringStyle();

    /* renamed from: z  reason: collision with root package name */
    public static final ToStringStyle f68857z = new SimpleToStringStyle();
    private static final ThreadLocal<WeakHashMap<Object, Object>> A = new ThreadLocal<>();

    /* loaded from: classes6.dex */
    private static final class DefaultToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        DefaultToStringStyle() {
        }

        private Object readResolve() {
            return ToStringStyle.f68853v;
        }
    }

    /* loaded from: classes6.dex */
    private static final class MultiLineToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        MultiLineToStringStyle() {
            R0("[");
            StringBuilder sb = new StringBuilder();
            String str = external.org.apache.commons.lang3.f.L;
            sb.append(str);
            sb.append("  ");
            U0(sb.toString());
            W0(true);
            Q0(str + "]");
        }

        private Object readResolve() {
            return ToStringStyle.f68854w;
        }
    }

    /* loaded from: classes6.dex */
    private static final class NoFieldNameToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        NoFieldNameToStringStyle() {
            e1(false);
        }

        private Object readResolve() {
            return ToStringStyle.f68855x;
        }
    }

    /* loaded from: classes6.dex */
    private static final class ShortPrefixToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        ShortPrefixToStringStyle() {
            g1(true);
            f1(false);
        }

        private Object readResolve() {
            return ToStringStyle.f68856y;
        }
    }

    /* loaded from: classes6.dex */
    private static final class SimpleToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        SimpleToStringStyle() {
            d1(false);
            f1(false);
            e1(false);
            R0("");
            Q0("");
        }

        private Object readResolve() {
            return ToStringStyle.f68857z;
        }
    }

    protected ToStringStyle() {
    }

    static boolean E0(Object obj) {
        Map<Object, Object> t02 = t0();
        return t02 != null && t02.containsKey(obj);
    }

    static void K0(Object obj) {
        if (obj != null) {
            if (t0() == null) {
                A.set(new WeakHashMap<>());
            }
            t0().put(obj, null);
        }
    }

    static void h1(Object obj) {
        Map<Object, Object> t02;
        if (obj == null || (t02 = t0()) == null) {
            return;
        }
        t02.remove(obj);
        if (t02.isEmpty()) {
            A.remove();
        }
    }

    static Map<Object, Object> t0() {
        return A.get();
    }

    protected void A(StringBuffer stringBuffer, String str, int i4) {
        stringBuffer.append(i4);
    }

    protected boolean A0() {
        return this.f68872p;
    }

    protected void B(StringBuffer stringBuffer, String str, long j4) {
        stringBuffer.append(j4);
    }

    protected boolean B0() {
        return this.f68866j;
    }

    protected void C(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    protected boolean C0() {
        return this.f68865i;
    }

    protected void D(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected boolean D0(Boolean bool) {
        if (bool == null) {
            return this.f68872p;
        }
        return bool.booleanValue();
    }

    protected void E(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    protected void F(StringBuffer stringBuffer, String str, short s4) {
        stringBuffer.append((int) s4);
    }

    protected boolean F0() {
        return this.f68859c;
    }

    protected void G(StringBuffer stringBuffer, String str, boolean z4) {
        stringBuffer.append(z4);
    }

    protected boolean G0() {
        return this.f68858b;
    }

    protected void H(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            w(stringBuffer, str, bArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    protected boolean H0() {
        return this.f68861e;
    }

    protected void I(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            x(stringBuffer, str, cArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    protected boolean I0() {
        return this.f68860d;
    }

    protected void J(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < dArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            y(stringBuffer, str, dArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J0(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f68868l);
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            Object obj2 = Array.get(obj, i4);
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            if (obj2 == null) {
                W(stringBuffer, str);
            } else {
                V(stringBuffer, str, obj2, this.f68870n);
            }
        }
        stringBuffer.append(this.f68871o);
    }

    protected void K(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < fArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            z(stringBuffer, str, fArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    protected void L(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            A(stringBuffer, str, iArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    protected void L0(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.f68867k.length();
        if (length <= 0 || length2 <= 0 || length < length2) {
            return;
        }
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                z4 = true;
                break;
            } else if (stringBuffer.charAt((length - 1) - i4) != this.f68867k.charAt((length2 - 1) - i4)) {
                break;
            } else {
                i4++;
            }
        }
        if (z4) {
            stringBuffer.setLength(length - length2);
        }
    }

    protected void M(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < jArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            B(stringBuffer, str, jArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    protected void M0(boolean z4) {
        this.f68870n = z4;
    }

    protected void N(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            if (obj == null) {
                W(stringBuffer, str);
            } else {
                V(stringBuffer, str, obj, this.f68870n);
            }
        }
        stringBuffer.append(this.f68871o);
    }

    protected void N0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68871o = str;
    }

    protected void O(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < sArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            F(stringBuffer, str, sArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    protected void O0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68869m = str;
    }

    protected void P(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f68868l);
        for (int i4 = 0; i4 < zArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f68869m);
            }
            G(stringBuffer, str, zArr[i4]);
        }
        stringBuffer.append(this.f68871o);
    }

    protected void P0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68868l = str;
    }

    public void Q(StringBuffer stringBuffer, Object obj) {
        if (!this.f68866j) {
            L0(stringBuffer);
        }
        t(stringBuffer);
        h1(obj);
    }

    protected void Q0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68863g = str;
    }

    protected void R(StringBuffer stringBuffer, String str) {
        S(stringBuffer);
    }

    protected void R0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68862f = str;
    }

    protected void S(StringBuffer stringBuffer) {
        stringBuffer.append(this.f68867k);
    }

    protected void S0(boolean z4) {
        this.f68872p = z4;
    }

    protected void T(StringBuffer stringBuffer, String str) {
        if (!this.f68858b || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f68864h);
    }

    protected void T0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68864h = str;
    }

    protected void U(StringBuffer stringBuffer, Object obj) {
        if (!H0() || obj == null) {
            return;
        }
        K0(obj);
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    protected void U0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68867k = str;
    }

    protected void V(StringBuffer stringBuffer, String str, Object obj, boolean z4) {
        if (E0(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            v(stringBuffer, str, obj);
            return;
        }
        K0(obj);
        try {
            if (obj instanceof Collection) {
                if (z4) {
                    D(stringBuffer, str, (Collection) obj);
                } else {
                    i0(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z4) {
                    E(stringBuffer, str, (Map) obj);
                } else {
                    i0(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z4) {
                    M(stringBuffer, str, (long[]) obj);
                } else {
                    e0(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z4) {
                    L(stringBuffer, str, (int[]) obj);
                } else {
                    d0(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z4) {
                    O(stringBuffer, str, (short[]) obj);
                } else {
                    g0(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z4) {
                    H(stringBuffer, str, (byte[]) obj);
                } else {
                    Z(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z4) {
                    I(stringBuffer, str, (char[]) obj);
                } else {
                    a0(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z4) {
                    J(stringBuffer, str, (double[]) obj);
                } else {
                    b0(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z4) {
                    K(stringBuffer, str, (float[]) obj);
                } else {
                    c0(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z4) {
                    P(stringBuffer, str, (boolean[]) obj);
                } else {
                    h0(stringBuffer, str, (boolean[]) obj);
                }
            } else if (obj.getClass().isArray()) {
                if (z4) {
                    N(stringBuffer, str, (Object[]) obj);
                } else {
                    f0(stringBuffer, str, (Object[]) obj);
                }
            } else if (z4) {
                C(stringBuffer, str, obj);
            } else {
                Y(stringBuffer, str, obj);
            }
        } finally {
            h1(obj);
        }
    }

    protected void V0(boolean z4) {
        this.f68866j = z4;
    }

    protected void W(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f68873q);
    }

    protected void W0(boolean z4) {
        this.f68865i = z4;
    }

    public void X(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            s(stringBuffer, obj);
            U(stringBuffer, obj);
            u(stringBuffer);
            if (this.f68865i) {
                S(stringBuffer);
            }
        }
    }

    protected void Y(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f68876t);
        stringBuffer.append(u0(obj.getClass()));
        stringBuffer.append(this.f68877u);
    }

    protected void Y0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68873q = str;
    }

    protected void Z(StringBuffer stringBuffer, String str, byte[] bArr) {
        i0(stringBuffer, str, bArr.length);
    }

    protected void Z0(String str) {
        if (str == null) {
            str = "";
        }
        this.f68875s = str;
    }

    public void a(StringBuffer stringBuffer, String str, byte b5) {
        T(stringBuffer, str);
        w(stringBuffer, str, b5);
        R(stringBuffer, str);
    }

    protected void a0(StringBuffer stringBuffer, String str, char[] cArr) {
        i0(stringBuffer, str, cArr.length);
    }

    protected void a1(String str) {
        if (str == null) {
            str = "";
        }
        this.f68874r = str;
    }

    public void b(StringBuffer stringBuffer, String str, char c5) {
        T(stringBuffer, str);
        x(stringBuffer, str, c5);
        R(stringBuffer, str);
    }

    protected void b0(StringBuffer stringBuffer, String str, double[] dArr) {
        i0(stringBuffer, str, dArr.length);
    }

    protected void b1(String str) {
        if (str == null) {
            str = "";
        }
        this.f68877u = str;
    }

    public void c(StringBuffer stringBuffer, String str, double d5) {
        T(stringBuffer, str);
        y(stringBuffer, str, d5);
        R(stringBuffer, str);
    }

    protected void c0(StringBuffer stringBuffer, String str, float[] fArr) {
        i0(stringBuffer, str, fArr.length);
    }

    protected void c1(String str) {
        if (str == null) {
            str = "";
        }
        this.f68876t = str;
    }

    public void d(StringBuffer stringBuffer, String str, float f5) {
        T(stringBuffer, str);
        z(stringBuffer, str, f5);
        R(stringBuffer, str);
    }

    protected void d0(StringBuffer stringBuffer, String str, int[] iArr) {
        i0(stringBuffer, str, iArr.length);
    }

    protected void d1(boolean z4) {
        this.f68859c = z4;
    }

    public void e(StringBuffer stringBuffer, String str, int i4) {
        T(stringBuffer, str);
        A(stringBuffer, str, i4);
        R(stringBuffer, str);
    }

    protected void e0(StringBuffer stringBuffer, String str, long[] jArr) {
        i0(stringBuffer, str, jArr.length);
    }

    protected void e1(boolean z4) {
        this.f68858b = z4;
    }

    public void f(StringBuffer stringBuffer, String str, long j4) {
        T(stringBuffer, str);
        B(stringBuffer, str, j4);
        R(stringBuffer, str);
    }

    protected void f0(StringBuffer stringBuffer, String str, Object[] objArr) {
        i0(stringBuffer, str, objArr.length);
    }

    protected void f1(boolean z4) {
        this.f68861e = z4;
    }

    public void g(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        T(stringBuffer, str);
        if (obj == null) {
            W(stringBuffer, str);
        } else {
            V(stringBuffer, str, obj, D0(bool));
        }
        R(stringBuffer, str);
    }

    protected void g0(StringBuffer stringBuffer, String str, short[] sArr) {
        i0(stringBuffer, str, sArr.length);
    }

    protected void g1(boolean z4) {
        this.f68860d = z4;
    }

    public void h(StringBuffer stringBuffer, String str, short s4) {
        T(stringBuffer, str);
        F(stringBuffer, str, s4);
        R(stringBuffer, str);
    }

    protected void h0(StringBuffer stringBuffer, String str, boolean[] zArr) {
        i0(stringBuffer, str, zArr.length);
    }

    public void i(StringBuffer stringBuffer, String str, boolean z4) {
        T(stringBuffer, str);
        G(stringBuffer, str, z4);
        R(stringBuffer, str);
    }

    protected void i0(StringBuffer stringBuffer, String str, int i4) {
        stringBuffer.append(this.f68874r);
        stringBuffer.append(i4);
        stringBuffer.append(this.f68875s);
    }

    public void j(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        T(stringBuffer, str);
        if (bArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            H(stringBuffer, str, bArr);
        } else {
            Z(stringBuffer, str, bArr);
        }
        R(stringBuffer, str);
    }

    public void j0(StringBuffer stringBuffer, String str) {
        k0(stringBuffer, str);
    }

    public void k(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        T(stringBuffer, str);
        if (cArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            I(stringBuffer, str, cArr);
        } else {
            a0(stringBuffer, str, cArr);
        }
        R(stringBuffer, str);
    }

    public void k0(StringBuffer stringBuffer, String str) {
        int indexOf;
        int lastIndexOf;
        if (str == null || (indexOf = str.indexOf(this.f68862f) + this.f68862f.length()) == (lastIndexOf = str.lastIndexOf(this.f68863g)) || indexOf < 0 || lastIndexOf < 0) {
            return;
        }
        String substring = str.substring(indexOf, lastIndexOf);
        if (this.f68865i) {
            L0(stringBuffer);
        }
        stringBuffer.append(substring);
        S(stringBuffer);
    }

    public void l(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        T(stringBuffer, str);
        if (dArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            J(stringBuffer, str, dArr);
        } else {
            b0(stringBuffer, str, dArr);
        }
        R(stringBuffer, str);
    }

    protected String l0() {
        return this.f68871o;
    }

    public void m(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        T(stringBuffer, str);
        if (fArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            K(stringBuffer, str, fArr);
        } else {
            c0(stringBuffer, str, fArr);
        }
        R(stringBuffer, str);
    }

    protected String m0() {
        return this.f68869m;
    }

    public void n(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        T(stringBuffer, str);
        if (iArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            L(stringBuffer, str, iArr);
        } else {
            d0(stringBuffer, str, iArr);
        }
        R(stringBuffer, str);
    }

    protected String n0() {
        return this.f68868l;
    }

    public void o(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        T(stringBuffer, str);
        if (jArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            M(stringBuffer, str, jArr);
        } else {
            e0(stringBuffer, str, jArr);
        }
        R(stringBuffer, str);
    }

    protected String o0() {
        return this.f68863g;
    }

    public void p(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        T(stringBuffer, str);
        if (objArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            N(stringBuffer, str, objArr);
        } else {
            f0(stringBuffer, str, objArr);
        }
        R(stringBuffer, str);
    }

    protected String p0() {
        return this.f68862f;
    }

    public void q(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        T(stringBuffer, str);
        if (sArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            O(stringBuffer, str, sArr);
        } else {
            g0(stringBuffer, str, sArr);
        }
        R(stringBuffer, str);
    }

    protected String q0() {
        return this.f68864h;
    }

    public void r(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        T(stringBuffer, str);
        if (zArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            P(stringBuffer, str, zArr);
        } else {
            h0(stringBuffer, str, zArr);
        }
        R(stringBuffer, str);
    }

    protected String r0() {
        return this.f68867k;
    }

    protected void s(StringBuffer stringBuffer, Object obj) {
        if (!this.f68859c || obj == null) {
            return;
        }
        K0(obj);
        if (this.f68860d) {
            stringBuffer.append(u0(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String s0() {
        return this.f68873q;
    }

    protected void t(StringBuffer stringBuffer) {
        stringBuffer.append(this.f68863g);
    }

    protected void u(StringBuffer stringBuffer) {
        stringBuffer.append(this.f68862f);
    }

    protected String u0(Class<?> cls) {
        return external.org.apache.commons.lang3.d.v(cls);
    }

    protected void v(StringBuffer stringBuffer, String str, Object obj) {
        ObjectUtils.k(stringBuffer, obj);
    }

    protected String v0() {
        return this.f68875s;
    }

    protected void w(StringBuffer stringBuffer, String str, byte b5) {
        stringBuffer.append((int) b5);
    }

    protected String w0() {
        return this.f68874r;
    }

    protected void x(StringBuffer stringBuffer, String str, char c5) {
        stringBuffer.append(c5);
    }

    protected String x0() {
        return this.f68877u;
    }

    protected void y(StringBuffer stringBuffer, String str, double d5) {
        stringBuffer.append(d5);
    }

    protected String y0() {
        return this.f68876t;
    }

    protected void z(StringBuffer stringBuffer, String str, float f5) {
        stringBuffer.append(f5);
    }

    protected boolean z0() {
        return this.f68870n;
    }
}
