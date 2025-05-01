package com.beizi.ad.internal.view;

import android.view.View;
/* compiled from: DisplayableInterstitialAdQueueEntry.java */
/* loaded from: classes2.dex */
public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private long f6371a;

    /* renamed from: b  reason: collision with root package name */
    private c f6372b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6373c;

    /* renamed from: d  reason: collision with root package name */
    private com.beizi.ad.internal.a.b f6374d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar, Long l4, boolean z4, com.beizi.ad.internal.a.b bVar) {
        this.f6371a = l4.longValue();
        this.f6372b = cVar;
        this.f6373c = z4;
        this.f6374d = bVar;
    }

    @Override // com.beizi.ad.internal.view.e
    public long a() {
        return this.f6371a;
    }

    @Override // com.beizi.ad.internal.view.e
    public boolean b() {
        return this.f6373c;
    }

    @Override // com.beizi.ad.internal.view.e
    public com.beizi.ad.internal.a.b c() {
        return this.f6374d;
    }

    @Override // com.beizi.ad.internal.view.e
    public View d() {
        c cVar = this.f6372b;
        if (cVar == null) {
            return null;
        }
        return cVar.getView();
    }
}
