package com.join.mgps.activity.arena;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.BaseFragmentActivity;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.adapter.h1;
import com.join.mgps.customview.TabPageIndicator;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.f;
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
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_arena_gamelist)
/* loaded from: classes4.dex */
public class ArenaGameListActivity extends BaseFragmentActivity {

    /* renamed from: s  reason: collision with root package name */
    private static final int f38498s = 10;

    /* renamed from: t  reason: collision with root package name */
    public static final int f38499t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f38500u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f38501v = 3;

    /* renamed from: w  reason: collision with root package name */
    public static final int f38502w = 4;

    /* renamed from: x  reason: collision with root package name */
    private static final int f38503x = 35;

    /* renamed from: y  reason: collision with root package name */
    private static final int f38504y = 31;

    /* renamed from: b  reason: collision with root package name */
    l f38505b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    int f38506c;
    @ViewById(R.id.title_textview)

    /* renamed from: d  reason: collision with root package name */
    TextView f38507d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f38508e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f38509f;

    /* renamed from: g  reason: collision with root package name */
    ViewPager f38510g;

    /* renamed from: h  reason: collision with root package name */
    TabPageIndicator f38511h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f38512i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RelativeLayout f38513j;
    @Bean

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.Util.b f38516m;

    /* renamed from: n  reason: collision with root package name */
    private h1 f38517n;

    /* renamed from: q  reason: collision with root package name */
    private ArenaGameListFragment_[] f38520q;

    /* renamed from: k  reason: collision with root package name */
    private boolean f38514k = false;

    /* renamed from: l  reason: collision with root package name */
    private int f38515l = 1;

    /* renamed from: o  reason: collision with root package name */
    private List<GameInfoBean> f38518o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<GameTypeBean> f38519p = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<GameInfoBean> f38521r = new ArrayList<>();

