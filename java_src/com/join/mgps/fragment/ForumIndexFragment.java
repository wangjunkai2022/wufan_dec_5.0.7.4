package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.customview.ForumIndexHeaderView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.customview.SlidingTabLayout4;
import com.join.mgps.db.tables.ForumTable;
import com.join.mgps.dto.ForumBannerBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.RecommenGroup;
import com.join.mgps.dto.RecommenGroupClassify;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.springframework.util.LinkedMultiValueMap;
import ru.noties.scrollable.ScrollableLayout;
@EFragment(R.layout.mg_forum_index_fragment)
/* loaded from: classes3.dex */
public class ForumIndexFragment extends BaseFragment implements ForumIndexHeaderView.c, View.OnClickListener {
    @ViewById
    RelativeLayout A;
    TextView B;
    @ViewById
    TextView C;
    TextView D;
    LinearLayout E;
    TextView F;
    ScrollTextViewLayout G;
    ImageView H;
    ImageView I;
    ImageView J;
    SimpleDraweeView K;
    SimpleDraweeView L;
    @Pref
    PrefDef_ M;
    public List<DownloadTask> U;
    private Animation W;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f51330c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f51331d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    View f51332e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f51333f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ForumLoadingView f51334g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ScrollableLayout f51335h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ForumIndexHeaderView f51336i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    SlidingTabLayout4 f51337j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ViewPager f51338k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    PtrClassicFrameLayout f51339l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    RelativeLayout f51340m;

    /* renamed from: n  reason: collision with root package name */
    Context f51341n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.i f51342o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.e f51343p;

    /* renamed from: q  reason: collision with root package name */
    com.join.mgps.rpc.b f51344q;

    /* renamed from: r  reason: collision with root package name */
    List<RecommenGroupClassify> f51345r;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.fragment.e f51346s;

    /* renamed from: t  reason: collision with root package name */
    FragmentPagerAdapter f51347t;

    /* renamed from: v  reason: collision with root package name */
    private int f51349v;

    /* renamed from: w  reason: collision with root package name */
    FragmentManager f51350w;

    /* renamed from: y  reason: collision with root package name */
    private AbsListView f51352y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f51353z;

    /* renamed from: b  reason: collision with root package name */
    private final String f51329b = getClass().getCanonicalName();

    /* renamed from: u  reason: collision with root package name */
    int f51348u = 0;

