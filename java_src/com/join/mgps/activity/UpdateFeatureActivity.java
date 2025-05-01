package com.join.mgps.activity;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.BaseActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonAdBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import tv.danmaku.ijk.media.player.IMediaPlayer;
@EActivity(R.layout.update_feature_activity)
/* loaded from: classes4.dex */
public class UpdateFeatureActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ViewPager f38227b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f38228c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    CommonAdBean f38229d;

    /* renamed from: h  reason: collision with root package name */
    private c f38233h;

    /* renamed from: i  reason: collision with root package name */
    private Context f38234i;

    /* renamed from: j  reason: collision with root package name */
    private Handler f38235j;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f38230e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<View> f38231f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private List<Boolean> f38232g = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    Runnable f38236k = new Runnable() { // from class: com.join.mgps.activity.h3
        @Override // java.lang.Runnable
        public final void run() {
            UpdateFeatureActivity.this.o0();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends PagerAdapter {
        a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i4, @NonNull Object obj) {
            viewGroup.removeView((View) UpdateFeatureActivity.this.f38231f.get(i4));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return UpdateFeatureActivity.this.f38231f.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i4) {
            View view = (View) UpdateFeatureActivity.this.f38231f.get(i4);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.pic);
            if (i4 < UpdateFeatureActivity.this.f38230e.size()) {
                MyImageLoader.p(simpleDraweeView, (String) UpdateFeatureActivity.this.f38230e.get(i4), r.c.f11296c);
            }
            viewGroup.addView(view);
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            if (i4 < UpdateFeatureActivity.this.f38231f.size() - 2 || f5 < 0.5d) {
                return;
            }
            UpdateFeatureActivity.this.finish();
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (i4 == UpdateFeatureActivity.this.f38231f.size() - 1) {
                return;
            }
            if (UpdateFeatureActivity.this.f38232g != null) {
                int i5 = 0;
                while (i5 < UpdateFeatureActivity.this.f38232g.size()) {
                    UpdateFeatureActivity.this.f38232g.set(i5, Boolean.valueOf(i5 == i4 % UpdateFeatureActivity.this.f38232g.size()));
                    if (UpdateFeatureActivity.this.f38233h != null) {
                        UpdateFeatureActivity.this.f38233h.notifyDataSetChanged();
                    }
                    i5++;
                }
            }
            if (UpdateFeatureActivity.this.f38235j != null) {
                UpdateFeatureActivity.this.f38235j.removeCallbacksAndMessages(null);
                UpdateFeatureActivity.this.f38235j.postDelayed(UpdateFeatureActivity.this.f38236k, 3000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends BaseQuickAdapter<Boolean, BaseViewHolder> {
        public c() {
            super(R.layout.item_update_feature_indicator, UpdateFeatureActivity.this.f38232g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, Boolean bool) {
            baseViewHolder.setGone(R.id.viewUnselected, !bool.booleanValue()).setGone(R.id.viewSelected, bool.booleanValue());
        }
    }

    private void m0() {
        this.f38228c.setLayoutManager(new LinearLayoutManager(this.f38234i, 0, false));
        c cVar = new c();
        this.f38233h = cVar;
        this.f38228c.setAdapter(cVar);
    }

    private void n0() {
        int i4 = 0;
        while (i4 < this.f38230e.size()) {
            this.f38231f.add(LayoutInflater.from(this).inflate(R.layout.layout_page_update_feature, (ViewGroup) null));
            this.f38232g.add(Boolean.valueOf(i4 == 0));
            i4++;
        }
        this.f38231f.add(LayoutInflater.from(this).inflate(R.layout.layout_page_update_feature, (ViewGroup) null));
        this.f38227b.setAdapter(new a());
        this.f38227b.setOffscreenPageLimit(4);
        this.f38227b.addOnPageChangeListener(new b());
        Handler handler = this.f38235j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f38235j.postDelayed(this.f38236k, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0() {
        List<View> list;
        if (this.f38227b == null || (list = this.f38231f) == null || list.size() <= 0) {
            return;
        }
        this.f38227b.setCurrentItem((this.f38227b.getCurrentItem() + 1) % this.f38231f.size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f38234i = this;
        this.f38235j = new Handler();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        CommonAdBean commonAdBean = this.f38229d;
        if (commonAdBean == null || commonAdBean.getAd_info_list() == null || this.f38229d.getAd_info_list().size() <= 0) {
            finish();
        }
        for (CommonGameInfoBean commonGameInfoBean : this.f38229d.getAd_info_list()) {
            this.f38230e.add(commonGameInfoBean.getBig_pic());
        }
        n0();
        m0();
    }

    @Override // android.app.Activity
    public void finish() {
        setResult(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
