package com.join.mgps.customview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.HandShankNoActivity;
import com.join.mgps.activity.HandShankYesActivity;
import com.join.mgps.customview.LoadingLayout;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.HandShankAdBean;
/* loaded from: classes4.dex */
public class HandShankAdView extends LinearLayout implements LoadingLayout.b {

    /* renamed from: b  reason: collision with root package name */
    protected LoadingLayout f47149b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f47150c;

    /* renamed from: d  reason: collision with root package name */
    private final View.OnClickListener f47151d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HandShankAdBean f47152b;

        a(HandShankAdBean handShankAdBean) {
            this.f47152b = handShankAdBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context = HandShankAdView.this.getContext();
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) HandShankAdView.this.findViewById(R.id.iv_banner);
            int a5 = com.join.mgps.Util.c0.a(context, 8.0f);
            int i4 = 1;
            if (this.f47152b.getTop_banner_ad() != null && this.f47152b.getTop_banner_ad().size() > 0) {
                BannerBean bannerBean = this.f47152b.getTop_banner_ad().get(0);
                if (bannerBean.getAd_switch() == 1) {
                    simpleDraweeView.setVisibility(0);
                    MyImageLoader.d(simpleDraweeView, R.drawable.banner_normal_icon, bannerBean.getPic_remote());
                    simpleDraweeView.setTag(bannerBean);
                    simpleDraweeView.setOnClickListener(HandShankAdView.this.f47151d);
                } else {
                    simpleDraweeView.setVisibility(8);
                }
            } else {
                simpleDraweeView.setVisibility(8);
            }
            if (this.f47152b.getFast_entrance_ad() == null || this.f47152b.getFast_entrance_ad().size() <= 0) {
                HandShankAdView.this.f47150c.setVisibility(8);
            } else {
                int size = this.f47152b.getFast_entrance_ad().size();
                int a6 = com.join.mgps.Util.c0.a(context, 48.0f);
                int a7 = com.join.mgps.Util.c0.a(context, 7.0f);
                int i5 = 0;
                while (i5 < size && i5 < 5) {
                    BannerBean bannerBean2 = this.f47152b.getFast_entrance_ad().get(i5);
                    if (bannerBean2.getAd_switch() != 0) {
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                        linearLayout.setGravity(17);
                        linearLayout.setOrientation(i4);
                        SimpleDraweeView simpleDraweeView2 = new SimpleDraweeView(context);
                        simpleDraweeView2.setLayoutParams(new LinearLayout.LayoutParams(a6, a6));
                        simpleDraweeView2.setTag(bannerBean2);
                        simpleDraweeView2.setOnClickListener(HandShankAdView.this.f47151d);
                        MyImageLoader.d(simpleDraweeView2, R.drawable.main_normal_icon, bannerBean2.getPic_remote());
                        TextView textView = new TextView(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.topMargin = a5;
                        textView.setLayoutParams(layoutParams);
                        textView.setTextSize(a7);
                        textView.setTextColor(Color.parseColor("#585858"));
                        textView.setText(bannerBean2.getSub_title());
                        linearLayout.addView(simpleDraweeView2);
                        linearLayout.addView(textView);
                        HandShankAdView.this.f47150c.addView(linearLayout);
                    }
                    i5++;
                    i4 = 1;
                }
            }
            HandShankAdView.this.f();
            int childCount = HandShankAdView.this.f47150c.getChildCount();
            if (simpleDraweeView.getVisibility() != 8) {
                if (childCount <= 0) {
                    HandShankAdView.this.setPadding(0, 0, 0, a5);
                    int a8 = com.join.mgps.Util.c0.a(context, 130.0f);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) HandShankAdView.this.getLayoutParams();
                    layoutParams2.height = a8;
                    HandShankAdView.this.setLayoutParams(layoutParams2);
                    HandShankAdView.this.f47150c.setVisibility(8);
                }
            } else if (childCount <= 0) {
                HandShankAdView.this.g();
            } else {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) HandShankAdView.this.f47150c.getLayoutParams();
                layoutParams3.topMargin = a5;
                HandShankAdView.this.f47150c.setLayoutParams(layoutParams3);
                int a9 = com.join.mgps.Util.c0.a(context, 130.0f);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) HandShankAdView.this.getLayoutParams();
                layoutParams4.height = a9;
                HandShankAdView.this.setLayoutParams(layoutParams4);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BannerBean bannerBean = (BannerBean) view.getTag();
            if (bannerBean == null) {
                return;
            }
            IntentUtil.getInstance().intentActivity(HandShankAdView.this.getContext(), HandShankAdView.this.e(bannerBean));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = HandShankAdView.this.f47149b;
            if (loadingLayout != null) {
                loadingLayout.setVisibility(0);
                HandShankAdView.this.f47149b.h();
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = HandShankAdView.this.f47149b;
            if (loadingLayout != null) {
                loadingLayout.setVisibility(0);
                HandShankAdView.this.f47149b.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = HandShankAdView.this.f47149b;
            if (loadingLayout != null) {
                loadingLayout.d();
                HandShankAdView.this.f47149b.setVisibility(8);
                HandShankAdView.this.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = HandShankAdView.this.f47149b;
            if (loadingLayout != null) {
                loadingLayout.d();
                HandShankAdView.this.f47149b.setVisibility(8);
            }
        }
    }

    public HandShankAdView(Context context) {
        super(context);
        this.f47151d = new b();
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IntentDateBean e(BannerBean bannerBean) {
        return bannerBean.getIntentDataBean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        new Handler(Looper.getMainLooper()).post(new e());
    }

    private void h() {
        LoadingLayout loadingLayout = (LoadingLayout) LayoutInflater.from(getContext()).inflate(R.layout.banner_handshank_top, this).findViewById(R.id.loadingLayout);
        this.f47149b = loadingLayout;
        loadingLayout.setRefreshCallBackListener(this);
        this.f47150c = (LinearLayout) findViewById(R.id.ll_fast_entrance);
    }

    @Override // com.join.mgps.customview.LoadingLayout.b
    public void callBack() {
        k();
        Activity activity = (Activity) getContext();
        if (activity instanceof HandShankYesActivity) {
            ((HandShankYesActivity) activity).C0();
        } else if (activity instanceof HandShankNoActivity) {
            ((HandShankNoActivity) activity).B0();
        }
    }

    protected void f() {
        new Handler(Looper.getMainLooper()).post(new f());
    }

    public void i() {
        g();
    }

    protected void j() {
        new Handler(Looper.getMainLooper()).post(new d());
    }

    protected void k() {
        new Handler(Looper.getMainLooper()).post(new c());
    }

    public void l() {
        g();
    }

    public void m(HandShankAdBean handShankAdBean) {
        new Handler(Looper.getMainLooper()).post(new a(handShankAdBean));
    }

    public HandShankAdView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47151d = new b();
        h();
    }

    public HandShankAdView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47151d = new b();
        h();
    }
}
