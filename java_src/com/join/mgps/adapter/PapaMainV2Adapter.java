package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.EverdayNewGameActivity;
import com.join.kotlin.ui.findgame.data.IntentClassfyEvent;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.PapaMainV3Fragment;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.customview.HorizontalRecyclerView;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.RecyclerviewViewpager;
import com.join.mgps.customview.SlidingTabLayout6;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.MgpapaMainItemBean;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.dto.PAPAItemTitle2;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.fragment.RankingItemV2Fragment;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.ExtFrom;
import com.psk.eventmodule.StatFactory;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class PapaMainV2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int A = 16;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 22;
    public static final int G = 23;
    public static final int H = 24;
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;
    public static final int M = 29;
    public static final int N = 30;
    public static final int O = 31;
    public static final int P = 32;
    public static final int Q = 33;
    public static final int R = 34;
    public static final int S = 35;
    public static final int T = 36;
    public static final int U = 37;
    public static final int V = 38;
    public static final int W = 39;
    public static final int X = 40;

    /* renamed from: k  reason: collision with root package name */
    public static final int f43880k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f43881l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f43882m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f43883n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f43884o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f43885p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f43886q = 6;

    /* renamed from: r  reason: collision with root package name */
    public static final int f43887r = 7;

    /* renamed from: s  reason: collision with root package name */
    public static final int f43888s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final int f43889t = 9;

    /* renamed from: u  reason: collision with root package name */
    public static final int f43890u = 10;

    /* renamed from: v  reason: collision with root package name */
    public static final int f43891v = 11;

    /* renamed from: w  reason: collision with root package name */
    public static final int f43892w = 12;

    /* renamed from: x  reason: collision with root package name */
    public static final int f43893x = 13;

    /* renamed from: y  reason: collision with root package name */
    public static final int f43894y = 14;

    /* renamed from: z  reason: collision with root package name */
    public static final int f43895z = 15;

    /* renamed from: a  reason: collision with root package name */
    private List<MgpapaMainItemBean> f43896a;

    /* renamed from: b  reason: collision with root package name */
    private Context f43897b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f43898c;

    /* renamed from: d  reason: collision with root package name */
    private c2.f f43899d;

    /* renamed from: e  reason: collision with root package name */
    private com.join.android.app.component.video.g f43900e;

    /* renamed from: f  reason: collision with root package name */
    NavigationAdapter f43901f;

    /* renamed from: g  reason: collision with root package name */
    private int f43902g;

    /* renamed from: h  reason: collision with root package name */
    private int f43903h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f43904i;

    /* renamed from: j  reason: collision with root package name */
    private h f43905j = null;

    /* loaded from: classes4.dex */
    public static class HomeRankingViewpagerAdapter extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<Fragment> f43906a;

        /* renamed from: b  reason: collision with root package name */
        private FragmentManager f43907b;

        public HomeRankingViewpagerAdapter(FragmentManager fragmentManager, List<Fragment> list) {
            this.f43907b = fragmentManager;
            this.f43906a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i4, @NonNull Object obj) {
            viewGroup.removeView(this.f43906a.get(i4).getView());
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f43906a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i4) {
            Fragment fragment = this.f43906a.get(i4);
            if (!fragment.isAdded()) {
                FragmentTransaction beginTransaction = this.f43907b.beginTransaction();
                beginTransaction.add(fragment, fragment.getClass().getSimpleName());
                beginTransaction.commitAllowingStateLoss();
                this.f43907b.executePendingTransactions();
            }
            if (fragment.getView().getParent() == null) {
                viewGroup.addView(fragment.getView());
            }
            return fragment.getView();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    public class ViewHolderBigPicVideo extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f43908a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f43909b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43910c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f43911d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f43912e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f43913f;

        /* renamed from: g  reason: collision with root package name */
        public ProgressBar f43914g;

        /* renamed from: h  reason: collision with root package name */
        public ProgressBar f43915h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f43916i;

        /* renamed from: j  reason: collision with root package name */
        public FrameLayout f43917j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f43918k;

        /* renamed from: l  reason: collision with root package name */
        public SimpleDraweeView f43919l;

        /* renamed from: m  reason: collision with root package name */
        public FrameLayout f43920m;

        /* renamed from: n  reason: collision with root package name */
        public ProgressBar f43921n;

        /* renamed from: o  reason: collision with root package name */
        public MultiStandVideo f43922o;

        public ViewHolderBigPicVideo(@NonNull View view) {
            super(view);
            this.f43908a = (ConstraintLayout) view.findViewById(R.id.root);
            this.f43909b = (SimpleDraweeView) view.findViewById(R.id.ivGameIcon);
            this.f43910c = (TextView) view.findViewById(R.id.tvGameName);
            this.f43911d = (LinearLayout) view.findViewById(R.id.llInfo);
            this.f43912e = (TextView) view.findViewById(R.id.appSize);
            this.f43913f = (TextView) view.findViewById(R.id.loding_info);
            this.f43914g = (ProgressBar) view.findViewById(R.id.progressBarZip);
            this.f43915h = (ProgressBar) view.findViewById(R.id.progressBar);
            this.f43916i = (TextView) view.findViewById(R.id.tvGameTags);
            this.f43917j = (FrameLayout) view.findViewById(R.id.flBtn);
            this.f43918k = (TextView) view.findViewById(R.id.tvBtn);
            this.f43919l = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            this.f43920m = (FrameLayout) view.findViewById(R.id.videoContner);
            this.f43921n = (ProgressBar) view.findViewById(R.id.loading_progress);
            this.f43922o = (MultiStandVideo) view.findViewById(R.id.wf_video);
        }
    }

    /* loaded from: classes4.dex */
    public class ViewHolderBigPicVideoAd extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f43924a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f43925b;

        /* renamed from: c  reason: collision with root package name */
        public FrameLayout f43926c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f43927d;

        /* renamed from: e  reason: collision with root package name */
        public MultiStandVideo f43928e;

        public ViewHolderBigPicVideoAd(@NonNull View view) {
            super(view);
            this.f43924a = (ConstraintLayout) view.findViewById(R.id.root);
            this.f43925b = (TextView) view.findViewById(R.id.tvGameName);
            this.f43926c = (FrameLayout) view.findViewById(R.id.flBtn);
            this.f43927d = (TextView) view.findViewById(R.id.tvBtn);
            this.f43928e = (MultiStandVideo) view.findViewById(R.id.wf_video);
        }
    }

    /* loaded from: classes4.dex */
    public class ViewHolderGameListGrid extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f43930a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f43931b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43932c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f43933d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f43934e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f43935f;

        /* renamed from: g  reason: collision with root package name */
        public ProgressBar f43936g;

        /* renamed from: h  reason: collision with root package name */
        public ProgressBar f43937h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f43938i;

        /* renamed from: j  reason: collision with root package name */
        public FrameLayout f43939j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f43940k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f43941l;

        /* renamed from: m  reason: collision with root package name */
        public MultiStandVideo f43942m;

        public ViewHolderGameListGrid(@NonNull View view) {
            super(view);
            this.f43930a = (ConstraintLayout) view.findViewById(R.id.item);
            this.f43931b = (SimpleDraweeView) view.findViewById(R.id.ivGamePic);
            this.f43932c = (TextView) view.findViewById(R.id.tvGameName);
            this.f43933d = (LinearLayout) view.findViewById(R.id.llInfo);
            this.f43934e = (TextView) view.findViewById(R.id.appSize);
            this.f43935f = (TextView) view.findViewById(R.id.loding_info);
            this.f43936g = (ProgressBar) view.findViewById(R.id.progressBarZip);
            this.f43937h = (ProgressBar) view.findViewById(R.id.progressBar);
            this.f43938i = (TextView) view.findViewById(R.id.tvGameTags);
            this.f43939j = (FrameLayout) view.findViewById(R.id.flBtn);
            this.f43940k = (TextView) view.findViewById(R.id.tvBtn);
            this.f43941l = (ProgressBar) view.findViewById(R.id.loading_progress);
            this.f43942m = (MultiStandVideo) view.findViewById(R.id.wf_video);
        }
    }

    /* loaded from: classes4.dex */
    public class ViewHolderRecommendStyle2 extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView f43944a;

        public ViewHolderRecommendStyle2(@NonNull View view) {
            super(view);
            this.f43944a = (RecyclerView) view.findViewById(R.id.recyclerView);
        }
    }

    /* loaded from: classes4.dex */
    class a implements BaseQuickAdapter.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f43946a;

        a(List list) {
            this.f43946a = list;
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            PapaMainV2Adapter papaMainV2Adapter = PapaMainV2Adapter.this;
            papaMainV2Adapter.N("2-" + (i4 + 1));
            PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) this.f43946a.get(i4);
            IntentDateBean intentDataBean = homeBeanDTO.getIntentDataBean();
            String link_type_val = intentDataBean.getLink_type_val();
            if (intentDataBean.getLink_type() == 3 && intentDataBean.getJump_type() == 31) {
                com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(1));
            } else if (intentDataBean.getLink_type() == 3 && intentDataBean.getJump_type() == 2 && "1".equals(link_type_val)) {
                com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(2));
            } else if (intentDataBean.getLink_type() == 29) {
                intentDataBean.setExt1(homeBeanDTO.getSub_title());
                intentDataBean.getExtBean().setFrom("2");
                IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, intentDataBean);
            } else {
                intentDataBean.setExt1(homeBeanDTO.getSub_title());
                IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, intentDataBean);
            }
            PapaMainV2Adapter.this.S(null);
        }
    }

    /* loaded from: classes4.dex */
    class b extends w1.p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f43948b;

        b(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f43948b = homeBeanDTO;
        }

        @Override // w1.p, s2.h
        public void onClickBlank(String str, Object... objArr) {
            super.onClickBlank(str, objArr);
            IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, this.f43948b.getIntentDataBean());
            PapaMainV2Adapter.this.S(this.f43948b.getPosition());
            PapaMainV2Adapter.this.O(this.f43948b, false);
            PapaMainV2Adapter.this.Q(this.f43948b);
        }

        @Override // w1.p, w1.q
        public void onClickCover() {
            super.onClickCover();
            IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, this.f43948b.getIntentDataBean());
            PapaMainV2Adapter.this.S(this.f43948b.getPosition());
            PapaMainV2Adapter.this.O(this.f43948b, false);
            PapaMainV2Adapter.this.Q(this.f43948b);
        }
    }

    /* loaded from: classes4.dex */
    class c extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f43950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f43951b;

        c(List list, j jVar) {
            this.f43950a = list;
            this.f43951b = jVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            PapaMainV2Adapter.this.L(this.f43950a, this.f43951b.f43965b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
        }
    }

    /* loaded from: classes4.dex */
    class d implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43953b;

        d(List list) {
            this.f43953b = list;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (PapaMainV2Adapter.this.f43905j != null) {
                PapaMainV2Adapter.this.f43905j.b(i4, this.f43953b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f43955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewHolderRecommendStyle2 f43956b;

        e(List list, ViewHolderRecommendStyle2 viewHolderRecommendStyle2) {
            this.f43955a = list;
            this.f43956b = viewHolderRecommendStyle2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            PapaMainV2Adapter.this.M(this.f43955a, this.f43956b.f43944a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
        }
    }

    /* loaded from: classes4.dex */
    class f extends w1.p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f43958b;

        f(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f43958b = homeBeanDTO;
        }

        @Override // w1.p, s2.h
        public void onClickBlank(String str, Object... objArr) {
            super.onClickBlank(str, objArr);
            IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, this.f43958b.getIntentDataBean());
            PapaMainV2Adapter.this.S(this.f43958b.getPosition());
            PapaMainV2Adapter.this.O(this.f43958b, false);
            PapaMainV2Adapter.this.Q(this.f43958b);
        }

        @Override // w1.p, w1.q
        public void onClickCover() {
            super.onClickCover();
            IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, this.f43958b.getIntentDataBean());
            PapaMainV2Adapter.this.S(this.f43958b.getPosition());
            PapaMainV2Adapter.this.O(this.f43958b, false);
            PapaMainV2Adapter.this.Q(this.f43958b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends w1.p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f43960b;

        g(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f43960b = homeBeanDTO;
        }

        @Override // w1.p, s2.h
        public void onClickBlank(String str, Object... objArr) {
            super.onClickBlank(str, objArr);
            IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, this.f43960b.getIntentDataBean());
            PapaMainV2Adapter.this.Q(this.f43960b);
            PapaMainV2Adapter.this.S(this.f43960b.getPosition());
            PapaMainV2Adapter.this.O(this.f43960b, false);
        }

        @Override // w1.p, w1.q
        public void onClickCover() {
            super.onClickCover();
            IntentUtil.getInstance().intentActivity(PapaMainV2Adapter.this.f43897b, this.f43960b.getIntentDataBean());
            PapaMainV2Adapter.this.Q(this.f43960b);
            PapaMainV2Adapter.this.S(this.f43960b.getPosition());
            PapaMainV2Adapter.this.O(this.f43960b, false);
        }
    }

    /* loaded from: classes4.dex */
    public interface h {
        void a(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO);

        void b(int i4, List<List<PAPAHomeBeanV7.HomeBeanDTO>> list);

        void c(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO);
    }

    /* loaded from: classes4.dex */
    class i extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private RecyclerView f43962a;

        public i(@NonNull View view) {
            super(view);
            this.f43962a = (RecyclerView) view.findViewById(R.id.rvFastEntry);
        }
    }

    /* loaded from: classes4.dex */
    class j extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private FrameLayout f43964a;

        /* renamed from: b  reason: collision with root package name */
        private HorizontalRecyclerView f43965b;

        public j(@NonNull View view) {
            super(view);
            this.f43965b = (HorizontalRecyclerView) view.findViewById(R.id.recyclerView);
            this.f43964a = (FrameLayout) view.findViewById(R.id.flRoot);
        }
    }

    /* loaded from: classes4.dex */
    class k extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f43967a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f43968b;

        public k(@NonNull View view) {
            super(view);
            this.f43967a = (TextView) view.findViewById(R.id.tvTitle);
            this.f43968b = (TextView) view.findViewById(R.id.tvSubTitle);
        }
    }

    /* loaded from: classes4.dex */
    class l extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private ConstraintLayout f43970a;

        /* renamed from: b  reason: collision with root package name */
        private SlidingTabLayout6 f43971b;

        /* renamed from: c  reason: collision with root package name */
        private RecyclerviewViewpager f43972c;

        /* renamed from: d  reason: collision with root package name */
        private LinearLayout f43973d;

        public l(@NonNull View view) {
            super(view);
            this.f43970a = (ConstraintLayout) view.findViewById(R.id.root);
            this.f43971b = (SlidingTabLayout6) view.findViewById(R.id.tabLayout);
            this.f43972c = (RecyclerviewViewpager) view.findViewById(R.id.viewPager);
            this.f43973d = (LinearLayout) view.findViewById(R.id.moreLayout);
        }
    }

    /* loaded from: classes4.dex */
    class m extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f43975a;

        public m(@NonNull View view) {
            super(view);
            this.f43975a = (TextView) view.findViewById(R.id.spacingView);
        }
    }

    /* loaded from: classes4.dex */
    class n extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f43977a;

        public n(@NonNull View view) {
            super(view);
            this.f43977a = view.findViewById(R.id.line);
        }
    }

    /* loaded from: classes4.dex */
    class o extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private View f43979a;

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f43980b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f43981c;

        /* renamed from: d  reason: collision with root package name */
        private SimpleDraweeView f43982d;

        /* renamed from: e  reason: collision with root package name */
        private RelativeLayout f43983e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f43984f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f43985g;

        /* renamed from: h  reason: collision with root package name */
        private SimpleDraweeView f43986h;

        /* renamed from: i  reason: collision with root package name */
        private RelativeLayout f43987i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f43988j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f43989k;

        /* renamed from: l  reason: collision with root package name */
        private LinearLayout f43990l;

        public o(@NonNull View view) {
            super(view);
            this.f43979a = view.findViewById(R.id.gradientView);
            this.f43980b = (RelativeLayout) view.findViewById(R.id.rlDailyDiscovery);
            this.f43981c = (TextView) view.findViewById(R.id.fight_appname);
            this.f43982d = (SimpleDraweeView) view.findViewById(R.id.fightapp_image);
            this.f43983e = (RelativeLayout) view.findViewById(R.id.rlDzg);
            this.f43984f = (TextView) view.findViewById(R.id.tvDzg);
            this.f43985g = (TextView) view.findViewById(R.id.tvDzgSub);
            this.f43986h = (SimpleDraweeView) view.findViewById(R.id.ivDzg);
            this.f43987i = (RelativeLayout) view.findViewById(R.id.rlDailyNew);
            this.f43988j = (TextView) view.findViewById(R.id.tvDialyNew);
            this.f43989k = (TextView) view.findViewById(R.id.tvDailyNewCount);
            this.f43990l = (LinearLayout) view.findViewById(R.id.llDailyNewIcon);
        }
    }

    public PapaMainV2Adapter(Context context, Fragment fragment, List<MgpapaMainItemBean> list, com.join.android.app.component.video.g gVar, c2.f fVar) {
        this.f43897b = context;
        this.f43898c = fragment;
        this.f43900e = gVar;
        this.f43899d = fVar;
        this.f43896a = list == null ? new ArrayList<>() : list;
        this.f43902g = (int) context.getResources().getDimension(R.dimen.wdp10);
        this.f43903h = (int) context.getResources().getDimension(R.dimen.wdp20);
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
        S(homeBeanDTO.getPosition());
        O(homeBeanDTO, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
        S(null);
        N("3-2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, ViewHolderBigPicVideo viewHolderBigPicVideo, int i4, View view) {
        boolean z4 = true;
        if (homeBeanDTO.getJp_info() != null && homeBeanDTO.getJp_info().getLink_type().intValue() != 1) {
            IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
            S(homeBeanDTO.getPosition());
            O(homeBeanDTO, true);
            Q(homeBeanDTO);
            return;
        }
        homeBeanDTO.setRequesting((homeBeanDTO.getGameBean() == null && homeBeanDTO.getDownloadTask() == null) ? false : false);
        viewHolderBigPicVideo.f43921n.setVisibility(homeBeanDTO.isRequesting() ? 0 : 4);
        viewHolderBigPicVideo.f43918k.setVisibility(homeBeanDTO.isRequesting() ? 4 : 0);
        h hVar = this.f43905j;
        if (hVar != null) {
            hVar.a(i4, homeBeanDTO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
        S(homeBeanDTO.getPosition());
        O(homeBeanDTO, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(List list, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        PAPAHomeBeanV7.NgSelectionDTO ngSelectionDTO = (PAPAHomeBeanV7.NgSelectionDTO) list.get(i4);
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(ngSelectionDTO.getId());
        if (intentDateBean.getExtBean() == null) {
            intentDateBean.setExtBean(new ExtBean());
        }
        intentDateBean.getExtBean().setFrom(String.valueOf(ngSelectionDTO.get_from()));
        intentDateBean.getExtBean().set_from_type(ngSelectionDTO.get_from_type());
        IntentUtil.getInstance().intentActivity(this.f43897b, intentDateBean);
        S(ngSelectionDTO.getPosition());
        P(ngSelectionDTO.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(View view) {
        com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(1));
        S(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(List list, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        IntentUtil.getInstance().intentActivity(this.f43897b, ((PAPAHomeBeanV7.HomeBeanDTO) list.get(i4)).getIntentDataBean());
        S(((PAPAHomeBeanV7.HomeBeanDTO) list.get(i4)).getPosition());
        O((PAPAHomeBeanV7.HomeBeanDTO) list.get(i4), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(List list, int i4, BaseQuickAdapter baseQuickAdapter, View view, int i5) {
        PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) list.get(i5);
        boolean z4 = true;
        if (homeBeanDTO.getJp_info() != null && homeBeanDTO.getJp_info().getLink_type().intValue() != 1) {
            IntentUtil.getInstance().intentActivity(this.f43897b, ((PAPAHomeBeanV7.HomeBeanDTO) list.get(i5)).getIntentDataBean());
            S(((PAPAHomeBeanV7.HomeBeanDTO) list.get(i5)).getPosition());
            O((PAPAHomeBeanV7.HomeBeanDTO) list.get(i5), true);
            return;
        }
        homeBeanDTO.setRequesting((homeBeanDTO.getGameBean() == null && homeBeanDTO.getDownloadTask() == null) ? false : false);
        try {
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading_progress);
            TextView textView = (TextView) view.findViewById(R.id.tvBtn);
            progressBar.setVisibility(homeBeanDTO.isRequesting() ? 0 : 4);
            textView.setVisibility(homeBeanDTO.isRequesting() ? 4 : 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        h hVar = this.f43905j;
        if (hVar != null) {
            hVar.a(i4, homeBeanDTO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
        S(homeBeanDTO.getPosition());
        O(homeBeanDTO, true);
        Q(homeBeanDTO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
        Q(homeBeanDTO);
        S(homeBeanDTO.getPosition());
        O(homeBeanDTO, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, ViewHolderGameListGrid viewHolderGameListGrid, int i4, View view) {
        boolean z4 = true;
        if (homeBeanDTO.getJp_info() != null && homeBeanDTO.getJp_info().getLink_type().intValue() != 1) {
            IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
            Q(homeBeanDTO);
            S(homeBeanDTO.getPosition());
            O(homeBeanDTO, true);
            return;
        }
        homeBeanDTO.setRequesting((homeBeanDTO.getGameBean() == null && homeBeanDTO.getDownloadTask() == null) ? false : false);
        viewHolderGameListGrid.f43941l.setVisibility(homeBeanDTO.isRequesting() ? 0 : 4);
        viewHolderGameListGrid.f43940k.setVisibility(homeBeanDTO.isRequesting() ? 4 : 0);
        h hVar = this.f43905j;
        if (hVar != null) {
            hVar.a(i4, homeBeanDTO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(List<PAPAHomeBeanV7.NgSelectionDTO> list, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView == null || list == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null) {
            return;
        }
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        for (int i4 = 0; i4 <= Math.min(findLastCompletelyVisibleItemPosition, list.size() - 1); i4++) {
            if (!list.get(i4).isHasExposure()) {
                Ext ext = new Ext();
                ext.setPage("home");
                ext.setFrom("204");
                ext.setGameId(list.get(i4).getId());
                ext.setPosition(list.get(i4).getPosition());
                com.papa.sim.statistic.p.l(this.f43897b).k0(Event.expGameAdPage, ext, list.get(i4).getId());
                list.get(i4).setHasExposure(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(List<PAPAHomeBeanV7.HomeBeanDTO> list, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView == null || list == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null) {
            return;
        }
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        for (int i4 = 0; i4 <= Math.min(findLastCompletelyVisibleItemPosition, list.size() - 1); i4++) {
            if (!list.get(i4).isHasExposure()) {
                Ext ext = new Ext();
                ext.setPage("home");
                ext.setFrom("206");
                ext.setGameId(w(list.get(i4)));
                ext.setPosition(list.get(i4).getPosition());
                com.papa.sim.statistic.p.l(this.f43897b).k0(Event.expGameAdPage, ext, w(list.get(i4)));
                list.get(i4).setHasExposure(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str) {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f43897b);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f43897b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, boolean z4) {
        if (x(homeBeanDTO) && homeBeanDTO != null) {
            com.papa.sim.statistic.p.l(this.f43897b).r(ExtFrom.home.name(), homeBeanDTO.getPosition(), AccountUtil_.getInstance_(this.f43897b).getUid(), homeBeanDTO.getJp_info() != null ? homeBeanDTO.getJp_info().getLink_type_val() : "", z4 ? "1" : "2", homeBeanDTO.getIntentDataBean().getLink_type_val());
        } else {
            com.papa.sim.statistic.p.l(this.f43897b).t(ExtFrom.home.name(), homeBeanDTO.getPosition(), AccountUtil_.getInstance_(this.f43897b).getUid());
        }
    }

    private void P(String str) {
        com.papa.sim.statistic.p.l(this.f43897b).t(ExtFrom.home.name(), str, AccountUtil_.getInstance_(this.f43897b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        String str;
        if (homeBeanDTO == null || homeBeanDTO.getG_info() == null || homeBeanDTO.getPosition() == null || homeBeanDTO.getG_info().getPosition_path() == null) {
            return;
        }
        String[] split = homeBeanDTO.getPosition().split("-");
        String str2 = "";
        if (split.length <= 2) {
            str = "0";
        } else if (!"22".equals(split[0])) {
            return;
        } else {
            if ("4".equals(split[1])) {
                str2 = "大家都在玩";
            } else if ("13".equals(split[1])) {
                str2 = "最新网游";
            }
            str = split[2];
        }
        String str3 = str;
        String str4 = str2;
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        StatFactory.Companion.getInstance(this.f43897b).sendEvent(new StatFactory.VolcanoEvent(com.psk.eventmodule.Event.click, homeBeanDTO.getG_info().getId(), new StatFactory.SpmData("wufun", "home", str4, str3, false), homeBeanDTO.getG_info().getPosition_path(), UtilsMy.l2(homeBeanDTO.getG_info().getTag_id())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(String str) {
        Fragment fragment = this.f43898c;
        if (fragment instanceof PapaMainV3Fragment) {
            ((PapaMainV3Fragment) fragment).S1(str);
        }
    }

    private void U(final ViewHolderGameListGrid viewHolderGameListGrid, final PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, String str, final int i4) {
        if (viewHolderGameListGrid == null) {
            return;
        }
        if (TextUtils.equals(str, "0")) {
            viewHolderGameListGrid.f43930a.setPadding(this.f43903h, 0, this.f43902g, 0);
        } else {
            viewHolderGameListGrid.f43930a.setPadding(this.f43902g, 0, this.f43903h, 0);
        }
        MyImageLoader.i(viewHolderGameListGrid.f43931b, homeBeanDTO.getBig_pic(), r.c.f11300g);
        PAPAHomeBeanV7.GInfoDTO g_info = homeBeanDTO.getG_info();
        viewHolderGameListGrid.f43932c.setText(g_info == null ? homeBeanDTO.getTitle() : g_info.getName());
        viewHolderGameListGrid.f43940k.setVisibility(0);
        viewHolderGameListGrid.f43941l.setVisibility(4);
        if (g_info != null && !TextUtils.isEmpty(g_info.getTag_name())) {
            StringBuilder sb = new StringBuilder();
            String[] split = g_info.getTag_name().split(",");
            for (int i5 = 0; i5 < split.length; i5++) {
                sb.append(split[i5]);
                sb.append(" | ");
                if (i5 >= 1) {
                    break;
                }
            }
            viewHolderGameListGrid.f43938i.setText(sb.substring(0, sb.length() - 3));
        }
        viewHolderGameListGrid.f43930a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PapaMainV2Adapter.this.J(homeBeanDTO, view);
            }
        });
        viewHolderGameListGrid.f43939j.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PapaMainV2Adapter.this.K(homeBeanDTO, viewHolderGameListGrid, i4, view);
            }
        });
        if (viewHolderGameListGrid.f43942m != null && (!TextUtils.equals(homeBeanDTO.getV_url(), viewHolderGameListGrid.f43942m.getUrl()) || (homeBeanDTO.getJp_info() != null && homeBeanDTO.getJp_info().getLink_type().intValue() != 1))) {
            viewHolderGameListGrid.f43942m.g(homeBeanDTO.getBig_pic());
            viewHolderGameListGrid.f43942m.setName(homeBeanDTO.getTitle());
            viewHolderGameListGrid.f43942m.setPlayTag(this.f43900e.p());
            viewHolderGameListGrid.f43942m.setPlayPosition(homeBeanDTO.hashCode());
            viewHolderGameListGrid.f43942m.setUpLazy(homeBeanDTO.getV_url(), false, null, null, "");
            viewHolderGameListGrid.f43942m.setRotateViewAuto(false);
            viewHolderGameListGrid.f43942m.setLockLand(true);
            viewHolderGameListGrid.f43942m.setReleaseWhenLossAudio(false);
            viewHolderGameListGrid.f43942m.setShowFullAnimation(false);
            viewHolderGameListGrid.f43942m.setIsTouchWiget(false);
            viewHolderGameListGrid.f43942m.setNeedLockFull(false);
            viewHolderGameListGrid.f43942m.setBottomProgressBarDrawable(null);
            viewHolderGameListGrid.f43942m.setVideoAllCallBack(new g(homeBeanDTO));
        }
        update(homeBeanDTO, viewHolderGameListGrid.f43932c, viewHolderGameListGrid.f43938i, viewHolderGameListGrid.f43939j, viewHolderGameListGrid.f43940k, viewHolderGameListGrid.f43933d, viewHolderGameListGrid.f43934e, viewHolderGameListGrid.f43935f, viewHolderGameListGrid.f43936g, viewHolderGameListGrid.f43937h);
    }

    private void V(TextView textView, LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, boolean z4, boolean z5) {
        if (z4) {
            textView.setVisibility(0);
            linearLayout.setVisibility(8);
            progressBar.setVisibility(8);
            progressBar2.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(8);
        if (z5) {
            progressBar2.setVisibility(0);
            progressBar.setVisibility(8);
            return;
        }
        progressBar.setVisibility(0);
        progressBar2.setVisibility(8);
    }

    private void update(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, LinearLayout linearLayout, TextView textView4, TextView textView5, ProgressBar progressBar, ProgressBar progressBar2) {
        DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
        CollectionBeanSub gameBean = homeBeanDTO.getGameBean();
        long size = downloadTask != null ? downloadTask.getSize() : 0L;
        if (homeBeanDTO.getJp_info() != null && homeBeanDTO.getJp_info().getLink_type().intValue() != 1) {
            textView3.setText("打开");
            textView.setText(homeBeanDTO.getTitle());
            textView2.setText(homeBeanDTO.getSub_title());
            V(textView2, linearLayout, progressBar2, progressBar, true, false);
            return;
        }
        if (gameBean != null) {
            if ((ConstantIntEnum.H5.value() + "").equals(gameBean.getPlugin_num())) {
                textView3.setText("开始");
                textView.setVisibility(8);
                return;
            }
        }
        if (downloadTask == null) {
            V(textView2, linearLayout, progressBar2, progressBar, true, false);
            textView3.setText("获取");
            if (gameBean == null) {
                return;
            }
            if (UtilsMy.o0(gameBean.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f43897b).d(this.f43897b, gameBean.getPackageName()) && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f43897b).l(this.f43897b, gameBean.getPackageName());
                    if (com.join.mgps.Util.g2.i(gameBean.getVer()) && l4.d() < Integer.parseInt(gameBean.getVer())) {
                        textView3.setText("更新");
                        return;
                    } else {
                        textView3.setText("启动");
                        return;
                    }
                }
                UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
                UtilsMy.f3(textView3, frameLayout, gameBean);
                return;
            }
            UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
            UtilsMy.f3(textView3, frameLayout, gameBean);
            return;
        }
        int status = downloadTask.getStatus();
        if (gameBean != null && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 27) {
                textView3.setText("暂停");
                return;
            } else if (status == 48) {
                textView3.setText("安装中");
                V(textView2, linearLayout, progressBar2, progressBar, true, false);
                return;
            } else if (status != 2) {
                if (status != 3) {
                    if (status != 5) {
                        if (status != 6) {
                            if (status != 7) {
                                if (status != 42) {
                                    if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                textView3.setText("更新");
                                                V(textView2, linearLayout, progressBar2, progressBar, true, false);
                                                return;
                                            case 10:
                                                textView3.setText("等待");
                                                V(textView2, linearLayout, progressBar2, progressBar, false, false);
                                                textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                try {
                                                    progressBar2.setProgress((int) downloadTask.getProgress());
                                                } catch (Exception e5) {
                                                    e5.printStackTrace();
                                                }
                                                textView5.setText("等待中");
                                                return;
                                            case 11:
                                                textView3.setText("安装");
                                                V(textView2, linearLayout, progressBar2, progressBar, true, false);
                                                return;
                                            case 12:
                                                V(textView2, linearLayout, progressBar2, progressBar, false, true);
                                                textView4.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                textView5.setText("解压中..");
                                                progressBar.setProgress((int) downloadTask.getProgress());
                                                textView3.setText("解压中");
                                                return;
                                            case 13:
                                                V(textView2, linearLayout, progressBar2, progressBar, false, true);
                                                textView4.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                textView5.setText("点击重新解压");
                                                progressBar.setProgress((int) downloadTask.getProgress());
                                                textView3.setText("解压");
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView3.setText("启动");
                    V(textView2, linearLayout, progressBar2, progressBar, true, true);
                    return;
                }
                textView3.setText("继续");
                V(textView2, linearLayout, progressBar2, progressBar, false, false);
                try {
                    if (downloadTask.getSize() == 0) {
                        textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    } else {
                        textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    }
                    progressBar2.setProgress((int) downloadTask.getProgress());
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                textView5.setText("暂停中");
                return;
            } else {
                UtilsMy.x4(downloadTask);
                textView3.setText("暂停");
                V(textView2, linearLayout, progressBar2, progressBar, false, false);
                if (downloadTask.getSize() == 0) {
                    textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                } else {
                    textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                }
                progressBar2.setProgress((int) downloadTask.getProgress());
                String speed = downloadTask.getSpeed();
                textView5.setText(speed + "/S");
                return;
            }
        }
        textView3.setText("获取");
        if (gameBean != null) {
            UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
            UtilsMy.f3(textView3, frameLayout, gameBean);
        }
        V(textView2, linearLayout, progressBar2, progressBar, true, false);
    }

    private String w(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        if (homeBeanDTO == null || homeBeanDTO.getG_info() == null) {
            return null;
        }
        if (!TextUtils.isEmpty(homeBeanDTO.getG_info().getId()) && !TextUtils.equals(homeBeanDTO.getG_info().getId(), "0")) {
            return homeBeanDTO.getG_info().getId();
        }
        return homeBeanDTO.getG_info().getMod_id();
    }

    private boolean x(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        return (homeBeanDTO == null || homeBeanDTO.getJp_info() == null || homeBeanDTO.getJp_info().getLink_type().intValue() == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f43897b, homeBeanDTO.getIntentDataBean());
        S(null);
        N("3-1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        this.f43897b.startActivity(new Intent(this.f43897b, EverdayNewGameActivity.class));
        S(null);
        N("3-3");
    }

    public void R(List<MgpapaMainItemBean> list) {
        this.f43896a = list;
        notifyDataSetChanged();
    }

    public void T(h hVar) {
        this.f43905j = hVar;
    }

    public List<MgpapaMainItemBean> getData() {
        List<MgpapaMainItemBean> list = this.f43896a;
        return list == null ? new ArrayList() : list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f43896a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return this.f43896a.get(i4).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        List<MgpapaMainItemBean> list;
        if (i4 >= 0 && (list = this.f43896a) != null && list.size() > i4) {
            return this.f43896a.get(i4).getShowtype();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i4) {
        List<MgpapaMainItemBean> list;
        FastEntryAdapter fastEntryAdapter;
        if (i4 < 0 || (list = this.f43896a) == null || list.size() <= i4) {
            return;
        }
        int itemViewType = getItemViewType(i4);
        MgpapaMainItemBean mgpapaMainItemBean = this.f43896a.get(i4);
        int i5 = 0;
        switch (itemViewType) {
            case 26:
                o oVar = (o) viewHolder;
                PAPAHomeBeanV7.TopChannelDTO topChannelDTO = (PAPAHomeBeanV7.TopChannelDTO) mgpapaMainItemBean.getObject();
                if (topChannelDTO != null) {
                    if (topChannelDTO.getDiscover() != null) {
                        final PAPAHomeBeanV7.HomeBeanDTO discover = topChannelDTO.getDiscover();
                        MyImageLoader.h(oVar.f43982d, discover.getBig_pic());
                        oVar.f43981c.setText(discover.getTitle());
                        oVar.f43980b.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.b4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PapaMainV2Adapter.this.y(discover, view);
                            }
                        });
                    }
                    if (topChannelDTO.getTheNew() != null) {
                        PAPAHomeBeanV7.TheNewDTO theNew = topChannelDTO.getTheNew();
                        TextView textView = oVar.f43989k;
                        textView.setText(theNew.getCount() + "款");
                        oVar.f43987i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.v3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PapaMainV2Adapter.this.z(view);
                            }
                        });
                        List<PAPAHomeBeanV7.ListDTO> list2 = theNew.getList();
                        if (list2 != null && list2.size() > 0) {
                            oVar.f43990l.removeAllViews();
                            for (PAPAHomeBeanV7.ListDTO listDTO : list2) {
                                View inflate = LayoutInflater.from(this.f43897b).inflate(R.layout.mgpapa_home_item_new_icon, (ViewGroup) null);
                                MyImageLoader.h((SimpleDraweeView) inflate.findViewById(R.id.newIcon), listDTO.getIco());
                                oVar.f43990l.addView(inflate);
                            }
                        }
                    }
                    if (topChannelDTO.getBroadcast() != null) {
                        final PAPAHomeBeanV7.HomeBeanDTO broadcast = topChannelDTO.getBroadcast();
                        oVar.f43984f.setText(broadcast.getTitle());
                        oVar.f43985g.setText(broadcast.getSub_title());
                        MyImageLoader.h(oVar.f43986h, broadcast.getBig_pic());
                        oVar.f43983e.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.y3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PapaMainV2Adapter.this.B(broadcast, view);
                            }
                        });
                    }
                    String bg_color = topChannelDTO.getBg_color();
                    if (TextUtils.isEmpty(bg_color)) {
                        bg_color = "#F7F8F9";
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    gradientDrawable.setColors(new int[]{Color.parseColor(bg_color), Color.parseColor("#F7F8F9")});
                    gradientDrawable.setGradientType(0);
                    oVar.f43979a.setBackground(gradientDrawable);
                    return;
                }
                return;
            case 27:
                i iVar = (i) viewHolder;
                List list3 = (List) mgpapaMainItemBean.getObject();
                if (list3 != null) {
                    if (iVar.f43962a.getAdapter() == null || !(iVar.f43962a.getAdapter() instanceof FastEntryAdapter)) {
                        iVar.f43962a.setNestedScrollingEnabled(false);
                        iVar.f43962a.setHasFixedSize(true);
                        FastEntryAdapter fastEntryAdapter2 = new FastEntryAdapter(list3);
                        iVar.f43962a.setLayoutManager(new GridLayoutManager(this.f43897b, 5));
                        iVar.f43962a.setAdapter(fastEntryAdapter2);
                        fastEntryAdapter = fastEntryAdapter2;
                    } else {
                        fastEntryAdapter = (FastEntryAdapter) iVar.f43962a.getAdapter();
                        if (!list3.equals(fastEntryAdapter.getData())) {
                            fastEntryAdapter.setNewData(list3);
                        }
                    }
                    fastEntryAdapter.setOnItemClickListener(new a(list3));
                    return;
                }
                return;
            case 28:
            case 34:
            case 37:
            case 38:
                ViewHolderGameListGrid viewHolderGameListGrid = (ViewHolderGameListGrid) viewHolder;
                PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                String moreType2 = mgpapaMainItemBean.getMoreType2();
                if (homeBeanDTO != null) {
                    U(viewHolderGameListGrid, homeBeanDTO, moreType2, i4);
                    return;
                }
                return;
            case 29:
            case 36:
                final ViewHolderBigPicVideo viewHolderBigPicVideo = (ViewHolderBigPicVideo) viewHolder;
                final PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO2 = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                PAPAHomeBeanV7.GInfoDTO g_info = homeBeanDTO2.getG_info();
                if (g_info != null) {
                    MyImageLoader.h(viewHolderBigPicVideo.f43909b, g_info.getIco());
                    viewHolderBigPicVideo.f43910c.setText(g_info.getName());
                    if (!TextUtils.isEmpty(g_info.getTag_name())) {
                        StringBuilder sb = new StringBuilder();
                        String[] split = g_info.getTag_name().split(",");
                        for (int i6 = 0; i6 < split.length; i6++) {
                            sb.append(split[i6]);
                            sb.append(" | ");
                            if (i6 >= 1) {
                                viewHolderBigPicVideo.f43916i.setText(sb.substring(0, sb.length() - 3));
                            }
                        }
                        viewHolderBigPicVideo.f43916i.setText(sb.substring(0, sb.length() - 3));
                    }
                }
                if (viewHolderBigPicVideo.f43922o != null && (!TextUtils.equals(homeBeanDTO2.getV_url(), viewHolderBigPicVideo.f43922o.getUrl()) || (homeBeanDTO2.getJp_info() != null && homeBeanDTO2.getJp_info().getLink_type().intValue() != 1))) {
                    viewHolderBigPicVideo.f43922o.g(homeBeanDTO2.getBig_pic());
                    viewHolderBigPicVideo.f43922o.setName(homeBeanDTO2.getTitle());
                    viewHolderBigPicVideo.f43922o.setPlayTag(this.f43900e.p());
                    viewHolderBigPicVideo.f43922o.setPlayPosition(homeBeanDTO2.hashCode());
                    viewHolderBigPicVideo.f43922o.setUpLazy(homeBeanDTO2.getV_url(), false, null, null, "");
                    viewHolderBigPicVideo.f43922o.setRotateViewAuto(false);
                    viewHolderBigPicVideo.f43922o.setLockLand(true);
                    viewHolderBigPicVideo.f43922o.setReleaseWhenLossAudio(false);
                    viewHolderBigPicVideo.f43922o.setShowFullAnimation(false);
                    viewHolderBigPicVideo.f43922o.setIsTouchWiget(false);
                    viewHolderBigPicVideo.f43922o.setNeedLockFull(false);
                    viewHolderBigPicVideo.f43922o.setBottomProgressBarDrawable(null);
                    viewHolderBigPicVideo.f43922o.setVideoAllCallBack(new b(homeBeanDTO2));
                }
                viewHolderBigPicVideo.f43917j.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.c4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV2Adapter.this.C(homeBeanDTO2, viewHolderBigPicVideo, i4, view);
                    }
                });
                viewHolderBigPicVideo.f43908a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.a4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV2Adapter.this.D(homeBeanDTO2, view);
                    }
                });
                viewHolderBigPicVideo.f43918k.setVisibility(0);
                viewHolderBigPicVideo.f43921n.setVisibility(4);
                update(homeBeanDTO2, viewHolderBigPicVideo.f43910c, viewHolderBigPicVideo.f43916i, viewHolderBigPicVideo.f43917j, viewHolderBigPicVideo.f43918k, viewHolderBigPicVideo.f43911d, viewHolderBigPicVideo.f43912e, viewHolderBigPicVideo.f43913f, viewHolderBigPicVideo.f43914g, viewHolderBigPicVideo.f43915h);
                return;
            case 30:
                j jVar = (j) viewHolder;
                final List list4 = (List) mgpapaMainItemBean.getObject();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f43897b, 0, false);
                linearLayoutManager.setInitialPrefetchItemCount(5);
                HomeGameListGameNewsAdapter homeGameListGameNewsAdapter = new HomeGameListGameNewsAdapter(list4);
                homeGameListGameNewsAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.adapter.t3
                    @Override // com.join.mgps.base.BaseQuickAdapter.j
                    public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i7) {
                        PapaMainV2Adapter.this.E(list4, baseQuickAdapter, view, i7);
                    }
                });
                jVar.f43965b.setHasFixedSize(true);
                jVar.f43965b.setItemViewCacheSize(10);
                jVar.f43965b.setNestedScrollingEnabled(false);
                jVar.f43965b.setLayoutManager(linearLayoutManager);
                jVar.f43965b.setAdapter(homeGameListGameNewsAdapter);
                jVar.f43965b.addOnScrollListener(new c(list4, jVar));
                return;
            case 31:
                k kVar = (k) viewHolder;
                PAPAItemTitle2 pAPAItemTitle2 = (PAPAItemTitle2) mgpapaMainItemBean.getObject();
                if (pAPAItemTitle2 != null) {
                    kVar.f43967a.setText(pAPAItemTitle2.getTitle());
                    kVar.f43968b.setText(pAPAItemTitle2.getSubTitle());
                    kVar.f43968b.setVisibility(TextUtils.isEmpty(pAPAItemTitle2.getSubTitle()) ? 8 : 0);
                    return;
                }
                return;
            case 32:
                l lVar = (l) viewHolder;
                PAPAHomeBeanV7.RankingListDTO rankingListDTO = (PAPAHomeBeanV7.RankingListDTO) mgpapaMainItemBean.getObject();
                if (rankingListDTO == null || TextUtils.isEmpty(rankingListDTO.getTxt()) || rankingListDTO.getList() == null) {
                    lVar.f43970a.setVisibility(8);
                    return;
                }
                lVar.f43970a.setVisibility(0);
                List<List<PAPAHomeBeanV7.HomeBeanDTO>> list5 = rankingListDTO.getList();
                NavigationAdapter navigationAdapter = this.f43901f;
                if (navigationAdapter == null) {
                    String[] split2 = rankingListDTO.getTxt().split(",");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    while (i5 < Math.min(split2.length, list5.size())) {
                        if (!TextUtils.isEmpty(split2[i5]) && list5.get(i5) != null) {
                            arrayList.add(split2[i5]);
                            arrayList2.add(RankingItemV2Fragment.j0(true, split2[i5], list5.get(i5), i5 + 20501));
                        }
                        i5++;
                    }
                    NavigationAdapter navigationAdapter2 = new NavigationAdapter(this.f43898c.getChildFragmentManager(), arrayList2, arrayList);
                    this.f43901f = navigationAdapter2;
                    navigationAdapter2.d(arrayList2, arrayList);
                    lVar.f43972c.setAdapter(this.f43901f);
                    lVar.f43972c.setOffscreenPageLimit(3);
                    lVar.f43971b.setViewPager(lVar.f43972c);
                    lVar.f43973d.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.r3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PapaMainV2Adapter.this.F(view);
                        }
                    });
                    lVar.f43972c.addOnPageChangeListener(new d(list5));
                    return;
                }
                ArrayList<Fragment> c5 = navigationAdapter.c();
                while (i5 < Math.min(c5.size(), list5.size())) {
                    ((RankingItemV2Fragment) c5.get(i5)).r0(list5.get(i5));
                    i5++;
                }
                return;
            case 33:
                m mVar = (m) viewHolder;
                float floatValue = ((Float) mgpapaMainItemBean.getObject()).floatValue();
                ViewGroup.LayoutParams layoutParams = mVar.f43975a.getLayoutParams();
                layoutParams.height = (int) floatValue;
                mVar.f43975a.setLayoutParams(layoutParams);
                if (TextUtils.isEmpty(mgpapaMainItemBean.getMoreType2()) || floatValue > 1.0f) {
                    mVar.f43975a.setBackgroundColor(0);
                    return;
                }
                try {
                    mVar.f43975a.setBackgroundColor(Color.parseColor(mgpapaMainItemBean.getMoreType2()));
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            case 35:
                ViewHolderRecommendStyle2 viewHolderRecommendStyle2 = (ViewHolderRecommendStyle2) viewHolder;
                final List list6 = (List) mgpapaMainItemBean.getObject();
                if (list6 == null || list6.size() <= 0) {
                    return;
                }
                if (viewHolderRecommendStyle2.f43944a.getAdapter() != null && (viewHolderRecommendStyle2.f43944a.getAdapter() instanceof HomeRecommendAdapter) && ((HomeRecommendAdapter) viewHolderRecommendStyle2.f43944a.getAdapter()).getData().equals(list6)) {
                    ((HomeRecommendAdapter) viewHolderRecommendStyle2.f43944a.getAdapter()).setNewData(list6);
                    return;
                }
                LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.f43897b, 0, false);
                HomeRecommendAdapter homeRecommendAdapter = new HomeRecommendAdapter(list6);
                ((SimpleItemAnimator) viewHolderRecommendStyle2.f43944a.getItemAnimator()).setSupportsChangeAnimations(false);
                viewHolderRecommendStyle2.f43944a.setHasFixedSize(true);
                viewHolderRecommendStyle2.f43944a.setLayoutManager(linearLayoutManager2);
                viewHolderRecommendStyle2.f43944a.setAdapter(homeRecommendAdapter);
                homeRecommendAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.adapter.u3
                    @Override // com.join.mgps.base.BaseQuickAdapter.j
                    public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i7) {
                        PapaMainV2Adapter.this.G(list6, baseQuickAdapter, view, i7);
                    }
                });
                homeRecommendAdapter.setOnItemChildClickListener(new BaseQuickAdapter.h() { // from class: com.join.mgps.adapter.s3
                    @Override // com.join.mgps.base.BaseQuickAdapter.h
                    public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i7) {
                        PapaMainV2Adapter.this.H(list6, i4, baseQuickAdapter, view, i7);
                    }
                });
                viewHolderRecommendStyle2.f43944a.addOnScrollListener(new e(list6, viewHolderRecommendStyle2));
                return;
            case 39:
            default:
                return;
            case 40:
                ViewHolderBigPicVideoAd viewHolderBigPicVideoAd = (ViewHolderBigPicVideoAd) viewHolder;
                final PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO3 = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                PAPAHomeBeanV7.GInfoDTO g_info2 = homeBeanDTO3.getG_info();
                if (g_info2 != null) {
                    viewHolderBigPicVideoAd.f43925b.setText(g_info2.getName());
                } else {
                    viewHolderBigPicVideoAd.f43925b.setText(homeBeanDTO3.getTitle());
                }
                if (viewHolderBigPicVideoAd.f43928e != null && (!TextUtils.equals(homeBeanDTO3.getV_url(), viewHolderBigPicVideoAd.f43928e.getUrl()) || (homeBeanDTO3.getJp_info() != null && homeBeanDTO3.getJp_info().getLink_type().intValue() != 1))) {
                    viewHolderBigPicVideoAd.f43928e.g(homeBeanDTO3.getBig_pic());
                    viewHolderBigPicVideoAd.f43928e.setName(homeBeanDTO3.getTitle());
                    viewHolderBigPicVideoAd.f43928e.setPlayTag(this.f43900e.p());
                    viewHolderBigPicVideoAd.f43928e.setPlayPosition(homeBeanDTO3.hashCode());
                    viewHolderBigPicVideoAd.f43928e.setUpLazy(homeBeanDTO3.getV_url(), false, null, null, "");
                    viewHolderBigPicVideoAd.f43928e.setRotateViewAuto(false);
                    viewHolderBigPicVideoAd.f43928e.setLockLand(true);
                    viewHolderBigPicVideoAd.f43928e.setReleaseWhenLossAudio(false);
                    viewHolderBigPicVideoAd.f43928e.setShowFullAnimation(false);
                    viewHolderBigPicVideoAd.f43928e.setIsTouchWiget(false);
                    viewHolderBigPicVideoAd.f43928e.setNeedLockFull(false);
                    viewHolderBigPicVideoAd.f43928e.setBottomProgressBarDrawable(null);
                    viewHolderBigPicVideoAd.f43928e.setVideoAllCallBack(new f(homeBeanDTO3));
                }
                viewHolderBigPicVideoAd.f43926c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.w3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV2Adapter.this.I(homeBeanDTO3, view);
                    }
                });
                viewHolderBigPicVideoAd.f43924a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.z3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV2Adapter.this.A(homeBeanDTO3, view);
                    }
                });
                viewHolderBigPicVideoAd.f43927d.setVisibility(0);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        switch (i4) {
            case 26:
                return new o(LayoutInflater.from(this.f43897b).inflate(R.layout.mgpapa_localfight_include_v2, viewGroup, false));
            case 27:
                return new i(LayoutInflater.from(this.f43897b).inflate(R.layout.mgpapa_fast_entry_item, viewGroup, false));
            case 28:
            case 34:
            case 37:
            case 38:
                return new ViewHolderGameListGrid(LayoutInflater.from(this.f43897b).inflate(R.layout.papamain_gamelist_grid_layout, viewGroup, false));
            case 29:
            case 36:
                return new ViewHolderBigPicVideo(LayoutInflater.from(this.f43897b).inflate(R.layout.papamain_video_game, viewGroup, false));
            case 30:
                return new j(LayoutInflater.from(this.f43897b).inflate(R.layout.papamain_item_game_news, viewGroup, false));
            case 31:
                return new k(LayoutInflater.from(this.f43897b).inflate(R.layout.papamain_item_title_layout_v2, viewGroup, false));
            case 32:
                return new l(LayoutInflater.from(this.f43897b).inflate(R.layout.home_rank_layout_v2, viewGroup, false));
            case 33:
                return new m(LayoutInflater.from(this.f43897b).inflate(R.layout.papamain_item_spacing_layout, viewGroup, false));
            case 35:
                return new ViewHolderRecommendStyle2(LayoutInflater.from(this.f43897b).inflate(R.layout.papamain_item_recommend_style2, viewGroup, false));
            case 39:
                return new n(LayoutInflater.from(this.f43897b).inflate(R.layout.mgpapa_home_underline, viewGroup, false));
            case 40:
                return new ViewHolderBigPicVideoAd(LayoutInflater.from(this.f43897b).inflate(R.layout.papamain_video_game_ad, viewGroup, false));
            default:
                return null;
        }
    }

    public MgpapaMainItemBean v(int i4) {
        List<MgpapaMainItemBean> list = this.f43896a;
        if (list == null || list.size() <= i4 || i4 < 0) {
            return null;
        }
        return this.f43896a.get(i4);
    }
}
