package com.beizi.ad.internal;

import com.beizi.ad.internal.utilities.HaoboLog;
import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: RequestManager.java */
/* loaded from: classes2.dex */
public abstract class l implements e {

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<com.beizi.ad.internal.a.a> f5928a;

    /* renamed from: b  reason: collision with root package name */
    private long f5929b = -1;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f5930c = new ArrayList<>();

    @Override // com.beizi.ad.internal.e
    public long a(long j4) {
        long j5 = this.f5929b;
        if (j5 > 0) {
            return j4 - j5;
        }
        return -1L;
    }

    @Override // com.beizi.ad.internal.e
    public LinkedList<com.beizi.ad.internal.a.a> b() {
        return this.f5928a;
    }

    public abstract void e();

    public void g() {
        this.f5929b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        if (this.f5930c.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Mediation Classes: \n");
        for (int size = this.f5930c.size(); size > 0; size--) {
            sb.append(String.format("%d: %s\n", Integer.valueOf(size), this.f5930c.get(size - 1)));
        }
        HaoboLog.i(HaoboLog.mediationLogTag, sb.toString());
        this.f5930c.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.beizi.ad.internal.a.a i() {
        LinkedList<com.beizi.ad.internal.a.a> linkedList = this.f5928a;
        if (linkedList == null || linkedList.getFirst() == null) {
            return null;
        }
        this.f5930c.add(this.f5928a.getFirst().a());
        return this.f5928a.removeFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(LinkedList<com.beizi.ad.internal.a.a> linkedList) {
        this.f5928a = linkedList;
    }
}
