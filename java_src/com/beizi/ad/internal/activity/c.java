package com.beizi.ad.internal.activity;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import com.beizi.ad.AdActivity;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.view.AdViewImpl;
import com.beizi.ad.internal.view.AdWebView;
import com.beizi.ad.internal.view.f;
/* compiled from: MRAIDAdActivity.java */
/* loaded from: classes2.dex */
public class c implements AdActivity.a {

    /* renamed from: a  reason: collision with root package name */
    private Activity f5766a;

    /* renamed from: b  reason: collision with root package name */
    private AdWebView f5767b;

    /* renamed from: c  reason: collision with root package name */
    private f f5768c = null;

    public c(Activity activity) {
        this.f5766a = activity;
    }

    @Override // com.beizi.ad.AdActivity.a
    public void a() {
        if (AdViewImpl.getMRAIDFullscreenContainer() != null && AdViewImpl.getMRAIDFullscreenImplementation() != null) {
            ViewUtil.removeChildFromParent(AdViewImpl.getMRAIDFullscreenContainer());
            this.f5766a.setContentView(AdViewImpl.getMRAIDFullscreenContainer());
            if (AdViewImpl.getMRAIDFullscreenContainer().getChildAt(0) instanceof AdWebView) {
                this.f5767b = (AdWebView) AdViewImpl.getMRAIDFullscreenContainer().getChildAt(0);
            }
            if (this.f5767b.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) this.f5767b.getContext()).setBaseContext(this.f5766a);
            }
            f mRAIDFullscreenImplementation = AdViewImpl.getMRAIDFullscreenImplementation();
            this.f5768c = mRAIDFullscreenImplementation;
            mRAIDFullscreenImplementation.a(this.f5766a);
            if (AdViewImpl.getMRAIDFullscreenListener() != null) {
                AdViewImpl.getMRAIDFullscreenListener().a();
                return;
            }
            return;
        }
        HaoboLog.e(HaoboLog.baseLogTag, "Launched MRAID Fullscreen activity with invalid properties");
        this.f5766a.finish();
    }

    @Override // com.beizi.ad.AdActivity.a
    public void b() {
        f fVar = this.f5768c;
        if (fVar != null) {
            fVar.a((Activity) null);
            this.f5768c.a();
        }
        this.f5768c = null;
    }

    @Override // com.beizi.ad.AdActivity.a
    public void c() {
    }

    @Override // com.beizi.ad.AdActivity.a
    public void d() {
    }

    @Override // com.beizi.ad.AdActivity.a
    public void e() {
    }

    @Override // com.beizi.ad.AdActivity.a
    public WebView f() {
        return this.f5767b;
    }
}
