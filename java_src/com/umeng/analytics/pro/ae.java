package com.umeng.analytics.pro;
/* compiled from: DelayedStartCondition.java */
/* loaded from: classes6.dex */
public class ae implements ac {

    /* renamed from: a  reason: collision with root package name */
    private long f63300a;

    public ae(long j4) {
        this.f63300a = 0L;
        this.f63300a = j4;
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.ac
    public long c() {
        return this.f63300a;
    }
}
