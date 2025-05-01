package com.aggmoread.sdk.z.c.a.a.d.a.d.p.e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.k;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.baidu.mobads.sdk.api.BaiduNativeManager;
import com.baidu.mobads.sdk.api.INativeVideoListener;
import com.baidu.mobads.sdk.api.NativeResponse;
import com.baidu.mobads.sdk.api.XNativeView;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class d extends com.aggmoread.sdk.z.c.a.a.d.a.d.d {

    /* renamed from: r  reason: collision with root package name */
    protected static String f2972r = "AMUTAGBD";

    /* renamed from: s  reason: collision with root package name */
    private static final Object f2973s = new Object();

    /* renamed from: t  reason: collision with root package name */
    private static final Object f2974t = new Object();

    /* renamed from: n  reason: collision with root package name */
    public NativeResponse f2975n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference f2976o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference<View> f2977p;

    /* renamed from: q  reason: collision with root package name */
    private WeakReference<XNativeView> f2978q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements NativeResponse.AdInteractionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f2979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f2980b;

        a(WeakReference weakReference, e.a aVar) {
            this.f2979a = weakReference;
            this.f2980b = aVar;
        }

        public void onADExposed() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f2972r, "onADExposed ");
            HashMap hashMap = new HashMap();
            d.this.f2801g = System.currentTimeMillis();
            hashMap.put(k.f3504a, d.this.f2799e.f3308b.a(e.c.f3330f, "-1"));
            l.a((Object) d.this.f2804j, true, true);
            d.this.a(this.f2980b);
        }

        public void onADExposureFailed(int i4) {
            com.aggmoread.sdk.z.c.a.a.e.e.a(d.f2972r, "onADError %d", Integer.valueOf(i4));
            d.this.a(new i(-1000, String.valueOf(i4)));
        }

        public void onADStatusChanged() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f2972r, "onADStatusChanged");
            if (this.f2980b instanceof e.b) {
                int downloadStatus = d.this.f2975n.getDownloadStatus();
                int c5 = d.this.c(downloadStatus);
                ((e.b) this.f2980b).onADStatusChanged(c5);
                if (c5 == 4) {
                    ((e.b) this.f2980b).onLoadApkProgress(downloadStatus);
                }
            }
        }

        public void onAdClick() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f2972r, "onADClicked");
            d dVar = d.this;
            dVar.f2800f++;
            com.aggmoread.sdk.z.c.a.a.d.b.k kVar = new com.aggmoread.sdk.z.c.a.a.d.b.k(dVar.f2798d, dVar.f2799e);
            com.aggmoread.sdk.z.c.a.a.d.b.k a5 = kVar.a(k.b.f3448n, d.this.f2796b);
            com.aggmoread.sdk.z.c.a.a.d.b.e eVar = d.this.f2799e;
            WeakReference weakReference = this.f2979a;
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = weakReference == null ? null : (com.aggmoread.sdk.z.c.a.a.d.b.m.a) weakReference.get();
            d dVar2 = d.this;
            boolean a6 = a5.a(eVar, aVar, dVar2.f2801g, dVar2.f2804j);
            kVar.b();
            l.a((Object) d.this.f2804j, false, true);
            if (a6) {
                this.f2980b.onAdClicked();
            }
        }

        public void onAdUnionClick() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements XNativeView.INativeViewClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.t.a f2982a;

        b(d dVar, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
            this.f2982a = aVar;
        }

        public void onNativeViewClick(XNativeView xNativeView) {
            this.f2982a.onVideoClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements INativeVideoListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.t.a f2983a;

        c(d dVar, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
            this.f2983a = aVar;
        }

        public void onCompletion() {
            this.f2983a.onVideoCompleted();
        }

        public void onError() {
            this.f2983a.a(new i(-1000, "广告展示失败"));
        }

        public void onPause() {
            this.f2983a.onVideoPause();
        }

        public void onRenderingStart() {
            this.f2983a.onVideoStart();
        }

        public void onResume() {
            this.f2983a.onVideoResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.e.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0110d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2984a;

        static {
            int[] iArr = new int[NativeResponse.MaterialType.values().length];
            f2984a = iArr;
            try {
                iArr[NativeResponse.MaterialType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2984a[NativeResponse.MaterialType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2984a[NativeResponse.MaterialType.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(NativeResponse nativeResponse, BaiduNativeManager baiduNativeManager, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f2975n = nativeResponse;
        com.aggmoread.sdk.z.c.a.a.d.a.c cVar = dVar.f3276t;
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b(this.f2840l, com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(nativeResponse), eVar);
    }

    private int a(NativeResponse nativeResponse) {
        int i4 = C0110d.f2984a[nativeResponse.getMaterialType().ordinal()];
        if (i4 != 1) {
            if (i4 != 3) {
                return 0;
            }
            if (TextUtils.isEmpty(nativeResponse.getImageUrl())) {
                List multiPicUrls = nativeResponse.getMultiPicUrls();
                return (multiPicUrls == null || multiPicUrls.size() <= 0) ? 0 : 3;
            }
            return 5;
        }
        return 2;
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
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.p.e.d.a(android.view.View, android.view.View, android.view.ViewGroup):com.aggmoread.sdk.z.c.a.a.d.b.m.a");
    }

    private void a(XNativeView xNativeView, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        if (xNativeView != null) {
            this.f2978q = new WeakReference<>(xNativeView);
            com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f2798d.f3275s;
            if (bVar != null) {
                xNativeView.setVideoMute(bVar.d());
            }
            xNativeView.setNativeItem(this.f2975n);
            xNativeView.setNativeViewClickListener(new b(this, aVar));
            xNativeView.setNativeVideoListener(new c(this, aVar));
            xNativeView.render();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(int i4) {
        if (i4 <= 0 || i4 > 100) {
            if (i4 == 101) {
                return 8;
            }
            if (i4 == 102) {
                return 32;
            }
            if (i4 == 103) {
                return 1;
            }
            return i4 == 104 ? 16 : 0;
        }
        return 4;
    }

    private com.aggmoread.sdk.z.c.a.a.c.c e() {
        try {
            com.aggmoread.sdk.z.c.a.a.c.c a5 = com.aggmoread.sdk.z.c.a.a.c.c.a(this.f2975n.getBrandName(), this.f2975n.getPublisher(), this.f2975n.getAppSize(), this.f2975n.getAppPermissionLink(), this.f2975n.getAppPrivacyLink(), this.f2975n.getAppVersion());
            a5.c(this.f2975n.getAppPackage());
            a5.a(this.f2975n.getAppFunctionLink());
            return a5;
        } catch (Exception e5) {
            String str = f2972r;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "err " + e5);
            return null;
        }
    }

    private XNativeView i() {
        WeakReference<XNativeView> weakReference = this.f2978q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, View view3, @NonNull e.a aVar) {
        String str;
        String str2;
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2972r, "enter");
        if (list == null) {
            list = new ArrayList<>();
        }
        List<View> list2 = list;
        View view4 = view3 != null ? view3 : view;
        if (list2.contains(view4)) {
            str = f2972r;
            str2 = "ovov + true";
        } else {
            str = f2972r;
            str2 = "ovov + false";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, str2);
        if (m.a(this.f2799e) && !list2.contains(view4)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f2972r, "ovov ");
            list2.add(view4);
        }
        this.f2797c = aVar;
        NativeAdContainer nativeAdContainer = new NativeAdContainer(context);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a a5 = a(view, view3, nativeAdContainer);
        a(context, nativeAdContainer, layoutParams, list2, this.f2805k, aVar);
        a(this.f2805k.get(), view2 != null ? new View[]{view2} : new View[0]);
        return a5;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public View a(@NonNull Context context, View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, @NonNull e.a aVar) {
        return a(context, view, layoutParams, list, view2, null, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams, List<View> list, WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference, e.a aVar) {
        if (this.f2975n == null || viewGroup == null) {
            return;
        }
        this.f2975n.registerViewForInteraction(viewGroup, list, new ArrayList(), new a(weakReference, aVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, View[] viewArr) {
        l.a(this.f2798d.f3258b, this.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, view, viewArr, this.f2977p, this.f2976o);
        l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
        byte[] b5 = this.f2798d.f3274r.b();
        if (b5 != null) {
            l.a(this.f2798d.f3258b, b5);
        }
        l.a(this.f2804j, this.f2799e);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void a(@NonNull ViewGroup viewGroup, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2972r, "ENTER");
        if (viewGroup != null) {
            Object obj = f2974t;
            XNativeView findViewWithTag = viewGroup.findViewWithTag(obj);
            if (findViewWithTag == null) {
                findViewWithTag = new XNativeView(viewGroup.getContext());
                findViewWithTag.setTag(obj);
                viewGroup.addView((View) findViewWithTag, new ViewGroup.LayoutParams(-1, -1));
            }
            a(findViewWithTag, aVar);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d
    public void b(int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.c("win " + i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2975n, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2975n, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int f() {
        return this.f2975n.getDuration();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public com.aggmoread.sdk.z.c.a.a.c.c g() {
        return e();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAdPatternType() {
        return a(this.f2975n);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppStatus() {
        return c(this.f2975n.getDownloadStatus());
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getDesc() {
        return this.f2975n.getDesc();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getIconUrl() {
        return this.f2975n.getIconUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getImageUrl() {
        List<String> imageUrlList;
        String imageUrl = this.f2975n.getImageUrl();
        return (!TextUtils.isEmpty(imageUrl) || (imageUrlList = getImageUrlList()) == null || imageUrlList.size() <= 0) ? imageUrl : imageUrlList.get(0);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public List<String> getImageUrlList() {
        return this.f2975n.getMultiPicUrls();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureHeight() {
        return this.f2975n.getMainPicHeight();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureWidth() {
        return this.f2975n.getMainPicWidth();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getProgress() {
        return this.f2975n.getDownloadStatus();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getTitle() {
        return this.f2975n.getTitle();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isAppAd() {
        return this.f2975n.getAdActionType() == 2;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isVideoAd() {
        return this.f2975n.getMaterialType() == NativeResponse.MaterialType.VIDEO;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void pauseVideo() {
        XNativeView i4 = i();
        if (i4 != null) {
            i4.pause();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resume() {
        XNativeView i4 = i();
        if (i4 != null) {
            i4.resume();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resumeVideo() {
        XNativeView i4 = i();
        if (i4 != null) {
            i4.resume();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void setVideoMute(boolean z4) {
        XNativeView i4 = i();
        if (i4 != null) {
            i4.setVideoMute(z4);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void startVideo() {
        XNativeView i4 = i();
        if (i4 != null) {
            i4.render();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void stopVideo() {
        XNativeView i4 = i();
        if (i4 != null) {
            i4.stop();
        }
    }
}
