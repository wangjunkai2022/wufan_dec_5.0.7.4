package com.aggmoread.sdk.z.c.a.a.d.a.d.t.f;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.comm.pi.AdData;
import com.qq.e.comm.util.AdError;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes2.dex */
public class a extends com.aggmoread.sdk.z.c.a.a.d.a.d.b implements NativeExpressMediaListener {

    /* renamed from: s  reason: collision with root package name */
    private static String f3105s = "AMDRAWTAGGDT";

    /* renamed from: p  reason: collision with root package name */
    private NativeExpressADView f3106p;

    /* renamed from: q  reason: collision with root package name */
    private AdData f3107q;

    /* renamed from: r  reason: collision with root package name */
    private WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> f3108r;

    public a(NativeExpressADView nativeExpressADView, d dVar, e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f3106p = nativeExpressADView;
        this.f2824o = dVar.f3276t;
        if (nativeExpressADView != null) {
            AdData boundData = nativeExpressADView.getBoundData();
            this.f3107q = boundData;
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f2821l, boundData, eVar);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.a
    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f3108r;
        return weakReference != null ? weakReference.get() : super.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
        this.f2824o = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    public void b(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3106p, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3106p, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void destroy() {
        NativeExpressADView nativeExpressADView = this.f3106p;
        if (nativeExpressADView != null) {
            nativeExpressADView.destroy();
            this.f3106p = null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    protected String getTitle() {
        return this.f3107q.getTitle();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public View getView() {
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f3108r;
        if (weakReference != null && weakReference.get() != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3105s, "get ");
            return this.f3108r.get();
        }
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f2798d.f3260d.getApplicationContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        aVar.addView(this.f3106p, layoutParams);
        this.f3108r = new WeakReference<>(aVar);
        return aVar;
    }

    public com.aggmoread.sdk.z.c.a.a.c.n.b j() {
        return this.f2823n;
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoCached(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoCached();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoComplete(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoComplete();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoError(NativeExpressADView nativeExpressADView, AdError adError) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.a(new i(adError.getErrorCode(), adError.getErrorMsg()));
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoInit(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoInit();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoLoading(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoLoading();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoPageClose(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoPageOpen(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoPause(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoPause();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoReady(NativeExpressADView nativeExpressADView, long j4) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.a(j4);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoStart(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoStart();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void render() {
        NativeExpressADView nativeExpressADView = this.f3106p;
        if (nativeExpressADView != null) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(nativeExpressADView, c());
            if (this.f2822m != null) {
                this.f3106p.setMediaListener(this);
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3105s, "render");
            this.f3106p.render();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void renderActivity(Activity activity) {
        render();
    }
}
