package com.beizi.ad.internal.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.beizi.ad.AdActivity;
import com.beizi.ad.R;
import com.beizi.ad.internal.activity.BeiZiInterstitialActivity;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.lance.a.l;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes2.dex */
public class InterstitialAdViewImpl extends AdViewImpl {
    public static final String INTENT_KEY_CLOSE_BUTTON_DELAY = "CLOSE_BUTTON_DELAY";
    public static final String INTENT_KEY_TIME = "TIME";
    public static InterstitialAdViewImpl INTERSTITIALADVIEW_TO_USE = null;
    public static final long MAX_AGE = 270000;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f6362m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f6363n;

    /* renamed from: o  reason: collision with root package name */
    private int f6364o;

    /* renamed from: p  reason: collision with root package name */
    private int f6365p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6366q;

    /* renamed from: r  reason: collision with root package name */
    private Queue<e> f6367r;

    /* renamed from: s  reason: collision with root package name */
    private AdActivity.a f6368s;

    /* renamed from: t  reason: collision with root package name */
    private AdSpacesBean.BuyerBean f6369t;

    public InterstitialAdViewImpl(Context context, boolean z4, boolean z5) {
        super(context);
        this.f6364o = 0;
        this.f6365p = 10000;
        this.f6367r = new LinkedList();
        this.f6368s = null;
        this.f6362m = false;
        this.f6363n = false;
        this.f6185j = z4;
        this.f6186k = z5;
        if (z4) {
            this.f6364o = -16777216;
        } else if (z5) {
            this.f6364o = 0;
        } else {
            this.f6364o = Color.argb(51, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        this.mAdFetcher.a(-1);
        this.f6183h.a(j.INTERSTITIAL);
        try {
            View view = (View) getParent();
            if (view != null) {
                int measuredHeight = view.getMeasuredHeight();
                int measuredHeight2 = view.getMeasuredHeight();
                com.beizi.ad.internal.g a5 = com.beizi.ad.internal.g.a();
                this.f6183h.d((int) ((measuredHeight2 / a5.h()) + 0.5f));
                this.f6183h.e((int) ((measuredHeight / a5.i()) + 0.5f));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnDestroy() {
        this.f6362m = true;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnPause() {
        this.f6363n = true;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnResume() {
        this.f6363n = false;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AdView);
        int indexCount = obtainStyledAttributes.getIndexCount();
        HaoboLog.v(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.found_n_in_xml, indexCount));
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == R.styleable.AdView_beizi_adUnitId) {
                setAdUnitId(obtainStyledAttributes.getString(index));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.placement_id, obtainStyledAttributes.getString(index)));
            } else if (index == R.styleable.AdView_test) {
                com.beizi.ad.internal.g.a().f5895c = obtainStyledAttributes.getBoolean(index, false);
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_set_test, com.beizi.ad.internal.g.a().f5895c));
            } else if (index == R.styleable.AdView_opens_native_browser) {
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_set_opens_native_browser));
                setOpensNativeBrowser(obtainStyledAttributes.getBoolean(index, false));
            } else if (index == R.styleable.AdView_show_loading_indicator) {
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.show_loading_indicator_xml));
                setShowLoadingIndicator(obtainStyledAttributes.getBoolean(index, true));
            } else if (index == R.styleable.AdView_load_landing_page_in_background) {
                setLoadsInBackground(obtainStyledAttributes.getBoolean(index, true));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_load_landing_page_in_background, this.f6182g));
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void cancel() {
        com.beizi.ad.internal.c cVar = this.mAdFetcher;
        if (cVar != null) {
            cVar.a();
        }
        INTERSTITIALADVIEW_TO_USE = null;
        this.f6367r.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean d() {
        return false;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void destroy() {
        super.destroy();
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.destroy_int));
        com.beizi.ad.internal.c cVar = this.mAdFetcher;
        if (cVar != null) {
            cVar.a();
        }
        this.f6367r.clear();
        INTERSTITIALADVIEW_TO_USE = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void f() {
        AdActivity.a aVar = this.f6368s;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        AdActivity.a aVar = this.f6368s;
        if (aVar != null) {
            aVar.e();
        }
    }

    public AdSpacesBean.BuyerBean getAdBuyerBean() {
        return this.f6369t;
    }

    public AdActivity.a getAdImplementation() {
        return this.f6368s;
    }

    public Queue<e> getAdQueue() {
        return this.f6367r;
    }

    public int getBackgroundColor() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.get_bg));
        return this.f6364o;
    }

    public int getCloseButtonDelay() {
        return this.f6365p;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public int getCreativeHeight() {
        return -1;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public int getCreativeWidth() {
        return -1;
    }

    @Override // com.beizi.ad.internal.a
    public j getMediaType() {
        return j.INTERSTITIAL;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean loadAd(a.C0179a c0179a) {
        com.beizi.ad.internal.c cVar;
        getAdParameters().a(false);
        this.f6184i = c0179a;
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.load_ad_int));
        if (isReadyToStart() && (cVar = this.mAdFetcher) != null) {
            cVar.a();
            this.mAdFetcher.b();
            this.loadCount = 1;
            this.clickCount = 0;
            return true;
        }
        return false;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, com.beizi.ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, com.beizi.ad.AdLifeControl
    public void onDestoryLifeCycle() {
        com.beizi.ad.internal.c cVar = this.mAdFetcher;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.ad.internal.view.AdViewImpl, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, com.beizi.ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, com.beizi.ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, com.beizi.ad.AdLifeControl
    public void onResumeLifeCycle() {
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, com.beizi.ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, com.beizi.ad.AdLifeControl
    public void onStopLifeCycle() {
    }

    public void setAdBuyerBean(AdSpacesBean.BuyerBean buyerBean) {
        this.f6369t = buyerBean;
    }

    public void setAdImplementation(AdActivity.a aVar) {
        this.f6368s = aVar;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.set_bg));
        this.f6364o = i4;
    }

    public void setCloseButtonDelay(int i4) {
        this.f6365p = Math.min(i4, 10000);
    }

    public void setDismissOnClick(boolean z4) {
        this.f6366q = z4;
    }

    public boolean shouldDismissOnClick() {
        return this.f6366q;
    }

    public int show() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.show_int));
        long currentTimeMillis = System.currentTimeMillis();
        boolean a5 = a(currentTimeMillis);
        e peek = this.f6367r.peek();
        if (peek != null && peek.b() && peek.c() != null) {
            peek.c().c();
            this.f6367r.poll();
            return this.f6367r.size();
        } else if (a5 && !this.f6362m) {
            Class a6 = AdActivity.a();
            Intent intent = new Intent(getContext(), a6);
            intent.putExtra("ACTIVITY_TYPE", "INTERSTITIAL");
            intent.putExtra(INTENT_KEY_TIME, currentTimeMillis);
            intent.putExtra(INTENT_KEY_CLOSE_BUTTON_DELAY, this.f6365p);
            INTERSTITIALADVIEW_TO_USE = this;
            try {
                getContext().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                INTERSTITIALADVIEW_TO_USE = null;
                HaoboLog.e(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_missing, a6.getName()));
            }
            return this.f6367r.size() - 1;
        } else {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.empty_queue));
            return this.f6367r.size();
        }
    }

    public void showInterstitial(Context context) {
        l.c("BeiZisAd", "showInterstitial");
        INTERSTITIALADVIEW_TO_USE = this;
        context.startActivity(new Intent(context, BeiZiInterstitialActivity.class));
    }

    public InterstitialAdViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6364o = 0;
        this.f6365p = 10000;
        this.f6367r = new LinkedList();
        this.f6368s = null;
        this.f6362m = false;
        this.f6363n = false;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(c cVar) {
        if (b(cVar)) {
            c cVar2 = this.f6178c;
            if (cVar2 != null) {
                cVar2.destroy();
            }
            if (!this.f6362m && !this.f6363n) {
                this.f6178c = cVar;
                this.f6367r.add(new d(cVar, Long.valueOf(System.currentTimeMillis()), false, null));
            } else if (cVar != null) {
                cVar.destroy();
            }
        }
    }

    public InterstitialAdViewImpl(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6364o = 0;
        this.f6365p = 10000;
        this.f6367r = new LinkedList();
        this.f6368s = null;
        this.f6362m = false;
        this.f6363n = false;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(com.beizi.ad.internal.a.e eVar) {
        if (b(eVar)) {
            c cVar = this.f6178c;
            if (cVar != null) {
                cVar.destroy();
            }
            if (!this.f6362m && !this.f6363n) {
                this.f6178c = eVar;
                this.f6367r.add(new d(eVar, Long.valueOf(System.currentTimeMillis()), true, eVar.a()));
            } else if (eVar != null) {
                eVar.destroy();
            }
        }
    }

    private boolean a(long j4) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f6367r) {
            if (eVar != null && j4 - eVar.a() <= MAX_AGE && j4 - eVar.a() >= 0 && (!eVar.b() || !eVar.c().d())) {
                z4 = true;
                break;
            }
            arrayList.add(eVar);
        }
        z4 = false;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f6367r.remove((e) it2.next());
        }
        return z4;
    }

    private boolean b(c cVar) {
        if (cVar == null || cVar.failed()) {
            HaoboLog.e(HaoboLog.baseLogTag, "Loaded an ad with an invalid displayable");
            return false;
        }
        return true;
    }
}