    /* renamed from: x  reason: collision with root package name */
    boolean f51351x = false;
    private int N = 0;
    private int O = 0;
    private int P = 0;
    private int Q = 0;
    private int R = 2;
    private int S = 0;
    private int T = 1;
    private int V = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumIndexFragment.this.g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.B0(view.getContext());
        }
    }

    /* loaded from: classes3.dex */
    class d implements com.join.mgps.ptr.b {
        d() {
        }

        @Override // com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            ForumIndexFragment.this.x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements ViewPager.OnPageChangeListener {
        e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            try {
                ForumIndexFragment forumIndexFragment = ForumIndexFragment.this;
                FragmentPagerAdapter fragmentPagerAdapter = forumIndexFragment.f51347t;
                Fragment item = fragmentPagerAdapter != null ? fragmentPagerAdapter.getItem(forumIndexFragment.f51349v) : null;
                if (item != null) {
                    item.onPause();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            ForumIndexFragment.this.f51349v = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements ru.noties.scrollable.b {
        f() {
        }

        @Override // ru.noties.scrollable.b
        public boolean q(int i4) {
            FragmentPagerFragment h02 = ForumIndexFragment.this.h0();
            return h02 != null && h02.q(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements ru.noties.scrollable.j {
        g() {
        }

        @Override // ru.noties.scrollable.j
        public void F(int i4, long j4) {
            FragmentPagerFragment h02 = ForumIndexFragment.this.h0();
            if (h02 != null) {
                h02.F(i4, j4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements ru.noties.scrollable.k {
        h() {
        }

        @Override // ru.noties.scrollable.k
        public void a(int i4, int i5, int i6) {
            try {
                com.join.mgps.fragment.e eVar = ForumIndexFragment.this.f51346s;
                if (eVar == null || !(eVar.a() instanceof ForumPostsFragment)) {
                    return;
                }
                ((ForumPostsFragment) ForumIndexFragment.this.f51346s.a()).F0();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends ForumLoadingView.e {
        i(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumIndexFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j extends ForumLoadingView.e {
        j(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            ForumIndexFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k extends ForumLoadingView.e {
        k(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumIndexFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f51341n);
        this.G.p();
        this.J.setVisibility(8);
        this.M.isNewFinishedGame().g(Boolean.FALSE);
        this.H.setVisibility(8);
    }

    private void r0() {
        View inflate = LayoutInflater.from(this.f51341n).inflate(R.layout.mgmain_otherlayout, (ViewGroup) null);
        this.B = (TextView) inflate.findViewById(R.id.papa_user_round);
        this.D = (TextView) inflate.findViewById(R.id.biground);
        this.E = (LinearLayout) inflate.findViewById(R.id.downloadLayout);
        this.F = (TextView) inflate.findViewById(R.id.scroll_text);
        this.G = (ScrollTextViewLayout) inflate.findViewById(R.id.scroll_text_layout);
        this.H = (ImageView) inflate.findViewById(R.id.hasNewFinishedGameImage);
        this.I = (ImageView) inflate.findViewById(R.id.downloadLine);
        this.J = (ImageView) inflate.findViewById(R.id.imageLoading);
        this.K = (SimpleDraweeView) inflate.findViewById(R.id.coinFloatad);
        this.L = (SimpleDraweeView) inflate.findViewById(R.id.papa_user_icon);
        this.A.addView(inflate);
        this.E.setOnClickListener(new a());
        this.E.setVisibility(0);
        f0();
    }

    private List<FragmentPagerAdapter.a> t0(Context context) {
        List<RecommenGroupClassify> list = this.f51345r;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i4 = 0; i4 < this.f51345r.size(); i4++) {
            RecommenGroupClassify recommenGroupClassify = this.f51345r.get(i4);
            recommenGroupClassify.getGid();
            arrayList.add(new FragmentPagerAdapter.a(recommenGroupClassify.getGname(), ForumPostsFragment.f0(recommenGroupClassify, i4)));
        }
        return arrayList;
    }

    private void v0() {
        j0();
        l0();
        n0();
    }

    public void A0() {
        this.f51353z = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B0(String str) {
        String str2 = "";
        if (com.join.android.app.common.utils.j.j(this.f51341n)) {
            try {
                String uid = AccountUtil_.getInstance_(this.f51341n).getUid();
                String token = AccountUtil_.getInstance_(this.f51341n).getToken();
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", uid + "");
                linkedMultiValueMap.add("token", token);
                linkedMultiValueMap.add("ids", str);
                ForumResponse<ForumData.HomepageRecommendLabel> z4 = this.f51342o.z(linkedMultiValueMap);
                if (z4 == null || z4.getError() != 0 || z4.getData() == null) {
                    return;
                }
                if (z4.getData().isResult()) {
                    I0();
                }
                if (TextUtils.isEmpty(z4.getData().getMsg())) {
                    return;
                }
                T(z4.getData().getMsg());
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                T("服务器异常");
                return;
            }
        }
        if (this.f51341n != null && isAdded()) {
            str2 = getString(R.string.net_connect_failed);
        }
        if (!TextUtils.isEmpty(str2)) {
            T(str2);
        }
        e0(9);
    }

    void C0() {
        if (this.f51347t == null) {
            if (this.f51350w == null && isAdded()) {
                this.f51350w = getChildFragmentManager();
            }
            FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(this.f51350w);
            this.f51347t = fragmentPagerAdapter;
            ViewPager viewPager = this.f51338k;
            if (viewPager != null) {
                viewPager.setAdapter(fragmentPagerAdapter);
            }
            SlidingTabLayout4 slidingTabLayout4 = this.f51337j;
            if (slidingTabLayout4 != null) {
                slidingTabLayout4.setViewPager(this.f51338k);
            }
            this.f51346s = new com.join.mgps.fragment.f(this.f51338k, this.f51350w);
        }
        if (this.f51347t.c() != null) {
            this.f51347t.b();
        }
        this.f51347t.e(t0(this.f51341n));
        if (this.f51337j != null) {
            if (this.f51347t.getCount() <= 4) {
                this.f51337j.setShouldExpand(true);
            } else {
                this.f51337j.setShouldExpand(false);
            }
            this.f51337j.setOnPageChangeListener(new e());
        }
        this.f51347t.notifyDataSetChanged();
        SlidingTabLayout4 slidingTabLayout42 = this.f51337j;
        if (slidingTabLayout42 != null) {
            slidingTabLayout42.g();
        }
        ViewPager viewPager2 = this.f51338k;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(this.f51347t.getCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(ForumBannerBean.ForumBannerDataBannerBean forumBannerDataBannerBean) {
        ForumIndexHeaderView forumIndexHeaderView = this.f51336i;
        if (forumIndexHeaderView != null && forumBannerDataBannerBean != null) {
            forumIndexHeaderView.setBannerData(forumBannerDataBannerBean.getBanner());
        }
        e0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        com.join.mgps.Util.b0.f0(getContext()).m(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0(ForumData.HomepageRecommendGroup homepageRecommendGroup) {
        e0(2);
        List<RecommenGroup> tuijianguanzhu = homepageRecommendGroup.getTuijianguanzhu();
        List<RecommenGroup> wodeguanzhu = homepageRecommendGroup.getWodeguanzhu();
        ForumIndexHeaderView forumIndexHeaderView = this.f51336i;
        if (forumIndexHeaderView != null) {
            forumIndexHeaderView.setHomepageRecommendGroupMy(wodeguanzhu);
            this.f51336i.setHomepageRecommendGroup(tuijianguanzhu);
        }
        if (this.f51345r == null) {
            this.f51345r = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        ForumIndexHeaderView forumIndexHeaderView = this.f51336i;
        if (forumIndexHeaderView != null) {
            forumIndexHeaderView.setLabelsVisibility(8);
        }
        L0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0(boolean z4, List<RecommendLabelTag> list) {
        ForumIndexHeaderView forumIndexHeaderView = this.f51336i;
        if (forumIndexHeaderView != null) {
            if (z4) {
                forumIndexHeaderView.setLabelsVisibility(0);
            } else {
                forumIndexHeaderView.setLabelsVisibility(8);
            }
            this.f51336i.setLabelsTipVisibility(8);
            this.f51336i.setHomepageRecommendLabel(list);
        }
        L0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0() {
        n0();
    }

    void J0() {
        this.I.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f51341n, R.anim.img_translate);
        this.W = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.J.setVisibility(0);
        this.J.startAnimation(this.W);
        this.W.setAnimationListener(new b());
    }

    void K0() {
        this.J.clearAnimation();
        this.J.setVisibility(8);
        int i4 = this.R;
        if (i4 != 2 && i4 != 5) {
            this.I.setImageResource(R.drawable.line_white_bg);
        } else {
            this.I.setImageResource(R.drawable.line_grey_bg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51339l;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M0() {
        ForumIndexHeaderView forumIndexHeaderView = this.f51336i;
        if (forumIndexHeaderView != null) {
            forumIndexHeaderView.i();
        }
    }

    public void N0() {
        com.papa.gsyvideoplayer.d.j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void O0() {
        try {
            if (this.f51334g.getLoadingState() == 2 && b2.t.p() != null) {
                ForumTable o4 = b2.t.p().o(ForumBean.ForumEvent.HomepageRecommendGroup);
                if ((o4 == null || System.currentTimeMillis() - (Long.parseLong(o4.getTime()) * 1000) < com.join.mgps.Util.j0.f27863c) && !com.join.mgps.pref.h.n(this.f51341n).A()) {
                    return;
                }
                com.join.mgps.pref.h.n(this.f51341n).o0(false);
                R();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0(int i4) {
        TextView textView = this.D;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.D.getLayoutParams();
            Context context = this.f51341n;
            if (context != null) {
                layoutParams.width = context.getResources().getDimensionPixelOffset(R.dimen.round_large_size);
                layoutParams.height = this.f51341n.getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            }
            this.D.setLayoutParams(layoutParams);
            this.D.setCompoundDrawables(null, null, null, null);
            this.D.setBackgroundResource(R.drawable.mygame_big_round);
            this.D.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.D.getLayoutParams();
            Context context2 = this.f51341n;
            if (context2 != null) {
                layoutParams2.width = context2.getResources().getDimensionPixelOffset(R.dimen.dp70);
                layoutParams2.height = this.f51341n.getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            }
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 7.0f, this.f51341n.getResources().getDisplayMetrics()), 4, 0);
            this.D.setGravity(17);
            this.D.setLayoutParams(layoutParams2);
            this.D.setCompoundDrawables(null, null, null, null);
            this.D.setBackgroundResource(R.drawable.message_round);
            this.D.setPadding(1, 0, 2, 1);
        }
        TextView textView2 = this.D;
        textView2.setText(i4 + "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0() {
        K0();
        TextView textView = this.D;
        if (textView != null) {
            textView.setVisibility(8);
            this.D.setText("");
        }
        TextView textView2 = this.C;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    void R() {
        u0();
        v0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(int i4) {
        Context context = this.f51341n;
        if (context != null) {
            int i5 = this.R;
            if (i5 != 2 && i5 != 5) {
                this.G.setDrawable(context.getResources().getDrawable(R.drawable.papa_download_butn));
            } else {
                this.G.setDrawable(context.getResources().getDrawable(R.drawable.papa_download_selector));
            }
        }
        if (i4 == 0) {
            K0();
            return;
        }
        this.I.setImageResource(R.drawable.line_blue_bg);
        J0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void S0() {
        K0();
        TextView textView = this.D;
        if (textView != null) {
            textView.setVisibility(8);
            this.D.setText("");
        }
        if (this.C != null) {
            Drawable drawable = this.f51341n.getResources().getDrawable(R.drawable.mygame_litle_round);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.C.setVisibility(0);
            this.C.setCompoundDrawables(drawable, null, null, null);
            this.C.setBackgroundResource(R.color.transparent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.BaseFragment
    @UiThread
    public void T(String str) {
        l2.a(this.f51341n).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void V() {
        com.join.mgps.Util.j0.g1();
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void W() {
        IntentUtil.getInstance().goMGSettingActivity(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51340m.setVisibility(0);
        this.f51331d.setVisibility(0);
        this.f51342o = com.join.mgps.rpc.impl.g.A0();
        this.f51343p = com.join.mgps.rpc.impl.d.P1();
        this.f51344q = com.join.mgps.rpc.impl.a.c0();
        this.f51341n = getActivity();
        this.f51333f.setVisibility(0);
        this.f51333f.setText("社区");
        this.f51340m.setOnClickListener(new c());
        this.f51339l.setPtrHandler(new d());
        this.f51339l.j(true);
        this.f51335h.setAutoMaxScroll(false);
        this.f51336i.setmOnMeasureHeight(this);
        this.f51336i.setHeaderClickListener(this);
        r0();
        q0();
        R();
    }

    public void b0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51339l;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72036y})
    public void c0(Intent intent) {
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d0() {
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(int i4) {
        ForumLoadingView forumLoadingView = this.f51334g;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.j(1);
        } else if (i4 == 2) {
            forumLoadingView.j(2);
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView2 = this.f51334g;
            forumLoadingView2.setListener(new k(forumLoadingView2));
            this.f51334g.j(16);
        } else if (i4 == 9) {
            forumLoadingView.setListener(new i(forumLoadingView));
            this.f51334g.j(9);
        } else if (i4 != 10) {
        } else {
            forumLoadingView.setFailedMsg("没有更多内容哦~");
            ForumLoadingView forumLoadingView3 = this.f51334g;
            forumLoadingView3.setListener(new j(forumLoadingView3));
            this.f51334g.setReloadingVisibility(0);
            this.f51334g.j(10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f0() {
        this.N = p1.f.K().S();
        this.P = p1.f.K().W(getActivity());
        R0(p1.f.K().a0());
        int i4 = this.N;
        if (i4 != 0) {
            P0(i4);
        } else if (this.P != 0) {
            S0();
        } else {
            Q0();
        }
    }

    @Override // com.join.mgps.customview.ForumIndexHeaderView.c
    public void h(int i4) {
        ViewPager viewPager;
        SlidingTabLayout4 slidingTabLayout4;
        ScrollableLayout scrollableLayout = this.f51335h;
        if (scrollableLayout != null) {
            if (this.f51348u == 0) {
                List<RecommenGroupClassify> list = this.f51345r;
                if (list != null && list.size() > 0 && (slidingTabLayout4 = this.f51337j) != null && this.f51338k != null && slidingTabLayout4.getVisibility() == 0 && this.f51338k.getVisibility() == 0) {
                    this.f51335h.setMaxScrollY(i4);
                    ViewGroup.LayoutParams layoutParams = this.f51338k.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = this.f51334g.getMeasuredHeight() - this.f51337j.getMeasuredHeight();
                    this.f51338k.setLayoutParams(layoutParams);
                    return;
                }
                this.f51335h.setMaxScrollY(i4 - this.f51334g.getMeasuredHeight());
                return;
            }
            scrollableLayout.setMaxScrollY(i4);
            if (this.f51337j == null || (viewPager = this.f51338k) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewPager.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = this.f51334g.getMeasuredHeight() - this.f51337j.getMeasuredHeight();
            this.f51338k.setLayoutParams(layoutParams2);
        }
    }

    FragmentPagerFragment h0() {
        com.join.mgps.fragment.e eVar = this.f51346s;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public int i0() {
        ViewPager viewPager = this.f51338k;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(this.f51341n)) {
            try {
                ResultMainBean<ForumBannerBean.ForumBannerDataBannerBean> x02 = this.f51343p.x0(com.join.mgps.Util.j0.V(this.f51341n, 1));
                if (x02 != null && x02.getFlag() == 1 && x02.getMessages() != null && x02.getMessages().getData() != null) {
                    ForumBannerBean.ForumBannerDataBannerBean data = x02.getMessages().getData();
                    com.join.mgps.Util.j0.l1(data);
                    D0(data);
                    return;
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                p0();
                L0();
                return;
            }
        }
        String string = (this.f51341n == null || !isAdded()) ? "" : getString(R.string.net_connect_failed);
        if (!TextUtils.isEmpty(string)) {
            T(string);
        }
        e0(9);
    }

    void k0() {
        ForumBannerBean.ForumBannerDataBannerBean a02 = com.join.mgps.Util.j0.a0();
        if (a02 == null) {
            return;
        }
        D0(a02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0() {
        if (com.join.android.app.common.utils.j.j(this.f51341n)) {
            try {
                ForumResponse<ForumData.HomepageRecommendGroup> P = this.f51342o.P(AccountUtil_.getInstance_(this.f51341n).getUid(), AccountUtil_.getInstance_(this.f51341n).getToken());
                if (P == null || P.getError() != 0) {
                    return;
                }
                if (P.getData() == null) {
                    e0(4);
                    return;
                }
                ForumData.HomepageRecommendGroup data = P.getData();
                com.join.mgps.Util.j0.q1(data);
                F0(data);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                L0();
                return;
            }
        }
        String string = (this.f51341n == null || !isAdded()) ? "" : getString(R.string.net_connect_failed);
        if (!TextUtils.isEmpty(string)) {
            T(string);
        }
        e0(9);
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    void m0() {
        ForumData.HomepageRecommendGroup g02 = com.join.mgps.Util.j0.g0();
        if (g02 == null) {
            return;
        }
        F0(g02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        if (com.join.android.app.common.utils.j.j(this.f51341n)) {
            try {
                ForumResponse<ForumData.HomepageRecommendLabel> O = this.f51342o.O(0, 1, AccountUtil_.getInstance_(this.f51341n).getUid(), AccountUtil_.getInstance_(this.f51341n).getToken());
                if (O != null && O.getError() == 0) {
                    if (O.getData() == null) {
                        e0(4);
                        M0();
                        return;
                    }
                    ForumData.HomepageRecommendLabel data = O.getData();
                    com.join.mgps.Util.j0.r1(data);
                    this.f51348u = data.getFlag();
                    if (data.getFlag() == 0) {
                        H0(data.getLabel_switcher() == 1, data.getTag_list());
                    } else if (data.getFlag() == 1) {
                        G0();
                    }
                    y0(data.getFenzu());
                }
                M0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                L0();
                return;
            }
        }
        String string = (this.f51341n == null || !isAdded()) ? "" : getString(R.string.net_connect_failed);
        if (!TextUtils.isEmpty(string)) {
            T(string);
        }
        e0(9);
        M0();
    }

    void o0() {
        List<RecommenGroupClassify> list;
        ForumData.HomepageRecommendLabel h02 = com.join.mgps.Util.j0.h0();
        if (h02 == null) {
            return;
        }
        this.f51348u = h02.getFlag();
        if (h02.getFlag() == 0) {
            H0(h02.getLabel_switcher() == 1, h02.getTag_list());
        } else if (h02.getFlag() == 1) {
            if (this.f51345r == null) {
                this.f51345r = new ArrayList();
            }
            if (h02.getFenzu() != null && (list = this.f51345r) != null && list.equals(h02.getFenzu())) {
                z0();
                return;
            }
            this.f51345r.clear();
            this.f51345r.addAll(h02.getFenzu());
            G0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            if (this.f51350w == null && isAdded()) {
                this.f51350w = getChildFragmentManager();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.refreshTag) {
            this.f51336i.h();
            n0();
        } else if (id == R.id.forumRecomm) {
            if (AccountUtil_.getInstance_(getContext()).isTourist()) {
                E0();
            } else if (this.f51336i.getSelectedLabel().size() >= 3) {
                B0(this.f51336i.getSelectedIds());
            } else {
                String string = (this.f51341n == null || !isAdded()) ? "" : getString(R.string.forum_tip_at_least_sel_label);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                T(string);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f51350w != null) {
            FragmentPagerAdapter fragmentPagerAdapter = this.f51347t;
            if (fragmentPagerAdapter != null) {
                fragmentPagerAdapter.b();
            }
            this.f51350w = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4 || h0() == null) {
            return;
        }
        h0().setUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        O0();
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        this.f51336i.setNoForumBanner();
    }

    void q0() {
        this.f51335h.setIsIndex(true);
        this.f51335h.setDraggableView(this.f51336i);
        this.f51335h.setCanScrollVerticallyDelegate(new f());
        this.f51335h.setOnFlingOverListener(new g());
        this.f51335h.w(new h());
    }

    public boolean s0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51339l;
        if (ptrClassicFrameLayout != null) {
            return ptrClassicFrameLayout.q();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0() {
        k0();
        m0();
        o0();
    }

    public void w0() {
    }

    void x0() {
        v0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0(List<RecommenGroupClassify> list) {
        List<RecommenGroupClassify> list2;
        SlidingTabLayout4 slidingTabLayout4;
        if (this.f51345r == null) {
            this.f51345r = new ArrayList();
        }
        if (list != null && (list2 = this.f51345r) != null && list2.equals(list) && (slidingTabLayout4 = this.f51337j) != null && this.f51338k != null && slidingTabLayout4.getVisibility() == 0 && this.f51338k.getVisibility() == 0) {
            z0();
            return;
        }
        this.f51345r.clear();
        this.f51345r.addAll(list);
        if (this.f51345r.size() > 0) {
            SlidingTabLayout4 slidingTabLayout42 = this.f51337j;
            if (slidingTabLayout42 != null) {
                slidingTabLayout42.setVisibility(0);
            }
            ViewPager viewPager = this.f51338k;
            if (viewPager != null) {
                viewPager.setVisibility(0);
            }
            C0();
            return;
        }
        SlidingTabLayout4 slidingTabLayout43 = this.f51337j;
        if (slidingTabLayout43 != null) {
            slidingTabLayout43.setVisibility(8);
        }
        ViewPager viewPager2 = this.f51338k;
        if (viewPager2 != null) {
            viewPager2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        com.join.mgps.fragment.e eVar = this.f51346s;
        if (eVar == null || !(eVar.a() instanceof ForumPostsFragment)) {
            return;
        }
        ((ForumPostsFragment) this.f51346s.a()).v0();
    }
}