    /* loaded from: classes4.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            GameRoomListActivity_.W3(ArenaGameListActivity.this).c((GameInfoBean) ArenaGameListActivity.this.f38518o.get(i4)).a(true).b(true).start();
        }
    }

    /* loaded from: classes4.dex */
    class b implements f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ArenaGameListActivity.this.f38514k) {
                if (!j.j(ArenaGameListActivity.this)) {
                    ArenaGameListActivity.this.f38509f.u();
                    l2.a(ArenaGameListActivity.this).b(ArenaGameListActivity.this.getString(R.string.net_connect_failed));
                    return;
                }
                ArenaGameListActivity.this.o0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c extends FragmentPagerAdapter {
        public c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return ArenaGameListActivity.this.f38519p.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return ArenaGameListActivity.this.l0(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return ((GameTypeBean) ArenaGameListActivity.this.f38519p.get(i4)).getTitle();
        }
    }

    private void getData() {
        if (j.j(this)) {
            showLoading();
            m0();
            return;
        }
        p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment l0(int i4) {
        ArenaGameListFragment_ arenaGameListFragment_ = this.f38520q[i4];
        if (arenaGameListFragment_ != null) {
            return arenaGameListFragment_;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("game_type", this.f38519p.get(i4).getId());
        int i5 = this.f38506c;
        if (i5 == 2) {
            bundle.putInt("room_type", 35);
        } else if (i5 == 3) {
            bundle.putInt("room_type", 31);
        }
        if (i4 == 0) {
            bundle.putInt("pn", 2);
            bundle.putSerializable("datas", this.f38521r);
        } else {
            bundle.putInt("pn", 1);
        }
        ArenaGameListFragment_ arenaGameListFragment_2 = new ArenaGameListFragment_();
        arenaGameListFragment_2.setArguments(bundle);
        this.f38520q[i4] = arenaGameListFragment_2;
        return arenaGameListFragment_2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f38505b = com.join.mgps.rpc.impl.l.n0();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.title_bar_layout);
        relativeLayout.setBackgroundColor(getResources().getColor(R.color.color_1F4959));
        relativeLayout.findViewById(R.id.line).setVisibility(8);
        ((ImageView) relativeLayout.findViewById(R.id.back_image)).setImageDrawable(getResources().getDrawable(R.drawable.icon_back_2));
        this.f38507d.setTextColor(-1);
        this.f38508e = (LinearLayout) findViewById(R.id.loding_layout);
        this.f38512i = (LinearLayout) findViewById(R.id.loding_faile);
        this.f38507d.setGravity(17);
        h1 h1Var = new h1(this, this.f38518o, false);
        this.f38517n = h1Var;
        this.f38509f.setAdapter((ListAdapter) h1Var);
        int i4 = this.f38506c;
        if (i4 == 1) {
            this.f38507d.setText("最近");
            this.f38509f.setVisibility(0);
            this.f38509f.setOnItemClickListener(new a());
            this.f38509f.setPullLoadEnable(new b());
            this.f38513j.setVisibility(8);
            getData();
            return;
        }
        if (i4 == 2) {
            this.f38507d.setText("FC对战");
        } else if (i4 == 3) {
            this.f38507d.setText("街机对战");
        } else if (i4 == 4) {
            this.f38507d.setText("其他");
        }
        this.f38509f.setVisibility(8);
        this.f38513j.setVisibility(0);
        this.f38510g = (ViewPager) findViewById(R.id.viewPager);
        this.f38511h = (TabPageIndicator) findViewById(R.id.pageIndicator);
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        this.f38508e.setVisibility(8);
        this.f38512i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(ResultResMainBean<NewArenaGameListBean> resultResMainBean) {
        this.f38519p.addAll(resultResMainBean.getData().getGame_type());
        this.f38521r.addAll(resultResMainBean.getData().getGame_list());
        this.f38520q = new ArenaGameListFragment_[this.f38519p.size()];
        this.f38510g.setAdapter(new c(getSupportFragmentManager()));
        this.f38510g.setOffscreenPageLimit(this.f38519p.size());
        this.f38510g.setCurrentItem(0);
        this.f38511h.setNormalTextColor(getResources().getColor(R.color.color_2D6273));
        this.f38511h.setSelectedTextColor(getResources().getColor(R.color.white));
        this.f38511h.setSelectedBottomDrawableBounds(R.drawable.line_white);
        this.f38511h.setNormalBottomDrawableBound(R.drawable.trans);
        this.f38511h.setViewPager(this.f38510g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        if (this.f38506c == 1) {
            o0();
        } else {
            n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        ResultResMainBean<NewArenaGameListBean> resultResMainBean = null;
        try {
            int i4 = this.f38506c;
            if (i4 == 2) {
                resultResMainBean = this.f38505b.w(35, 1, 1);
            } else if (i4 == 3) {
                resultResMainBean = this.f38505b.w(31, 1, 1);
            }
            if (isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 17 || !isDestroyed()) {
                if (resultResMainBean != null && resultResMainBean.getData() != null && resultResMainBean.getData().getGame_type() != null) {
                    k0(resultResMainBean);
                    j0();
                    return;
                }
                p0();
            }
        } catch (Exception unused) {
            p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        try {
            ResultResMainBean<GameListBean> m4 = this.f38505b.m(this.f38516m.getAccountData().getUid(), this.f38516m.getAccountData().getToken(), this.f38515l);
            if (isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 17 || !isDestroyed()) {
                if (m4 != null && m4.getData() != null) {
                    List<GameInfoBean> game_list = m4.getData().getGame_list();
                    if (game_list != null && game_list.size() > 0) {
                        this.f38514k = game_list.size() >= 10;
                    } else {
                        this.f38514k = false;
                    }
                    q0(game_list);
                    if (this.f38515l <= 1) {
                        j0();
                    }
                    if (this.f38514k) {
                        this.f38515l++;
                        return;
                    }
                    return;
                }
                if (this.f38515l <= 1) {
                    p0();
                }
            }
        } catch (Exception e5) {
            v0.b("ArenaGameListActivity", "requestRecentGameList Exception :" + e5.getMessage());
            if (this.f38515l <= 1) {
                p0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        this.f38509f.setVisibility(8);
        this.f38508e.setVisibility(8);
        this.f38512i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(List<GameInfoBean> list) {
        if (this.f38509f.getVisibility() == 8) {
            this.f38509f.setVisibility(0);
        }
        if (list != null && list.size() > 0) {
            this.f38518o.addAll(list);
        }
        if (!this.f38514k) {
            this.f38509f.setNoMore();
            if (this.f38518o.size() <= 0) {
                this.f38509f.setVisibility(8);
                return;
            }
        } else {
            this.f38509f.u();
        }
        this.f38517n.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoading() {
        this.f38508e.setVisibility(0);
        this.f38512i.setVisibility(8);
    }
}
