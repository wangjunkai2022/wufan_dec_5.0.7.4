package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.flyco.tablayout.SlidingTabLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.ForumIndexActivity_;
import com.join.mgps.activity.NewArenaMainActivty_;
import com.join.mgps.activity.SearchHintActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.customview.ViewPagerSlide;
import com.join.mgps.dto.DIscoverTypeBean;
import com.join.mgps.dto.DiscoverListData;
import com.join.mgps.dto.DiscoverListItemBean;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameWorldResponse;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.discovery_fragment_layout)
/* loaded from: classes3.dex */
public class DiscoveryFragmentV2 extends Fragment implements View.OnClickListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    CoordinatorLayout f50752b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f50753c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f50754d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ViewPagerSlide f50755e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Toolbar f50756f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    SlidingTabLayout f50757g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    AppBarLayout f50758h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f50759i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    GridView f50760j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    HListView f50761k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f50762l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    NestedScrollView f50763m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f50764n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f50765o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f50766p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f50767q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f50768r;
    @Bean

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.Util.b f50769s;

    /* renamed from: u  reason: collision with root package name */
    private com.join.mgps.rpc.l f50771u;

    /* renamed from: x  reason: collision with root package name */
    private List<DownloadTask> f50774x;

    /* renamed from: y  reason: collision with root package name */
    Context f50775y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.rpc.i f50776z;

    /* renamed from: t  reason: collision with root package name */
    private com.join.mgps.adapter.l f50770t = null;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.adapter.k f50772v = null;

    /* renamed from: w  reason: collision with root package name */
    private String f50773w = "";
    private int A = 3;
    List<DIscoverTypeBean> B = new ArrayList();
    private List<DiscoveryMainDataBean.BattleGameBean> C = null;

    /* loaded from: classes3.dex */
    class a implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f50777a;

        a(int i4) {
            this.f50777a = i4;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
            int i5 = -i4;
            if (this.f50777a > i5) {
                DiscoveryFragmentV2.this.f50757g.setVisibility(8);
                DiscoveryFragmentV2.this.f50768r.setVisibility(8);
            } else {
                DiscoveryFragmentV2.this.f50757g.setVisibility(0);
                DiscoveryFragmentV2.this.f50768r.setVisibility(0);
                float abs = Math.abs((i4 + this.f50777a) * 1.0f) / (appBarLayout.getTotalScrollRange() - this.f50777a);
                DiscoveryFragmentV2.this.f50757g.setAlpha(abs);
                DiscoveryFragmentV2.this.f50768r.setAlpha(abs * 0.8f);
            }
            if (i5 == appBarLayout.getTotalScrollRange()) {
                DiscoveryFragmentV2.this.f50757g.setAlpha(1.0f);
                DiscoveryFragmentV2.this.f50755e.setSlide(true);
                return;
            }
            DiscoveryFragmentV2.this.f50755e.setSlide(false);
        }
    }

    /* loaded from: classes3.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            com.papa.sim.statistic.p.l(DiscoveryFragmentV2.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragmentV2.this.getActivity()).getUid(), "gameEnter");
            DiscoveryMainDataBean.BattleGameBean item = DiscoveryFragmentV2.this.f50770t.getItem(i4);
            if (item == null) {
                return;
            }
            GameInfoBean gameInfoBean = new GameInfoBean();
            gameInfoBean.setGame_name(item.getGame_name());
            gameInfoBean.setGame_ico(item.getGame_ico());
            gameInfoBean.setGame_id(item.getGame_id());
            GameRoomListActivity_.W3(DiscoveryFragmentV2.this.getActivity()).c(gameInfoBean).start();
        }
    }

    /* loaded from: classes3.dex */
    class c implements AdapterView.d {
        c() {
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(it.sephiroth.android.library.widget.AdapterView<?> adapterView, View view, int i4, long j4) {
            if (adapterView.getAdapter() == null || !(adapterView.getAdapter() instanceof com.join.mgps.adapter.k)) {
                return;
            }
            com.papa.sim.statistic.p.l(DiscoveryFragmentV2.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragmentV2.this.getActivity()).getUid(), "groupEnter");
            IntentUtil.getInstance().goForumGroupActivity(adapterView.getContext(), ((com.join.mgps.adapter.k) adapterView.getAdapter()).getItem(i4).getFid(), "discovery");
        }
    }

    private void X() {
        this.f50773w = "";
        List<DownloadTask> R = p1.f.K().R(null);
        this.f50774x = R;
        if (R == null || R.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f50774x) {
            if (downloadTask.isIs_fight() == 1) {
                if ("".equals(this.f50773w)) {
                    this.f50773w += downloadTask.getCrc_link_type_val();
                } else {
                    this.f50773w += "," + downloadTask.getCrc_link_type_val();
                }
            }
        }
    }

    public void W() {
        X();
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.update.position"})
    public void Z(Intent intent) {
        try {
            this.f50755e.setCurrentItem(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public int a0() {
        AppBarLayout appBarLayout = this.f50758h;
        if (appBarLayout != null && appBarLayout.getVisibility() == 0) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) this.f50758h.getLayoutParams()).getBehavior();
            if (behavior instanceof AppBarLayout.Behavior) {
                int topAndBottomOffset = ((AppBarLayout.Behavior) behavior).getTopAndBottomOffset();
                return (topAndBottomOffset != 0 && topAndBottomOffset == (-this.f50758h.getTotalScrollRange())) ? 2 : 1;
            }
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f50775y = getContext();
        this.f50776z = com.join.mgps.rpc.impl.g.A0();
        this.f50763m.setVisibility(8);
        this.f50771u = com.join.mgps.rpc.impl.k.n0();
        this.f50757g.setVisibility(8);
        this.f50758h.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a(getResources().getDimensionPixelOffset(R.dimen.wdp100)));
        this.f50762l.setOnClickListener(this);
        this.f50764n.setOnClickListener(this);
        this.f50765o.setOnClickListener(this);
        this.f50766p.setOnClickListener(this);
        this.f50759i.setOnClickListener(this);
        this.f50760j.setOnItemClickListener(new b());
        this.f50761k.setOnItemClickListener(new c());
        W();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        try {
            ForumResponse<DiscoverListData<DiscoverListItemBean>> C = this.f50776z.C(AccountUtil_.getInstance_(this.f50775y).getAccountData().getUid(), 1, 1);
            if (C != null) {
                List<DIscoverTypeBean> type_list = C.getData().getType_list();
                if (type_list != null && type_list.size() > 0) {
                    h0(type_list);
                } else {
                    d0();
                }
            } else {
                d0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void c0() {
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void d0() {
        int i4 = this.A;
        if (i4 > 0) {
            this.A = i4 - 1;
            b0();
            return;
        }
        f0();
    }

    public void e0() {
        AppBarLayout appBarLayout = this.f50758h;
        if (appBarLayout != null) {
            appBarLayout.setVisibility(8);
            this.f50763m.setVisibility(8);
            this.f50757g.setVisibility(0);
            this.f50757g.setAlpha(1.0f);
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) this.f50758h.getLayoutParams()).getBehavior();
            if (behavior instanceof AppBarLayout.Behavior) {
                AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
                if (behavior2.getTopAndBottomOffset() != this.f50758h.getTotalScrollRange()) {
                    behavior2.setTopAndBottomOffset(-this.f50758h.getTotalScrollRange());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
        List<DiscoveryMainDataBean.BattleGameBean> list = this.C;
        if (list == null || list.size() == 0) {
            try {
                this.f50754d.setVisibility(0);
                this.f50753c.setVisibility(8);
                this.f50752b.setVisibility(8);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(DiscoveryMainDataBean discoveryMainDataBean) {
        try {
            LinearLayout linearLayout = this.f50754d;
            if (linearLayout == null || discoveryMainDataBean == null) {
                return;
            }
            linearLayout.setVisibility(8);
            this.f50753c.setVisibility(8);
            this.f50752b.setVisibility(0);
            this.C = discoveryMainDataBean.getBattle_game();
            TextView textView = this.f50766p;
            textView.setText(discoveryMainDataBean.getBattle_game_count() + "款");
            List<DiscoveryMainDataBean.BattleGameBean> list = this.C;
            if (list != null && list.size() > 0) {
                if (this.C.size() <= 3) {
                    this.f50760j.setColumnWidth(this.C.size());
                } else {
                    this.f50760j.setColumnWidth(3);
                }
                com.join.mgps.adapter.l lVar = this.f50770t;
                if (lVar == null) {
                    com.join.mgps.adapter.l lVar2 = new com.join.mgps.adapter.l(getActivity(), this.C, this.f50773w);
                    this.f50770t = lVar2;
                    this.f50760j.setAdapter((ListAdapter) lVar2);
                } else {
                    lVar.c(this.C);
                }
                this.f50770t.b(this.f50773w);
            }
            List<DiscoveryMainDataBean.ForumListBean> forum_list = discoveryMainDataBean.getForum_list();
            if (forum_list == null || forum_list.size() <= 0) {
                return;
            }
            com.join.mgps.adapter.k kVar = this.f50772v;
            if (kVar == null) {
                this.f50772v = new com.join.mgps.adapter.k(getActivity(), forum_list);
            } else {
                kVar.b(forum_list);
            }
            this.f50761k.setAdapter((ListAdapter) this.f50772v);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(List<DIscoverTypeBean> list) {
        try {
            this.B.clear();
            this.B.addAll(list);
            if (list != null && list.size() != 0) {
                FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getFragmentManager());
                ArrayList arrayList = new ArrayList();
                for (DIscoverTypeBean dIscoverTypeBean : list) {
                    DIscoveryTabFragment_ dIscoveryTabFragment_ = new DIscoveryTabFragment_();
                    Bundle bundle = new Bundle();
                    bundle.putInt(com.alipay.sdk.cons.b.f4830c, dIscoverTypeBean.getTid());
                    dIscoveryTabFragment_.setArguments(bundle);
                    arrayList.add(new FragmentPagerAdapter.a(dIscoverTypeBean.getName(), dIscoveryTabFragment_));
                }
                fragmentPagerAdapter.e(arrayList);
                this.f50755e.setAdapter(fragmentPagerAdapter);
                ViewPagerSlide viewPagerSlide = this.f50755e;
                int i4 = 4;
                if (list.size() <= 4) {
                    i4 = list.size();
                }
                viewPagerSlide.setOffscreenPageLimit(i4);
                this.f50757g.setViewPager(this.f50755e);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.put("uid", this.f50769s.getUid());
                linkedMultiValueMap.put("token", this.f50769s.getToken());
                linkedMultiValueMap.put("game_ids", this.f50773w);
                GameWorldResponse<DiscoveryMainDataBean> j02 = this.f50771u.j0(linkedMultiValueMap);
                if (j02 != null && j02.getError() == 0) {
                    g0(j02.getData());
                } else {
                    f0();
                }
                return;
            } catch (Exception unused) {
                f0();
                return;
            }
        }
        f0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.discoveryTitleSearchIv /* 2131297343 */:
                SearchHintActivity_.G1(getActivity()).start();
                return;
            case R.id.discoveryTopRl /* 2131297346 */:
            case R.id.number /* 2131300161 */:
            case R.id.toFightRl /* 2131301524 */:
                NewArenaMainActivty_.g1(getActivity()).start();
                com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "enterLobby");
                return;
            case R.id.toCommunityLl /* 2131301522 */:
            case R.id.toCommunityTx /* 2131301523 */:
                com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "communityEnter");
                ForumIndexActivity_.i0(getContext()).start();
                return;
            default:
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        W();
        List<DIscoverTypeBean> list = this.B;
        if (list == null || list.size() == 0) {
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        W();
        b0();
    }

    public void scrollToTop() {
        AppBarLayout appBarLayout = this.f50758h;
        if (appBarLayout != null) {
            appBarLayout.setVisibility(0);
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) this.f50758h.getLayoutParams()).getBehavior();
            if (behavior instanceof AppBarLayout.Behavior) {
                AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
                if (behavior2.getTopAndBottomOffset() != 0) {
                    behavior2.setTopAndBottomOffset(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f50775y);
    }
}
