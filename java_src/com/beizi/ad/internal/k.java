package com.beizi.ad.internal;

import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.StringUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PrefetchAdRequestManagerImpl.java */
/* loaded from: classes2.dex */
public class k extends l {

    /* renamed from: a  reason: collision with root package name */
    private com.beizi.ad.internal.network.a f5926a;

    /* renamed from: b  reason: collision with root package name */
    private d f5927b = new d(g.a().e(), StringUtil.createRequestId());

    @Override // com.beizi.ad.internal.e
    public void a() {
        this.f5926a = new com.beizi.ad.internal.network.a(new a.C0179a());
        g();
        try {
            this.f5926a.a(this);
            this.f5926a.executeOnExecutor(com.beizi.ad.lance.a.c.b().c(), new Void[0]);
        } catch (IllegalStateException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("ignored:");
            sb.append(e5.getMessage());
        } catch (RejectedExecutionException e6) {
            String str = HaoboLog.baseLogTag;
            HaoboLog.e(str, "Concurrent Thread Exception while firing new ad request: " + e6.getMessage());
        }
    }

    @Override // com.beizi.ad.internal.e
    public d c() {
        return this.f5927b;
    }

    @Override // com.beizi.ad.internal.e
    public com.beizi.ad.b.a d() {
        return null;
    }

    @Override // com.beizi.ad.internal.l
    public void e() {
        com.beizi.ad.internal.network.a aVar = this.f5926a;
        if (aVar != null) {
            aVar.cancel(true);
            this.f5926a = null;
        }
        a((LinkedList<com.beizi.ad.internal.a.a>) null);
    }

    @Override // com.beizi.ad.internal.e
    public void a(int i4) {
        String str = HaoboLog.pbLogTag;
        HaoboLog.d(str, "Failed to load prefetch request: " + i4);
    }

    @Override // com.beizi.ad.internal.e
    public void a(ServerResponse serverResponse) {
        Iterator<String> it2 = serverResponse.getPrefetchResources().iterator();
        while (it2.hasNext()) {
            String str = HaoboLog.baseLogTag;
            HaoboLog.d(str, "Prefetch resource: " + it2.next());
        }
    }
}
