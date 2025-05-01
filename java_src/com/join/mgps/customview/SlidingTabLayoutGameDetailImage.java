package com.join.mgps.customview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.screenshot.ScreenshotGamedetialBean;
import com.join.mgps.customview.SlidingTabLayout;
import com.join.mgps.dto.GamedetialModleFourBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class SlidingTabLayoutGameDetailImage extends HorizontalScrollView {

    /* renamed from: n  reason: collision with root package name */
    private static final int f47918n = 24;

    /* renamed from: o  reason: collision with root package name */
    private static final int f47919o = 16;

    /* renamed from: p  reason: collision with root package name */
    private static final int f47920p = 12;

    /* renamed from: b  reason: collision with root package name */
    private int f47921b;

    /* renamed from: c  reason: collision with root package name */
    private int f47922c;

    /* renamed from: d  reason: collision with root package name */
    private int f47923d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47924e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPager f47925f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<String> f47926g;

    /* renamed from: h  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f47927h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f47928i;

    /* renamed from: j  reason: collision with root package name */
    private int f47929j;

    /* renamed from: k  reason: collision with root package name */
    private List<View> f47930k;

    /* renamed from: l  reason: collision with root package name */
    private List<View> f47931l;

    /* renamed from: m  reason: collision with root package name */
    private GamedetialModleFourBean f47932m;

    /* loaded from: classes4.dex */
    private class b implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private int f47933b;

        private b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            this.f47933b = i4;
            if (SlidingTabLayoutGameDetailImage.this.f47927h != null) {
                SlidingTabLayoutGameDetailImage.this.f47927h.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            int childCount = SlidingTabLayoutGameDetailImage.this.f47928i.getChildCount();
            if (childCount == 0 || i4 < 0 || i4 >= childCount) {
                return;
            }
            SlidingTabLayoutGameDetailImage.this.f47928i.b(i4, f5);
            View childAt = SlidingTabLayoutGameDetailImage.this.f47928i.getChildAt(i4);
            SlidingTabLayoutGameDetailImage.this.l(i4, childAt != null ? (int) (childAt.getWidth() * f5) : 0);
            if (SlidingTabLayoutGameDetailImage.this.f47927h != null) {
                SlidingTabLayoutGameDetailImage.this.f47927h.onPageScrolled(i4, f5, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (this.f47933b == 0) {
                SlidingTabLayoutGameDetailImage.this.f47928i.b(i4, 0.0f);
                SlidingTabLayoutGameDetailImage.this.l(i4, 0);
            }
            int i5 = 0;
            while (i5 < SlidingTabLayoutGameDetailImage.this.f47928i.getChildCount()) {
                SlidingTabLayoutGameDetailImage.this.f47928i.getChildAt(i5).setSelected(i4 == i5);
                i5++;
            }
            if (SlidingTabLayoutGameDetailImage.this.f47927h != null) {
                SlidingTabLayoutGameDetailImage.this.f47927h.onPageSelected(i4);
            }
            for (int i6 = 0; i6 < SlidingTabLayoutGameDetailImage.this.f47930k.size(); i6++) {
                View view = (View) SlidingTabLayoutGameDetailImage.this.f47930k.get(i6);
                View view2 = (View) SlidingTabLayoutGameDetailImage.this.f47931l.get(i6);
                if (i6 == i4) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i4 = 0; i4 < SlidingTabLayoutGameDetailImage.this.f47928i.getChildCount(); i4++) {
                if (view == SlidingTabLayoutGameDetailImage.this.f47928i.getChildAt(i4)) {
                    SlidingTabLayoutGameDetailImage.this.f47925f.setCurrentItem(i4);
                    SlidingTabLayoutGameDetailImage.this.f47928i.getChildAt(i4).findViewById(R.id.indicator).setVisibility(0);
                } else {
                    SlidingTabLayoutGameDetailImage.this.f47928i.getChildAt(i4).findViewById(R.id.indicator).setVisibility(4);
                }
            }
        }
    }

    public SlidingTabLayoutGameDetailImage(Context context) {
        this(context, null);
    }

    private void k() {
        String path;
        ScreenshotGamedetialBean screenshotGamedetialBean;
        String str;
        ScreenshotGamedetialBean screenshotGamedetialBean2;
        PagerAdapter adapter = this.f47925f.getAdapter();
        c cVar = new c();
        this.f47930k.clear();
        this.f47931l.clear();
        for (int i4 = 0; i4 < adapter.getCount(); i4++) {
            View g4 = g(getContext());
            View findViewById = g4.findViewById(R.id.indicator);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) g4.findViewById(R.id.image);
            TextView textView = (TextView) g4.findViewById(R.id.name);
            View findViewById2 = g4.findViewById(R.id.play);
            this.f47930k.add(g4);
            this.f47931l.add(findViewById);
            if (this.f47924e) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g4.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                int i5 = this.f47929j;
                layoutParams.setMargins(i5, 0, i5, 0);
            }
            String str2 = "";
            if (j()) {
                if (i4 == 0) {
                    String game_info_top_pic = this.f47932m.getGame_info_top_pic();
                    findViewById2.setVisibility(0);
                    textView.setVisibility(8);
                    str = "";
                    str2 = game_info_top_pic;
                } else if (i()) {
                    str2 = this.f47932m.getGame_screen_shot().get(i4 - 1).getPic();
                    str = screenshotGamedetialBean2.getTitle() + "\n[ " + screenshotGamedetialBean2.getCount() + " ]";
                } else {
                    if (this.f47932m.getPic_info() != null) {
                        int i6 = i4 - 1;
                        if (this.f47932m.getPic_info().get(i6) != null && this.f47932m.getPic_info().get(i6).getRemote() != null) {
                            path = this.f47932m.getPic_info().get(i6).getRemote().getPath();
                            str2 = path;
                            str = "";
                        }
                    }
                    str = "";
                }
            } else if (i()) {
                str2 = this.f47932m.getGame_screen_shot().get(i4).getPic();
                str = screenshotGamedetialBean.getTitle() + "\n[ " + screenshotGamedetialBean.getCount() + " ]";
            } else {
                if (this.f47932m.getPic_info() != null && this.f47932m.getPic_info().get(i4) != null && this.f47932m.getPic_info().get(i4).getRemote() != null) {
                    path = this.f47932m.getPic_info().get(i4).getRemote().getPath();
                    str2 = path;
                    str = "";
                }
                str = "";
            }
            MyImageLoader.h(simpleDraweeView, str2);
            textView.setText(str);
            g4.setOnClickListener(cVar);
            String str3 = this.f47926g.get(i4, null);
            if (str3 != null) {
                g4.setContentDescription(str3);
            }
            this.f47928i.addView(g4);
            if (i4 == this.f47925f.getCurrentItem()) {
                g4.setSelected(true);
                findViewById.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i4, int i5) {
        View childAt;
        int childCount = this.f47928i.getChildCount();
        if (childCount == 0 || i4 < 0 || i4 >= childCount || (childAt = this.f47928i.getChildAt(i4)) == null) {
            return;
        }
        int left = childAt.getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47921b;
        }
        scrollTo(left, 0);
    }

    protected View g(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.sliding_tab_item_game_detail_image, (ViewGroup) this, false);
    }

    public int getMarginWidth() {
        return this.f47929j;
    }

    public ImageView h(Context context) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
        simpleDraweeView.getHierarchy().B(R.drawable.main_normal_icon);
        simpleDraweeView.getHierarchy().V(RoundingParams.a());
        return simpleDraweeView;
    }

    boolean i() {
        GamedetialModleFourBean gamedetialModleFourBean = this.f47932m;
        return (gamedetialModleFourBean == null || gamedetialModleFourBean.getGame_screen_shot() == null || this.f47932m.getGame_screen_shot().size() <= 0) ? false : true;
    }

    boolean j() {
        return (TextUtils.isEmpty(this.f47932m.getGame_info_top_pic()) || TextUtils.isEmpty(this.f47932m.getGame_info_top_video_url())) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f47925f;
        if (viewPager != null) {
            l(viewPager.getCurrentItem(), 0);
        }
    }

    public void setContentDescription(int i4, String str) {
        this.f47926g.put(i4, str);
    }

    public void setCustomTabColorizer(SlidingTabLayout.d dVar) {
        this.f47928i.d(dVar);
    }

    public void setCustomTabView(int i4, int i5) {
        this.f47922c = i4;
        this.f47923d = i5;
    }

    public void setData(GamedetialModleFourBean gamedetialModleFourBean) {
        this.f47932m = gamedetialModleFourBean;
        if (this.f47925f != null) {
            k();
        }
    }

    public void setDistributeEvenly(boolean z4) {
        this.f47924e = z4;
    }

    public void setMarginWidth(int i4) {
        this.f47929j = i4;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47927h = onPageChangeListener;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f47928i.e(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47928i.removeAllViews();
        this.f47925f = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new b());
            k();
        }
    }

    public SlidingTabLayoutGameDetailImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayoutGameDetailImage(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47926g = new SparseArray<>();
        this.f47930k = new ArrayList();
        this.f47931l = new ArrayList();
        this.f47932m = null;
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f47921b = (int) (getResources().getDisplayMetrics().density * 24.0f);
        d0 d0Var = new d0(context);
        this.f47928i = d0Var;
        addView(d0Var, -1, -2);
    }
}
