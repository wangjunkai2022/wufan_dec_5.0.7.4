package com.join.mgps.fragment;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.GameDiscoverActivity;
import com.join.mgps.adapter.CardPagerAdapter;
import com.join.mgps.control.RhythmLayout;
import com.join.mgps.dto.GameDiscoverBean;
import com.join.mgps.pulltorefresh.extras.viewpager.PullToRefreshViewPager;
import com.join.mgps.pulltorefresh.library.PullToRefreshBase;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class CardViewPagerFragment extends AbsBaseFragment implements PullToRefreshBase.h<ViewPager> {

    /* renamed from: w  reason: collision with root package name */
    private static CardViewPagerFragment f49991w;

    /* renamed from: c  reason: collision with root package name */
    private View f49992c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f49993d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f49994e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f49995f;

    /* renamed from: g  reason: collision with root package name */
    private RhythmLayout f49996g;

    /* renamed from: h  reason: collision with root package name */
    private PullToRefreshViewPager f49997h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPager f49998i;

    /* renamed from: j  reason: collision with root package name */
    private CardPagerAdapter f49999j;

    /* renamed from: k  reason: collision with root package name */
    private int f50000k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f50002m;

    /* renamed from: n  reason: collision with root package name */
    private List<GameDiscoverBean> f50003n;

    /* renamed from: o  reason: collision with root package name */
    private List<GameDiscoverBean> f50004o;

    /* renamed from: s  reason: collision with root package name */
    private com.join.mgps.control.b f50008s;

    /* renamed from: v  reason: collision with root package name */
    private int f50011v;

    /* renamed from: l  reason: collision with root package name */
    private boolean f50001l = true;

    /* renamed from: p  reason: collision with root package name */
    private com.join.mgps.pref.c f50005p = null;

    /* renamed from: q  reason: collision with root package name */
    private int f50006q = 1;

    /* renamed from: r  reason: collision with root package name */
    private boolean f50007r = true;

    /* renamed from: t  reason: collision with root package name */
    private com.join.mgps.control.a f50009t = new a();

    /* renamed from: u  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f50010u = new b();

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.control.a {

        /* renamed from: com.join.mgps.fragment.CardViewPagerFragment$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0365a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f50013b;

            RunnableC0365a(int i4) {
                this.f50013b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                CardViewPagerFragment.this.f49998i.setCurrentItem(this.f50013b);
            }
        }

        a() {
        }

        @Override // com.join.mgps.control.a
        public void a() {
        }

        @Override // com.join.mgps.control.a
        public void b(int i4) {
        }

        @Override // com.join.mgps.control.a
        public void onSelected(int i4) {
            CardViewPagerFragment.this.f49948b.postDelayed(new RunnableC0365a(i4), 100L);
        }
    }

    /* loaded from: classes3.dex */
    class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            CardViewPagerFragment.this.k0(i4);
            if (!CardViewPagerFragment.this.f50001l || CardViewPagerFragment.this.f50003n.size() <= 0 || CardViewPagerFragment.this.f50003n.size() % 10 != 0 || i4 < CardViewPagerFragment.this.f50003n.size() - 8 || CardViewPagerFragment.this.f50002m || !com.join.android.app.common.utils.j.j(CardViewPagerFragment.this.getActivity())) {
                return;
            }
            CardViewPagerFragment.this.g0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardViewPagerFragment.this.f49998i.setCurrentItem(0, true);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CardViewPagerFragment.this.g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Animator.AnimatorListener {
        e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardViewPagerFragment.this.f49993d.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private void f0(List<GameDiscoverBean> list) {
        com.join.mgps.control.b bVar = this.f50008s;
        if (bVar == null) {
            l0(list);
            return;
        }
        bVar.a(list);
        this.f50008s.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        this.f50001l = false;
        this.f50002m = true;
        Bundle bundle = new Bundle();
        int i4 = this.f50006q + 1;
        this.f50006q = i4;
        bundle.putInt("CurrentPn", i4);
        this.f50005p.B(bundle);
    }

    public static CardViewPagerFragment h0() {
        if (f49991w == null) {
            f49991w = new CardViewPagerFragment();
        }
        return f49991w;
    }

    public static int i0(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i4 = rect.top;
        if (i4 == 0) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                return activity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            } catch (ClassNotFoundException e5) {
                e5.printStackTrace();
                return i4;
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return i4;
            } catch (IllegalArgumentException e7) {
                e7.printStackTrace();
                return i4;
            } catch (InstantiationException e8) {
                e8.printStackTrace();
                return i4;
            } catch (NoSuchFieldException e9) {
                e9.printStackTrace();
                return i4;
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
                return i4;
            } catch (SecurityException e11) {
                e11.printStackTrace();
                return i4;
            }
        }
        return i4;
    }

    private void j0() {
        List<GameDiscoverBean> list = this.f50004o;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f50000k = com.join.mgps.Util.h.d(this.f50004o.get(0).getDiscover().getBg_color());
        p0(this.f50004o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i4) {
        this.f49996g.w(i4);
        o0(i4);
        int d5 = com.join.mgps.Util.h.d(this.f50003n.get(i4).getDiscover().getBg_color());
        if (this.f50007r) {
            GameDiscoverActivity gameDiscoverActivity = (GameDiscoverActivity) getActivity();
            if (gameDiscoverActivity != null && gameDiscoverActivity.i0() != null) {
                gameDiscoverActivity.i0().p(d5);
                this.f50007r = false;
            }
        } else {
            GameDiscoverActivity gameDiscoverActivity2 = (GameDiscoverActivity) getActivity();
            if (gameDiscoverActivity2 != null && gameDiscoverActivity2.i0() != null) {
                gameDiscoverActivity2.i0().k(0);
            }
        }
        com.join.mgps.Util.c.k(this.f49992c, this.f50000k, d5, 700);
        this.f50000k = d5;
    }

    private void l0(List<GameDiscoverBean> list) {
        if (getActivity() == null || list == null) {
            return;
        }
        com.join.mgps.control.b bVar = new com.join.mgps.control.b(getActivity(), this.f49996g, list);
        this.f50008s = bVar;
        this.f49996g.setAdapter(bVar);
    }

    private void n0(ViewPager viewPager, int i4) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            com.join.mgps.control.c cVar = new com.join.mgps.control.c(viewPager.getContext(), new OvershootInterpolator(0.6f));
            declaredField.set(viewPager, cVar);
            cVar.a(i4);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
    }

    private void o0(int i4) {
        if (i4 > 1) {
            if (this.f49993d.getVisibility() == 8) {
                this.f49993d.setVisibility(0);
                com.join.mgps.Util.c.a(this.f49993d);
            }
        } else if (this.f49993d.getVisibility() == 0) {
            com.join.mgps.Util.c.c(this.f49993d).addListener(new e());
        }
        String format = new SimpleDateFormat("dd").format(Long.valueOf(this.f50003n.get(i4).getDiscover().getAddtimes() * 1000));
        this.f49995f.setText(new SimpleDateFormat("MM EEEE").format(Long.valueOf(this.f50003n.get(i4).getDiscover().getAddtimes() * 1000)).replace(" ", "月\n"));
        this.f49994e.setText(format);
    }

    private void p0(List<GameDiscoverBean> list) {
        try {
            if (getActivity() != null && !getActivity().isFinishing()) {
                if (list.isEmpty()) {
                    this.f50001l = false;
                    this.f49992c.setBackgroundColor(this.f50000k);
                    return;
                }
                int size = this.f50003n.size();
                this.f50001l = list.size() >= 10;
                CardPagerAdapter cardPagerAdapter = this.f49999j;
                if (cardPagerAdapter == null) {
                    CardPagerAdapter cardPagerAdapter2 = new CardPagerAdapter(getActivity().getSupportFragmentManager(), list);
                    this.f49999j = cardPagerAdapter2;
                    this.f49998i.setAdapter(cardPagerAdapter2);
                } else {
                    cardPagerAdapter.b(list);
                    this.f49999j.notifyDataSetChanged();
                }
                f0(list);
                this.f50003n = this.f49999j.c();
                if (this.f49998i.getCurrentItem() == size - 1) {
                    ViewPager viewPager = this.f49998i;
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.PullToRefreshBase.h
    public void O(PullToRefreshBase<ViewPager> pullToRefreshBase) {
        if (this.f50002m) {
            return;
        }
        if (pullToRefreshBase.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_END) {
            if (this.f50001l && !this.f50002m && com.join.android.app.common.utils.j.j(getActivity())) {
                new Handler().postDelayed(new d(), 2000L);
                return;
            }
            this.f49997h.f();
            this.f49997h.setMode(PullToRefreshBase.Mode.DISABLED);
            this.f50002m = false;
        } else if (pullToRefreshBase.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_START) {
            this.f49997h.f();
            this.f50002m = false;
        }
    }

    @Override // com.join.mgps.fragment.AbsBaseFragment
    protected void V(View view) {
        this.f49996g.setRhythmListener(this.f50009t);
        this.f49997h.setOnRefreshListener(this);
        this.f49997h.setPullToRefreshEnabled(false);
        this.f49998i.setOnPageChangeListener(this.f50010u);
        this.f49993d.setOnClickListener(new c());
    }

    @Override // com.join.mgps.fragment.AbsBaseFragment
    protected View W(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_discoverapp, (ViewGroup) null);
        if (Build.VERSION.SDK_INT >= 21) {
            int i02 = i0(getActivity());
            this.f50011v = i02;
            inflate.setPadding(0, i02, 0, 0);
        }
        this.f49994e = (TextView) inflate.findViewById(R.id.text_time_first);
        this.f49995f = (TextView) inflate.findViewById(R.id.text_time_second);
        this.f49992c = inflate.findViewById(R.id.main_view);
        this.f49993d = (ImageButton) inflate.findViewById(R.id.btn_rocket_to_head);
        this.f49996g = (RhythmLayout) inflate.findViewById(R.id.box_rhythm);
        PullToRefreshViewPager pullToRefreshViewPager = (PullToRefreshViewPager) inflate.findViewById(R.id.pager);
        this.f49997h = pullToRefreshViewPager;
        ViewPager refreshableView = pullToRefreshViewPager.getRefreshableView();
        this.f49998i = refreshableView;
        n0(refreshableView, 700);
        this.f49996g.setScrollRhythmStartDelayTime(100);
        int rhythmItemWidth = ((int) this.f49996g.getRhythmItemWidth()) + (((int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics())) * 2);
        this.f49996g.getLayoutParams().height = rhythmItemWidth;
        double d5 = rhythmItemWidth;
        Double.isNaN(d5);
        ((RelativeLayout.LayoutParams) this.f49997h.getLayoutParams()).bottomMargin = (int) (d5 * 1.3d);
        return inflate;
    }

    @Override // com.join.mgps.fragment.AbsBaseFragment
    protected void initData() {
        this.f50003n = new ArrayList();
    }

    public void m0(List<GameDiscoverBean> list) {
        this.f50004o = list;
        if (this.f50006q > 1) {
            this.f50000k = com.join.mgps.Util.h.d(list.get(0).getDiscover().getBg_color());
            p0(list);
            this.f49997h.f();
            this.f50002m = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f50006q = 1;
        this.f50001l = true;
        this.f50008s = null;
        this.f49999j = null;
        this.f50005p.y(null);
        try {
            j0();
            k0(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (getActivity() != null) {
            this.f50005p = (GameDiscoverActivity) getActivity();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f50005p = null;
        super.onDestroy();
    }
}
