package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.MainThread;
import com.aggmoread.sdk.client.AMAdLoadSlot;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.AMSdk;
import com.aggmoread.sdk.client.splash.AMSplashAd;
import com.aggmoread.sdk.client.splash.AMSplashAdListener;
import com.aggmoread.sdk.client.splash.AMSplashInteractionListener;
import com.beizi.fusion.AdListener;
import com.beizi.fusion.SplashAd;
import com.beizi.fusion.widget.TwistView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTSplashAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.EmptyControlVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.activity.login.AbScreenUtils;
import com.join.mgps.adapter.LodingViewPagerAdapter;
import com.join.mgps.db.tables.ShowViewDataBeanTable;
import com.join.mgps.dto.FirstIntentData;
import com.join.mgps.dto.FirstScreenAdInteractionBean;
import com.join.mgps.dto.PlayCfgBean;
import com.join.mgps.dto.ShowViewDataBean;
import com.join.mgps.dto.SplashIntentBean;
import com.join.mgps.dto.ThAdSwitchDataBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService;
import com.join.mgps.shake.a;
import com.nineoldandroids.animation.q;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.wrapper.UserPrefs;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.json.JSONObject;
@EActivity(R.layout.splash_main_layout)
/* loaded from: classes4.dex */
public class SplashActivity extends Activity {
    public static final String X = "SplashActivity";
    private static final String Y = "点击跳过 %d";
    private LodingViewPagerAdapter A;
    private FirstIntentData B;
    private TTAdNative I;
    private int K;
    private Vibrator N;
    GestureDetector P;
    ShowViewDataBean T;
    SplashIntentBean U;
    private SplashAd V;
    AMSplashAd W;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f37876b;

    /* renamed from: c  reason: collision with root package name */
    EmptyControlVideoView f37877c;

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f37878d;

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f37879e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f37880f;
    @Pref

    /* renamed from: g  reason: collision with root package name */
    PrefDef_ f37881g;

    /* renamed from: h  reason: collision with root package name */
    TextView f37882h;

    /* renamed from: i  reason: collision with root package name */
    TextView f37883i;

    /* renamed from: j  reason: collision with root package name */
    View f37884j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    ThAdSwitchDataBean f37885k;
    @Extra

    /* renamed from: l  reason: collision with root package name */
    PlayCfgBean f37886l;
    @ViewById(R.id.splash_holder)

    /* renamed from: m  reason: collision with root package name */
    ImageView f37887m;
    @ViewById(R.id.skip_view)

    /* renamed from: n  reason: collision with root package name */
    TextView f37888n;

    /* renamed from: o  reason: collision with root package name */
    ImageView f37889o;

    /* renamed from: p  reason: collision with root package name */
    ImageView f37890p;

    /* renamed from: q  reason: collision with root package name */
    RelativeLayout f37891q;

    /* renamed from: r  reason: collision with root package name */
    LinearLayout f37892r;

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f37893s;

    /* renamed from: t  reason: collision with root package name */
    TextView f37894t;

    /* renamed from: u  reason: collision with root package name */
    TextView f37895u;

    /* renamed from: v  reason: collision with root package name */
    RelativeLayout f37896v;

    /* renamed from: w  reason: collision with root package name */
    private int f37897w = 2000;

    /* renamed from: x  reason: collision with root package name */
    private long f37898x = 0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f37899y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f37900z = false;
    FirstScreenAdInteractionBean C = null;
    int D = 4;
    private Handler E = new i();
    private boolean F = false;
    private boolean G = false;
    private int H = 1;
    private String J = "";
    private int L = 0;
    private com.join.mgps.shake.a M = null;
    a.InterfaceC0380a O = new k();
    com.nineoldandroids.animation.q Q = null;
    float R = 0.0f;
    float S = 0.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.f37877c.startPlayLogic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TTAdSdk.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f37903a;

