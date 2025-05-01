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
import com.umeng.analytics.pro.cv;
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
/* compiled from: IdJournal.java */
/* loaded from: classes6.dex */
public class a implements bv<a, e>, Serializable, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<e, ch> f64476e;

    /* renamed from: f  reason: collision with root package name */
    private static final long f64477f = 9132678615281394583L;

    /* renamed from: g  reason: collision with root package name */
    private static final cz f64478g = new cz("IdJournal");

    /* renamed from: h  reason: collision with root package name */
    private static final cp f64479h = new cp("domain", (byte) 11, 1);

    /* renamed from: i  reason: collision with root package name */
    private static final cp f64480i = new cp("old_id", (byte) 11, 2);

    /* renamed from: j  reason: collision with root package name */
    private static final cp f64481j = new cp("new_id", (byte) 11, 3);

    /* renamed from: k  reason: collision with root package name */
    private static final cp f64482k = new cp("ts", (byte) 10, 4);

    /* renamed from: l  reason: collision with root package name */
    private static final Map<Class<? extends dc>, dd> f64483l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f64484m = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f64485a;

    /* renamed from: b  reason: collision with root package name */
    public String f64486b;

    /* renamed from: c  reason: collision with root package name */
    public String f64487c;

    /* renamed from: d  reason: collision with root package name */
    public long f64488d;

    /* renamed from: n  reason: collision with root package name */
    private byte f64489n;

    /* renamed from: o  reason: collision with root package name */
    private e[] f64490o;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdJournal.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0676a extends de<a> {
        private C0676a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, a aVar) throws cb {
            cuVar.j();
            while (true) {
                cp l4 = cuVar.l();
                byte b5 = l4.f63628b;
                if (b5 == 0) {
                    break;
                }
                short s4 = l4.f63629c;
                if (s4 != 1) {
                    if (s4 != 2) {
                        if (s4 != 3) {
                            if (s4 != 4) {
                                cx.a(cuVar, b5);
                            } else if (b5 == 10) {
                                aVar.f64488d = cuVar.x();
                                aVar.d(true);
                            } else {
                                cx.a(cuVar, b5);
                            }
                        } else if (b5 == 11) {
                            aVar.f64487c = cuVar.z();
                            aVar.c(true);
                        } else {
                            cx.a(cuVar, b5);
                        }
                    } else if (b5 == 11) {
                        aVar.f64486b = cuVar.z();
                        aVar.b(true);
                    } else {
                        cx.a(cuVar, b5);
                    }
                } else if (b5 == 11) {
                    aVar.f64485a = cuVar.z();
                    aVar.a(true);
                } else {
                    cx.a(cuVar, b5);
                }
                cuVar.m();
            }
            cuVar.k();
            if (aVar.m()) {
                aVar.n();
                return;
            }
            throw new cv("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, a aVar) throws cb {
            aVar.n();
            cuVar.a(a.f64478g);
            if (aVar.f64485a != null) {
                cuVar.a(a.f64479h);
                cuVar.a(aVar.f64485a);
                cuVar.c();
            }
            if (aVar.f64486b != null && aVar.g()) {
                cuVar.a(a.f64480i);
                cuVar.a(aVar.f64486b);
                cuVar.c();
            }
            if (aVar.f64487c != null) {
                cuVar.a(a.f64481j);
                cuVar.a(aVar.f64487c);
                cuVar.c();
            }
            cuVar.a(a.f64482k);
            cuVar.a(aVar.f64488d);
            cuVar.c();
            cuVar.d();
            cuVar.b();
        }
    }

    /* compiled from: IdJournal.java */
    /* loaded from: classes6.dex */
    private static class b implements dd {
        private b() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public C0676a b() {
            return new C0676a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdJournal.java */
    /* loaded from: classes6.dex */
    public static class c extends df<a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.dc
        public void a(cu cuVar, a aVar) throws cb {
            da daVar = (da) cuVar;
            daVar.a(aVar.f64485a);
            daVar.a(aVar.f64487c);
            daVar.a(aVar.f64488d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            daVar.a(bitSet, 1);
            if (aVar.g()) {
                daVar.a(aVar.f64486b);
            }
        }

        @Override // com.umeng.analytics.pro.dc
        public void b(cu cuVar, a aVar) throws cb {
            da daVar = (da) cuVar;
            aVar.f64485a = daVar.z();
            aVar.a(true);
            aVar.f64487c = daVar.z();
            aVar.c(true);
            aVar.f64488d = daVar.x();
            aVar.d(true);
            if (daVar.b(1).get(0)) {
                aVar.f64486b = daVar.z();
                aVar.b(true);
            }
        }
    }

    /* compiled from: IdJournal.java */
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
        f64483l = hashMap;
        hashMap.put(de.class, new b());
        hashMap.put(df.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new ch("domain", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new ch("old_id", (byte) 2, new ci((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new ch("new_id", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new ch("ts", (byte) 1, new ci((byte) 10)));
        Map<e, ch> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f64476e = unmodifiableMap;
        ch.a(a.class, unmodifiableMap);
    }

    public a() {
        this.f64489n = (byte) 0;
        this.f64490o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public a deepCopy() {
        return new a(this);
    }

    public String b() {
        return this.f64485a;
    }

    public void c() {
        this.f64485a = null;
    }

    @Override // com.umeng.analytics.pro.bv
    public void clear() {
        this.f64485a = null;
        this.f64486b = null;
        this.f64487c = null;
        d(false);
        this.f64488d = 0L;
    }

    public boolean d() {
        return this.f64485a != null;
    }

    public String e() {
        return this.f64486b;
    }

    public void f() {
        this.f64486b = null;
    }

    public boolean g() {
        return this.f64486b != null;
    }

    public String h() {
        return this.f64487c;
    }

    public void i() {
        this.f64487c = null;
    }

    public boolean j() {
        return this.f64487c != null;
    }

    public long k() {
        return this.f64488d;
    }

    public void l() {
        this.f64489n = bs.b(this.f64489n, 0);
    }

    public boolean m() {
        return bs.a(this.f64489n, 0);
    }

    public void n() throws cb {
        if (this.f64485a != null) {
            if (this.f64487c != null) {
                return;
            }
            throw new cv("Required field 'new_id' was not present! Struct: " + toString());
        }
        throw new cv("Required field 'domain' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        f64483l.get(cuVar.D()).b().b(cuVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f64485a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f64486b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f64487c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f64488d);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        f64483l.get(cuVar.D()).b().a(cuVar, this);
    }

    /* compiled from: IdJournal.java */
    /* loaded from: classes6.dex */
    public enum e implements cc {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");
        

        /* renamed from: e  reason: collision with root package name */
        private static final Map<String, e> f64495e = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        private final short f64497f;

        /* renamed from: g  reason: collision with root package name */
        private final String f64498g;

        static {
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f64495e.put(eVar.b(), eVar);
            }
        }

        e(short s4, String str) {
            this.f64497f = s4;
            this.f64498g = str;
        }

        public static e a(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return null;
                        }
                        return TS;
                    }
                    return NEW_ID;
                }
                return OLD_ID;
            }
            return DOMAIN;
        }

        public static e b(int i4) {
            e a5 = a(i4);
            if (a5 != null) {
                return a5;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.cc
        public String b() {
            return this.f64498g;
        }

        public static e a(String str) {
            return f64495e.get(str);
        }

        @Override // com.umeng.analytics.pro.cc
        public short a() {
            return this.f64497f;
        }
    }

    public a a(String str) {
        this.f64485a = str;
        return this;
    }

    public a b(String str) {
        this.f64486b = str;
        return this;
    }

    public a c(String str) {
        this.f64487c = str;
        return this;
    }

    public void d(boolean z4) {
        this.f64489n = bs.a(this.f64489n, 0, z4);
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f64485a = null;
    }

    public void b(boolean z4) {
        if (z4) {
            return;
        }
        this.f64486b = null;
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f64487c = null;
    }

    public a(String str, String str2, long j4) {
        this();
        this.f64485a = str;
        this.f64487c = str2;
        this.f64488d = j4;
        d(true);
    }

    public a a(long j4) {
        this.f64488d = j4;
        d(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public e fieldForId(int i4) {
        return e.a(i4);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new co(new dg(objectOutputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public a(a aVar) {
        this.f64489n = (byte) 0;
        this.f64490o = new e[]{e.OLD_ID};
        this.f64489n = aVar.f64489n;
        if (aVar.d()) {
            this.f64485a = aVar.f64485a;
        }
        if (aVar.g()) {
            this.f64486b = aVar.f64486b;
        }
        if (aVar.j()) {
            this.f64487c = aVar.f64487c;
        }
        this.f64488d = aVar.f64488d;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f64489n = (byte) 0;
            read(new co(new dg(objectInputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
