package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.client.AMConst;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
/* loaded from: classes2.dex */
public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final SortedSet<a<T>> f3048a = Collections.synchronizedSortedSet(new TreeSet());

    /* loaded from: classes2.dex */
    public static class a<T> implements Comparable<a> {

        /* renamed from: b  reason: collision with root package name */
        public T f3049b;

        /* renamed from: c  reason: collision with root package name */
        public int f3050c;

        /* renamed from: e  reason: collision with root package name */
        private long f3052e = 1800000;

        /* renamed from: d  reason: collision with root package name */
        private long f3051d = System.currentTimeMillis();

        public a(T t4, int i4) {
            this.f3049b = t4;
            this.f3050c = i4;
        }

        public boolean a() {
            return this.f3052e > System.currentTimeMillis() - this.f3051d;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(a aVar) {
            int i4 = aVar.f3050c - this.f3050c;
            if (i4 == 0) {
                int i5 = ((this.f3051d - aVar.f3051d) > 0L ? 1 : ((this.f3051d - aVar.f3051d) == 0L ? 0 : -1));
                if (i5 > 0) {
                    return 1;
                }
                return i5 < 0 ? -1 : 0;
            }
            return i4;
        }

        public void b() {
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACCDTAG", "nr ");
            T t4 = this.f3049b;
            if (t4 instanceof com.aggmoread.sdk.z.c.a.a.c.a) {
                ((com.aggmoread.sdk.z.c.a.a.c.a) t4).a(1, this.f3050c + 10, "");
            }
        }
    }

    public e(String str) {
    }

    private void a(String str, a<T> aVar) {
        String str2;
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACCDTAG", "dump " + str + ", adData " + aVar);
            T t4 = aVar.f3049b;
            if (t4 instanceof com.aggmoread.sdk.z.c.a.a.c.a) {
                Map<String, Object> h4 = ((com.aggmoread.sdk.z.c.a.a.c.a) t4).h();
                if (h4 != null) {
                    StringBuilder sb = new StringBuilder("ExtrasInfo:\n");
                    sb.append("time = " + ((a) aVar).f3051d);
                    sb.append("\n\t");
                    sb.append("slot_id = " + h4.get(AMConst.ExtrasKey.AD_PLACEMENT_ID));
                    sb.append("\n\t");
                    sb.append("ecpm = " + h4.get(AMConst.ExtrasKey.AD_PRICE));
                    sb.append("\n\t End");
                    str2 = sb.toString();
                } else {
                    str2 = "extrasMap is empty ";
                }
                com.aggmoread.sdk.z.c.a.a.e.e.b("ACCDTAG", str2);
            }
        }
    }

    public void a() {
        SortedSet<a<T>> sortedSet = this.f3048a;
        if (sortedSet != null) {
            synchronized (sortedSet) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("ACCDTAG", "checkExpire, size " + this.f3048a.size());
                Iterator<a<T>> it2 = this.f3048a.iterator();
                while (it2.hasNext()) {
                    a<T> next = it2.next();
                    if (next != null && !next.a()) {
                        it2.remove();
                        next.b();
                        a("checkExpire", next);
                    }
                }
            }
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACCDTAG", "checkExpire end , size = " + this.f3048a.size());
    }

    public void a(a<T> aVar) {
        synchronized (this.f3048a) {
            if (aVar != null) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("ACCDTAG", "addAdData   " + aVar);
                this.f3048a.add(aVar);
                if (this.f3048a.size() > 9) {
                    this.f3048a.remove(this.f3048a.last());
                }
            }
        }
    }

    public a<T> b() {
        synchronized (this.f3048a) {
            if (this.f3048a.isEmpty()) {
                return null;
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACCDTAG", "pollFirst data  " + Thread.currentThread().getName());
            a<T> first = this.f3048a.first();
            this.f3048a.remove(first);
            return first;
        }
    }
}
