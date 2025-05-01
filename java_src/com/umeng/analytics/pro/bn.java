package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: UMEnvelope.java */
/* loaded from: classes6.dex */
public class bn implements bv<bn, e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final Map<e, ch> f63466k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f63467l = 420342210744516016L;

    /* renamed from: m  reason: collision with root package name */
    private static final cz f63468m = new cz("UMEnvelope");

    /* renamed from: n  reason: collision with root package name */
    private static final cp f63469n = new cp("version", (byte) 11, 1);

    /* renamed from: o  reason: collision with root package name */
    private static final cp f63470o = new cp("address", (byte) 11, 2);

    /* renamed from: p  reason: collision with root package name */
    private static final cp f63471p = new cp("signature", (byte) 11, 3);

    /* renamed from: q  reason: collision with root package name */
    private static final cp f63472q = new cp("serial_num", (byte) 8, 4);

    /* renamed from: r  reason: collision with root package name */
    private static final cp f63473r = new cp("ts_secs", (byte) 8, 5);

    /* renamed from: s  reason: collision with root package name */
    private static final cp f63474s = new cp("length", (byte) 8, 6);

    /* renamed from: t  reason: collision with root package name */
    private static final cp f63475t = new cp("entity", (byte) 11, 7);

    /* renamed from: u  reason: collision with root package name */
    private static final cp f63476u = new cp("guid", (byte) 11, 8);

    /* renamed from: v  reason: collision with root package name */
    private static final cp f63477v = new cp("checksum", (byte) 11, 9);

    /* renamed from: w  reason: collision with root package name */
    private static final cp f63478w = new cp("codex", (byte) 8, 10);

    /* renamed from: x  reason: collision with root package name */
    private static final Map<Class<? extends dc>, dd> f63479x;

    /* renamed from: y  reason: collision with root package name */
    private static final int f63480y = 0;

    /* renamed from: z  reason: collision with root package name */
    private static final int f63481z = 1;
    private byte C;
    private e[] D;

    /* renamed from: a  reason: collision with root package name */
    public String f63482a;

    /* renamed from: b  reason: collision with root package name */
    public String f63483b;

    /* renamed from: c  reason: collision with root package name */
    public String f63484c;

    /* renamed from: d  reason: collision with root package name */
    public int f63485d;

    /* renamed from: e  reason: collision with root package name */
    public int f63486e;

    /* renamed from: f  reason: collision with root package name */
    public int f63487f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f63488g;

    /* renamed from: h  reason: collision with root package name */
    public String f63489h;

    /* renamed from: i  reason: collision with root package name */
    public String f63490i;

    /* renamed from: j  reason: collision with root package name */
    public int f63491j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UMEnvelope.java */
    /* loaded from: classes6.dex */
    public static class a extends de<bn> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, bn bnVar) throws cb {
            cuVar.j();
            while (true) {
                cp l4 = cuVar.l();
                byte b5 = l4.f63628b;
                if (b5 == 0) {
                    cuVar.k();
                    if (bnVar.m()) {
                        if (bnVar.p()) {
                            if (bnVar.s()) {
                                bnVar.G();
                                return;
                            }
                            throw new cv("Required field 'length' was not found in serialized data! Struct: " + toString());
                        }
                        throw new cv("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    throw new cv("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                }
                switch (l4.f63629c) {
                    case 1:
                        if (b5 == 11) {
                            bnVar.f63482a = cuVar.z();
                            bnVar.a(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 2:
                        if (b5 == 11) {
                            bnVar.f63483b = cuVar.z();
                            bnVar.b(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 3:
                        if (b5 == 11) {
                            bnVar.f63484c = cuVar.z();
                            bnVar.c(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 4:
                        if (b5 == 8) {
                            bnVar.f63485d = cuVar.w();
                            bnVar.d(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 5:
                        if (b5 == 8) {
                            bnVar.f63486e = cuVar.w();
                            bnVar.e(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 6:
                        if (b5 == 8) {
                            bnVar.f63487f = cuVar.w();
                            bnVar.f(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 7:
                        if (b5 == 11) {
                            bnVar.f63488g = cuVar.A();
                            bnVar.g(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 8:
                        if (b5 == 11) {
                            bnVar.f63489h = cuVar.z();
                            bnVar.h(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 9:
                        if (b5 == 11) {
                            bnVar.f63490i = cuVar.z();
                            bnVar.i(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    case 10:
                        if (b5 == 8) {
                            bnVar.f63491j = cuVar.w();
                            bnVar.j(true);
                            break;
                        } else {
                            cx.a(cuVar, b5);
                            break;
                        }
                    default:
                        cx.a(cuVar, b5);
                        break;
                }
                cuVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, bn bnVar) throws cb {
            bnVar.G();
            cuVar.a(bn.f63468m);
            if (bnVar.f63482a != null) {
                cuVar.a(bn.f63469n);
                cuVar.a(bnVar.f63482a);
                cuVar.c();
            }
            if (bnVar.f63483b != null) {
                cuVar.a(bn.f63470o);
                cuVar.a(bnVar.f63483b);
                cuVar.c();
            }
            if (bnVar.f63484c != null) {
                cuVar.a(bn.f63471p);
                cuVar.a(bnVar.f63484c);
                cuVar.c();
            }
            cuVar.a(bn.f63472q);
            cuVar.a(bnVar.f63485d);
            cuVar.c();
            cuVar.a(bn.f63473r);
            cuVar.a(bnVar.f63486e);
            cuVar.c();
            cuVar.a(bn.f63474s);
            cuVar.a(bnVar.f63487f);
            cuVar.c();
            if (bnVar.f63488g != null) {
                cuVar.a(bn.f63475t);
                cuVar.a(bnVar.f63488g);
                cuVar.c();
            }
            if (bnVar.f63489h != null) {
                cuVar.a(bn.f63476u);
                cuVar.a(bnVar.f63489h);
                cuVar.c();
            }
            if (bnVar.f63490i != null) {
                cuVar.a(bn.f63477v);
                cuVar.a(bnVar.f63490i);
                cuVar.c();
            }
            if (bnVar.F()) {
                cuVar.a(bn.f63478w);
                cuVar.a(bnVar.f63491j);
                cuVar.c();
            }
            cuVar.d();
            cuVar.b();
        }
    }

    /* compiled from: UMEnvelope.java */
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
    /* compiled from: UMEnvelope.java */
    /* loaded from: classes6.dex */
    public static class c extends df<bn> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.dc
        public void a(cu cuVar, bn bnVar) throws cb {
            da daVar = (da) cuVar;
            daVar.a(bnVar.f63482a);
            daVar.a(bnVar.f63483b);
            daVar.a(bnVar.f63484c);
            daVar.a(bnVar.f63485d);
            daVar.a(bnVar.f63486e);
            daVar.a(bnVar.f63487f);
            daVar.a(bnVar.f63488g);
            daVar.a(bnVar.f63489h);
            daVar.a(bnVar.f63490i);
            BitSet bitSet = new BitSet();
            if (bnVar.F()) {
                bitSet.set(0);
            }
            daVar.a(bitSet, 1);
            if (bnVar.F()) {
                daVar.a(bnVar.f63491j);
            }
        }

        @Override // com.umeng.analytics.pro.dc
        public void b(cu cuVar, bn bnVar) throws cb {
            da daVar = (da) cuVar;
            bnVar.f63482a = daVar.z();
            bnVar.a(true);
            bnVar.f63483b = daVar.z();
            bnVar.b(true);
            bnVar.f63484c = daVar.z();
            bnVar.c(true);
            bnVar.f63485d = daVar.w();
            bnVar.d(true);
            bnVar.f63486e = daVar.w();
            bnVar.e(true);
            bnVar.f63487f = daVar.w();
            bnVar.f(true);
            bnVar.f63488g = daVar.A();
            bnVar.g(true);
            bnVar.f63489h = daVar.z();
            bnVar.h(true);
            bnVar.f63490i = daVar.z();
            bnVar.i(true);
            if (daVar.b(1).get(0)) {
                bnVar.f63491j = daVar.w();
                bnVar.j(true);
            }
        }
    }

    /* compiled from: UMEnvelope.java */
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
        f63479x = hashMap;
        hashMap.put(de.class, new b());
        hashMap.put(df.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new ch("version", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new ch("address", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new ch("signature", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new ch("serial_num", (byte) 1, new ci((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new ch("ts_secs", (byte) 1, new ci((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new ch("length", (byte) 1, new ci((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new ch("entity", (byte) 1, new ci((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new ch("guid", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new ch("checksum", (byte) 1, new ci((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new ch("codex", (byte) 2, new ci((byte) 8)));
        Map<e, ch> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f63466k = unmodifiableMap;
        ch.a(bn.class, unmodifiableMap);
    }

    public bn() {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
    }

    public String A() {
        return this.f63490i;
    }

    public void B() {
        this.f63490i = null;
    }

    public boolean C() {
        return this.f63490i != null;
    }

    public int D() {
        return this.f63491j;
    }

    public void E() {
        this.C = bs.b(this.C, 3);
    }

    public boolean F() {
        return bs.a(this.C, 3);
    }

    public void G() throws cb {
        if (this.f63482a != null) {
            if (this.f63483b != null) {
                if (this.f63484c != null) {
                    if (this.f63488g != null) {
                        if (this.f63489h != null) {
                            if (this.f63490i != null) {
                                return;
                            }
                            throw new cv("Required field 'checksum' was not present! Struct: " + toString());
                        }
                        throw new cv("Required field 'guid' was not present! Struct: " + toString());
                    }
                    throw new cv("Required field 'entity' was not present! Struct: " + toString());
                }
                throw new cv("Required field 'signature' was not present! Struct: " + toString());
            }
            throw new cv("Required field 'address' was not present! Struct: " + toString());
        }
        throw new cv("Required field 'version' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: a */
    public bn deepCopy() {
        return new bn(this);
    }

    public String b() {
        return this.f63482a;
    }

    public void c() {
        this.f63482a = null;
    }

    @Override // com.umeng.analytics.pro.bv
    public void clear() {
        this.f63482a = null;
        this.f63483b = null;
        this.f63484c = null;
        d(false);
        this.f63485d = 0;
        e(false);
        this.f63486e = 0;
        f(false);
        this.f63487f = 0;
        this.f63488g = null;
        this.f63489h = null;
        this.f63490i = null;
        j(false);
        this.f63491j = 0;
    }

    public boolean d() {
        return this.f63482a != null;
    }

    public String e() {
        return this.f63483b;
    }

    public void f() {
        this.f63483b = null;
    }

    public boolean g() {
        return this.f63483b != null;
    }

    public String h() {
        return this.f63484c;
    }

    public void i() {
        this.f63484c = null;
    }

    public boolean j() {
        return this.f63484c != null;
    }

    public int k() {
        return this.f63485d;
    }

    public void l() {
        this.C = bs.b(this.C, 0);
    }

    public boolean m() {
        return bs.a(this.C, 0);
    }

    public int n() {
        return this.f63486e;
    }

    public void o() {
        this.C = bs.b(this.C, 1);
    }

    public boolean p() {
        return bs.a(this.C, 1);
    }

    public int q() {
        return this.f63487f;
    }

    public void r() {
        this.C = bs.b(this.C, 2);
    }

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        f63479x.get(cuVar.D()).b().b(cuVar, this);
    }

    public boolean s() {
        return bs.a(this.C, 2);
    }

    public byte[] t() {
        a(bw.c(this.f63488g));
        ByteBuffer byteBuffer = this.f63488g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f63482a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f63483b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f63484c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f63485d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f63486e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f63487f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f63488g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            bw.a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f63489h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f63490i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f63491j);
        }
        sb.append(")");
        return sb.toString();
    }

    public ByteBuffer u() {
        return this.f63488g;
    }

    public void v() {
        this.f63488g = null;
    }

    public boolean w() {
        return this.f63488g != null;
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        f63479x.get(cuVar.D()).b().a(cuVar, this);
    }

    public String x() {
        return this.f63489h;
    }

    public void y() {
        this.f63489h = null;
    }

    public boolean z() {
        return this.f63489h != null;
    }

    /* compiled from: UMEnvelope.java */
    /* loaded from: classes6.dex */
    public enum e implements cc {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");
        

        /* renamed from: k  reason: collision with root package name */
        private static final Map<String, e> f63502k = new HashMap();

        /* renamed from: l  reason: collision with root package name */
        private final short f63504l;

        /* renamed from: m  reason: collision with root package name */
        private final String f63505m;

        static {
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f63502k.put(eVar.b(), eVar);
            }
        }

        e(short s4, String str) {
            this.f63504l = s4;
            this.f63505m = str;
        }

        public static e a(int i4) {
            switch (i4) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
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
            return this.f63505m;
        }

        public static e a(String str) {
            return f63502k.get(str);
        }

        @Override // com.umeng.analytics.pro.cc
        public short a() {
            return this.f63504l;
        }
    }

    public bn a(String str) {
        this.f63482a = str;
        return this;
    }

    public bn b(String str) {
        this.f63483b = str;
        return this;
    }

    public bn c(String str) {
        this.f63484c = str;
        return this;
    }

    public void d(boolean z4) {
        this.C = bs.a(this.C, 0, z4);
    }

    public void e(boolean z4) {
        this.C = bs.a(this.C, 1, z4);
    }

    public void f(boolean z4) {
        this.C = bs.a(this.C, 2, z4);
    }

    public void g(boolean z4) {
        if (z4) {
            return;
        }
        this.f63488g = null;
    }

    public void h(boolean z4) {
        if (z4) {
            return;
        }
        this.f63489h = null;
    }

    public void i(boolean z4) {
        if (z4) {
            return;
        }
        this.f63490i = null;
    }

    public void j(boolean z4) {
        this.C = bs.a(this.C, 3, z4);
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f63482a = null;
    }

    public void b(boolean z4) {
        if (z4) {
            return;
        }
        this.f63483b = null;
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f63484c = null;
    }

    public bn d(String str) {
        this.f63489h = str;
        return this;
    }

    public bn e(String str) {
        this.f63490i = str;
        return this;
    }

    public bn(String str, String str2, String str3, int i4, int i5, int i6, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f63482a = str;
        this.f63483b = str2;
        this.f63484c = str3;
        this.f63485d = i4;
        d(true);
        this.f63486e = i5;
        e(true);
        this.f63487f = i6;
        f(true);
        this.f63488g = byteBuffer;
        this.f63489h = str4;
        this.f63490i = str5;
    }

    public bn a(int i4) {
        this.f63485d = i4;
        d(true);
        return this;
    }

    public bn b(int i4) {
        this.f63486e = i4;
        e(true);
        return this;
    }

    public bn c(int i4) {
        this.f63487f = i4;
        f(true);
        return this;
    }

    public bn d(int i4) {
        this.f63491j = i4;
        j(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.bv
    /* renamed from: e */
    public e fieldForId(int i4) {
        return e.a(i4);
    }

    public bn a(byte[] bArr) {
        a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    public bn a(ByteBuffer byteBuffer) {
        this.f63488g = byteBuffer;
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
            this.C = (byte) 0;
            read(new co(new dg(objectInputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public bn(bn bnVar) {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
        this.C = bnVar.C;
        if (bnVar.d()) {
            this.f63482a = bnVar.f63482a;
        }
        if (bnVar.g()) {
            this.f63483b = bnVar.f63483b;
        }
        if (bnVar.j()) {
            this.f63484c = bnVar.f63484c;
        }
        this.f63485d = bnVar.f63485d;
        this.f63486e = bnVar.f63486e;
        this.f63487f = bnVar.f63487f;
        if (bnVar.w()) {
            this.f63488g = bw.d(bnVar.f63488g);
        }
        if (bnVar.z()) {
            this.f63489h = bnVar.f63489h;
        }
        if (bnVar.C()) {
            this.f63490i = bnVar.f63490i;
        }
        this.f63491j = bnVar.f63491j;
    }
}
