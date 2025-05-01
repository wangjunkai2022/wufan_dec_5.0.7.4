package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.ch;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cm;
import com.umeng.analytics.pro.co;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cr;
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
/* compiled from: Imprint.java */
/* loaded from: classes6.dex */
public class d implements bv<d, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, ch> f64537d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f64538e = 2846460275012375038L;

    /* renamed from: f  reason: collision with root package name */
    private static final cz f64539f = new cz("Imprint");

    /* renamed from: g  reason: collision with root package name */
    private static final cp f64540g = new cp("property", (byte) 13, 1);

    /* renamed from: h  reason: collision with root package name */
    private static final cp f64541h = new cp("version", (byte) 8, 2);

    /* renamed from: i  reason: collision with root package name */
    private static final cp f64542i = new cp("checksum", (byte) 11, 3);

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Class<? extends dc>, dd> f64543j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f64544k = 0;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.e> f64545a;

    /* renamed from: b  reason: collision with root package name */
    public int f64546b;

    /* renamed from: c  reason: collision with root package name */
    public String f64547c;

    /* renamed from: l  reason: collision with root package name */
    private byte f64548l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Imprint.java */
    /* loaded from: classes6.dex */
    public static class a extends de<d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, d dVar) throws cb {
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
                        } else if (b5 == 11) {
                            dVar.f64547c = cuVar.z();
                            dVar.c(true);
                        } else {
                            cx.a(cuVar, b5);
                        }
                    } else if (b5 == 8) {
                        dVar.f64546b = cuVar.w();
                        dVar.b(true);
                    } else {
                        cx.a(cuVar, b5);
                    }
                } else if (b5 == 13) {
                    cr n4 = cuVar.n();
                    dVar.f64545a = new HashMap(n4.f63634c * 2);
                    for (int i4 = 0; i4 < n4.f63634c; i4++) {
                        String z4 = cuVar.z();
                        com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                        eVar.read(cuVar);
                        dVar.f64545a.put(z4, eVar);
                    }
                    cuVar.o();
                    dVar.a(true);
                } else {
                    cx.a(cuVar, b5);
                }
                cuVar.m();
            }
            cuVar.k();
            if (dVar.h()) {
                dVar.l();
                return;
            }
            throw new cv("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, d dVar) throws cb {
            dVar.l();
            cuVar.a(d.f64539f);
            if (dVar.f64545a != null) {
                cuVar.a(d.f64540g);
                cuVar.a(new cr((byte) 11, (byte) 12, dVar.f64545a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f64545a.entrySet()) {
                    cuVar.a(entry.getKey());
                    entry.getValue().write(cuVar);
                }
                cuVar.e();
                cuVar.c();
            }
            cuVar.a(d.f64541h);
            cuVar.a(dVar.f64546b);
            cuVar.c();
            if (dVar.f64547c != null) {
                cuVar.a(d.f64542i);
                cuVar.a(dVar.f64547c);
                cuVar.c();
            }
            cuVar.d();
            cuVar.b();
        }
    }

    /* compiled from: Imprint.java */
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
    /* compiled from: Imprint.java */
    /* loaded from: classes6.dex */
    public static class c extends df<d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.dc
        public void a(cu cuVar, d dVar) throws cb {
            da daVar = (da) cuVar;
            daVar.a(dVar.f64545a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f64545a.entrySet()) {
                daVar.a(entry.getKey());
                entry.getValue().write(daVar);
            }
            daVar.a(dVar.f64546b);
            daVar.a(dVar.f64547c);
        }

        @Override // com.umeng.analytics.pro.dc
        public void b(cu cuVar, d dVar) throws cb {
            da daVar = (da) cuVar;
            cr crVar = new cr((byte) 11, (byte) 12, daVar.w());
            dVar.f64545a = new HashMap(crVar.f63634c * 2);
            for (int i4 = 0; i4 < crVar.f63634c; i4++) {
                String z4 = daVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(daVar);
                dVar.f64545a.put(z4, eVar);
            }
            dVar.a(true);
            dVar.f64546b = daVar.w();
            dVar.b(true);
            dVar.f64547c = daVar.z();
            dVar.c(true);
        }
    }

    /* compiled from: Imprint.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private static class C0679d implements dd {
        private C0679d() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f64543j = hashMap;
        hashMap.put(de.class, new b());
        hashMap.put(df.class, new C0679d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new ch("property", (byte) 1, new ck((byte) 13, new ci((byte) 11), new cm((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new ch("version", (byte) 1, new ci((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new ch("checksum", (byte) 1, new ci((byte) 11)));
        Map<e, ch> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f64537d = unmodifiableMap;
        ch.a(d.class, unmodifiableMap);
    }

    public d() {
        this.f64548l = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public d deepCopy() {
        return new d(this);
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f64545a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.f64545a;
    }

    @Override // com.umeng.analytics.pro.bv
    public void clear() {
        this.f64545a = null;
        b(false);
        this.f64546b = 0;
        this.f64547c = null;
    }

    public void d() {
        this.f64545a = null;
    }

    public boolean e() {
        return this.f64545a != null;
    }

    public int f() {
        return this.f64546b;
    }

    public void g() {
        this.f64548l = bs.b(this.f64548l, 0);
    }

    public boolean h() {
        return bs.a(this.f64548l, 0);
    }

    public String i() {
        return this.f64547c;
    }

    public void j() {
        this.f64547c = null;
    }

    public boolean k() {
        return this.f64547c != null;
    }

    public void l() throws cb {
        if (this.f64545a != null) {
            if (this.f64547c != null) {
                return;
            }
            throw new cv("Required field 'checksum' was not present! Struct: " + toString());
        }
        throw new cv("Required field 'property' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        f64543j.get(cuVar.D()).b().b(cuVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f64545a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f64546b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f64547c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        f64543j.get(cuVar.D()).b().a(cuVar, this);
    }

    /* compiled from: Imprint.java */
    /* loaded from: classes6.dex */
    public enum e implements cc {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f64552d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private final short f64554e;

        /* renamed from: f  reason: collision with root package name */
        private final String f64555f;

        static {
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f64552d.put(eVar.b(), eVar);
            }
        }

        e(short s4, String str) {
            this.f64554e = s4;
            this.f64555f = str;
        }

        public static e a(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return CHECKSUM;
                }
                return VERSION;
            }
            return PROPERTY;
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
            return this.f64555f;
        }

        public static e a(String str) {
            return f64552d.get(str);
        }

        @Override // com.umeng.analytics.pro.cc
        public short a() {
            return this.f64554e;
        }
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.f64545a == null) {
            this.f64545a = new HashMap();
        }
        this.f64545a.put(str, eVar);
    }

    public void b(boolean z4) {
        this.f64548l = bs.a(this.f64548l, 0, z4);
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f64547c = null;
    }

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int i4, String str) {
        this();
        this.f64545a = map;
        this.f64546b = i4;
        b(true);
        this.f64547c = str;
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: b */
    public e fieldForId(int i4) {
        return e.a(i4);
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
        this.f64545a = map;
        return this;
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f64545a = null;
    }

    public d a(int i4) {
        this.f64546b = i4;
        b(true);
        return this;
    }

    public d(d dVar) {
        this.f64548l = (byte) 0;
        this.f64548l = dVar.f64548l;
        if (dVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f64545a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.e(entry.getValue()));
            }
            this.f64545a = hashMap;
        }
        this.f64546b = dVar.f64546b;
        if (dVar.k()) {
            this.f64547c = dVar.f64547c;
        }
    }

    public d a(String str) {
        this.f64547c = str;
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new co(new dg(objectOutputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f64548l = (byte) 0;
            read(new co(new dg(objectInputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
