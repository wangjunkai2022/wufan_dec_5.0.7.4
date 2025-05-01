package com.aggmoread.sdk.z.c.a.a.d.a.d.t.g;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.comm.pi.AdData;
import com.qq.e.comm.util.AdError;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes2.dex */
public class d extends com.aggmoread.sdk.z.c.a.a.d.a.d.c implements NativeExpressMediaListener {

    /* renamed from: s  reason: collision with root package name */
    private static String f3117s = "AMEPTAGGDT";

    /* renamed from: o  reason: collision with root package name */
    private NativeExpressADView f3118o;

    /* renamed from: p  reason: collision with root package name */
    private AdData f3119p;

    /* renamed from: q  reason: collision with root package name */
    private WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> f3120q;

    /* renamed from: r  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.o.a f3121r;

    public d(NativeExpressADView nativeExpressADView, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f3118o = nativeExpressADView;
        if (nativeExpressADView != null) {
            AdData boundData = nativeExpressADView.getBoundData();
            this.f3119p = boundData;
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f2831l, boundData, eVar);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.a
    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f3120q;
        return weakReference != null ? weakReference.get() : super.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c, com.aggmoread.sdk.z.c.a.a.c.o.c
    public void a(com.aggmoread.sdk.z.c.a.a.c.o.a aVar) {
        this.f3121r = aVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        this.f2832m = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    public void b(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3118o, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3118o, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void destroy() {
        NativeExpressADView nativeExpressADView = this.f3118o;
        if (nativeExpressADView != null) {
            nativeExpressADView.destroy();
            this.f3118o = null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    protected String getTitle() {
        return this.f3119p.getTitle();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public View getView() {
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f3120q;
        if (weakReference != null && weakReference.get() != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3117s, "get ");
            return this.f3120q.get();
        }
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f2798d.f3260d);
        aVar.addView(this.f3118o, new FrameLayout.LayoutParams(-1, -2));
        this.f3120q = new WeakReference<>(aVar);
        return aVar;
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoCached(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoComplete(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.h(this);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoError(NativeExpressADView nativeExpressADView, AdError adError) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.a(this, new i(adError.getErrorCode(), adError.getErrorMsg()));
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoInit(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoLoading(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoPageClose(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.g(this);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoPageOpen(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoPause(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoReady(NativeExpressADView nativeExpressADView, long j4) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.a(this, j4);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
    public void onVideoStart(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.c.o.a aVar = this.f3121r;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void render() {
        NativeExpressADView nativeExpressADView = this.f3118o;
        if (nativeExpressADView != null) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(nativeExpressADView, c());
            if (this.f3121r != null) {
                this.f3118o.setMediaListener(this);
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3117s, "render");
            this.f3118o.render();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void renderActivity(Activity activity) {
        render();
    }
}
