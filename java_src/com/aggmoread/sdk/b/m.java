package com.aggmoread.sdk.b;

import android.app.Activity;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.reward.AMRewardAd;
import com.aggmoread.sdk.client.reward.AMRewardInteractionListener;
import java.util.Map;
/* loaded from: classes2.dex */
public class m extends c implements AMRewardAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.r.a f1982b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.r.d f1983c;

    /* renamed from: d  reason: collision with root package name */
    private AMRewardInteractionListener f1984d;

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.r.d {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void a() {
            if (m.this.f1984d != null) {
                m.this.f1984d.onAdClosed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            if (m.this.f1984d != null) {
                m.this.f1984d.onAdError(new AMError(dVar.a(), dVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdClicked() {
            if (m.this.f1984d != null) {
                m.this.f1984d.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdExposed() {
            if (m.this.f1984d != null) {
                m.this.f1984d.onAdExposed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.r.d
        public void onAdShow() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.r.d
        public void onReward(Map map) {
            if (m.this.f1984d != null) {
                m.this.f1984d.onReward(map);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.r.d
        public void onVideoComplete() {
            if (m.this.f1984d != null) {
                m.this.f1984d.onVideoComplete();
            }
        }
    }

    public m(com.aggmoread.sdk.z.c.a.a.c.r.a aVar, d dVar) {
        super(aVar, dVar);
        this.f1982b = aVar;
        this.f1983c = new a();
    }

    @Override // com.aggmoread.sdk.b.c
    protected Map<String, Object> a() {
        return this.f1982b.h();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1984d = null;
        this.f1983c = null;
        com.aggmoread.sdk.z.c.a.a.c.r.a aVar = this.f1982b;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // com.aggmoread.sdk.client.reward.AMRewardAd
    public void show(Activity activity, AMRewardInteractionListener aMRewardInteractionListener) {
        this.f1984d = aMRewardInteractionListener;
        this.f1982b.a(this.f1983c);
        this.f1982b.a(activity);
    }

    @Override // com.aggmoread.sdk.client.reward.AMRewardAd
    public void show(AMRewardInteractionListener aMRewardInteractionListener) {
        this.f1984d = aMRewardInteractionListener;
        this.f1982b.a(this.f1983c);
        this.f1982b.b();
    }
}
