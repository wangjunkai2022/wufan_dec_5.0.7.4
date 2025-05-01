package com.aggmoread.sdk.z.c.a.a.d.a.d.t.f;

import android.content.Context;
import android.view.View;
import com.aggmoread.sdk.z.c.a.a.c.h;
import com.aggmoread.sdk.z.c.a.a.c.i;
import com.aggmoread.sdk.z.c.a.a.d.a.d.e;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.d;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.f;
import com.googlecode.mp4parser.boxes.apple.x0;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.comm.util.AdError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class b extends e implements b.a {

    /* renamed from: m  reason: collision with root package name */
    private static String f3109m = "AMDRAWTAGGDT";

    /* renamed from: j  reason: collision with root package name */
    public NativeExpressAD f3110j;

    /* renamed from: k  reason: collision with root package name */
    private long f3111k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<NativeExpressADView, a> f3112l;

    public b(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f3112l = new HashMap<>();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void a(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onADClosed");
        a aVar = this.f3112l.get(nativeExpressADView);
        new k(this.f3244c, this.f3245d).a(4).b();
        if (aVar != null && aVar.j() != null) {
            aVar.j().a();
        }
        this.f3112l.remove(aVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.e
    protected void a(Object obj, int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(obj, i5, i4, null);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void b(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onRenderSuccess");
        a aVar = this.f3112l.get(nativeExpressADView);
        if (aVar == null || aVar.j() == null) {
            return;
        }
        aVar.j().onRenderSuccess();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void b(List<NativeExpressADView> list) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onADLoaded");
        List<com.aggmoread.sdk.z.c.a.a.c.n.a> arrayList = new ArrayList<>();
        if (list != null && list.size() > 0) {
            boolean q4 = q();
            boolean o4 = o();
            int i4 = -1;
            for (NativeExpressADView nativeExpressADView : list) {
                int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(nativeExpressADView);
                if (o4) {
                    if (q4 && com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f3245d, nativeExpressADView.getBoundData())) {
                        a(nativeExpressADView, 0);
                        i4 = a5;
                    } else {
                        b(nativeExpressADView, a5);
                    }
                }
                a aVar = new a(nativeExpressADView, this.f3244c, this.f3245d, this.f3243b);
                arrayList.add(aVar);
                this.f3112l.put(nativeExpressADView, aVar);
                i4 = a5;
            }
            if (q4 && arrayList.size() == 0) {
                a(i4, 0);
                return;
            }
        }
        e(arrayList);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void c(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onADExposure");
        a aVar = this.f3112l.get(nativeExpressADView);
        if (aVar != null) {
            com.aggmoread.sdk.z.c.a.a.d.b.m.a a5 = aVar.a();
            l.a(a5, aVar.f2804j);
            l.a(this.f3244c.f3258b, aVar.f2804j, i.INFORMATION_FLOW, a5, new View[0], new WeakReference(a5), null);
            l.b(this.f3244c.f3258b, this.f3245d.e(), this.f3245d.b());
            byte[] b5 = this.f3244c.f3274r.b();
            if (b5 != null) {
                l.a(this.f3244c.f3258b, b5);
            }
            this.f3111k = System.currentTimeMillis();
            l.a((Object) aVar.f2804j, true, true);
            l.a(aVar.f2804j, this.f3245d);
            aVar.d();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.e
    protected void c(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(obj, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void d(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onADCloseOverlay");
        a aVar = this.f3112l.get(nativeExpressADView);
        if (aVar == null || aVar.j() == null) {
            return;
        }
        aVar.j().onADCloseOverlay();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void e(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onADLeftApplication");
        a aVar = this.f3112l.get(nativeExpressADView);
        if (aVar == null || aVar.j() == null) {
            return;
        }
        aVar.j().onADLeftApplication();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void f(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onRenderFail");
        a aVar = this.f3112l.get(nativeExpressADView);
        this.f3112l.remove(aVar);
        if (aVar == null || aVar.j() == null) {
            return;
        }
        aVar.j().onRenderFail();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void g(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onADOpenOverlay");
        a aVar = this.f3112l.get(nativeExpressADView);
        if (aVar == null || aVar.j() == null) {
            return;
        }
        aVar.j().onADOpenOverlay();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void h(NativeExpressADView nativeExpressADView) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onADClicked");
        a aVar = this.f3112l.get(nativeExpressADView);
        k kVar = new k(this.f3244c, this.f3245d);
        if (aVar != null) {
            boolean a5 = kVar.a(k.b.f3448n, aVar.f2796b).a(this.f3245d, aVar.a(), this.f3111k, aVar.f2804j);
            kVar.b();
            l.a((Object) aVar.f2804j, false, true);
            if (!a5 || aVar.j() == null) {
                return;
            }
            aVar.j().onAdClicked();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        Context context = this.f3244c.f3260d;
        f fVar = this.f3245d.f3309c;
        Object obj = e.c.X;
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(context, fVar.a(obj, ""));
        h hVar = this.f3244c.f3273q;
        ADSize aDSize = new ADSize(hVar.b(), hVar.a());
        NativeExpressAD nativeExpressAD = (NativeExpressAD) com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3244c.f3260d, this.f3245d.f3309c.c(obj), this.f3245d.f3309c.c(e.c.T), d.e.EXPRESS, this.f3247f, new com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b(this).a(), aDSize);
        this.f3110j = nativeExpressAD;
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f3244c.f3275s;
        if (bVar != null) {
            nativeExpressAD.setVideoOption(new VideoOption.Builder().setAutoPlayPolicy(bVar.a()).setAutoPlayMuted(bVar.d()).setDetailPageMuted(bVar.e()).build());
            if (bVar.c() >= 5 && bVar.c() <= 61) {
                this.f3110j.setMinVideoDuration(bVar.c());
            }
            if (bVar.b() >= 5 && bVar.b() <= 61) {
                this.f3110j.setMaxVideoDuration(bVar.b());
            }
        }
        new k(this.f3244c, this.f3245d).a(0).b();
        this.f3110j.loadAD(this.f3244c.f3269m);
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, x0.f13710s);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.b.a
    public void onNoAD(AdError adError) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3109m, "onNoAD");
        b(new com.aggmoread.sdk.z.c.a.a.d.b.i(adError.getErrorCode(), adError.getErrorMsg()));
    }
}
