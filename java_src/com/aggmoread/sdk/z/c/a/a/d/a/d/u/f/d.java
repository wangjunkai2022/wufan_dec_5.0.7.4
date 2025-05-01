package com.aggmoread.sdk.z.c.a.a.d.a.d.u.f;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.f;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.api.KsImage;
import com.kwad.sdk.api.KsNativeAd;
import com.qq.e.ads.nativ.MediaView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class d extends com.aggmoread.sdk.z.c.a.a.d.a.d.d {

    /* renamed from: q  reason: collision with root package name */
    protected static String f3188q = "AMUTAGKS";

    /* renamed from: r  reason: collision with root package name */
    private static final Object f3189r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static final Object f3190s = new Object();

    /* renamed from: n  reason: collision with root package name */
    public KsNativeAd f3191n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference f3192o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference<View> f3193p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements KsAppDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f3194a;

        a(d dVar, e.a aVar) {
            this.f3194a = aVar;
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onDownloadFailed() {
            e.a aVar = this.f3194a;
            if (aVar instanceof e.b) {
                ((e.b) aVar).onADStatusChanged(16);
            }
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onDownloadFinished() {
            e.a aVar = this.f3194a;
            if (aVar instanceof e.b) {
                ((e.b) aVar).onADStatusChanged(8);
            }
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onDownloadStarted() {
            e.a aVar = this.f3194a;
            if (aVar instanceof e.b) {
                ((e.b) aVar).onADStatusChanged(4);
            }
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onIdle() {
            e.a aVar = this.f3194a;
            if (aVar instanceof e.b) {
                ((e.b) aVar).onADStatusChanged(0);
            }
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onInstalled() {
            e.a aVar = this.f3194a;
            if (aVar instanceof e.b) {
                ((e.b) aVar).onADStatusChanged(1);
            }
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onProgressUpdate(int i4) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f3188q, "onADStatusChanged");
            e.a aVar = this.f3194a;
            if (aVar instanceof e.b) {
                ((e.b) aVar).onLoadApkProgress(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f3195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f3196b;

        b(WeakReference weakReference, e.a aVar) {
            this.f3195a = weakReference;
            this.f3196b = aVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d.e
        public void a(View view, KsNativeAd ksNativeAd) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f3188q, "onADClicked");
            d dVar = d.this;
            dVar.f2800f++;
            k kVar = new k(dVar.f2798d, dVar.f2799e);
            k a5 = kVar.a(k.b.f3448n, d.this.f2796b);
            com.aggmoread.sdk.z.c.a.a.d.b.e eVar = d.this.f2799e;
            WeakReference weakReference = this.f3195a;
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = weakReference == null ? null : (com.aggmoread.sdk.z.c.a.a.d.b.m.a) weakReference.get();
            d dVar2 = d.this;
            boolean a6 = a5.a(eVar, aVar, dVar2.f2801g, dVar2.f2804j);
            kVar.b();
            l.a((Object) d.this.f2804j, false, true);
            if (a6) {
                this.f3196b.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d.e
        public void a(KsNativeAd ksNativeAd) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f3188q, "onADExposed ");
            HashMap hashMap = new HashMap();
            d.this.f2801g = System.currentTimeMillis();
            hashMap.put(com.aggmoread.sdk.z.c.a.a.e.k.f3504a, d.this.f2799e.f3308b.a(e.c.f3330f, "-1"));
            l.a((Object) d.this.f2804j, true, true);
            d.this.a(this.f3196b);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d.e
        public boolean a(DialogInterface.OnClickListener onClickListener) {
            return false;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d.e
        public void onDownloadTipsDialogDismiss() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d.e
        public void onDownloadTipsDialogShow() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.t.a f3198a;

        c(d dVar, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
            this.f3198a = aVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.f.a
        public void a() {
            this.f3198a.onVideoCompleted();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.f.a
        public void b() {
            this.f3198a.onVideoReady();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.f.a
        public void c() {
            this.f3198a.onVideoPause();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.f.a
        public void d() {
            this.f3198a.onVideoResume();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.f.a
        public void onVideoPlayError(int i4, int i5) {
            com.aggmoread.sdk.z.c.a.a.c.t.a aVar = this.f3198a;
            aVar.a(new i(i4, "msg:" + i5));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.f.a
        public void onVideoPlayStart() {
            this.f3198a.onVideoStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0135d implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private e f3199a;

        public C0135d(d dVar, e eVar) {
            this.f3199a = eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if ("onAdClicked".equals(name)) {
                this.f3199a.a((View) objArr[0], (KsNativeAd) objArr[1]);
                return null;
            } else if ("onAdShow".equals(name)) {
                this.f3199a.a((KsNativeAd) objArr[0]);
                return null;
            } else if ("handleDownloadDialog".equals(name)) {
                return Boolean.valueOf(this.f3199a.a((DialogInterface.OnClickListener) objArr[0]));
            } else {
                if ("onDownloadTipsDialogShow".equals(name)) {
                    this.f3199a.onDownloadTipsDialogShow();
                    return null;
                } else if ("onDownloadTipsDialogDismiss".equals(name)) {
                    this.f3199a.onDownloadTipsDialogDismiss();
                    return null;
                } else {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface e {
        void a(View view, KsNativeAd ksNativeAd);

        void a(KsNativeAd ksNativeAd);

        boolean a(DialogInterface.OnClickListener onClickListener);

        void onDownloadTipsDialogDismiss();

        void onDownloadTipsDialogShow();
    }

    public d(KsNativeAd ksNativeAd, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f3191n = ksNativeAd;
        com.aggmoread.sdk.z.c.a.a.d.a.c cVar = dVar.f3276t;
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f2840l, com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(ksNativeAd), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.aggmoread.sdk.z.c.a.a.d.b.m.a a(android.view.View r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d.a(android.view.View, android.view.View, android.view.ViewGroup):com.aggmoread.sdk.z.c.a.a.d.b.m.a");
    }

    private void a(MediaView mediaView, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        if (mediaView != null) {
            mediaView.removeAllViews();
            this.f3191n.setVideoPlayListener(new f().a(new c(this, aVar)));
            com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f2798d.f3275s;
            KsAdVideoPlayConfig ksAdVideoPlayConfig = null;
            if (bVar != null) {
                KsAdVideoPlayConfig.Builder builder = new KsAdVideoPlayConfig.Builder();
                builder.videoSoundEnable(!bVar.d());
                builder.dataFlowAutoStart(bVar.a() == 1);
                ksAdVideoPlayConfig = builder.build();
            }
            View videoView = this.f3191n.getVideoView(mediaView.getContext().getApplicationContext(), ksAdVideoPlayConfig);
            if (videoView != null) {
                ViewParent parent = videoView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(videoView);
                }
                mediaView.addView(videoView);
            }
        }
    }

    private com.aggmoread.sdk.z.c.a.a.c.c e() {
        try {
            com.aggmoread.sdk.z.c.a.a.c.c a5 = com.aggmoread.sdk.z.c.a.a.c.c.a(this.f3191n.getAppName(), this.f3191n.getProductName(), this.f3191n.getAppPackageSize(), this.f3191n.getPermissionInfoUrl(), this.f3191n.getAppPrivacyUrl(), this.f3191n.getAppVersion());
            a5.c(this.f3191n.getAppPackageName());
            a5.a(this.f3191n.getIntroductionInfoUrl());
            return a5;
        } catch (Exception e5) {
            String str = f3188q;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "err " + e5);
            return null;
        }
    }

    private void i() {
    }

    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, View view3, @NonNull e.a aVar) {
        String str;
        String str2;
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3188q, "enter");
        if (list == null) {
            list = new ArrayList<>();
        }
        List<View> list2 = list;
        View view4 = view3 != null ? view3 : view;
        if (list2.contains(view4)) {
            str = f3188q;
            str2 = "ovov + true";
        } else {
            str = f3188q;
            str2 = "ovov + false";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, str2);
        if (m.a(this.f2799e) && !list2.contains(view4)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3188q, "ovov ");
            list2.add(view4);
        }
        this.f2797c = aVar;
        FrameLayout frameLayout = new FrameLayout(context);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a a5 = a(view, view3, frameLayout);
        a(context, frameLayout, layoutParams, list2, this.f2805k, aVar);
        a(this.f2805k.get(), view2 != null ? new View[]{view2} : new View[0]);
        return a5;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public View a(@NonNull Context context, View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, @NonNull e.a aVar) {
        return a(context, view, layoutParams, list, view2, null, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams, List<View> list, WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference, e.a aVar) {
        KsNativeAd ksNativeAd = this.f3191n;
        if (ksNativeAd == null || viewGroup == null) {
            return;
        }
        ksNativeAd.setDownloadListener(new a(this, aVar));
        b bVar = new b(weakReference, aVar);
        i();
        this.f3191n.registerViewForInteraction(viewGroup, list, (KsNativeAd.AdInteractionListener) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{KsNativeAd.AdInteractionListener.class}, new C0135d(this, bVar)));
        Iterator<View> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = f3188q;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "clickView " + it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, View[] viewArr) {
        l.a(this.f2798d.f3258b, this.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, view, viewArr, this.f3193p, this.f3192o);
        l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
        byte[] b5 = this.f2798d.f3274r.b();
        if (b5 != null) {
            l.a(this.f2798d.f3258b, b5);
        }
        l.a(this.f2804j, this.f2799e);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void a(@NonNull ViewGroup viewGroup, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3188q, "ENTER");
        if (viewGroup != null) {
            Object obj = f3190s;
            MediaView mediaView = (MediaView) viewGroup.findViewWithTag(obj);
            if (mediaView == null) {
                mediaView = new MediaView(viewGroup.getContext().getApplicationContext());
                mediaView.setTag(obj);
                viewGroup.addView(mediaView, new ViewGroup.LayoutParams(-1, -1));
            }
            a(mediaView, aVar);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d
    public void b(int i4) {
        super.b(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f3191n, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3191n, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int f() {
        return this.f3191n.getVideoDuration();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public com.aggmoread.sdk.z.c.a.a.c.c g() {
        return e();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAdPatternType() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.u.d.a(this.f3191n.getMaterialType());
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppScore() {
        return (int) this.f3191n.getAppScore();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getDesc() {
        return this.f3191n.getAdDescription();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getIconUrl() {
        return this.f3191n.getAppIconUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getImageUrl() {
        List<String> imageUrlList = getImageUrlList();
        if (imageUrlList == null || imageUrlList.size() <= 0) {
            return null;
        }
        return imageUrlList.get(0);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public List<String> getImageUrlList() {
        ArrayList arrayList = new ArrayList();
        if (this.f3191n.getImageList() != null) {
            for (KsImage ksImage : this.f3191n.getImageList()) {
                arrayList.add(ksImage.getImageUrl());
            }
        }
        return arrayList;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureHeight() {
        List<KsImage> imageList = this.f3191n.getImageList();
        return (imageList == null || imageList.size() <= 0) ? super.getPictureHeight() : imageList.get(0).getHeight();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureWidth() {
        List<KsImage> imageList = this.f3191n.getImageList();
        return (imageList == null || imageList.size() <= 0) ? super.getPictureWidth() : imageList.get(0).getWidth();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getTitle() {
        String appName = this.f3191n.getAppName();
        return !TextUtils.isEmpty(appName) ? appName : this.f3191n.getProductName();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isAppAd() {
        return this.f3191n.getInteractionType() == 1;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isVideoAd() {
        return this.f3191n.getMaterialType() == 1;
    }
}
