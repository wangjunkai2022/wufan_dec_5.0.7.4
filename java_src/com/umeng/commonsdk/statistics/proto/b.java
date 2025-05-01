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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: IdSnapshot.java */
/* loaded from: classes6.dex */
public class b implements bv<b, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, ch> f64499d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f64500e = -6496538196005191531L;

    /* renamed from: f  reason: collision with root package name */
    private static final cz f64501f = new cz("IdSnapshot");

    /* renamed from: g  reason: collision with root package name */
    private static final cp f64502g = new cp("identity", (byte) 11, 1);

    /* renamed from: h  reason: collision with root package name */
    private static final cp f64503h = new cp("ts", (byte) 10, 2);

    /* renamed from: i  reason: collision with root package name */
    private static final cp f64504i = new cp("version", (byte) 8, 3);

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Class<? extends dc>, dd> f64505j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f64506k = 0;

    /* renamed from: l  reason: collision with root package name */
    private static final int f64507l = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f64508a;

    /* renamed from: b  reason: collision with root package name */
    public long f64509b;

    /* renamed from: c  reason: collision with root package name */
    public int f64510c;

    /* renamed from: m  reason: collision with root package name */
    private byte f64511m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdSnapshot.java */
    /* loaded from: classes6.dex */
    public static class a extends de<b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, b bVar) throws cb {
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
                            cx.a(cuVar, b5);
                        } else if (b5 == 8) {
                            bVar.f64510c = cuVar.w();
                            bVar.c(true);
                        } else {
                            cx.a(cuVar, b5);
                        }
                    } else if (b5 == 10) {
                        bVar.f64509b = cuVar.x();
                        bVar.b(true);
                    } else {
                        cx.a(cuVar, b5);
                    }
                } else if (b5 == 11) {
                    bVar.f64508a = cuVar.z();
                    bVar.a(true);
                } else {
                    cx.a(cuVar, b5);
                }
                cuVar.m();
            }
            cuVar.k();
            if (bVar.g()) {
                if (bVar.j()) {
                    bVar.k();
                    return;
                }
                throw new cv("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            throw new cv("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, b bVar) throws cb {
            bVar.k();
            cuVar.a(b.f64501f);
            if (bVar.f64508a != null) {
                cuVar.a(b.f64502g);
                cuVar.a(bVar.f64508a);
                cuVar.c();
            }
            cuVar.a(b.f64503h);
            cuVar.a(bVar.f64509b);
            cuVar.c();
            cuVar.a(b.f64504i);
            cuVar.a(bVar.f64510c);
            cuVar.c();
            cuVar.d();
            cuVar.b();
        }
    }

    /* compiled from: IdSnapshot.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private static class C0677b implements dd {
        private C0677b() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdSnapshot.java */
    /* loaded from: classes6.dex */
    public static class c extends df<b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.dc
        public void a(cu cuVar, b bVar) throws cb {
            da daVar = (da) cuVar;
            daVar.a(bVar.f64508a);
            daVar.a(bVar.f64509b);
            daVar.a(bVar.f64510c);
        }

        @Override // com.umeng.analytics.pro.dc
        public void b(cu cuVar, b bVar) throws cb {
            da daVar = (da) cuVar;
            bVar.f64508a = daVar.z();
            bVar.a(true);
            bVar.f64509b = daVar.x();
            bVar.b(true);
            bVar.f64510c = daVar.w();
            bVar.c(true);
        }
    }

    /* compiled from: IdSnapshot.java */
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
        f64505j = hashMap;
        hashMap.put(de.class, new C0677b());
        hashMap.put(df.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new ch("identity", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new ch("ts", (byte) 1, new ci((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new ch("version", (byte) 1, new ci((byte) 8)));
        Map<e, ch> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f64499d = unmodifiableMap;
        ch.a(b.class, unmodifiableMap);
    }

    public b() {
        this.f64511m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public b deepCopy() {
        return new b(this);
    }

    public String b() {
        return this.f64508a;
    }

    public void c() {
        this.f64508a = null;
    }

    @Override // com.umeng.analytics.pro.bv
    public void clear() {
        this.f64508a = null;
        b(false);
        this.f64509b = 0L;
        c(false);
        this.f64510c = 0;
    }

    public boolean d() {
        return this.f64508a != null;
    }

    public long e() {
        return this.f64509b;
    }

    public void f() {
        this.f64511m = bs.b(this.f64511m, 0);
    }

    public boolean g() {
        return bs.a(this.f64511m, 0);
    }

    public int h() {
        return this.f64510c;
    }

    public void i() {
        this.f64511m = bs.b(this.f64511m, 1);
    }

    public boolean j() {
        return bs.a(this.f64511m, 1);
    }

    public void k() throws cb {
        if (this.f64508a != null) {
            return;
        }
        throw new cv("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        f64505j.get(cuVar.D()).b().b(cuVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f64508a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f64509b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f64510c);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        f64505j.get(cuVar.D()).b().a(cuVar, this);
    }

    /* compiled from: IdSnapshot.java */
    /* loaded from: classes6.dex */
    public enum e implements cc {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f64515d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private final short f64517e;

        /* renamed from: f  reason: collision with root package name */
        private final String f64518f;

        static {
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f64515d.put(eVar.b(), eVar);
            }
        }

        e(short s4, String str) {
            this.f64517e = s4;
            this.f64518f = str;
        }

        public static e a(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return VERSION;
                }
                return TS;
            }
            return IDENTITY;
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
            return this.f64518f;
        }

        public static e a(String str) {
            return f64515d.get(str);
        }

        @Override // com.umeng.analytics.pro.cc
        public short a() {
            return this.f64517e;
        }
    }

    public b a(String str) {
        this.f64508a = str;
        return this;
    }

    public void b(boolean z4) {
        this.f64511m = bs.a(this.f64511m, 0, z4);
    }

    public void c(boolean z4) {
        this.f64511m = bs.a(this.f64511m, 1, z4);
    }

    public b(String str, long j4, int i4) {
        this();
        this.f64508a = str;
        this.f64509b = j4;
        b(true);
        this.f64510c = i4;
        c(true);
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f64508a = null;
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: b */
    public e fieldForId(int i4) {
        return e.a(i4);
    }

    public b a(long j4) {
        this.f64509b = j4;
        b(true);
        return this;
    }

    public b a(int i4) {
        this.f64510c = i4;
        c(true);
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new co(new dg(objectOutputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public b(b bVar) {
        this.f64511m = (byte) 0;
        this.f64511m = bVar.f64511m;
        if (bVar.d()) {
            this.f64508a = bVar.f64508a;
        }
        this.f64509b = bVar.f64509b;
        this.f64510c = bVar.f64510c;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f64511m = (byte) 0;
            read(new co(new dg(objectInputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
