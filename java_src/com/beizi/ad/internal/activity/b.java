package com.beizi.ad.internal.activity;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.beizi.ad.AdActivity;
import com.beizi.ad.R;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.video.AdVideoView;
import com.beizi.ad.internal.view.AdWebView;
import com.beizi.ad.internal.view.InterstitialAdViewImpl;
import com.beizi.ad.internal.view.e;
/* compiled from: InterstitialAdActivity.java */
/* loaded from: classes2.dex */
public class b implements AdActivity.a {

    /* renamed from: a  reason: collision with root package name */
    private Activity f5760a;

    /* renamed from: b  reason: collision with root package name */
    private AdWebView f5761b;

    /* renamed from: c  reason: collision with root package name */
    private com.beizi.ad.internal.view.c f5762c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f5763d;

    /* renamed from: e  reason: collision with root package name */
    private long f5764e;

    /* renamed from: f  reason: collision with root package name */
    private InterstitialAdViewImpl f5765f;

    public b(Activity activity) {
        this.f5760a = activity;
    }

    private void h() {
        if (this.f5760a != null) {
            InterstitialAdViewImpl interstitialAdViewImpl = this.f5765f;
            if (interstitialAdViewImpl != null && interstitialAdViewImpl.getAdDispatcher() != null) {
                this.f5765f.getAdDispatcher().b();
            }
            this.f5760a.finish();
        }
    }

