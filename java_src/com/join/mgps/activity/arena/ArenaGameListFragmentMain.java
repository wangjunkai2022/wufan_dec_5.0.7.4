package com.join.mgps.activity.arena;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.common.utils.j;
import com.join.android.app.common.utils.n;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.adapter.GameInfoAdapterV2;
import com.join.mgps.customview.TabPageIndicator;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameListBean;
import com.join.mgps.dto.GameTypeBean;
import com.join.mgps.dto.NewArenaGameListBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.fragment.ArenaGameListFragment_;
import com.join.mgps.rpc.l;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.activity_arena_gamelist_fragment)
/* loaded from: classes4.dex */
public class ArenaGameListFragmentMain extends Fragment {

    /* renamed from: s  reason: collision with root package name */
    private static final int f38540s = 10;

    /* renamed from: t  reason: collision with root package name */
    public static final int f38541t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f38542u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f38543v = 3;

    /* renamed from: w  reason: collision with root package name */
    public static final int f38544w = 4;

    /* renamed from: x  reason: collision with root package name */
    public static final int f38545x = 35;

    /* renamed from: y  reason: collision with root package name */
    public static final int f38546y = 31;

    /* renamed from: b  reason: collision with root package name */
    l f38547b;

    /* renamed from: c  reason: collision with root package name */
    int f38548c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f38549d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XRecyclerView f38550e;

    /* renamed from: f  reason: collision with root package name */
    ViewPager f38551f;

    /* renamed from: g  reason: collision with root package name */
    TabPageIndicator f38552g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f38553h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f38554i;

    /* renamed from: k  reason: collision with root package name */
    Activity f38556k;
    @Bean

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.Util.b f38558m;

    /* renamed from: n  reason: collision with root package name */
    private GameInfoAdapterV2 f38559n;

    /* renamed from: q  reason: collision with root package name */
    private ArenaGameListFragment_[] f38562q;

    /* renamed from: j  reason: collision with root package name */
    private boolean f38555j = false;

    /* renamed from: l  reason: collision with root package name */
    private int f38557l = 1;

    /* renamed from: o  reason: collision with root package name */
    private List<GameInfoBean> f38560o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<GameTypeBean> f38561p = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<GameInfoBean> f38563r = new ArrayList<>();

    /* loaded from: classes4.dex */
    class a extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f38564a;

