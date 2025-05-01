package com.aggmoread.sdk.b;

import android.app.Activity;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAd;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener;
import java.util.Map;
/* loaded from: classes2.dex */
public class i extends c implements AMFullScreenAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.p.b f1967b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.p.a f1968c;

    /* renamed from: d  reason: collision with root package name */
    private AMFullScreenAdInteractionListener f1969d;

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.p.a {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void a() {
            if (i.this.f1969d != null) {
                i.this.f1969d.onAdClosed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            if (i.this.f1969d != null) {
                i.this.f1969d.onAdError(new AMError(dVar.a(), dVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.p.a
        public void onADLeftApplication() {
            if (i.this.f1969d != null) {
                i.this.f1969d.onADLeftApplication();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdClicked() {
            if (i.this.f1969d != null) {
                i.this.f1969d.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdExposed() {
            if (i.this.f1969d != null) {
                i.this.f1969d.onAdExposed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.p.a
        public void onAdShow() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.p.a
        public void onAdVideoCompleted() {
            if (i.this.f1969d != null) {
                i.this.f1969d.onAdVideoCompleted();
            }
        }
    }

    public i(com.aggmoread.sdk.z.c.a.a.c.p.b bVar, d dVar) {
        super(bVar, dVar);
        this.f1967b = bVar;
        this.f1968c = new a();
    }

    @Override // com.aggmoread.sdk.b.c
    protected Map<String, Object> a() {
        return this.f1967b.h();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1967b.destroy();
        this.f1969d = null;
        this.f1968c = null;
    }

    @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAd
    public void show(Activity activity, AMFullScreenAdInteractionListener aMFullScreenAdInteractionListener) {
        this.f1969d = aMFullScreenAdInteractionListener;
        this.f1967b.a(this.f1968c);
        this.f1967b.a(activity);
    }

    @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAd
    public void show(AMFullScreenAdInteractionListener aMFullScreenAdInteractionListener) {
        this.f1969d = aMFullScreenAdInteractionListener;
        this.f1967b.a(this.f1968c);
        this.f1967b.b();
    }
}
