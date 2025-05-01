package com.aggmoread.sdk.z.c.a.a.d.a.d.o.e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.a.l.e;
import com.aggmoread.sdk.z.a.l.f;
import com.aggmoread.sdk.z.a.s.c;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class d extends com.aggmoread.sdk.z.c.a.a.d.a.d.d {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f2914r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static final Object f2915s = new Object();

    /* renamed from: n  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.l.c f2916n;

    /* renamed from: o  reason: collision with root package name */
    private String f2917o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference<View> f2918p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f2919q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f2920b;

        a(e.a aVar) {
            this.f2920b = aVar;
        }

        @Override // com.aggmoread.sdk.z.a.i.b
        public void a(com.aggmoread.sdk.z.a.g.e eVar) {
            d.this.a(new i(eVar.a(), eVar.b()));
        }

        @Override // com.aggmoread.sdk.z.a.l.f
        public void onADClicked() {
            d dVar = d.this;
            k kVar = new k(dVar.f2798d, dVar.f2799e);
            k a5 = kVar.a(k.b.f3448n, d.this.f2796b);
            d dVar2 = d.this;
            com.aggmoread.sdk.z.c.a.a.d.b.e eVar = dVar2.f2799e;
            WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = dVar2.f2805k;
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = weakReference == null ? null : weakReference.get();
            d dVar3 = d.this;
            boolean a6 = a5.a(eVar, aVar, dVar3.f2801g, dVar3.f2804j);
            kVar.b();
            if (a6) {
                this.f2920b.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.f
        public void onADExposed() {
            d.this.f2801g = System.currentTimeMillis();
            l.a((Object) d.this.f2804j, true, true);
            d.this.a(this.f2920b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.t.a f2922a;

        b(com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
            this.f2922a = aVar;
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void a() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.this.f2917o, "onMediaStart");
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.onVideoStart();
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void a(int i4) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.this.f2917o, "onMediaLoaded");
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.onVideoLoaded(i4);
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void a(com.aggmoread.sdk.z.a.g.e eVar) {
            String str = d.this.f2917o;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, " onMediaError err " + eVar.toString());
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.a(new i(eVar.a(), eVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void b() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.this.f2917o, "onMediaReady ");
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.onVideoReady();
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void c() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.this.f2917o, "onMediaCompleted ");
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.onVideoCompleted();
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void d() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.this.f2917o, "onMediaLoading");
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.onVideoLoading();
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void e() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.this.f2917o, "onMediaResume");
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.onVideoResume();
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.e.a
        public void f() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.this.f2917o, "onMediaPause ");
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f2922a;
            if (aVar != null) {
                aVar.onVideoPause();
            }
        }
    }

    public d(com.aggmoread.sdk.z.a.l.c cVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f2917o = "AMHTAG";
        this.f2916n = cVar;
        if (cVar instanceof com.aggmoread.sdk.z.a.l.d) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.b(this.f2840l, ((com.aggmoread.sdk.z.a.l.d) cVar).e(), eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.aggmoread.sdk.z.c.a.a.d.b.m.a a(android.view.View r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.o.e.d.a(android.view.View, android.view.View, android.view.ViewGroup):com.aggmoread.sdk.z.c.a.a.d.b.m.a");
    }

    private void a(com.aggmoread.sdk.z.a.t.f fVar, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f2798d.f3275s;
        c.b bVar2 = new c.b();
        if (bVar != null) {
            bVar2.a(bVar.d());
            bVar2.a(bVar.a());
            bVar2.b(bVar.f());
            bVar2.c(bVar.g());
            bVar2.d(bVar.h());
        }
        if (fVar != null) {
            this.f2916n.a(fVar, bVar2.a(), new b(aVar));
        }
    }

    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, View view3, @NonNull e.a aVar) {
        String str;
        String str2;
        if (list == null) {
            list = new ArrayList<>();
        }
        View view4 = view3 != null ? view3 : view;
        if (list.contains(view4)) {
            str = this.f2917o;
            str2 = "ovov + true";
        } else {
            str = this.f2917o;
            str2 = "ovov + false";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, str2);
        if (m.a(this.f2799e) && !list.contains(view4)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2917o, "ovov ");
            list.add(view4);
        }
        this.f2797c = aVar;
        com.aggmoread.sdk.z.a.t.c cVar = new com.aggmoread.sdk.z.a.t.c(context);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a a5 = a(view, view3, cVar);
        this.f2916n.a(cVar, list, new a(aVar));
        a(this.f2805k.get(), view2 != null ? new View[]{view2} : new View[0]);
        return a5;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, @NonNull e.a aVar) {
        return a(context, view, layoutParams, list, view2, null, aVar);
    }

    protected void a(View view, View[] viewArr) {
        l.a(this.f2798d.f3258b, this.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, view, viewArr, this.f2918p, this.f2919q);
        l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
        byte[] b5 = this.f2798d.f3274r.b();
        if (b5 != null) {
            l.a(this.f2798d.f3258b, b5);
        }
        l.a(this.f2804j, this.f2799e);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void a(@NonNull ViewGroup viewGroup, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2917o, "ENTER");
        if (viewGroup != null) {
            Object obj = f2915s;
            com.aggmoread.sdk.z.a.t.f fVar = (com.aggmoread.sdk.z.a.t.f) viewGroup.findViewWithTag(obj);
            if (fVar == null) {
                fVar = new com.aggmoread.sdk.z.a.t.f(viewGroup.getContext());
                fVar.setTag(obj);
                viewGroup.addView(fVar, new ViewGroup.LayoutParams(-1, -1));
            }
            a(fVar, aVar);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void destroy() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int f() {
        return this.f2916n.getVideoDuration();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAdPatternType() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public double getAppPrice() {
        return 0.0d;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppScore() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppStatus() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getDesc() {
        return this.f2916n.getDesc();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public long getDownloadCount() {
        return 0L;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getIconUrl() {
        return this.f2916n.getIconUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getImageUrl() {
        return this.f2916n.getImageUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public List<String> getImageUrlList() {
        return this.f2916n.b();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureHeight() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureWidth() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getProgress() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getTitle() {
        return this.f2916n.getTitle();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getVideoCurrentPosition() {
        return this.f2916n.getVideoCurrentPosition();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isAppAd() {
        return this.f2916n.isAppAd();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isVideoAd() {
        return this.f2916n.isVideoAd();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void pauseVideo() {
        this.f2916n.pauseVideo();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resume() {
        this.f2916n.resume();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resumeVideo() {
        this.f2916n.resumeVideo();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void setVideoMute(boolean z4) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void startVideo() {
        this.f2916n.startVideo();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void stopVideo() {
        this.f2916n.stopVideo();
    }
}
