package com.beizi.ad.internal.nativead;

import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.R;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.l;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.HaoboLog;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: NativeAdRequestManagerImpl.java */
/* loaded from: classes2.dex */
public class c extends l {

    /* renamed from: a  reason: collision with root package name */
    private final SoftReference<b> f6038a;

    /* renamed from: b  reason: collision with root package name */
    private com.beizi.ad.internal.nativead.a.a f6039b;

    public c(b bVar) {
        this.f6038a = new SoftReference<>(bVar);
    }

    @Override // com.beizi.ad.internal.e
    public void a() {
        b bVar = this.f6038a.get();
        if (bVar == null) {
            HaoboLog.e(HaoboLog.baseLogTag, "Before execute request manager, you should set ad request!");
            return;
        }
        g();
        try {
            bVar.a(this);
            bVar.executeOnExecutor(com.beizi.ad.lance.a.c.b().c(), new Void[0]);
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
    public com.beizi.ad.internal.d c() {
        b bVar = this.f6038a.get();
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }

    @Override // com.beizi.ad.internal.e
    public com.beizi.ad.b.a d() {
        return null;
    }

    @Override // com.beizi.ad.internal.l
    public void e() {
        b bVar = this.f6038a.get();
        if (bVar != null) {
            bVar.cancel(true);
        }
        a((LinkedList<com.beizi.ad.internal.a.a>) null);
        com.beizi.ad.internal.nativead.a.a aVar = this.f6039b;
        if (aVar != null) {
            aVar.a(true);
            this.f6039b = null;
        }
    }

    @Override // com.beizi.ad.internal.e
    public void a(int i4) {
        h();
        b bVar = this.f6038a.get();
        if (bVar != null) {
            bVar.h().a(i4);
        }
    }

    @Override // com.beizi.ad.internal.e
    public void a(final ServerResponse serverResponse) {
        b bVar = this.f6038a.get();
        if (bVar != null) {
            boolean containsAds = serverResponse.containsAds();
            boolean z4 = (b() == null || b().isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append(containsAds);
            sb.append("=====");
            sb.append(z4);
            if (!containsAds && !z4) {
                HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.response_no_ads));
                bVar.h().a(3);
                return;
            }
            if (containsAds) {
                a(serverResponse.getMediationAds());
            }
            if (b() != null && !b().isEmpty()) {
                com.beizi.ad.internal.a.a i4 = i();
                if (i4 != null) {
                    i4.a(serverResponse.getExtras());
                }
                this.f6039b = com.beizi.ad.internal.nativead.a.a.a(i4, this, serverResponse);
                return;
            }
            final a aVar = (a) serverResponse.getNativeAdResponse();
            aVar.a(bVar.g().a());
            aVar.a(bVar.a());
            aVar.b(bVar.b());
            a(new com.beizi.ad.internal.network.b() { // from class: com.beizi.ad.internal.nativead.c.1
                @Override // com.beizi.ad.internal.network.b
                public j a() {
                    return j.NATIVE;
                }

                @Override // com.beizi.ad.internal.network.b
                public boolean b() {
                    return false;
                }

                @Override // com.beizi.ad.internal.network.b
                public com.beizi.ad.internal.view.c c() {
                    return null;
                }

                @Override // com.beizi.ad.internal.network.b
                public NativeAdResponse d() {
                    return aVar;
                }

                @Override // com.beizi.ad.internal.network.b
                public String e() {
                    return "";
                }

                @Override // com.beizi.ad.internal.network.b
                public String f() {
                    return serverResponse.getPrice();
                }

                @Override // com.beizi.ad.internal.network.b
                public String g() {
                    return serverResponse.getAdId();
                }

                @Override // com.beizi.ad.internal.network.b
                public void h() {
                    aVar.destroy();
                }
            });
        }
    }

    public void a(com.beizi.ad.internal.network.b bVar) {
        h();
        if (this.f6039b != null) {
            this.f6039b = null;
        }
        b bVar2 = this.f6038a.get();
        if (bVar2 != null) {
            bVar2.h().a(bVar);
        } else {
            bVar.h();
        }
    }
}