    @Override // com.beizi.ad.AdActivity.a
    public void a() {
        InterstitialAdViewImpl interstitialAdViewImpl = InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE;
        if (interstitialAdViewImpl == null || interstitialAdViewImpl.getAdQueue().peek() == null || !(InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getAdQueue().peek().d() instanceof AdWebView)) {
            return;
        }
        this.f5760a.setTheme(R.style.BeiZiDialogStyle);
        AdWebView adWebView = (AdWebView) InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getAdQueue().peek().d();
        adWebView.getSettings().setLoadsImagesAutomatically(true);
        if (adWebView.isVideoFullScreen()) {
            this.f5760a.setTheme(R.style.BeiZiTheme_Transparent);
            this.f5760a.requestWindowFeature(1);
            this.f5760a.getWindow().setFlags(1024, 1024);
        }
        this.f5763d = new FrameLayout(this.f5760a);
        this.f5763d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.f5760a.setContentView(this.f5763d);
        try {
            this.f5764e = this.f5760a.getIntent().getLongExtra(InterstitialAdViewImpl.INTENT_KEY_TIME, System.currentTimeMillis());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        a(InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE);
    }

    @Override // com.beizi.ad.AdActivity.a
    public void b() {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f5765f;
        if (interstitialAdViewImpl == null || interstitialAdViewImpl.getAdDispatcher() == null || this.f5765f.isRewardedVideo() || this.f5760a == null) {
            return;
        }
        this.f5765f.getAdDispatcher().b();
        this.f5760a.finish();
    }

    @Override // com.beizi.ad.AdActivity.a
    public void c() {
        AdWebView adWebView = this.f5761b;
        if (adWebView != null) {
            ViewUtil.removeChildFromParent(adWebView);
            this.f5761b.destroy();
            AdVideoView adVideoView = this.f5761b.mAdVideoView;
            if (adVideoView != null) {
                adVideoView.destroy();
            }
        }
        InterstitialAdViewImpl interstitialAdViewImpl = this.f5765f;
        if (interstitialAdViewImpl != null) {
            interstitialAdViewImpl.setAdImplementation(null);
        }
        this.f5760a.finish();
    }

    @Override // com.beizi.ad.AdActivity.a
    public void d() {
    }

    @Override // com.beizi.ad.AdActivity.a
    public void e() {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f5765f;
        if (interstitialAdViewImpl == null || !interstitialAdViewImpl.shouldDismissOnClick()) {
            return;
        }
        h();
    }

    @Override // com.beizi.ad.AdActivity.a
    public WebView f() {
        return this.f5761b;
    }

    public void g() {
        com.beizi.ad.internal.view.c realDisplayable;
        com.beizi.ad.internal.view.c cVar;
        AdWebView adWebView = this.f5761b;
        if (adWebView == null || (realDisplayable = adWebView.getRealDisplayable()) == (cVar = this.f5762c)) {
            return;
        }
        this.f5763d.removeView(cVar.getView());
        if (realDisplayable instanceof AdVideoView) {
            this.f5763d.addView(realDisplayable.getView(), new ViewGroup.LayoutParams(-1, -1));
        } else {
            this.f5763d.addView(realDisplayable.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        this.f5762c = realDisplayable;
        realDisplayable.visible();
    }

    private void a(InterstitialAdViewImpl interstitialAdViewImpl) {
        this.f5765f = interstitialAdViewImpl;
        if (interstitialAdViewImpl == null) {
            return;
        }
        interstitialAdViewImpl.setAdImplementation(this);
        this.f5763d.setBackgroundColor(this.f5765f.getBackgroundColor());
        this.f5763d.removeAllViews();
        if (this.f5765f.getParent() != null) {
            ((ViewGroup) this.f5765f.getParent()).removeAllViews();
        }
        e poll = this.f5765f.getAdQueue().poll();
        while (poll != null && (this.f5764e - poll.a() > InterstitialAdViewImpl.MAX_AGE || this.f5764e - poll.a() < 0)) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.too_old));
            poll = this.f5765f.getAdQueue().poll();
        }
        if (poll == null || !(poll.d() instanceof AdWebView)) {
            return;
        }
        AdWebView adWebView = (AdWebView) poll.d();
        this.f5761b = adWebView;
        if (adWebView.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) this.f5761b.getContext()).setBaseContext(this.f5760a);
            AdVideoView adVideoView = this.f5761b.mAdVideoView;
            if (adVideoView != null) {
                ((MutableContextWrapper) adVideoView.getContext()).setBaseContext(this.f5760a);
            }
        }
        if ((this.f5761b.getCreativeWidth() != 1 || this.f5761b.getCreativeHeight() != 1) && this.f5760a.getResources().getConfiguration().orientation != 2) {
            int i4 = 0;
            try {
                i4 = this.f5765f.getAdParameters().b().getApplicationInfo().targetSdkVersion;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (i4 <= 26 || Build.VERSION.SDK_INT != 26) {
                AdActivity.a(this.f5760a, this.f5761b.getOrientation());
            }
        }
        this.f5762c = this.f5761b.getRealDisplayable();
        AdWebView adWebView2 = this.f5761b;
        if (adWebView2.mAdVideoView != null) {
            this.f5763d.addView(adWebView2.getRealDisplayable().getView(), new FrameLayout.LayoutParams(-2, -2, 17));
        } else if (this.f5760a.getRequestedOrientation() == 0) {
            this.f5763d.addView(this.f5761b.getRealDisplayable().getView(), new FrameLayout.LayoutParams((int) (this.f5761b.getCreativeHeight() * g.a().f5899j), (int) (this.f5761b.getCreativeWidth() * g.a().f5900k), 17));
        } else if (this.f5760a.getRequestedOrientation() == 1) {
            this.f5763d.addView(this.f5761b.getRealDisplayable().getView(), new FrameLayout.LayoutParams((int) (this.f5761b.getCreativeWidth() * g.a().f5899j), (int) (this.f5761b.getCreativeHeight() * g.a().f5900k), 17));
        } else {
            this.f5763d.addView(this.f5761b.getRealDisplayable().getView(), new FrameLayout.LayoutParams((int) (this.f5761b.getCreativeWidth() * g.a().f5899j), (int) (this.f5761b.getCreativeHeight() * g.a().f5900k), 17));
        }
        this.f5762c.visible();
    }
}
