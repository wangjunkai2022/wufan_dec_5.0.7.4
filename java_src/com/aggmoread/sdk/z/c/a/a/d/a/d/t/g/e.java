package com.aggmoread.sdk.z.c.a.a.d.a.d.t.g;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.j;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import com.qq.e.comm.util.AdError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e extends com.aggmoread.sdk.z.c.a.a.d.a.d.d {

    /* renamed from: r  reason: collision with root package name */
    protected static String f3122r = "AMUTAGGDT";

    /* renamed from: s  reason: collision with root package name */
    private static final Object f3123s = new Object();

    /* renamed from: t  reason: collision with root package name */
    private static final Object f3124t = new Object();

    /* renamed from: n  reason: collision with root package name */
    public NativeUnifiedADData f3125n;

    /* renamed from: o  reason: collision with root package name */
    public int f3126o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f3127p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference<View> f3128q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements NativeADEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f3129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f3130b;

        a(WeakReference weakReference, e.a aVar) {
            this.f3129a = weakReference;
            this.f3130b = aVar;
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADClicked() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(e.f3122r, "onADClicked");
            e eVar = e.this;
            eVar.f2800f++;
            k kVar = new k(eVar.f2798d, eVar.f2799e);
            k a5 = kVar.a(k.b.f3448n, e.this.f2796b);
            com.aggmoread.sdk.z.c.a.a.d.b.e eVar2 = e.this.f2799e;
            WeakReference weakReference = this.f3129a;
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = weakReference == null ? null : (com.aggmoread.sdk.z.c.a.a.d.b.m.a) weakReference.get();
            e eVar3 = e.this;
            boolean a6 = a5.a(eVar2, aVar, eVar3.f2801g, eVar3.f2804j);
            kVar.b();
            l.a((Object) e.this.f2804j, false, true);
            if (a6) {
                this.f3130b.onAdClicked();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADError(AdError adError) {
            com.aggmoread.sdk.z.c.a.a.e.e.a(e.f3122r, "onADError %s", adError);
            e.this.a(new i(adError.getErrorCode(), adError.getErrorMsg()));
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADExposed() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(e.f3122r, "onADExposed ");
            new HashMap();
            e.this.f2801g = System.currentTimeMillis();
            l.a((Object) e.this.f2804j, true, true);
            e.this.a(this.f3130b);
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADStatusChanged() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(e.f3122r, "onADStatusChanged");
            e.a aVar = this.f3130b;
            if (aVar instanceof e.b) {
                ((e.b) aVar).onADStatusChanged(e.this.f3125n.getAppStatus());
                if (e.this.f3125n.getAppStatus() == 4) {
                    ((e.b) this.f3130b).onLoadApkProgress(e.this.f3125n.getProgress());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements NativeADMediaListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.t.a f3132a;

        b(e eVar, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
            this.f3132a = aVar;
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoClicked() {
            this.f3132a.onVideoClicked();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoCompleted() {
            this.f3132a.onVideoCompleted();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoError(AdError adError) {
            this.f3132a.a(new i(adError.getErrorCode(), adError.getErrorMsg()));
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoInit() {
            this.f3132a.onVideoInit();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoLoaded(int i4) {
            this.f3132a.onVideoLoaded(i4);
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoLoading() {
            this.f3132a.onVideoLoading();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoPause() {
            this.f3132a.onVideoPause();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoReady() {
            this.f3132a.onVideoReady();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoResume() {
            this.f3132a.onVideoResume();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoStart() {
            this.f3132a.onVideoStart();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoStop() {
            this.f3132a.onVideoStop();
        }
    }

    public e(NativeUnifiedADData nativeUnifiedADData, NativeUnifiedAD nativeUnifiedAD, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map, int i4) {
        super(dVar, eVar, map);
        this.f3125n = nativeUnifiedADData;
        this.f3126o = i4;
        if (nativeUnifiedADData != null) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f2840l, nativeUnifiedADData, eVar);
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
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.e.a(android.view.View, android.view.View, android.view.ViewGroup):com.aggmoread.sdk.z.c.a.a.d.b.m.a");
    }

    private void a(MediaView mediaView, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        if (mediaView != null) {
            com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f2798d.f3275s;
            VideoOption.Builder builder = new VideoOption.Builder();
            if (bVar != null) {
                builder.setAutoPlayMuted(bVar.d());
                builder.setAutoPlayPolicy(bVar.a());
                builder.setEnableDetailPage(bVar.f());
                builder.setNeedCoverImage(bVar.g());
                builder.setNeedProgressBar(bVar.h());
            }
            this.f3125n.bindMediaView(mediaView, builder.build(), new b(this, aVar));
        }
    }

    private JSONObject e() {
        try {
            Object a5 = j.a(this.f3125n, "a");
            Object a6 = j.a(a5, com.kwad.sdk.m.e.TAG);
            if (a6 == null || !"com.qq.e.comm.plugin.nativeadunified.g".equals(a6.getClass().getName())) {
                a6 = j.a(a5, "a");
            }
            Class<? super Object> superclass = a6.getClass().getSuperclass();
            if (superclass != null) {
                String b5 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.b();
                char c5 = 65535;
                switch (b5.hashCode()) {
                    case 49445110:
                        if (b5.equals("4.440")) {
                            c5 = '\b';
                            break;
                        }
                        break;
                    case 49445143:
                        if (b5.equals("4.452")) {
                            c5 = '\t';
                            break;
                        }
                        break;
                    case 49445174:
                        if (b5.equals("4.462")) {
                            c5 = '\n';
                            break;
                        }
                        break;
                    case 49445176:
                        if (b5.equals("4.464")) {
                            c5 = 11;
                            break;
                        }
                        break;
                    case 49445204:
                        if (b5.equals("4.471")) {
                            c5 = '\f';
                            break;
                        }
                        break;
                    case 49445947:
                        if (b5.equals("4.500")) {
                            c5 = 7;
                            break;
                        }
                        break;
                    case 49446009:
                        if (b5.equals("4.520")) {
                            c5 = 6;
                            break;
                        }
                        break;
                    case 49446071:
                        if (b5.equals("4.540")) {
                            c5 = 5;
                            break;
                        }
                        break;
                    case 49446073:
                        if (b5.equals("4.542")) {
                            c5 = 4;
                            break;
                        }
                        break;
                    case 49446135:
                        if (b5.equals("4.562")) {
                            c5 = 3;
                            break;
                        }
                        break;
                    case 49446164:
                        if (b5.equals("4.570")) {
                            c5 = 2;
                            break;
                        }
                        break;
                    case 49446169:
                        if (b5.equals("4.575")) {
                            c5 = 1;
                            break;
                        }
                        break;
                    case 49446195:
                        if (b5.equals("4.580")) {
                            c5 = 0;
                            break;
                        }
                        break;
                }
                String str = "L";
                switch (c5) {
                    case 6:
                    case 7:
                    case '\b':
                        str = "M";
                        break;
                    case '\t':
                        str = "N";
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                        str = "K";
                        break;
                }
                Object a7 = j.a(superclass, a6, str);
                if (a7 instanceof JSONObject) {
                    return (JSONObject) a7;
                }
                return null;
            }
            return null;
        } catch (Exception e5) {
            String str2 = f3122r;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "getAdInfoObj err " + e5.getMessage());
            return null;
        }
    }

    private com.aggmoread.sdk.z.c.a.a.c.c i() {
        try {
            Object invoke = this.f3125n.getClass().getMethod("getAppMiitInfo", new Class[0]).invoke(this.f3125n, new Object[0]);
            Object b5 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getAppName");
            Object b6 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getAuthorName");
            Object b7 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getPackageSizeBytes");
            Object b8 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getPermissionsUrl");
            Object b9 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getPrivacyAgreement");
            Object b10 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getVersionName");
            Object b11 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getDescriptionUrl");
            Object b12 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getIcpNumber");
            Object b13 = j.b(NativeUnifiedADAppMiitInfo.class, invoke, "getSuitableAge");
            String str = b5 instanceof String ? (String) b5 : null;
            String str2 = b6 instanceof String ? (String) b6 : null;
            long longValue = b7 instanceof Long ? ((Long) b7).longValue() : 0L;
            String str3 = b8 instanceof String ? (String) b8 : null;
            String str4 = b9 instanceof String ? (String) b9 : null;
            String str5 = b10 instanceof String ? (String) b10 : null;
            String str6 = b11 instanceof String ? (String) b11 : null;
            String str7 = b12 instanceof String ? (String) b12 : null;
            String str8 = b13 instanceof String ? (String) b13 : null;
            String j4 = j();
            com.aggmoread.sdk.z.c.a.a.c.c a5 = com.aggmoread.sdk.z.c.a.a.c.c.a(str, str2, longValue, str3, str4, str5);
            a5.c(j4);
            a5.a(str6);
            a5.b(str7);
            a5.d(str8);
            return a5;
        } catch (Exception e5) {
            String str9 = f3122r;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str9, "err " + e5);
            return null;
        }
    }

    private String j() {
        JSONObject optJSONObject;
        JSONObject e5 = e();
        String optString = (e5 == null || (optJSONObject = e5.optJSONObject("ext")) == null) ? "" : optJSONObject.optString("packagename");
        try {
            if (TextUtils.isEmpty(optString)) {
                String a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3125n);
                return (TextUtils.isEmpty(a5) || !a5.contains("pkgName")) ? optString : Uri.parse(a5).getQueryParameter("pkgName");
            }
            return optString;
        } catch (Exception e6) {
            String str = f3122r;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "gdt pkg err:  " + e6.getMessage());
            return optString;
        }
    }

    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, View view3, @NonNull e.a aVar) {
        String str;
        String str2;
        String str3 = f3122r;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str3, "enter " + view);
        if (this.f3126o == 91) {
            a(new i(1001006001, "GDT ad blocked"));
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        List<View> list2 = list;
        View view4 = view3 != null ? view3 : view;
        if (list2.contains(view4)) {
            str = f3122r;
            str2 = "ovov + true";
        } else {
            str = f3122r;
            str2 = "ovov + false";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, str2);
        if (m.a(this.f2799e) && !list2.contains(view4)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3122r, "ovov ");
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
    public void a(Context context, NativeAdContainer nativeAdContainer, FrameLayout.LayoutParams layoutParams, List<View> list, WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference, e.a aVar) {
        NativeUnifiedADData nativeUnifiedADData = this.f3125n;
        if (nativeUnifiedADData == null || nativeAdContainer == null) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(nativeUnifiedADData, c());
        this.f3125n.setNativeAdEventListener(new a(weakReference, aVar));
        Iterator<View> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = f3122r;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "clickView " + it2.next());
        }
        this.f3125n.bindAdToView(context, nativeAdContainer, layoutParams, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, View[] viewArr) {
        l.a(this.f2798d.f3258b, this.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, view, viewArr, this.f3128q, this.f3127p);
        l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
        byte[] b5 = this.f2798d.f3274r.b();
        if (b5 != null) {
            l.a(this.f2798d.f3258b, b5);
        }
        l.a(this.f2804j, this.f2799e);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void a(@NonNull ViewGroup viewGroup, com.aggmoread.sdk.z.c.a.a.c.t.a aVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3122r, "ENTER");
        if (viewGroup != null) {
            Object obj = f3124t;
            MediaView mediaView = (MediaView) viewGroup.findViewWithTag(obj);
            if (mediaView == null) {
                mediaView = new MediaView(viewGroup.getContext());
                mediaView.setTag(obj);
                viewGroup.addView(mediaView, new ViewGroup.LayoutParams(-1, -1));
            }
            a(mediaView, aVar);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d
    public void b(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3125n, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3125n, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void destroy() {
        this.f3125n.destroy();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int f() {
        return this.f3125n.getVideoDuration();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public com.aggmoread.sdk.z.c.a.a.c.c g() {
        return m.a("4.380") ? i() : super.g();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAdPatternType() {
        return this.f3125n.getAdPatternType();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public double getAppPrice() {
        return this.f3125n.getAppPrice();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppScore() {
        return this.f3125n.getAppScore();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppStatus() {
        return this.f3125n.getAppStatus();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getDesc() {
        return this.f3125n.getDesc();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public long getDownloadCount() {
        return this.f3125n.getDownloadCount();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getIconUrl() {
        return this.f3125n.getIconUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getImageUrl() {
        return this.f3125n.getImgUrl();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public List<String> getImageUrlList() {
        return this.f3125n.getImgList();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureHeight() {
        return this.f3125n.getPictureHeight();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureWidth() {
        return this.f3125n.getPictureWidth();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getProgress() {
        return this.f3125n.getProgress();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public String getTitle() {
        return this.f3125n.getTitle();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getVideoCurrentPosition() {
        return this.f3125n.getVideoCurrentPosition();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isAppAd() {
        return this.f3125n.isAppAd();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public boolean isVideoAd() {
        return this.f3125n.getAdPatternType() == 2;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void pauseVideo() {
        this.f3125n.pauseVideo();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resume() {
        this.f3125n.resume();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resumeVideo() {
        this.f3125n.resumeVideo();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void setVideoMute(boolean z4) {
        this.f3125n.setVideoMute(z4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void startVideo() {
        this.f3125n.startVideo();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.d, com.aggmoread.sdk.z.c.a.a.c.o.e
    public void stopVideo() {
        this.f3125n.stopVideo();
    }
}
