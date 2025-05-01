package com.ss.android.socialbase.downloader.u;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class wv {

    /* renamed from: i  reason: collision with root package name */
    private final AtomicLong f61445i;

    /* renamed from: m  reason: collision with root package name */
    int f61446m;

    /* renamed from: n  reason: collision with root package name */
    private int f61447n;

    /* renamed from: o  reason: collision with root package name */
    private volatile long f61448o;

    /* renamed from: p  reason: collision with root package name */
    private final long f61449p;
    private JSONObject qv;

    /* renamed from: u  reason: collision with root package name */
    private long f61450u;
    volatile r vv;

    public wv(long j4, long j5) {
        AtomicLong atomicLong = new AtomicLong();
        this.f61445i = atomicLong;
        this.f61446m = 0;
        this.f61449p = j4;
        atomicLong.set(j4);
        this.f61448o = j4;
        if (j5 >= j4) {
            this.f61450u = j5;
        } else {
            this.f61450u = -1L;
        }
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = this.qv;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.qv = jSONObject;
        }
        jSONObject.put("st", p());
        jSONObject.put("cu", i());
        jSONObject.put("en", u());
        return jSONObject;
    }

    public long i() {
        long j4 = this.f61445i.get();
        long j5 = this.f61450u;
        if (j5 > 0) {
            long j6 = j5 + 1;
            if (j4 > j6) {
                return j6;
            }
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f61446m;
    }

    public long m() {
        long j4 = this.f61450u;
        if (j4 >= this.f61449p) {
            return (j4 - o()) + 1;
        }
        return -1L;
    }

    public int n() {
        return this.f61447n;
    }

    public long o() {
        r rVar = this.vv;
        if (rVar != null) {
            long i4 = rVar.i();
            if (i4 > this.f61448o) {
                return i4;
            }
        }
        return this.f61448o;
    }

    public long p() {
        return this.f61449p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void qv() {
        this.f61446m++;
    }

    public String toString() {
        return "Segment{startOffset=" + this.f61449p + ",\t currentOffset=" + this.f61445i + ",\t currentOffsetRead=" + o() + ",\t endOffset=" + this.f61450u + '}';
    }

    public long u() {
        return this.f61450u;
    }

    public long vv() {
        return this.f61445i.get() - this.f61449p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wv() {
        this.f61446m--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(long j4) {
        if (j4 >= this.f61449p) {
            this.f61450u = j4;
            return;
        }
        StringBuilder sb = new StringBuilder("setEndOffset: endOffset = ");
        sb.append(j4);
        sb.append(", segment = ");
        sb.append(this);
        if (j4 == -1) {
            this.f61450u = j4;
        }
    }

    public void vv(long j4) {
        long j5 = this.f61449p;
        if (j4 < j5) {
            j4 = j5;
        }
        long j6 = this.f61450u;
        if (j6 > 0) {
            long j7 = j6 + 1;
            if (j4 > j7) {
                j4 = j7;
            }
        }
        this.f61445i.set(j4);
    }

    public void i(long j4) {
        if (j4 >= this.f61445i.get()) {
            this.f61448o = j4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(long j4) {
        this.f61445i.addAndGet(j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i4) {
        this.f61446m = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(int i4) {
        this.f61447n = i4;
    }

    public static String vv(List<wv> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Collections.sort(list, new Comparator<wv>() { // from class: com.ss.android.socialbase.downloader.u.wv.1
            @Override // java.util.Comparator
            /* renamed from: vv */
            public int compare(wv wvVar, wv wvVar2) {
                return (int) (wvVar.p() - wvVar2.p());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (wv wvVar : list) {
            sb.append(wvVar);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public wv(wv wvVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.f61445i = atomicLong;
        this.f61446m = 0;
        this.f61449p = wvVar.f61449p;
        this.f61450u = wvVar.f61450u;
        atomicLong.set(wvVar.f61445i.get());
        this.f61448o = atomicLong.get();
        this.f61447n = wvVar.f61447n;
    }

    public wv(JSONObject jSONObject) {
        this.f61445i = new AtomicLong();
        this.f61446m = 0;
        this.f61449p = jSONObject.optLong("st");
        p(jSONObject.optLong("en"));
        vv(jSONObject.optLong("cu"));
        i(i());
    }
}
