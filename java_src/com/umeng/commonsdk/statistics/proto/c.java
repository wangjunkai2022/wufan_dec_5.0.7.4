package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.ch;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cm;
import com.umeng.analytics.pro.co;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cq;
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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: IdTracking.java */
/* loaded from: classes6.dex */
public class c implements bv<c, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, ch> f64519d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f64520e = -5764118265293965743L;

    /* renamed from: f  reason: collision with root package name */
    private static final cz f64521f = new cz("IdTracking");

    /* renamed from: g  reason: collision with root package name */
    private static final cp f64522g = new cp("snapshots", (byte) 13, 1);

    /* renamed from: h  reason: collision with root package name */
    private static final cp f64523h = new cp("journals", (byte) 15, 2);

    /* renamed from: i  reason: collision with root package name */
    private static final cp f64524i = new cp("checksum", (byte) 11, 3);

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Class<? extends dc>, dd> f64525j;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.b> f64526a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.umeng.commonsdk.statistics.proto.a> f64527b;

    /* renamed from: c  reason: collision with root package name */
    public String f64528c;

    /* renamed from: k  reason: collision with root package name */
    private e[] f64529k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdTracking.java */
    /* loaded from: classes6.dex */
    public static class a extends de<c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, c cVar) throws cb {
            cuVar.j();
            while (true) {
                cp l4 = cuVar.l();
                byte b5 = l4.f63628b;
                if (b5 == 0) {
                    cuVar.k();
                    cVar.n();
                    return;
                }
                short s4 = l4.f63629c;
                int i4 = 0;
                if (s4 != 1) {
                    if (s4 != 2) {
                        if (s4 != 3) {
                            cx.a(cuVar, b5);
                        } else if (b5 == 11) {
                            cVar.f64528c = cuVar.z();
                            cVar.c(true);
                        } else {
                            cx.a(cuVar, b5);
                        }
                    } else if (b5 == 15) {
                        cq p4 = cuVar.p();
                        cVar.f64527b = new ArrayList(p4.f63631b);
                        while (i4 < p4.f63631b) {
                            com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                            aVar.read(cuVar);
                            cVar.f64527b.add(aVar);
                            i4++;
                        }
                        cuVar.q();
                        cVar.b(true);
                    } else {
                        cx.a(cuVar, b5);
                    }
                } else if (b5 == 13) {
                    cr n4 = cuVar.n();
                    cVar.f64526a = new HashMap(n4.f63634c * 2);
                    while (i4 < n4.f63634c) {
                        String z4 = cuVar.z();
                        com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                        bVar.read(cuVar);
                        cVar.f64526a.put(z4, bVar);
                        i4++;
                    }
                    cuVar.o();
                    cVar.a(true);
                } else {
                    cx.a(cuVar, b5);
                }
                cuVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, c cVar) throws cb {
            cVar.n();
            cuVar.a(c.f64521f);
            if (cVar.f64526a != null) {
                cuVar.a(c.f64522g);
                cuVar.a(new cr((byte) 11, (byte) 12, cVar.f64526a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f64526a.entrySet()) {
                    cuVar.a(entry.getKey());
                    entry.getValue().write(cuVar);
                }
                cuVar.e();
                cuVar.c();
            }
            if (cVar.f64527b != null && cVar.j()) {
                cuVar.a(c.f64523h);
                cuVar.a(new cq((byte) 12, cVar.f64527b.size()));
                for (com.umeng.commonsdk.statistics.proto.a aVar : cVar.f64527b) {
                    aVar.write(cuVar);
                }
                cuVar.f();
                cuVar.c();
            }
            if (cVar.f64528c != null && cVar.m()) {
                cuVar.a(c.f64524i);
                cuVar.a(cVar.f64528c);
                cuVar.c();
            }
            cuVar.d();
            cuVar.b();
        }
    }

    /* compiled from: IdTracking.java */
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
    /* compiled from: IdTracking.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0678c extends df<c> {
        private C0678c() {
        }

        @Override // com.umeng.analytics.pro.dc
        public void a(cu cuVar, c cVar) throws cb {
            da daVar = (da) cuVar;
            daVar.a(cVar.f64526a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f64526a.entrySet()) {
                daVar.a(entry.getKey());
                entry.getValue().write(daVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            daVar.a(bitSet, 2);
            if (cVar.j()) {
                daVar.a(cVar.f64527b.size());
                for (com.umeng.commonsdk.statistics.proto.a aVar : cVar.f64527b) {
                    aVar.write(daVar);
                }
            }
            if (cVar.m()) {
                daVar.a(cVar.f64528c);
            }
        }

        @Override // com.umeng.analytics.pro.dc
        public void b(cu cuVar, c cVar) throws cb {
            da daVar = (da) cuVar;
            cr crVar = new cr((byte) 11, (byte) 12, daVar.w());
            cVar.f64526a = new HashMap(crVar.f63634c * 2);
            for (int i4 = 0; i4 < crVar.f63634c; i4++) {
                String z4 = daVar.z();
                com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                bVar.read(daVar);
                cVar.f64526a.put(z4, bVar);
            }
            cVar.a(true);
            BitSet b5 = daVar.b(2);
            if (b5.get(0)) {
                cq cqVar = new cq((byte) 12, daVar.w());
                cVar.f64527b = new ArrayList(cqVar.f63631b);
                for (int i5 = 0; i5 < cqVar.f63631b; i5++) {
                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                    aVar.read(daVar);
                    cVar.f64527b.add(aVar);
                }
                cVar.b(true);
            }
            if (b5.get(1)) {
                cVar.f64528c = daVar.z();
                cVar.c(true);
            }
        }
    }

    /* compiled from: IdTracking.java */
    /* loaded from: classes6.dex */
    private static class d implements dd {
        private d() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public C0678c b() {
            return new C0678c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f64525j = hashMap;
        hashMap.put(de.class, new b());
        hashMap.put(df.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new ch("snapshots", (byte) 1, new ck((byte) 13, new ci((byte) 11), new cm((byte) 12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new ch("journals", (byte) 2, new cj((byte) 15, new cm((byte) 12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new ch("checksum", (byte) 2, new ci((byte) 11)));
        Map<e, ch> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f64519d = unmodifiableMap;
        ch.a(c.class, unmodifiableMap);
    }

    public c() {
        this.f64529k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public c deepCopy() {
        return new c(this);
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f64526a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.b> c() {
        return this.f64526a;
    }

    @Override // com.umeng.analytics.pro.bv
    public void clear() {
        this.f64526a = null;
        this.f64527b = null;
        this.f64528c = null;
    }

    public void d() {
        this.f64526a = null;
    }

    public boolean e() {
        return this.f64526a != null;
    }

    public int f() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.f64527b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.f64527b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public List<com.umeng.commonsdk.statistics.proto.a> h() {
        return this.f64527b;
    }

    public void i() {
        this.f64527b = null;
    }

    public boolean j() {
        return this.f64527b != null;
    }

    public String k() {
        return this.f64528c;
    }

    public void l() {
        this.f64528c = null;
    }

    public boolean m() {
        return this.f64528c != null;
    }

    public void n() throws cb {
        if (this.f64526a != null) {
            return;
        }
        throw new cv("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        f64525j.get(cuVar.D()).b().b(cuVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f64526a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (j()) {
            sb.append(", ");
            sb.append("journals:");
            List<com.umeng.commonsdk.statistics.proto.a> list = this.f64527b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f64528c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        f64525j.get(cuVar.D()).b().a(cuVar, this);
    }

    /* compiled from: IdTracking.java */
    /* loaded from: classes6.dex */
    public enum e implements cc {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f64533d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private final short f64535e;

        /* renamed from: f  reason: collision with root package name */
        private final String f64536f;

        static {
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f64533d.put(eVar.b(), eVar);
            }
        }

        e(short s4, String str) {
            this.f64535e = s4;
            this.f64536f = str;
        }

        public static e a(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return CHECKSUM;
                }
                return JOURNALS;
            }
            return SNAPSHOTS;
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
            return this.f64536f;
        }

        public static e a(String str) {
            return f64533d.get(str);
        }

        @Override // com.umeng.analytics.pro.cc
        public short a() {
            return this.f64535e;
        }
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.b bVar) {
        if (this.f64526a == null) {
            this.f64526a = new HashMap();
        }
        this.f64526a.put(str, bVar);
    }

    public void b(boolean z4) {
        if (z4) {
            return;
        }
        this.f64527b = null;
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f64528c = null;
    }

    public c(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this();
        this.f64526a = map;
    }

    public c(c cVar) {
        this.f64529k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f64526a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.b(entry.getValue()));
            }
            this.f64526a = hashMap;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            for (com.umeng.commonsdk.statistics.proto.a aVar : cVar.f64527b) {
                arrayList.add(new com.umeng.commonsdk.statistics.proto.a(aVar));
            }
            this.f64527b = arrayList;
        }
        if (cVar.m()) {
            this.f64528c = cVar.f64528c;
        }
    }

    public c a(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this.f64526a = map;
        return this;
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f64526a = null;
    }

    public void a(com.umeng.commonsdk.statistics.proto.a aVar) {
        if (this.f64527b == null) {
            this.f64527b = new ArrayList();
        }
        this.f64527b.add(aVar);
    }

    public c a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f64527b = list;
        return this;
    }

    public c a(String str) {
        this.f64528c = str;
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

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new co(new dg(objectInputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
