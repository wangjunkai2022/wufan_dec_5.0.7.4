package com.aggmoread.sdk.z.c.a.a.d.a.d.s.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.a.l.c;
import com.aggmoread.sdk.z.a.l.f;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.a.d.d;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class b extends d {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f3067r = new Object();

    /* renamed from: n  reason: collision with root package name */
    private String f3068n;

    /* renamed from: o  reason: collision with root package name */
    private c f3069o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference<View> f3070p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f3071q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f3072b;

        a(e.a aVar) {
            this.f3072b = aVar;
        }

        @Override // com.aggmoread.sdk.z.a.i.b
        public void a(com.aggmoread.sdk.z.a.g.e eVar) {
            b.this.a(new i(eVar.a(), eVar.b()));
        }

        @Override // com.aggmoread.sdk.z.a.l.f
        public void onADClicked() {
            b bVar = b.this;
            k kVar = new k(bVar.f2798d, bVar.f2799e);
            k a5 = kVar.a(k.b.f3448n, b.this.f2796b);
            b bVar2 = b.this;
            com.aggmoread.sdk.z.c.a.a.d.b.e eVar = bVar2.f2799e;
            WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = bVar2.f2805k;
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = weakReference == null ? null : weakReference.get();
            b bVar3 = b.this;
            boolean a6 = a5.a(eVar, aVar, bVar3.f2801g, bVar3.f2804j);
            kVar.b();
            if (a6) {
                this.f3072b.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.a.l.f
        public void onADExposed() {
            b.this.f2801g = System.currentTimeMillis();
            l.a((Object) b.this.f2804j, true, true);
            b.this.a(this.f3072b);
        }
    }

    public b(c cVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f3068n = "AMHTAG";
        this.f3069o = cVar;
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
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.s.c.b.a(android.view.View, android.view.View, android.view.ViewGroup):com.aggmoread.sdk.z.c.a.a.d.b.m.a");
    }

    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, View view3, @NonNull e.a aVar) {
        String str;
        String str2;
        if (list == null) {
            list = new ArrayList<>();
        }
        View view4 = view3 != null ? view3 : view;
        if (list.contains(view4)) {
            str = this.f3068n;
            str2 = "ovov + true";
        } else {
            str = this.f3068n;
            str2 = "ovov + false";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, str2);
        if (m.a(this.f2799e) && !list.contains(view4)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3068n, "ovov ");
            list.add(view4);
        }
        this.f2797c = aVar;
        com.aggmoread.sdk.z.a.t.c cVar = new com.aggmoread.sdk.z.a.t.c(context);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a a5 = a(view, view3, cVar);
        this.f3069o.a(cVar, list, new a(aVar));
        a(this.f2805k.get(), view2 != null ? new View[]{view2} : new View[0]);
        return a5;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, @NonNull e.a aVar) {
        return a(context, view, layoutParams, list, view2, null, aVar);
    }

    protected void a(View view, View[] viewArr) {
        l.a(this.f2798d.f3258b, this.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, view, viewArr, this.f3070p, this.f3071q);
        l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
        byte[] b5 = this.f2798d.f3274r.b();
        if (b5 != null) {
            l.a(this.f2798d.f3258b, b5);
        }
        l.a(this.f2804j, this.f2799e);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void a(@NonNull ViewGroup viewGroup, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void destroy() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int f() {
        return 0;
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
        return this.f3069o.getDesc();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public long getDownloadCount() {
        return 0L;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getIconUrl() {
        return this.f3069o.getIconUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getImageUrl() {
        return this.f3069o.getImageUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public List<String> getImageUrlList() {
        return this.f3069o.b();
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
        return this.f3069o.getTitle();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getVideoCurrentPosition() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isAppAd() {
        return this.f3069o.isAppAd();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isVideoAd() {
        return false;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void pauseVideo() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resume() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resumeVideo() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void setVideoMute(boolean z4) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void startVideo() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void stopVideo() {
    }
}