        c(Context context) {
            this.f37903a = context;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i4, String str) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            TTAdManager adManager = TTAdSdk.getAdManager();
            adManager.requestPermissionIfNecessary(this.f37903a);
            SplashActivity.this.I = adManager.createAdNative(this.f37903a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements TTAdNative.SplashAdListener {

        /* loaded from: classes4.dex */
        class a implements TTSplashAd.AdInteractionListener {
            a() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
            public void onAdClicked(View view, int i4) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
            public void onAdShow(View view, int i4) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
            public void onAdSkip() {
                SplashActivity.this.x();
            }

            @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
            public void onAdTimeOver() {
                SplashActivity.this.x();
            }
        }

        d() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.SplashAdListener
        @MainThread
        public void onError(int i4, String str) {
            SplashActivity.this.x();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.SplashAdListener
        @MainThread
        public void onSplashAdLoad(TTSplashAd tTSplashAd) {
            if (tTSplashAd == null) {
                return;
            }
            View splashView = tTSplashAd.getSplashView();
            if (splashView != null) {
                SplashActivity splashActivity = SplashActivity.this;
                if (splashActivity.f37876b != null && !splashActivity.isFinishing()) {
                    SplashActivity.this.f37876b.removeAllViews();
                    SplashActivity.this.f37876b.addView(splashView);
                    tTSplashAd.setSplashInteractionListener(new a());
                    com.papa.sim.statistic.p.l(SplashActivity.this).O1(Event.OpenScreenAd, new Ext());
                }
            }
            SplashActivity.this.x();
            tTSplashAd.setSplashInteractionListener(new a());
            com.papa.sim.statistic.p.l(SplashActivity.this).O1(Event.OpenScreenAd, new Ext());
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.SplashAdListener
        @MainThread
        public void onTimeout() {
            SplashActivity.this.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements AdListener {
        e() {
        }

        @Override // com.beizi.fusion.AdListener
        public void onAdClicked() {
        }

        @Override // com.beizi.fusion.AdListener
        public void onAdClosed() {
            SplashActivity.this.x();
        }

        @Override // com.beizi.fusion.AdListener
        public void onAdFailedToLoad(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("onAdFailedToLoad:");
            sb.append(i4);
            com.papa.sim.statistic.p.l(SplashActivity.this).O1(Event.AdscopeSdk_No, new Ext());
            SplashActivity.this.Z();
        }

        @Override // com.beizi.fusion.AdListener
        public void onAdLoaded() {
            if (SplashActivity.this.V != null) {
                if (!SplashActivity.this.B()) {
                    SplashActivity.this.V.reportNotShow();
                    return;
                }
                SplashActivity.this.f37876b.removeAllViews();
                SplashActivity.this.V.show(SplashActivity.this.f37876b);
                com.papa.sim.statistic.p.l(SplashActivity.this).O1(Event.AdscopeSdk_Show, new Ext());
            }
        }

        @Override // com.beizi.fusion.AdListener
        public void onAdShown() {
        }

        @Override // com.beizi.fusion.AdListener
        public void onAdTick(long j4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements SplashAd.SplashClickEyeListener {
        f() {
        }

        @Override // com.beizi.fusion.SplashAd.SplashClickEyeListener
        public void isSupportSplashClickEye(boolean z4) {
            StringBuilder sb = new StringBuilder();
            sb.append("isSupportSplashClickEye isSupport == ");
            sb.append(z4);
        }

        @Override // com.beizi.fusion.SplashAd.SplashClickEyeListener
        public void onSplashClickEyeAnimationFinish() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements AMSplashAdListener {
        g() {
        }

        @Override // com.aggmoread.sdk.client.IAMAdLoadListener
        public void onAdLoadFail(AMError aMError) {
            com.papa.sim.statistic.p.l(SplashActivity.this).O1(Event.AdRenerSdk_No, new Ext());
            SplashActivity.this.x();
        }

        @Override // com.aggmoread.sdk.client.IAMAdLoadListener
        public void onAdLoaded(List<AMSplashAd> list) {
            if (list == null || list.size() <= 0) {
                return;
            }
            SplashActivity.this.W = list.get(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements AMSplashInteractionListener {
        h() {
        }

        @Override // com.aggmoread.sdk.client.splash.AMSplashInteractionListener
        public void onAdClicked() {
        }

        @Override // com.aggmoread.sdk.client.splash.AMSplashInteractionListener
        public void onAdClosed() {
            SplashActivity.this.x();
        }

        @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
        public void onAdError(AMError aMError) {
            com.papa.sim.statistic.p.l(SplashActivity.this).O1(Event.AdRenerSdk_No, new Ext());
            SplashActivity.this.x();
        }

        @Override // com.aggmoread.sdk.client.splash.AMSplashInteractionListener
        public void onAdExposed() {
            SplashActivity splashActivity = SplashActivity.this;
            if (splashActivity.W != null) {
                com.papa.sim.statistic.p.l(splashActivity).O1(Event.AdRenerSdk_Show, new Ext());
            }
        }

        @Override // com.aggmoread.sdk.client.splash.AMSplashInteractionListener
        public void onAdTick(long j4) {
        }
    }

    /* loaded from: classes4.dex */
    class i extends Handler {
        i() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                if (SplashActivity.this.F) {
                    return;
                }
                SplashActivity.this.a0();
            } else if (i4 == 2) {
                if (SplashActivity.this.F) {
                    return;
                }
                TextView textView = SplashActivity.this.f37882h;
                textView.setText("跳过(" + SplashActivity.this.D + "S)");
                TextView textView2 = SplashActivity.this.f37883i;
                textView2.setText("跳过(" + SplashActivity.this.D + "S)");
                SplashActivity splashActivity = SplashActivity.this;
                int i5 = splashActivity.D;
                if (i5 > 1) {
                    splashActivity.D = i5 - 1;
                    if (splashActivity.E != null) {
                        SplashActivity.this.E.sendEmptyMessageDelayed(2, 1000L);
                    }
                }
            } else if (i4 != 3) {
                if (i4 == 4 && !SplashActivity.this.F) {
                    SplashActivity.this.f37882h.setText("跳过");
                    SplashActivity.this.f37883i.setText("跳过");
                    SplashActivity splashActivity2 = SplashActivity.this;
                    int i6 = splashActivity2.D;
                    if (i6 > 1) {
                        splashActivity2.D = i6 - 1;
                        if (splashActivity2.E != null) {
                            SplashActivity.this.E.sendEmptyMessageDelayed(4, 1000L);
                        }
                    }
                }
            } else if (SplashActivity.this.B != null && SplashActivity.this.B.isCustomApk() && SplashActivity.this.B.isIntent()) {
                IntentDateBean intentDateBean = SplashActivity.this.B.getIntentDateBean();
                intentDateBean.setFrom(MediationConstant.RIT_TYPE_SPLASH);
                if (SplashActivity.this.B.isAutoDownload()) {
                    intentDateBean.setObject(Boolean.TRUE);
                }
                SplashActivity splashActivity3 = SplashActivity.this;
                splashActivity3.b0(splashActivity3.B.getIntentDateBean());
            } else {
                SplashActivity.this.a0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashActivity.this.v();
        }
    }

    /* loaded from: classes4.dex */
    class k implements a.InterfaceC0380a {
        k() {
        }

        @Override // com.join.mgps.shake.a.InterfaceC0380a
        public void a() {
            SplashIntentBean splashIntentBean;
            SplashActivity.this.N.vibrate(new long[]{300, 500}, -1);
            SplashActivity.this.M.e();
            SplashActivity splashActivity = SplashActivity.this;
            ShowViewDataBean showViewDataBean = splashActivity.T;
            if (showViewDataBean != null && (splashIntentBean = splashActivity.U) != null) {
                splashActivity.O(showViewDataBean, splashIntentBean, "2");
            } else {
                splashActivity.a0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements q.g {
        l() {
        }

        @Override // com.nineoldandroids.animation.q.g
        public void e(com.nineoldandroids.animation.q qVar) {
            SplashActivity.this.f37890p.setRotation(((Float) qVar.K()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements GestureDetector.OnGestureListener {
        m() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            SplashIntentBean splashIntentBean;
            if (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) <= 200.0f || Math.abs(f6) <= 100.0f) {
                return false;
            }
            SplashActivity splashActivity = SplashActivity.this;
            ShowViewDataBean showViewDataBean = splashActivity.T;
            if (showViewDataBean != null && (splashIntentBean = splashActivity.U) != null) {
                splashActivity.O(showViewDataBean, splashIntentBean, "3");
                return true;
            }
            splashActivity.a0();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements q.g {
        n() {
        }

        @Override // com.nineoldandroids.animation.q.g
        public void e(com.nineoldandroids.animation.q qVar) {
            SplashActivity.this.f37889o.setTranslationY(((Float) qVar.K()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShowViewDataBean f37917b;

        o(ShowViewDataBean showViewDataBean) {
            this.f37917b = showViewDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            b2.i0.o().m(this.f37917b.getShowVieDatabeanTable());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShowViewDataBean f37919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SplashIntentBean f37920c;

        p(ShowViewDataBean showViewDataBean, SplashIntentBean splashIntentBean) {
            this.f37919b = showViewDataBean;
            this.f37920c = splashIntentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.O(this.f37919b, this.f37920c, splashActivity.K == 1 ? "0" : "1");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q extends w1.p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShowViewDataBean f37922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SplashIntentBean f37923c;

        q(ShowViewDataBean showViewDataBean, SplashIntentBean splashIntentBean) {
            this.f37922b = showViewDataBean;
            this.f37923c = splashIntentBean;
        }

        @Override // w1.p, s2.h
        public void onAutoComplete(String str, Object... objArr) {
            super.onAutoComplete(str, objArr);
            onClickBlank(str, objArr);
        }

        @Override // w1.p, s2.h
        public void onClickBlank(String str, Object... objArr) {
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.O(this.f37922b, this.f37923c, splashActivity.K == 1 ? "0" : "1");
        }

        @Override // w1.p, s2.h
        public void onPrepared(String str, Object... objArr) {
            int duration = SplashActivity.this.f37877c.getDuration();
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.D = duration / 1000;
            if (splashActivity.E != null) {
                SplashActivity.this.E.sendEmptyMessage(4);
            }
        }
    }

    private void A(Context context, String str) {
        TTAdSdk.init(context, u(str));
        TTAdSdk.start(new c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        return true;
    }

    private boolean C(String str, String str2, long j4) {
        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "isInRange", str, str2, "before");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "isInRange", str, str2, "after");
            return false;
        }
        try {
            boolean z4 = j4 > Long.parseLong(str) * 1000 && j4 < Long.parseLong(str2) * 1000;
            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "isInRange", str, str2, "after");
            return z4;
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "isInRange", str, str2, "after");
            return false;
        }
    }

    private boolean D() {
        ShowViewDataBean showViewDataBean;
        ShowViewDataBean showViewDataBean2;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("splash isShowSplash");
            sb.append(System.currentTimeMillis());
            List<ShowViewDataBeanTable> d5 = b2.i0.o().d();
            ArrayList arrayList = new ArrayList();
            for (ShowViewDataBeanTable showViewDataBeanTable : d5) {
                arrayList.add(showViewDataBeanTable.getShowVieDatabean());
            }
            long currentTimeMillis = System.currentTimeMillis();
            showViewDataBean = null;
            showViewDataBean2 = null;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ShowViewDataBean showViewDataBean3 = (ShowViewDataBean) arrayList.get(i4);
                String is_force = showViewDataBean3.getIs_force();
                if (is_force.equals("1") && showViewDataBean3.getTag_show() != 2) {
                    long parseLong = Long.parseLong(showViewDataBean3.getEnd_times()) * 1000;
                    if (currentTimeMillis > Long.parseLong(showViewDataBean3.getBegin_times()) * 1000 && currentTimeMillis < parseLong) {
                        showViewDataBean = showViewDataBean3;
                    }
                } else if (!is_force.equals("1")) {
                    long parseLong2 = Long.parseLong(showViewDataBean3.getEnd_times()) * 1000;
                    if (currentTimeMillis > Long.parseLong(showViewDataBean3.getBegin_times()) * 1000 && currentTimeMillis < parseLong2 && showViewDataBean3.getJump_info().size() > 0 && showViewDataBean3.getTag_show() != 2) {
                        showViewDataBean2 = showViewDataBean3;
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (showViewDataBean != null) {
            return W(showViewDataBean);
        }
        if (showViewDataBean2 != null) {
            return W(showViewDataBean2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        A(this, this.f37885k.getFx_sdk_key());
        M(this.f37885k.getFx_ad_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        K(this.f37886l.getAd_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        L(this.f37886l.getAd_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean I(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.P;
        return gestureDetector != null && gestureDetector.onTouchEvent(motionEvent);
    }

    private void J(String str) {
        P();
    }

    private void K(String str) {
        com.papa.sim.statistic.p.l(this).O1(Event.AdscopeSdk_loading, new Ext());
        e0();
        SplashAd splashAd = new SplashAd(this, null, str, new e(), 3000L);
        this.V = splashAd;
        splashAd.loadAd(AbScreenUtils.getScreenWidth(this), AbScreenUtils.getScreenHeight(this));
        this.V.setSplashClickEyeListener(new f());
    }

    private void L(String str) {
        com.papa.sim.statistic.p.l(this).O1(Event.AdRenerSdk_loading, new Ext());
        e0();
        AMSdk.makeAdLoader(new AMAdLoadSlot.Builder().setSlotId(str).setAdContainer((ViewGroup) findViewById(R.id.main)).setAdCount(1).setFetchTimeOut(3000).build()).loadAndShowSplashAd(this, new g(), new h());
    }

    private void M(String str) {
        this.I.loadSplashAd(new AdSlot.Builder().setCodeId(str).setImageAcceptedSize(1080, 1920).build(), new d(), 3000);
    }

    private void N() {
        if (this.f37899y) {
            x();
        } else {
            this.f37899y = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(ShowViewDataBean showViewDataBean, SplashIntentBean splashIntentBean, String str) {
        IntentDateBean intentDataBean = splashIntentBean.getIntentDataBean();
        if (showViewDataBean.getIs_force().equals("1")) {
            showViewDataBean.setTag_show(2);
            b2.i0.o().m(showViewDataBean.getShowVieDatabeanTable());
            this.f37881g.lastClickPageAD().g(showViewDataBean.getId() + "");
            this.f37881g.isShowSplash().g(Boolean.valueOf(D()));
        }
        U(new com.papa.sim.statistic.e(splashIntentBean.getCrc_link_type_val(), "spreadButton", splashIntentBean.getJump_id() + "", splashIntentBean.getTitle() + ""), true);
        String str2 = showViewDataBean.getStrategy_id() + "_" + splashIntentBean.getTitle() + "_" + splashIntentBean.getJump_id();
        com.papa.sim.statistic.p.l(this).O1(Event.onclickScreenAds, new Ext().setNodeId(str2).setReMarks(str2));
        com.papa.sim.statistic.p.l(this).O1(Event.expHomeTrigTab, new Ext().setRecPosition(str).setGameId(splashIntentBean.getCrc_link_type_val()).setNodeId(str2).setReMarks(str2));
        splashIntentBean.setTag_show(2);
        b2.i0.o().m(showViewDataBean.getShowVieDatabeanTable());
        this.F = true;
        this.f37881g.isShowSplash().g(Boolean.valueOf(D()));
        b0(intentDataBean);
    }

    private void Q() {
        if (this.f37890p != null) {
            com.nineoldandroids.animation.q qVar = this.Q;
            if (qVar != null) {
                qVar.Y();
            }
            if (this.Q == null) {
                this.R = getResources().getDimension(R.dimen.wdp146);
                float dimension = getResources().getDimension(R.dimen.wdp78);
                this.S = dimension;
                this.f37890p.setPivotX((dimension * 4.0f) / 5.0f);
                this.f37890p.setPivotY((this.R * 2.0f) / 5.0f);
                com.nineoldandroids.animation.q qVar2 = new com.nineoldandroids.animation.q();
                this.Q = qVar2;
                qVar2.e0(0.0f, 30.0f, 0.0f, 45.0f, 0.0f);
                this.Q.i0(-1);
                this.Q.j0(1);
                this.Q.l(new AccelerateInterpolator());
                l lVar = new l();
                this.Q.n(this.f37890p);
                this.Q.C(lVar);
                this.Q.k(1000L);
                this.Q.q();
            }
        }
    }

    private void R() {
        if (this.f37889o != null) {
            com.nineoldandroids.animation.q qVar = this.Q;
            if (qVar != null) {
                qVar.Y();
            }
            if (this.Q == null) {
                this.R = getResources().getDimension(R.dimen.wdp166);
                com.nineoldandroids.animation.q qVar2 = new com.nineoldandroids.animation.q();
                this.Q = qVar2;
                qVar2.e0(this.R, 0.0f);
                this.Q.i0(-1);
                this.Q.j0(1);
                this.Q.l(new DecelerateInterpolator());
                n nVar = new n();
                this.Q.n(this.f37889o);
                this.Q.C(nVar);
                this.Q.k(1500L);
                this.Q.q();
            }
        }
    }

    private void S(String str, ShowViewDataBean showViewDataBean, SplashIntentBean splashIntentBean) {
        String pic_remote;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this);
        String pic_remote_local = splashIntentBean.getPic_remote_local();
        if (com.join.mgps.Util.g2.i(pic_remote_local)) {
            File file = new File(pic_remote_local);
            if (file.exists()) {
                pic_remote = MyImageLoader.G(file).toString();
            } else {
                pic_remote = splashIntentBean.getPic_remote();
            }
        } else {
            pic_remote = splashIntentBean.getPic_remote();
        }
        if (com.join.mgps.Util.g2.i(pic_remote)) {
            MyImageLoader.e(simpleDraweeView, R.drawable.alph, pic_remote, r.c.f11294a);
        }
        simpleDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f37877c.setThumbImageView(simpleDraweeView);
        this.f37877c.setUp(str, true, " ");
        this.f37877c.setVideoAllCallBack(new q(showViewDataBean, splashIntentBean));
        this.f37877c.setMute(true);
        this.E.postDelayed(new a(), 200L);
    }

    private void T(ShowViewDataBean showViewDataBean) {
        this.E.post(new o(showViewDataBean));
    }

    private void U(com.papa.sim.statistic.e eVar, boolean z4) {
        eVar.j(AccountUtil_.getInstance_(this).getUid());
        com.papa.sim.statistic.p.l(this).w(eVar, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        String d5 = com.papa.sim.statistic.pref.b.k(this).d();
        if (com.join.mgps.Util.g2.i(d5)) {
            this.C = (FirstScreenAdInteractionBean) JsonMapper.getInstance().fromJson(d5, FirstScreenAdInteractionBean.class);
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.splash_activity_layout_b, (ViewGroup) null);
        this.f37891q = (RelativeLayout) inflate.findViewById(R.id.rl_opts_bottom);
        this.f37896v = (RelativeLayout) inflate.findViewById(R.id.rlRootView);
        FirstScreenAdInteractionBean firstScreenAdInteractionBean = this.C;
        if (firstScreenAdInteractionBean != null) {
            this.J = firstScreenAdInteractionBean.getAction();
            boolean equals = "shake_click".equals(this.C.getMode());
            boolean hasSystemFeature = equals ? getPackageManager().hasSystemFeature("android.hardware.sensor.accelerometer") : true;
            if (equals && hasSystemFeature) {
                this.f37890p = (ImageView) inflate.findViewById(R.id.iv_hand_shake);
                this.f37892r = (LinearLayout) inflate.findViewById(R.id.ll_hand_shake);
                this.f37894t = (TextView) inflate.findViewById(R.id.tv_hand_shake_tip);
                this.f37892r.setVisibility(0);
                if (com.join.mgps.Util.g2.i(this.C.getTips())) {
                    this.f37894t.setText(this.C.getTips());
                }
                y(this.C.getShake_conf());
                this.L = 2;
            } else if ("slide_click".equals(this.C.getMode())) {
                this.f37889o = (ImageView) inflate.findViewById(R.id.iv_hand_up);
                this.f37893s = (LinearLayout) inflate.findViewById(R.id.ll_hand_up);
                this.f37895u = (TextView) inflate.findViewById(R.id.tv_hand_up_tip);
                this.f37893s.setVisibility(0);
                if (com.join.mgps.Util.g2.i(this.C.getTips())) {
                    this.f37895u.setText(this.C.getTips());
                }
                this.f37896v.setOnTouchListener(new View.OnTouchListener() { // from class: com.join.mgps.activity.c3
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean I;
                        I = SplashActivity.this.I(view, motionEvent);
                        return I;
                    }
                });
                z();
                this.L = 3;
            } else {
                this.f37891q.setVisibility(8);
                this.L = 1;
            }
        }
        this.f37878d = (SimpleDraweeView) inflate.findViewById(R.id.viewImage);
        this.f37882h = (TextView) inflate.findViewById(R.id.countdown);
        this.f37883i = (TextView) inflate.findViewById(R.id.countdownVideo);
        this.f37884j = inflate.findViewById(R.id.countdownLayout);
        this.f37879e = (RelativeLayout) inflate.findViewById(R.id.bottomImag);
        this.f37880f = (ImageView) inflate.findViewById(R.id.imageView24);
        this.f37877c = (EmptyControlVideoView) inflate.findViewById(R.id.video_player);
        this.f37876b.addView(inflate);
        this.f37884j.setOnClickListener(new j());
        f0();
        StringBuilder sb = new StringBuilder();
        sb.append("splash afterview2");
        sb.append(System.currentTimeMillis());
        w();
    }

    private void e0() {
        UserPrefs userPrefs = new UserPrefs(this);
        String sspAdConfig = userPrefs.getSspAdConfig();
        int i4 = 0;
        if (com.join.mgps.Util.g2.i(sspAdConfig)) {
            try {
                JSONObject jSONObject = new JSONObject(sspAdConfig);
                if (jSONObject.has("adCount")) {
                    i4 = Integer.parseInt(jSONObject.get("adCount").toString());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        userPrefs.setSspAdConfig(i4 + 1);
    }

    private void r() {
        if (this.P == null) {
            this.P = new GestureDetector(this, new m());
        }
    }

    private void s(FirstScreenAdInteractionBean.ShakeConfBean shakeConfBean) {
        com.join.mgps.shake.a aVar = new com.join.mgps.shake.a(this);
        this.M = aVar;
        aVar.c(shakeConfBean);
        this.M.b(this.O);
        this.N = (Vibrator) getSystemService("vibrator");
    }

    private static TTAdConfig u(String str) {
        return new TTAdConfig.Builder().appId(str).appName("悟饭游戏厅_android").titleBarTheme(1).allowShowNotify(true).debug(true).directDownloadNetworkType(4, 3).supportMultiProcess(false).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (isFinishing()) {
            return;
        }
        if (this.f37899y) {
            setResult(10001);
            finish();
            return;
        }
        this.f37899y = true;
    }

    private void y(FirstScreenAdInteractionBean.ShakeConfBean shakeConfBean) {
        Q();
        s(shakeConfBean);
    }

    private void z() {
        R();
        r();
    }

    public void P() {
        long currentTimeMillis = System.currentTimeMillis() - this.f37898x;
        int i4 = this.f37897w;
        this.E.postDelayed(new b(), currentTimeMillis > ((long) i4) ? 0L : i4 - currentTimeMillis);
    }

    void V(ShowViewDataBean showViewDataBean, SplashIntentBean splashIntentBean) {
        try {
            this.T = showViewDataBean;
            this.U = splashIntentBean;
            String str = showViewDataBean.getStrategy_id() + "_" + splashIntentBean.getTitle() + "_" + splashIntentBean.getJump_id();
            com.papa.sim.statistic.p.l(this).O1(Event.FullScreenAds, new Ext().setPosition("0").setNodeId(str).setReMarks(str));
            com.papa.sim.statistic.p.l(this).O1(Event.expHomeFunTab, new Ext().setPosition("0").setRecPosition(String.valueOf(this.L)).setGameId(splashIntentBean.getCrc_link_type_val()).setNodeId(str).setReMarks(str));
            this.f37878d.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append("splash setimageback");
            sb.append(System.currentTimeMillis());
            this.f37882h.setVisibility(0);
            this.f37883i.setVisibility(8);
            this.f37880f.setVisibility(0);
            this.f37879e.setBackgroundColor(-1);
            Handler handler = this.E;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
            U(new com.papa.sim.statistic.e(splashIntentBean.getCrc_link_type_val(), "spreadButton", splashIntentBean.getJump_id() + "", splashIntentBean.getTitle() + ""), false);
            this.f37896v.setOnClickListener(new p(showViewDataBean, splashIntentBean));
            this.f37879e.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SplashActivity.H(view);
                }
            });
            Handler handler2 = this.E;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 4000L);
            }
            String pic_remote_local = splashIntentBean.getPic_remote_local();
            if (com.join.mgps.Util.g2.i(pic_remote_local)) {
                File file = new File(pic_remote_local);
                if (file.exists()) {
                    MyImageLoader.e(this.f37878d, R.drawable.alph, MyImageLoader.G(file).toString(), r.c.f11300g);
                } else {
                    String pic_remote = splashIntentBean.getPic_remote();
                    if (com.join.mgps.Util.g2.i(pic_remote) && pic_remote.startsWith(com.facebook.common.util.f.f10923a)) {
                        MyImageLoader.d(this.f37878d, R.drawable.alph, pic_remote);
                    } else {
                        MyImageLoader.e(this.f37878d, R.drawable.alph, MyImageLoader.H(pic_remote).toString(), r.c.f11300g);
                    }
                }
            } else {
                String pic_remote2 = splashIntentBean.getPic_remote();
                if (com.join.mgps.Util.g2.i(pic_remote2) && pic_remote2.startsWith(com.facebook.common.util.f.f10923a)) {
                    MyImageLoader.e(this.f37878d, R.drawable.alph, pic_remote2, r.c.f11300g);
                } else {
                    MyImageLoader.e(this.f37878d, R.drawable.alph, MyImageLoader.H("file://" + pic_remote2).toString(), r.c.f11300g);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("splash loadimage");
            sb2.append(System.currentTimeMillis());
        } catch (Exception e5) {
            e5.printStackTrace();
            a0();
        }
    }

    boolean W(ShowViewDataBean showViewDataBean) {
        StringBuilder sb = new StringBuilder();
        sb.append("splash setiamgeBackx");
        sb.append(System.currentTimeMillis());
        try {
            if (showViewDataBean.getIs_force().equals("1")) {
                showViewDataBean.getJump_info().get(0).getPic_remote();
                return !this.f37881g.lastClickPageAD().d().equals(showViewDataBean.getId() + "");
            }
            for (SplashIntentBean splashIntentBean : showViewDataBean.getJump_info()) {
                if (splashIntentBean.getTag_show() != 2) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    void X(ShowViewDataBean showViewDataBean, SplashIntentBean splashIntentBean) {
        try {
            String str = showViewDataBean.getStrategy_id() + "_" + splashIntentBean.getTitle() + "_" + splashIntentBean.getJump_id();
            com.papa.sim.statistic.p.l(this).O1(Event.FullScreenAds, new Ext().setPosition("1").setNodeId(str).setReMarks(str));
            com.papa.sim.statistic.p.l(this).O1(Event.expHomeFunTab, new Ext().setPosition("1").setRecPosition(String.valueOf(this.L)).setGameId(splashIntentBean.getCrc_link_type_val()).setNodeId(str).setReMarks(str));
            com.papa.gsyvideoplayer.utils.f.l(4);
            this.f37882h.setVisibility(8);
            this.f37883i.setVisibility(0);
            this.f37880f.setVisibility(8);
            this.f37879e.setBackgroundColor(0);
            this.f37877c.setVisibility(0);
            U(new com.papa.sim.statistic.e(splashIntentBean.getCrc_link_type_val(), "spreadButton", splashIntentBean.getJump_id() + "", splashIntentBean.getTitle() + ""), false);
            String vedio_url_local = splashIntentBean.getVedio_url_local();
            if (com.join.mgps.Util.g2.i(vedio_url_local)) {
                File file = new File(vedio_url_local);
                if (file.exists()) {
                    if (this.f37877c != null) {
                        S(MyImageLoader.G(file).toString(), showViewDataBean, splashIntentBean);
                    }
                } else {
                    String vedio_url = splashIntentBean.getVedio_url();
                    if (com.join.mgps.Util.g2.i(vedio_url) && (vedio_url.startsWith(com.facebook.common.util.f.f10923a) || vedio_url.startsWith("https"))) {
                        S(vedio_url, showViewDataBean, splashIntentBean);
                    } else {
                        S(MyImageLoader.H(vedio_url).toString(), showViewDataBean, splashIntentBean);
                    }
                }
            } else {
                String vedio_url2 = splashIntentBean.getVedio_url();
                if (com.join.mgps.Util.g2.i(vedio_url2) && (vedio_url2.startsWith(com.facebook.common.util.f.f10923a) || vedio_url2.startsWith("https"))) {
                    S(vedio_url2, showViewDataBean, splashIntentBean);
                } else {
                    S(MyImageLoader.H("file://" + vedio_url2).toString(), showViewDataBean, splashIntentBean);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("splash loadimage");
            sb.append(System.currentTimeMillis());
        } catch (Exception e5) {
            e5.printStackTrace();
            a0();
        }
    }

    void Y() {
        com.join.mgps.Util.v0.c("setnormal time =" + System.currentTimeMillis());
        new ArrayList();
        if (this.f37881g.isFirstRun().d().booleanValue()) {
            FirstIntentData firstIntentData = this.B;
            if (firstIntentData != null && firstIntentData.isCustomApk() && this.B.isAPKSplashImage()) {
                try {
                    this.f37881g.isFirstRun().g(Boolean.FALSE);
                    try {
                        String[] list = getAssets().list("");
                        boolean z4 = false;
                        boolean z5 = false;
                        for (int i4 = 0; i4 < list.length; i4++) {
                            if (list[i4].equals("splash.png")) {
                                z4 = true;
                                break;
                            }
                            if (list[i4].equals("splash.jpg")) {
                                z5 = true;
                            }
                        }
                        try {
                            if (z4) {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(getAssets().open("splash.png"));
                                this.f37878d.setImageBitmap(BitmapFactory.decodeStream(bufferedInputStream));
                                bufferedInputStream.close();
                            } else if (z5) {
                                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(getAssets().open("splash.jpg"));
                                this.f37878d.setImageBitmap(BitmapFactory.decodeStream(bufferedInputStream2));
                                bufferedInputStream2.close();
                            } else {
                                this.f37878d.setImageResource(R.drawable.splash);
                            }
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    } catch (IOException e6) {
                        e6.printStackTrace();
                        this.f37878d.setImageResource(R.drawable.splash);
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                Handler handler = this.E;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(3, 4000L);
                    return;
                }
                return;
            }
            this.f37881g.isFirstRun().g(Boolean.FALSE);
            c0();
            return;
        }
        c0();
    }

    void a0() {
        setResult(10001);
        finish();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        if (r6.equals("detail_dl") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b0(com.join.mgps.Util.IntentDateBean r10) {
        /*
            r9 = this;
            java.lang.String r0 = "splash"
            r10.setFrom(r0)
            int r0 = r10.getLink_type()
            r1 = 3
            r2 = 1
            if (r0 != r1) goto L15
            int r0 = r10.getJump_type()
            if (r0 != r2) goto L15
            goto Lc5
        L15:
            com.join.mgps.dto.ExtBean r0 = new com.join.mgps.dto.ExtBean
            r0.<init>()
            int r3 = r9.K
            if (r3 != r2) goto L21
            r3 = 13201(0x3391, float:1.8499E-41)
            goto L23
        L21:
            r3 = 157(0x9d, float:2.2E-43)
        L23:
            r0.set_from_type(r3)
            com.join.mgps.dto.FirstScreenAdInteractionBean r3 = r9.C
            if (r3 == 0) goto Lbb
            int r3 = r10.getLink_type()
            if (r3 != r2) goto Lbb
            p1.f r3 = p1.f.K()
            java.lang.String r4 = r10.getCrc_link_type_val()
            com.github.snowdream.android.app.downloader.DownloadTask r3 = r3.F(r4)
            r4 = 0
            java.lang.String r5 = "detail_dl"
            if (r3 == 0) goto L50
            int r3 = r3.getStatus()
            r6 = 11
            if (r3 != r6) goto L50
            com.join.mgps.dto.FirstScreenAdInteractionBean r3 = r9.C
            r3.setAction(r5)
            r3 = 0
            goto L51
        L50:
            r3 = 1
        L51:
            com.join.mgps.dto.FirstScreenAdInteractionBean r6 = r9.C
            java.lang.String r6 = r6.getAction()
            r6.hashCode()
            r7 = -1
            int r8 = r6.hashCode()
            switch(r8) {
                case -1973081290: goto L7a;
                case -881390222: goto L6f;
                case 831022286: goto L64;
                default: goto L62;
            }
        L62:
            r4 = -1
            goto L81
        L64:
            java.lang.String r4 = "main_dl"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L6d
            goto L62
        L6d:
            r4 = 2
            goto L81
        L6f:
            java.lang.String r4 = "tab_dl"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L78
            goto L62
        L78:
            r4 = 1
            goto L81
        L7a:
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L81
            goto L62
        L81:
            switch(r4) {
                case 0: goto Lac;
                case 1: goto L96;
                case 2: goto L85;
                default: goto L84;
            }
        L84:
            goto Lbb
        L85:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r10.setObject(r3)
            r10.setLink_type(r1)
            r10.setJump_type(r2)
            java.lang.String r1 = "156"
            r0.setFrom(r1)
            goto Lbb
        L96:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r10.setObject(r3)
            java.lang.String r3 = "2"
            r10.setExt1(r3)
            r10.setLink_type(r1)
            r10.setJump_type(r2)
            java.lang.String r1 = "154"
            r0.setFrom(r1)
            goto Lbb
        Lac:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r10.setObject(r1)
            r10.setLink_type(r2)
            r1 = 155(0x9b, float:2.17E-43)
            r0.set_from_type(r1)
        Lbb:
            r10.setExtBean(r0)
            com.join.mgps.Util.IntentUtil r0 = com.join.mgps.Util.IntentUtil.getInstance()
            r0.intentActivity(r9, r10)
        Lc5:
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.setResult(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "startMainActivity  time ="
            r10.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.join.mgps.Util.v0.c(r10)
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.SplashActivity.b0(com.join.mgps.Util.IntentDateBean):void");
    }

    void c0() {
        com.join.mgps.Util.v0.c("startNow1  time =" + System.currentTimeMillis());
        setResult(10001);
        finish();
        com.join.mgps.Util.v0.c("startNow2  time =" + System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = TwistView.DELAY_TIME_TWIST)
    public void d0() {
        com.join.mgps.Util.v0.c("splashactivity  start finish time =" + System.currentTimeMillis());
        finish();
    }

    void f0() {
        if (WifiUtils.getInstance(getApplicationContext()).isWifiEnable()) {
            this.f37881g.isWifiConnectedBefore().g(Boolean.TRUE);
        } else {
            this.f37881g.isWifiConnectedBefore().g(Boolean.FALSE);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EmptyControlVideoView emptyControlVideoView = this.f37877c;
        if (emptyControlVideoView != null) {
            emptyControlVideoView.setVideoAllCallBack(null);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.f37881g.firstNewSplashV2().d().booleanValue() && (getIntent().getFlags() & 4194304) == 0) {
            com.join.mgps.Util.c2.s(this);
            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "onCreate");
            return;
        }
        this.f37881g.firstNewSplashV2().g(Boolean.FALSE);
        setResult(10001);
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        EmptyControlVideoView emptyControlVideoView = this.f37877c;
        if (emptyControlVideoView != null) {
            emptyControlVideoView.release();
        }
        Handler handler = this.E;
        if (handler != null) {
            handler.removeMessages(2);
            this.E.removeMessages(4);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 || i4 == 3) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        EmptyControlVideoView emptyControlVideoView;
        super.onPause();
        if (this.G && (emptyControlVideoView = this.f37877c) != null) {
            emptyControlVideoView.onVideoPause();
        }
        this.G = true;
        this.f37899y = false;
        com.join.mgps.shake.a aVar = this.M;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        EmptyControlVideoView emptyControlVideoView;
        super.onResume();
        if (this.G && (emptyControlVideoView = this.f37877c) != null) {
            emptyControlVideoView.onVideoResume(false);
        }
        if (this.f37899y) {
            N();
        }
        this.f37899y = true;
        com.join.mgps.shake.a aVar = this.M;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.join.mgps.shake.a aVar = this.M;
        if (aVar != null) {
            aVar.e();
        }
    }

    @AfterViews
    public void t() {
        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "afterViews", "before");
        try {
            ThAdSwitchDataBean thAdSwitchDataBean = this.f37885k;
            if (thAdSwitchDataBean != null && thAdSwitchDataBean.getFx_ad_switch() == 1) {
                com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "afterViews", "111", "before");
                int type = this.f37885k.getType();
                this.H = type;
                if (type == 1) {
                    this.f37888n.setVisibility(8);
                    com.join.mgps.ad.adapter.e.d(getApplicationContext(), this.f37885k.getFx_sdk_key(), new s1.a() { // from class: com.join.mgps.activity.f3
                        @Override // s1.a
                        public final void a() {
                            SplashActivity.this.E();
                        }
                    });
                } else if (type == 2) {
                    this.f37888n.setVisibility(8);
                } else if (type == 3) {
                    this.f37888n.setVisibility(8);
                    J(this.f37885k.getFx_ad_id());
                } else if (type == 4) {
                    this.f37888n.setVisibility(8);
                }
            } else {
                PlayCfgBean playCfgBean = this.f37886l;
                if (playCfgBean != null) {
                    int sdk_type = playCfgBean.getSdk_type();
                    if (sdk_type == 8) {
                        com.join.mgps.ad.adapter.a.a(getApplicationContext(), this.f37886l.getSdk_key(), new s1.a() { // from class: com.join.mgps.activity.d3
                            @Override // s1.a
                            public final void a() {
                                SplashActivity.this.F();
                            }
                        });
                        this.f37888n.setVisibility(8);
                    } else if (sdk_type == 9) {
                        com.join.mgps.ad.adapter.d.a(getApplicationContext(), this.f37886l.getSdk_key(), new s1.a() { // from class: com.join.mgps.activity.e3
                            @Override // s1.a
                            public final void a() {
                                SplashActivity.this.G();
                            }
                        });
                        this.f37888n.setVisibility(8);
                    }
                    com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "afterViews", "222", "before");
                } else {
                    Z();
                }
            }
            com.papa.sim.statistic.p.l(this).K2(0, AccountUtil_.getInstance_(this).getUid());
            this.f37881g.plugHasUpdate().g(Boolean.FALSE);
            CommonService.W = false;
            StringBuilder sb = new StringBuilder();
            sb.append("splash afterview3");
            sb.append(System.currentTimeMillis());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void v() {
        this.F = true;
        a0();
    }

    void w() {
        SplashIntentBean splashIntentBean;
        ShowViewDataBean showViewDataBean;
        boolean z4;
        long j4;
        int i4;
        int i5 = 2;
        try {
            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "11", "before");
            List<ShowViewDataBeanTable> n4 = b2.i0.o().n();
            if (n4 != null && !n4.isEmpty()) {
                com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "222", "before");
                long currentTimeMillis = System.currentTimeMillis();
                String e5 = this.f37881g.lastShowSplashImage().e("");
                int i6 = 0;
                while (true) {
                    if (i6 >= n4.size()) {
                        splashIntentBean = null;
                        showViewDataBean = null;
                        break;
                    }
                    showViewDataBean = n4.get(i6).getShowVieDatabean();
                    if (showViewDataBean.getTag_show() != i5 && C(showViewDataBean.getBegin_times(), showViewDataBean.getEnd_times(), currentTimeMillis)) {
                        if (!TextUtils.isEmpty(showViewDataBean.getIs_force()) && showViewDataBean.getIs_force().equals("1")) {
                            splashIntentBean = showViewDataBean.getJump_info().get(0);
                            z4 = true;
                            break;
                        } else if (showViewDataBean.getJump_info() != null && !showViewDataBean.getJump_info().isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            j4 = currentTimeMillis;
                            i4 = i6;
                            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "222 - bbb", "before");
                            Iterator<SplashIntentBean> it2 = showViewDataBean.getJump_info().iterator();
                            SplashIntentBean splashIntentBean2 = null;
                            while (it2.hasNext()) {
                                SplashIntentBean next = it2.next();
                                Iterator<SplashIntentBean> it3 = it2;
                                ShowViewDataBean showViewDataBean2 = showViewDataBean;
                                if (next.getTag_show() != 2) {
                                    if (!TextUtils.equals(e5, next.getVedio_url_local()) && !TextUtils.equals(e5, next.getPic_remote_local())) {
                                        arrayList.add(next);
                                    }
                                    splashIntentBean2 = next;
                                }
                                it2 = it3;
                                showViewDataBean = showViewDataBean2;
                            }
                            ShowViewDataBean showViewDataBean3 = showViewDataBean;
                            if (arrayList.isEmpty() && splashIntentBean2 != null) {
                                arrayList.add(splashIntentBean2);
                            }
                            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "222 - ccc", "before");
                            if (arrayList.isEmpty()) {
                                i6 = i4 + 1;
                                currentTimeMillis = j4;
                                i5 = 2;
                            } else {
                                int nextInt = new Random().nextInt(arrayList.size());
                                splashIntentBean = (SplashIntentBean) arrayList.get(nextInt);
                                splashIntentBean.setShowPosition(nextInt + 1);
                                if (!TextUtils.isEmpty(splashIntentBean.getVedio_url_local())) {
                                    this.f37881g.lastShowSplashImage().g(splashIntentBean.getVedio_url_local());
                                } else {
                                    this.f37881g.lastShowSplashImage().g(splashIntentBean.getPic_remote_local());
                                }
                                showViewDataBean = showViewDataBean3;
                            }
                        }
                    }
                    j4 = currentTimeMillis;
                    i4 = i6;
                    i6 = i4 + 1;
                    currentTimeMillis = j4;
                    i5 = 2;
                }
                z4 = false;
                com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333", "before");
                if (z4) {
                    if (splashIntentBean == null) {
                        return;
                    }
                    if (!TextUtils.isEmpty(splashIntentBean.getVedio_url())) {
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - aaaa", "before");
                        X(showViewDataBean, splashIntentBean);
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - aaaa", "after");
                    } else {
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - bbb", "before");
                        V(showViewDataBean, splashIntentBean);
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - bbb", "after");
                    }
                    if (showViewDataBean.getTag_show() == 0) {
                        showViewDataBean.setTag_show(2);
                        T(showViewDataBean);
                        this.f37881g.isShowSplash().g(Boolean.valueOf(D()));
                    } else if (showViewDataBean.getTag_show() == 1) {
                        T(showViewDataBean);
                    }
                } else if (showViewDataBean != null) {
                    if (!TextUtils.isEmpty(splashIntentBean.getVedio_url())) {
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - ccc", "before");
                        X(showViewDataBean, splashIntentBean);
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - ccc", "after");
                    } else {
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - ddd", "before");
                        V(showViewDataBean, splashIntentBean);
                        com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "333 - ddd", "after");
                    }
                    splashIntentBean.setShow_time(System.currentTimeMillis());
                    T(showViewDataBean);
                } else {
                    finish();
                }
                com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "444", "before");
                return;
            }
            finish();
        } catch (Exception e6) {
            e6.printStackTrace();
            com.join.mgps.Util.w0.e("Aspect", getClass().getSimpleName(), "getImageBitmap", "555", e6.toString(), "before");
        }
    }
}
