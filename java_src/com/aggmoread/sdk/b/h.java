package com.aggmoread.sdk.b;

import android.app.Activity;
import android.view.View;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.feedlist.AMExpressAd;
import com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener;
import java.util.Map;
/* loaded from: classes2.dex */
public class h extends c implements AMExpressAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.o.c f1961b;

    /* renamed from: c  reason: collision with root package name */
    protected AMExpressInteractionListener f1962c;

    /* renamed from: d  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.o.b f1963d;

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.o.b {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void a() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onAdClosed(hVar);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.b
        public void onADCloseOverlay() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onADCloseOverlay(hVar);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.b
        public void onADLeftApplication() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onADLeftApplication(hVar);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.b
        public void onADOpenOverlay() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onADOpenOverlay(hVar);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdClicked() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onAdClicked(hVar);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdExposed() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onAdExposed(hVar);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.b
        public void onRenderFail() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onRenderFail(hVar);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.b
        public void onRenderSuccess() {
            h hVar = h.this;
            AMExpressInteractionListener aMExpressInteractionListener = hVar.f1962c;
            if (aMExpressInteractionListener != null) {
                aMExpressInteractionListener.onRenderSuccess(hVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements com.aggmoread.sdk.z.c.a.a.c.o.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AMExpressAd.ExpressMediaListener f1965a;

        b(AMExpressAd.ExpressMediaListener expressMediaListener) {
            this.f1965a = expressMediaListener;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void a(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoLoading(h.this);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void a(com.aggmoread.sdk.z.c.a.a.c.o.c cVar, long j4) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoReady(h.this, j4);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void a(com.aggmoread.sdk.z.c.a.a.c.o.c cVar, com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoError(h.this, new AMError(dVar.a(), dVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void b(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoCached(h.this);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void c(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoPageOpen(h.this);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void d(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoPause(h.this);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void e(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoInit(h.this);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void f(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoStart(h.this);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void g(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoPageClose(h.this);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.a
        public void h(com.aggmoread.sdk.z.c.a.a.c.o.c cVar) {
            AMExpressAd.ExpressMediaListener expressMediaListener = this.f1965a;
            if (expressMediaListener != null) {
                expressMediaListener.onVideoComplete(h.this);
            }
        }
    }

    public h(com.aggmoread.sdk.z.c.a.a.c.o.c cVar, d dVar) {
        super(cVar, dVar);
        this.f1961b = cVar;
        this.f1963d = new a();
    }

    @Override // com.aggmoread.sdk.b.c
    protected Map<String, Object> a() {
        return this.f1961b.h();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1961b.destroy();
        this.f1963d = null;
        this.f1962c = null;
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd
    public View getView() {
        return this.f1961b.getView();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd
    public void recycle() {
        this.f1961b.destroy();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd
    public void render() {
        this.f1961b.render();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd
    public void renderActivity(Activity activity) {
        this.f1961b.renderActivity(activity);
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd
    public void setInteractionListener(AMExpressInteractionListener aMExpressInteractionListener) {
        this.f1962c = aMExpressInteractionListener;
        this.f1961b.a(this.f1963d);
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd
    public void setMediaListener(AMExpressAd.ExpressMediaListener expressMediaListener) {
        this.f1961b.a(new b(expressMediaListener));
    }
}