        a(GridLayoutManager gridLayoutManager) {
            this.f38564a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i4) {
            if (ArenaGameListFragmentMain.this.f38560o.size() == i4) {
                return this.f38564a.getSpanCount();
            }
            return 1;
        }
    }

    /* loaded from: classes4.dex */
    class b implements GameInfoAdapterV2.e {
        b() {
        }

        @Override // com.join.mgps.adapter.GameInfoAdapterV2.e
        public void a(int i4) {
            GameRoomListActivity_.W3(ArenaGameListFragmentMain.this.f38556k).c((GameInfoBean) ArenaGameListFragmentMain.this.f38560o.get(i4)).a(true).b(true).start();
        }
    }

    /* loaded from: classes4.dex */
    class c implements XRecyclerView.f {
        c() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            if (ArenaGameListFragmentMain.this.f38555j) {
                if (!j.j(ArenaGameListFragmentMain.this.f38556k)) {
                    ArenaGameListFragmentMain.this.f38550e.stopLoadMore();
                    l2.a(ArenaGameListFragmentMain.this.f38556k).b(ArenaGameListFragmentMain.this.getString(R.string.net_connect_failed));
                    return;
                }
                ArenaGameListFragmentMain.this.g0();
            }
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class d extends FragmentPagerAdapter {
        public d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return ArenaGameListFragmentMain.this.f38561p.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return ArenaGameListFragmentMain.this.d0(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return ((GameTypeBean) ArenaGameListFragmentMain.this.f38561p.get(i4)).getTitle();
        }
    }

    private void b0() {
        if (j.j(this.f38556k)) {
            e0();
        } else {
            h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment d0(int i4) {
        ArenaGameListFragment_ arenaGameListFragment_ = this.f38562q[i4];
        if (arenaGameListFragment_ != null) {
            return arenaGameListFragment_;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("game_type", this.f38561p.get(i4).getId());
        int i5 = this.f38548c;
        if (i5 == 2) {
            bundle.putInt("room_type", 35);
        } else if (i5 == 3) {
            bundle.putInt("room_type", 31);
        }
        if (i4 == 0) {
            bundle.putInt("pn", 2);
            bundle.putSerializable("datas", this.f38563r);
        } else {
            bundle.putInt("pn", 1);
        }
        ArenaGameListFragment_ arenaGameListFragment_2 = new ArenaGameListFragment_();
        arenaGameListFragment_2.setArguments(bundle);
        this.f38562q[i4] = arenaGameListFragment_2;
        return arenaGameListFragment_2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void a0() {
        this.f38556k.finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        Bundle arguments = getArguments();
        this.f38556k = getActivity();
        this.f38548c = arguments.getInt(ArenaGameListActivity_.B);
        this.f38547b = com.join.mgps.rpc.impl.l.n0();
        GameInfoAdapterV2 gameInfoAdapterV2 = new GameInfoAdapterV2(this.f38556k, false);
        this.f38559n = gameInfoAdapterV2;
        this.f38550e.setAdapter(gameInfoAdapterV2);
        this.f38550e.setPreLoadCount(6);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), ((double) n.n(getActivity()).j(this.f38556k)) >= 1.9d ? 3 : 2);
        this.f38550e.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        if (this.f38548c == 1) {
            this.f38550e.setVisibility(0);
            this.f38559n.f(new b());
            this.f38550e.setLoadingMoreEnabled(true);
            this.f38550e.setPullRefreshEnabled(false);
            this.f38550e.setLoadingListener(new c());
            this.f38554i.setVisibility(8);
            i0();
            b0();
            return;
        }
        this.f38550e.setVisibility(8);
        this.f38554i.setVisibility(0);
        this.f38551f = (ViewPager) this.f38556k.findViewById(R.id.viewPager);
        this.f38552g = (TabPageIndicator) this.f38556k.findViewById(R.id.pageIndicator);
        i0();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0(ResultResMainBean<NewArenaGameListBean> resultResMainBean) {
        this.f38561p.addAll(resultResMainBean.getData().getGame_type());
        this.f38563r.addAll(resultResMainBean.getData().getGame_list());
        this.f38562q = new ArenaGameListFragment_[this.f38561p.size()];
        this.f38551f.setAdapter(new d(getChildFragmentManager()));
        this.f38551f.setOffscreenPageLimit(this.f38561p.size());
        this.f38551f.setCurrentItem(0);
        this.f38552g.setNormalTextColor(getResources().getColor(R.color.color_2D6273));
        this.f38552g.setSelectedTextColor(getResources().getColor(R.color.white));
        this.f38552g.setSelectedBottomDrawableBounds(R.drawable.line_white);
        this.f38552g.setNormalBottomDrawableBound(R.drawable.trans);
        this.f38552g.setViewPager(this.f38551f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0() {
        if (this.f38548c == 1) {
            g0();
        } else {
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f0() {
        ResultResMainBean<NewArenaGameListBean> resultResMainBean = null;
        try {
            int i4 = this.f38548c;
            if (i4 == 2) {
                resultResMainBean = this.f38547b.w(35, 1, 1);
            } else if (i4 == 3) {
                resultResMainBean = this.f38547b.w(31, 1, 1);
            }
            if (this.f38556k.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 17 || !this.f38556k.isDestroyed()) {
                if (resultResMainBean != null && resultResMainBean.getData() != null && resultResMainBean.getData().getGame_type() != null) {
                    c0(resultResMainBean);
                    hideLoading();
                    return;
                }
                h0();
            }
        } catch (Exception unused) {
            h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0() {
        try {
            ResultResMainBean<GameListBean> m4 = this.f38547b.m(this.f38558m.getAccountData().getUid(), this.f38558m.getAccountData().getToken(), this.f38557l);
            if (this.f38556k.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 17 || !this.f38556k.isDestroyed()) {
                if (m4 != null && m4.getData() != null) {
                    List<GameInfoBean> game_list = m4.getData().getGame_list();
                    if (game_list != null && game_list.size() > 0) {
                        this.f38555j = game_list.size() >= 10;
                    } else {
                        this.f38555j = false;
                    }
                    j0(game_list);
                    if (this.f38557l <= 1) {
                        hideLoading();
                    }
                    if (this.f38555j) {
                        this.f38557l++;
                        return;
                    }
                    return;
                }
                if (this.f38557l <= 1) {
                    h0();
                }
            }
        } catch (Exception e5) {
            v0.b("ArenaGameListActivity", "requestRecentGameList Exception :" + e5.getMessage());
            if (this.f38557l <= 1) {
                h0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        this.f38550e.setVisibility(8);
        this.f38549d.setVisibility(8);
        this.f38553h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = me.relex.photodraweeview.d.f71604s1)
    public void hideLoading() {
        this.f38549d.setVisibility(8);
        this.f38553h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        this.f38549d.setVisibility(8);
        this.f38553h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(List<GameInfoBean> list) {
        if (this.f38550e.getVisibility() == 8) {
            this.f38550e.setVisibility(0);
        }
        if (list != null && list.size() > 0) {
            this.f38560o.addAll(list);
        }
        this.f38559n.e(this.f38560o);
        this.f38550e.stopLoadMore();
        this.f38550e.stopRefresh();
        if (!this.f38555j) {
            this.f38550e.setNoMore();
            if (this.f38560o.size() <= 0) {
                this.f38550e.setVisibility(8);
                return;
            }
        } else {
            this.f38550e.stopLoadMore();
        }
        this.f38559n.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        i0();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f38556k);
    }
}
