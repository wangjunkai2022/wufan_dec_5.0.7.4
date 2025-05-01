package com.aggmoread.sdk.b;

import android.app.Activity;
import android.view.View;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.draw.AMDrawAd;
import com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener;
import java.util.Map;
/* loaded from: classes2.dex */
public class g extends c implements AMDrawAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.n.a f1957b;

    /* renamed from: c  reason: collision with root package name */
    protected AMDrawAdInteractionListener f1958c;

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.n.b {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void onADCloseOverlay() {
            AMDrawAdInteractionListener aMDrawAdInteractionListener = g.this.f1958c;
            if (aMDrawAdInteractionListener != null) {
                aMDrawAdInteractionListener.onADCloseOverlay();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void onADLeftApplication() {
            AMDrawAdInteractionListener aMDrawAdInteractionListener = g.this.f1958c;
            if (aMDrawAdInteractionListener != null) {
                aMDrawAdInteractionListener.onADLeftApplication();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void onADOpenOverlay() {
            AMDrawAdInteractionListener aMDrawAdInteractionListener = g.this.f1958c;
            if (aMDrawAdInteractionListener != null) {
                aMDrawAdInteractionListener.onADOpenOverlay();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void onAdClicked() {
            AMDrawAdInteractionListener aMDrawAdInteractionListener = g.this.f1958c;
            if (aMDrawAdInteractionListener != null) {
                aMDrawAdInteractionListener.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void onAdExposed() {
            AMDrawAdInteractionListener aMDrawAdInteractionListener = g.this.f1958c;
            if (aMDrawAdInteractionListener != null) {
                aMDrawAdInteractionListener.onAdExposed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void onRenderFail() {
            AMDrawAdInteractionListener aMDrawAdInteractionListener = g.this.f1958c;
            if (aMDrawAdInteractionListener != null) {
                aMDrawAdInteractionListener.onRenderFail();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.b
        public void onRenderSuccess() {
            AMDrawAdInteractionListener aMDrawAdInteractionListener = g.this.f1958c;
            if (aMDrawAdInteractionListener != null) {
                aMDrawAdInteractionListener.onRenderSuccess();
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements com.aggmoread.sdk.z.c.a.a.c.n.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AMDrawAd.DrawVideoListener f1960a;

        b(g gVar, AMDrawAd.DrawVideoListener drawVideoListener) {
            this.f1960a = drawVideoListener;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void a(long j4) {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            AMDrawAd.DrawVideoListener drawVideoListener = this.f1960a;
            if (drawVideoListener != null) {
                drawVideoListener.onVideoError(new AMError(dVar.a(), dVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void b() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void c() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void onVideoCached() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void onVideoComplete() {
            AMDrawAd.DrawVideoListener drawVideoListener = this.f1960a;
            if (drawVideoListener != null) {
                drawVideoListener.onVideoComplete();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void onVideoInit() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void onVideoLoading() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void onVideoPause() {
            AMDrawAd.DrawVideoListener drawVideoListener = this.f1960a;
            if (drawVideoListener != null) {
                drawVideoListener.onVideoPause();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.d
        public void onVideoStart() {
            AMDrawAd.DrawVideoListener drawVideoListener = this.f1960a;
            if (drawVideoListener != null) {
                drawVideoListener.onVideoStart();
            }
        }
    }

    public g(com.aggmoread.sdk.z.c.a.a.c.n.a aVar, d dVar) {
        super(aVar, dVar);
        this.f1957b = aVar;
        aVar.a(new a());
    }

    @Override // com.aggmoread.sdk.b.c
    protected Map<String, Object> a() {
        return this.f1957b.h();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1957b.destroy();
        this.f1958c = null;
    }

    @Override // com.aggmoread.sdk.client.draw.AMDrawAd
    public View getView() {
        return this.f1957b.getView();
    }

    @Override // com.aggmoread.sdk.client.draw.AMDrawAd
    public void recycle() {
        this.f1957b.destroy();
    }

    @Override // com.aggmoread.sdk.client.draw.AMDrawAd
    public void render() {
        this.f1957b.render();
    }

    @Override // com.aggmoread.sdk.client.draw.AMDrawAd
    public void renderActivity(Activity activity) {
        this.f1957b.renderActivity(activity);
    }

    @Override // com.aggmoread.sdk.client.draw.AMDrawAd
    public void setInteractionListener(AMDrawAdInteractionListener aMDrawAdInteractionListener) {
        this.f1958c = aMDrawAdInteractionListener;
    }

    @Override // com.aggmoread.sdk.client.draw.AMDrawAd
    public void setVideoListener(AMDrawAd.DrawVideoListener drawVideoListener) {
        this.f1957b.a(new b(this, drawVideoListener));
    }
}
