package com.umeng.analytics.pro;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cf;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: TUnion.java */
/* loaded from: classes6.dex */
public abstract class cf<T extends cf<?, ?>, F extends cc> implements bv<T, F> {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends dc>, dd> f63562c;

    /* renamed from: a  reason: collision with root package name */
    protected Object f63563a;

    /* renamed from: b  reason: collision with root package name */
    protected F f63564b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TUnion.java */
    /* loaded from: classes6.dex */
    public static class a extends de<cf> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, cf cfVar) throws cb {
            cfVar.f63564b = null;
            cfVar.f63563a = null;
            cuVar.j();
            cp l4 = cuVar.l();
            Object a5 = cfVar.a(cuVar, l4);
            cfVar.f63563a = a5;
            if (a5 != null) {
                cfVar.f63564b = (F) cfVar.a(l4.f63629c);
            }
            cuVar.m();
            cuVar.l();
            cuVar.k();
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, cf cfVar) throws cb {
            if (cfVar.a() != null && cfVar.b() != null) {
                cuVar.a(cfVar.d());
                cuVar.a(cfVar.c(cfVar.f63564b));
                cfVar.a(cuVar);
                cuVar.c();
                cuVar.d();
                cuVar.b();
                return;
            }
            throw new cv("Cannot write a TUnion with no set value!");
        }
    }

    /* compiled from: TUnion.java */
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
    /* compiled from: TUnion.java */
    /* loaded from: classes6.dex */
    public static class c extends df<cf> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, cf cfVar) throws cb {
            cfVar.f63564b = null;
            cfVar.f63563a = null;
            short v2 = cuVar.v();
            Object a5 = cfVar.a(cuVar, v2);
            cfVar.f63563a = a5;
            if (a5 != null) {
                cfVar.f63564b = (F) cfVar.a(v2);
            }
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, cf cfVar) throws cb {
            if (cfVar.a() != null && cfVar.b() != null) {
                cuVar.a(cfVar.f63564b.a());
                cfVar.b(cuVar);
                return;
            }
            throw new cv("Cannot write a TUnion with no set value!");
        }
    }

    /* compiled from: TUnion.java */
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
        f63562c = hashMap;
        hashMap.put(de.class, new b());
        hashMap.put(df.class, new d());
    }

    protected cf() {
        this.f63564b = null;
        this.f63563a = null;
    }

    private static Object a(Object obj) {
        if (obj instanceof bv) {
            return ((bv) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return bw.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    protected abstract F a(short s4);

    protected abstract Object a(cu cuVar, cp cpVar) throws cb;

    protected abstract Object a(cu cuVar, short s4) throws cb;

    protected abstract void a(cu cuVar) throws cb;

    public Object b() {
        return this.f63563a;
    }

    protected abstract void b(F f5, Object obj) throws ClassCastException;

    protected abstract void b(cu cuVar) throws cb;

    protected abstract cp c(F f5);

    public boolean c() {
        return this.f63564b != null;
    }

    @Override // com.umeng.analytics.pro.bv
    public final void clear() {
        this.f63564b = null;
        this.f63563a = null;
    }

    protected abstract cz d();

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        f63562c.get(cuVar.D()).b().b(cuVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SimpleComparison.LESS_THAN_OPERATION);
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (a() != null) {
            Object b5 = b();
            sb.append(c(a()).f63627a);
            sb.append(":");
            if (b5 instanceof ByteBuffer) {
                bw.a((ByteBuffer) b5, sb);
            } else {
                sb.append(b5.toString());
            }
        }
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        f63562c.get(cuVar.D()).b().a(cuVar, this);
    }

    public boolean b(F f5) {
        return this.f63564b == f5;
    }

    public boolean b(int i4) {
        return b((cf<T, F>) a((short) i4));
    }

    protected cf(F f5, Object obj) {
        a((cf<T, F>) f5, obj);
    }

    protected cf(cf<T, F> cfVar) {
        if (cfVar.getClass().equals(getClass())) {
            this.f63564b = cfVar.f63564b;
            this.f63563a = a(cfVar.f63563a);
            return;
        }
        throw new ClassCastException();
    }

    private static Map a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(a(entry.getKey()), a(entry.getValue()));
        }
        return hashMap;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            hashSet.add(a(obj));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            arrayList.add(a(obj));
        }
        return arrayList;
    }

    public F a() {
        return this.f63564b;
    }

    public Object a(F f5) {
        if (f5 == this.f63564b) {
            return b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f5 + " because union's set field is " + this.f63564b);
    }

    public Object a(int i4) {
        return a((cf<T, F>) a((short) i4));
    }

    public void a(F f5, Object obj) {
        b(f5, obj);
        this.f63564b = f5;
        this.f63563a = obj;
    }

    public void a(int i4, Object obj) {
        a((cf<T, F>) a((short) i4), obj);
    }
}
