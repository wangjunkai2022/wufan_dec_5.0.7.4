package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.ch;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.co;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cu;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import com.umeng.analytics.pro.dc;
import com.umeng.analytics.pro.dd;
import com.umeng.analytics.pro.de;
import com.umeng.analytics.pro.df;
import com.umeng.analytics.pro.dg;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ImprintValue.java */
/* loaded from: classes6.dex */
public class e implements bv<e, EnumC0680e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<EnumC0680e, ch> f64556d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f64557e = 7501688097813630241L;

    /* renamed from: f  reason: collision with root package name */
    private static final cz f64558f = new cz("ImprintValue");

    /* renamed from: g  reason: collision with root package name */
    private static final cp f64559g = new cp("value", (byte) 11, 1);

    /* renamed from: h  reason: collision with root package name */
    private static final cp f64560h = new cp("ts", (byte) 10, 2);

    /* renamed from: i  reason: collision with root package name */
    private static final cp f64561i = new cp("guid", (byte) 11, 3);

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Class<? extends dc>, dd> f64562j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f64563k = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f64564a;

    /* renamed from: b  reason: collision with root package name */
    public long f64565b;

    /* renamed from: c  reason: collision with root package name */
    public String f64566c;

    /* renamed from: l  reason: collision with root package name */
    private byte f64567l;

    /* renamed from: m  reason: collision with root package name */
    private EnumC0680e[] f64568m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImprintValue.java */
    /* loaded from: classes6.dex */
    public static class a extends de<e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, e eVar) throws cb {
            cuVar.j();
            while (true) {
                cp l4 = cuVar.l();
                byte b5 = l4.f63628b;
                if (b5 == 0) {
                    cuVar.k();
                    eVar.k();
                    return;
                }
                short s4 = l4.f63629c;
                if (s4 != 1) {
                    if (s4 != 2) {
                        if (s4 != 3) {
                            cx.a(cuVar, b5);
                        } else if (b5 == 11) {
                            eVar.f64566c = cuVar.z();
                            eVar.c(true);
                        } else {
                            cx.a(cuVar, b5);
                        }
                    } else if (b5 == 10) {
                        eVar.f64565b = cuVar.x();
                        eVar.b(true);
                    } else {
                        cx.a(cuVar, b5);
                    }
                } else if (b5 == 11) {
                    eVar.f64564a = cuVar.z();
                    eVar.a(true);
                } else {
                    cx.a(cuVar, b5);
                }
                cuVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, e eVar) throws cb {
            eVar.k();
            cuVar.a(e.f64558f);
            if (eVar.f64564a != null && eVar.d()) {
                cuVar.a(e.f64559g);
                cuVar.a(eVar.f64564a);
                cuVar.c();
            }
            if (eVar.g()) {
                cuVar.a(e.f64560h);
                cuVar.a(eVar.f64565b);
                cuVar.c();
            }
            if (eVar.f64566c != null && eVar.j()) {
                cuVar.a(e.f64561i);
                cuVar.a(eVar.f64566c);
                cuVar.c();
            }
            cuVar.d();
            cuVar.b();
        }
    }

    /* compiled from: ImprintValue.java */
    /* loaded from: classes6.dex */
    private static class b implements dd {
        private b() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImprintValue.java */
    /* loaded from: classes6.dex */
    public static class c extends df<e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.dc
        public void a(cu cuVar, e eVar) throws cb {
            da daVar = (da) cuVar;
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            if (eVar.g()) {
                bitSet.set(1);
            }
            if (eVar.j()) {
                bitSet.set(2);
            }
            daVar.a(bitSet, 3);
            if (eVar.d()) {
                daVar.a(eVar.f64564a);
            }
            if (eVar.g()) {
                daVar.a(eVar.f64565b);
            }
            if (eVar.j()) {
                daVar.a(eVar.f64566c);
            }
        }

        @Override // com.umeng.analytics.pro.dc
        public void b(cu cuVar, e eVar) throws cb {
            da daVar = (da) cuVar;
            BitSet b5 = daVar.b(3);
            if (b5.get(0)) {
                eVar.f64564a = daVar.z();
                eVar.a(true);
            }
            if (b5.get(1)) {
                eVar.f64565b = daVar.x();
                eVar.b(true);
            }
            if (b5.get(2)) {
                eVar.f64566c = daVar.z();
                eVar.c(true);
            }
        }
    }

    /* compiled from: ImprintValue.java */
    /* loaded from: classes6.dex */
    private static class d implements dd {
        private d() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f64562j = hashMap;
        hashMap.put(de.class, new b());
        hashMap.put(df.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0680e.class);
        enumMap.put((EnumMap) EnumC0680e.VALUE, (EnumC0680e) new ch("value", (byte) 2, new ci((byte) 11)));
        enumMap.put((EnumMap) EnumC0680e.TS, (EnumC0680e) new ch("ts", (byte) 2, new ci((byte) 10)));
        enumMap.put((EnumMap) EnumC0680e.GUID, (EnumC0680e) new ch("guid", (byte) 2, new ci((byte) 11)));
        Map<EnumC0680e, ch> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f64556d = unmodifiableMap;
        ch.a(e.class, unmodifiableMap);
    }

    public e() {
        this.f64567l = (byte) 0;
        this.f64568m = new EnumC0680e[]{EnumC0680e.VALUE, EnumC0680e.TS, EnumC0680e.GUID};
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public e deepCopy() {
        return new e(this);
    }

    public String b() {
        return this.f64564a;
    }

    public void c() {
        this.f64564a = null;
    }

    @Override // com.umeng.analytics.pro.bv
    public void clear() {
        this.f64564a = null;
        b(false);
        this.f64565b = 0L;
        this.f64566c = null;
    }

    public boolean d() {
        return this.f64564a != null;
    }

    public long e() {
        return this.f64565b;
    }

    public void f() {
        this.f64567l = bs.b(this.f64567l, 0);
    }

    public boolean g() {
        return bs.a(this.f64567l, 0);
    }

    public String h() {
        return this.f64566c;
    }

    public void i() {
        this.f64566c = null;
    }

    public boolean j() {
        return this.f64566c != null;
    }

    public void k() throws cb {
    }

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        f64562j.get(cuVar.D()).b().b(cuVar, this);
    }

    public String toString() {
        boolean z4;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (d()) {
            sb.append("value:");
            String str = this.f64564a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f64565b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f64566c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        f64562j.get(cuVar.D()).b().a(cuVar, this);
    }

    /* compiled from: ImprintValue.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public enum EnumC0680e implements cc {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, EnumC0680e> f64572d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private final short f64574e;

        /* renamed from: f  reason: collision with root package name */
        private final String f64575f;

        static {
            Iterator it2 = EnumSet.allOf(EnumC0680e.class).iterator();
            while (it2.hasNext()) {
                EnumC0680e enumC0680e = (EnumC0680e) it2.next();
                f64572d.put(enumC0680e.b(), enumC0680e);
            }
        }

        EnumC0680e(short s4, String str) {
            this.f64574e = s4;
            this.f64575f = str;
        }

        public static EnumC0680e a(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return GUID;
                }
                return TS;
            }
            return VALUE;
        }

        public static EnumC0680e b(int i4) {
            EnumC0680e a5 = a(i4);
            if (a5 != null) {
                return a5;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.cc
        public String b() {
            return this.f64575f;
        }

        public static EnumC0680e a(String str) {
            return f64572d.get(str);
        }

        @Override // com.umeng.analytics.pro.cc
        public short a() {
            return this.f64574e;
        }
    }

    public e a(String str) {
        this.f64564a = str;
        return this;
    }

    public void b(boolean z4) {
        this.f64567l = bs.a(this.f64567l, 0, z4);
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f64566c = null;
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f64564a = null;
    }

    public e b(String str) {
        this.f64566c = str;
        return this;
    }

    public e(long j4, String str) {
        this();
        this.f64565b = j4;
        b(true);
        this.f64566c = str;
    }

    public e a(long j4) {
        this.f64565b = j4;
        b(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public EnumC0680e fieldForId(int i4) {
        return EnumC0680e.a(i4);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new co(new dg(objectOutputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public e(e eVar) {
        this.f64567l = (byte) 0;
        this.f64568m = new EnumC0680e[]{EnumC0680e.VALUE, EnumC0680e.TS, EnumC0680e.GUID};
        this.f64567l = eVar.f64567l;
        if (eVar.d()) {
            this.f64564a = eVar.f64564a;
        }
        this.f64565b = eVar.f64565b;
        if (eVar.j()) {
            this.f64566c = eVar.f64566c;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f64567l = (byte) 0;
            read(new co(new dg(objectInputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
