package com.beizi.fusion.d;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.beizi.fusion.SplashAd;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.work.splash.c;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import java.lang.ref.SoftReference;
import java.util.List;
/* compiled from: ClickEyeManager.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f6728a;

    /* renamed from: c  reason: collision with root package name */
    private static SplashAd.SplashClickEyeListener f6729c;

    /* renamed from: b  reason: collision with root package name */
    private Context f6730b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6731d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClickEyeManager.java */
    /* loaded from: classes2.dex */
    public static class a implements CSJSplashAd.SplashClickEyeListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f6736a = true;

        /* renamed from: b  reason: collision with root package name */
        private SoftReference<View> f6737b;

        /* renamed from: c  reason: collision with root package name */
        private SoftReference<CSJSplashAd> f6738c;

        /* renamed from: d  reason: collision with root package name */
        private Context f6739d;

        public a(Context context, View view, CSJSplashAd cSJSplashAd) {
            this.f6737b = new SoftReference<>(view);
            this.f6738c = new SoftReference<>(cSJSplashAd);
            this.f6739d = context;
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
        public void onSplashClickEyeClick() {
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
        public void onSplashClickEyeClose() {
            SoftReference<View> softReference = this.f6737b;
            if (softReference != null && softReference.get() != null) {
                this.f6737b.get().setVisibility(8);
                av.a(this.f6737b.get());
                this.f6737b = null;
                this.f6738c = null;
            }
            if (g.f6729c != null && this.f6736a) {
                g.f6729c.onSplashClickEyeAnimationFinish();
                this.f6736a = false;
            }
            com.beizi.fusion.work.splash.c.a(this.f6739d).a();
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
        public void onSplashClickEyeReadyToShow(CSJSplashAd cSJSplashAd) {
        }
    }

    private g() {
    }

    public static g a() {
        if (f6728a == null) {
            synchronized (g.class) {
                if (f6728a == null) {
                    f6728a = new g();
                }
            }
        }
        return f6728a;
    }

    public boolean b() {
        return this.f6731d;
    }

    private View b(final Activity activity) {
        final com.beizi.fusion.work.splash.c a5 = com.beizi.fusion.work.splash.c.a(this.f6730b);
        final CSJSplashAd b5 = a5.b();
        return a5.a((ViewGroup) activity.getWindow().getDecorView(), (ViewGroup) activity.findViewById(16908290), new c.a() { // from class: com.beizi.fusion.d.g.1
            @Override // com.beizi.fusion.work.splash.c.a
            public void a() {
                CSJSplashAd cSJSplashAd = b5;
                if (cSJSplashAd != null) {
                    cSJSplashAd.showSplashClickEyeView((ViewGroup) activity.findViewById(16908290));
                    a5.a();
                }
            }

            @Override // com.beizi.fusion.work.splash.c.a
            public void a(int i4) {
            }
        });
    }

    public void a(SplashAd.SplashClickEyeListener splashClickEyeListener) {
        f6729c = splashClickEyeListener;
    }

    public void a(String str, boolean z4, boolean z5) {
        this.f6731d = z4;
        SplashAd.SplashClickEyeListener splashClickEyeListener = f6729c;
        if (splashClickEyeListener == null || !z5) {
            return;
        }
        splashClickEyeListener.isSupportSplashClickEye(z4);
    }

    public void a(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        this.f6730b = applicationContext;
        AdSpacesBean a5 = com.beizi.fusion.c.a.a(applicationContext, str, "2");
        if (a5 != null) {
            AdSpacesBean.ComponentBean component = a5.getComponent();
            List<AdSpacesBean.BuyerBean> buyer = a5.getBuyer();
            List<AdSpacesBean.ForwardBean> a6 = com.beizi.fusion.f.b.a(component, buyer, str);
            if (a6.size() > 0) {
                for (int i4 = 0; i4 < a6.size(); i4++) {
                    AdSpacesBean.ForwardBean forwardBean = a6.get(i4);
                    String buyerId = forwardBean.getBuyerId();
                    if (com.beizi.fusion.f.b.a(buyerId, buyer, forwardBean.getBuyerSpaceUuId()) != null && buyerId.equalsIgnoreCase("CSJ")) {
                        a(activity);
                        return;
                    }
                }
            }
        }
    }

    private void a(Activity activity) {
        if (activity == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        this.f6730b = applicationContext;
        com.beizi.fusion.work.splash.c a5 = com.beizi.fusion.work.splash.c.a(applicationContext);
        if (b()) {
            View b5 = b(activity);
            CSJSplashAd b6 = a5.b();
            a aVar = new a(this.f6730b, b5, b6);
            if (b6 != null) {
                b6.setSplashClickEyeListener(aVar);
            }
        }
    }
}
