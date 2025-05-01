package com.join.mgps.fragment;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.ForumIndexActivity_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.NewArenaMainActivty_;
import com.join.mgps.activity.SearchHintActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.customview.MyGridView;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.fragment_discovery)
/* loaded from: classes3.dex */
public class DiscoveryFragment extends Fragment implements View.OnClickListener, AbsListView.OnScrollListener {
    private List<DownloadTask> B;
    private ScrollTextViewLayout C;
    private ImageView D;
    com.join.android.app.component.video.c E;
    MGMainActivity F;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f50718b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f50719c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    PtrClassicFrameLayout f50720d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f50721e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f50722f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f50723g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f50724h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f50725i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f50726j;
    @Bean

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.Util.b f50727k;

    /* renamed from: l  reason: collision with root package name */
    private com.join.mgps.rpc.i f50728l;

    /* renamed from: n  reason: collision with root package name */
    private ForumBaseAdapter f50730n;

    /* renamed from: p  reason: collision with root package name */
    private View f50732p;

    /* renamed from: q  reason: collision with root package name */
    private LinearLayout f50733q;

    /* renamed from: r  reason: collision with root package name */
    private GridView f50734r;

    /* renamed from: s  reason: collision with root package name */
    private MyGridView f50735s;

    /* renamed from: t  reason: collision with root package name */
    private ImageView f50736t;

    /* renamed from: u  reason: collision with root package name */
    private RelativeLayout f50737u;

    /* renamed from: v  reason: collision with root package name */
    private LinearLayout f50738v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f50739w;

    /* renamed from: x  reason: collision with root package name */
    private com.join.mgps.rpc.l f50740x;

    /* renamed from: m  reason: collision with root package name */
    private int f50729m = 1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f50731o = false;

    /* renamed from: y  reason: collision with root package name */
    private com.join.mgps.adapter.l f50741y = null;

    /* renamed from: z  reason: collision with root package name */
    private com.join.mgps.adapter.k f50742z = null;
    private String A = "";
    String G = "DiscoveryFragment";
    private List<ForumBean.ForumPostsBean> H = new ArrayList();
    private List<DiscoveryMainDataBean.BattleGameBean> I = null;
    private int J = 0;
    private SparseArray K = new SparseArray(0);

    /* loaded from: classes3.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            com.papa.sim.statistic.p.l(DiscoveryFragment.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragment.this.getActivity()).getUid(), "gameEnter");
            DiscoveryMainDataBean.BattleGameBean item = DiscoveryFragment.this.f50741y.getItem(i4);
            if (item == null) {
                return;
            }
            GameInfoBean gameInfoBean = new GameInfoBean();
            gameInfoBean.setGame_name(item.getGame_name());
            gameInfoBean.setGame_ico(item.getGame_ico());
            gameInfoBean.setGame_id(item.getGame_id());
            GameRoomListActivity_.W3(DiscoveryFragment.this.getActivity()).c(gameInfoBean).start();
        }
    }

    /* loaded from: classes3.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (adapterView.getAdapter() == null || !(adapterView.getAdapter() instanceof com.join.mgps.adapter.k)) {
                return;
            }
            com.papa.sim.statistic.p.l(DiscoveryFragment.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragment.this.getActivity()).getUid(), "groupEnter");
            IntentUtil.getInstance().goForumGroupActivity(adapterView.getContext(), ((com.join.mgps.adapter.k) adapterView.getAdapter()).getItem(i4).getFid(), "discovery");
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.listener.f {
        c() {
        }

        @Override // com.join.mgps.listener.f
        public void a(int i4) {
            int height = DiscoveryFragment.this.f50719c.getHeight();
            if (height < DiscoveryFragment.this.f50723g.getResources().getDimensionPixelOffset(R.dimen.wdp80)) {
                height = DiscoveryFragment.this.f50723g.getResources().getDimensionPixelOffset(R.dimen.wdp140);
            }
            DiscoveryFragment.this.f50723g.smoothScrollToPositionFromTop(i4, height);
        }
    }

    /* loaded from: classes3.dex */
    class d implements com.join.mgps.customview.f {
        d() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (DiscoveryFragment.this.f50731o) {
                return;
            }
            DiscoveryFragment.this.h0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements com.join.mgps.customview.g {
        e() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (DiscoveryFragment.this.f50731o) {
                return;
            }
            DiscoveryFragment.this.f50729m = 1;
            com.join.android.app.component.video.c cVar = DiscoveryFragment.this.E;
            if (cVar != null) {
                cVar.H();
                DiscoveryFragment.this.E.M(1);
            }
            DiscoveryFragment.this.H.clear();
            DiscoveryFragment.this.h0();
        }
    }

    /* loaded from: classes3.dex */
    class f extends ForumBaseAdapter.b1 {
        f() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
            DiscoveryFragment discoveryFragment = DiscoveryFragment.this;
            if (!discoveryFragment.isLogined(discoveryFragment.getActivity())) {
                DiscoveryFragment discoveryFragment2 = DiscoveryFragment.this;
                discoveryFragment2.showMessage(discoveryFragment2.getActivity().getString(R.string.forum_user_not_login));
            } else if (!DiscoveryFragment.this.s0()) {
                DiscoveryFragment.this.n0();
            } else {
                DiscoveryFragment.this.l0(i4);
                DiscoveryFragment.this.j0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
            super.d(i4);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(DiscoveryFragment.this.getActivity(), forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void e(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        int f50749a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f50750b = 0;

        g() {
        }
    }

    private com.wufan.user.service.protobuf.n0 c0(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void f0() {
        this.A = "";
        List<DownloadTask> R = p1.f.K().R(null);
        this.B = R;
        if (R == null || R.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.B) {
            if (downloadTask.isIs_fight() == 1) {
                if ("".equals(this.A)) {
                    this.A += downloadTask.getCrc_link_type_val();
                } else {
                    this.A += "," + downloadTask.getCrc_link_type_val();
                }
            }
        }
    }

    private int g0() {
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.J;
            if (i5 >= i4) {
                break;
            }
            g gVar = (g) this.K.get(i5);
            if (gVar != null) {
                i6 += gVar.f50749a;
            }
            i5++;
        }
        g gVar2 = (g) this.K.get(i4);
        if (gVar2 == null) {
            gVar2 = new g();
        }
        return i6 - gVar2.f50750b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 c02 = c0(getActivity());
        return c02 != null && g2.i(c02.getToken());
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m0(com.join.mgps.dto.ForumBean.ForumPostsBean r24, int r25) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.DiscoveryFragment.m0(com.join.mgps.dto.ForumBean$ForumPostsBean, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void V() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.C = ((MGMainActivity) getActivity()).scroll_text_layout;
        this.D = ((MGMainActivity) getActivity()).downloadLine;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f50726j.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.height = com.join.android.app.common.utils.n.v(getContext());
        }
        this.f50726j.setLayoutParams(layoutParams);
        this.E = new com.join.android.app.component.video.c(getContext(), this.G);
        this.F = (MGMainActivity) getActivity();
        this.f50740x = com.join.mgps.rpc.impl.k.n0();
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.part_discovery_header, (ViewGroup) null);
        this.f50732p = inflate;
        this.f50733q = (LinearLayout) inflate.findViewById(R.id.discoveryTopRl);
        this.f50734r = (GridView) this.f50732p.findViewById(R.id.discoveryTopGv);
        this.f50735s = (MyGridView) this.f50732p.findViewById(R.id.discoveryBottomGv);
        this.f50736t = (ImageView) this.f50732p.findViewById(R.id.discoverySearchIv);
        this.f50737u = (RelativeLayout) this.f50732p.findViewById(R.id.toFightRl);
        this.f50738v = (LinearLayout) this.f50732p.findViewById(R.id.toCommunityLl);
        this.f50739w = (TextView) this.f50732p.findViewById(R.id.toCommunityTx);
        View findViewById = this.f50732p.findViewById(R.id.statubar);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams2.height = com.join.android.app.common.utils.n.v(getContext());
        findViewById.setLayoutParams(layoutParams2);
        this.f50736t.setOnClickListener(this);
        this.f50724h.setOnClickListener(this);
        this.f50737u.setOnClickListener(this);
        this.f50738v.setOnClickListener(this);
        this.f50739w.setOnClickListener(this);
        this.f50734r.setOnItemClickListener(new a());
        this.f50735s.setOnItemClickListener(new b());
        this.f50723g.addHeaderView(this.f50732p);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(getActivity(), this.E);
        this.f50730n = forumBaseAdapter;
        forumBaseAdapter.f1(new c());
        this.f50730n.C0(this.G);
        this.f50723g.setAdapter((ListAdapter) this.f50730n);
        this.f50723g.setPreLoadCount(10);
        this.f50723g.setVerticalScrollBarEnabled(false);
        this.f50723g.setPullLoadEnable(new d());
        this.f50723g.setPullRefreshEnable(new e());
        this.f50723g.setOnScrollListener(this);
        e0();
        this.f50730n.I0(new f());
    }

    public void d0() {
        com.join.android.app.component.video.c cVar = this.E;
        if (cVar != null) {
            cVar.M(1);
            this.E.n(this.f50723g);
        }
    }

    public void e0() {
        f0();
        loadData();
        List<ForumBean.ForumPostsBean> list = this.H;
        if (list == null || list.size() != 0) {
            return;
        }
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            if (this.f50728l == null) {
                this.f50728l = com.join.mgps.rpc.impl.g.A0();
            }
            String uid = AccountUtil_.getInstance_(getActivity()).getUid();
            String token = AccountUtil_.getInstance_(getActivity()).getToken();
            if (this.f50731o) {
                return;
            }
            this.f50731o = true;
            try {
                ForumResponse<List<ForumBean.ForumPostsBean>> W = this.f50728l.W(uid, token, this.f50729m);
                if (W != null && W.getError() == 0) {
                    q0(W.getData());
                } else {
                    p0();
                }
                return;
            } catch (Exception unused) {
                p0();
                return;
            }
        }
        p0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(getActivity())) {
                com.join.mgps.Util.j0.L0(getActivity());
                l2.a(getActivity()).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(getActivity(), i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f50728l.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                l0(i4);
                n0();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void k0(ForumBean.GameInfo gameInfo) {
    }

    void l0(int i4) {
        List<ForumBean.ForumPostsBean> list = this.H;
        if (list == null || list.size() == 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.H.size()) {
                break;
            }
            ForumBean.ForumPostsBean forumPostsBean = this.H.get(i5);
            if (forumPostsBean.getPid() == i4) {
                this.H.get(i5).setPraise(forumPostsBean.is_praise() ? forumPostsBean.getPraise() - 1 : forumPostsBean.getPraise() + 1);
                this.H.get(i5).setIs_praise(!forumPostsBean.is_praise());
            } else {
                i5++;
            }
        }
        this.f50730n.x().clear();
        for (int i6 = 0; i6 < this.H.size(); i6++) {
            m0(this.H.get(i6), i6);
        }
        this.f50730n.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.put("uid", this.f50727k.getUid());
                linkedMultiValueMap.put("token", this.f50727k.getToken());
                linkedMultiValueMap.put("game_ids", this.A);
                GameWorldResponse<DiscoveryMainDataBean> j02 = this.f50740x.j0(linkedMultiValueMap);
                if (j02 != null && j02.getData() != null && j02.getError() == 0) {
                    r0(j02.getData());
                } else {
                    o0();
                }
                return;
            } catch (Exception unused) {
                o0();
                return;
            }
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loding_faile() {
        this.f50722f.setVisibility(8);
        this.f50721e.setVisibility(0);
        this.f50720d.setVisibility(8);
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        com.join.mgps.Util.b0.f0(getActivity()).m(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        try {
            this.f50722f.setVisibility(0);
            this.f50721e.setVisibility(8);
            this.f50720d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.discoverySearchIv && id != R.id.discoveryTitleSearchIv) {
            switch (id) {
                case R.id.toCommunityLl /* 2131301522 */:
                case R.id.toCommunityTx /* 2131301523 */:
                    com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "communityEnter");
                    ForumIndexActivity_.i0(getContext()).start();
                    return;
                case R.id.toFightRl /* 2131301524 */:
                    NewArenaMainActivty_.g1(getActivity()).start();
                    com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "enterLobby");
                    return;
                default:
                    return;
            }
        }
        SearchHintActivity_.G1(getActivity()).start();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.android.app.component.video.c cVar = this.E;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            e0();
            com.join.android.app.component.video.c cVar = this.E;
            if (cVar != null) {
                cVar.I();
                return;
            }
            return;
        }
        com.join.android.app.component.video.c cVar2 = this.E;
        if (cVar2 != null) {
            cVar2.H();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.join.android.app.component.video.c cVar;
        if (this.F.getPositionNum() == 4 && (cVar = this.E) != null) {
            cVar.H();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        com.join.android.app.component.video.c cVar;
        super.onResume();
        if (this.f50741y != null) {
            e0();
            if (this.F.getPositionNum() != 4 || (cVar = this.E) == null) {
                return;
            }
            cVar.I();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.E.f(absListView, i4, i5, i6);
        this.J = i4;
        View childAt = absListView.getChildAt(0);
        if (childAt != null) {
            g gVar = (g) this.K.get(i4);
            if (gVar == null) {
                gVar = new g();
            }
            gVar.f50749a = childAt.getHeight();
            gVar.f50750b = childAt.getTop();
            this.K.append(i4, gVar);
            int g02 = g0();
            if (g02 <= 20) {
                this.f50719c.setVisibility(8);
                this.f50726j.setVisibility(8);
                this.C.setDrawable(getResources().getDrawable(R.drawable.papa_download_butn));
                this.D.setImageResource(R.drawable.line_white_bg);
            } else if (g02 > 10) {
                this.f50726j.setVisibility(0);
                this.f50719c.setVisibility(0);
                this.C.setDrawable(getResources().getDrawable(R.drawable.papa_download_selector));
                this.D.setImageResource(R.drawable.line_grey_bg);
                if (g02 >= this.f50732p.getHeight()) {
                    this.f50725i.setText("悟饭头条");
                } else {
                    this.f50725i.setText("发现");
                }
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.E.j(absListView, i4);
        if (i4 == 0 && Fresco.getImagePipeline().H()) {
            Fresco.getImagePipeline().N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        XListView2 xListView2 = this.f50723g;
        if (xListView2 != null) {
            xListView2.u();
            this.f50723g.v();
        }
        this.f50731o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(List<ForumBean.ForumPostsBean> list) {
        if (list == null) {
            return;
        }
        if (this.f50729m == 1) {
            this.f50730n.x().clear();
            this.H.clear();
        }
        this.H.addAll(list);
        for (int size = this.H.size(); size < this.H.size(); size++) {
            m0(this.H.get(size), size);
        }
        this.f50730n.notifyDataSetChanged();
        if (this.f50723g != null) {
            if (list.size() >= 10 && list.size() != 0) {
                this.f50729m++;
                this.f50723g.u();
                this.f50723g.v();
            } else {
                this.f50723g.setNoMore();
                this.f50723g.v();
            }
        }
        this.f50731o = false;
        this.f50730n.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(DiscoveryMainDataBean discoveryMainDataBean) {
        LinearLayout linearLayout = this.f50722f;
        if (linearLayout == null || discoveryMainDataBean == null) {
            return;
        }
        linearLayout.setVisibility(8);
        this.f50721e.setVisibility(8);
        this.f50720d.setVisibility(0);
        List<DiscoveryMainDataBean.BattleGameBean> battle_game = discoveryMainDataBean.getBattle_game();
        this.I = battle_game;
        if (battle_game != null && battle_game.size() > 0) {
            if (this.I.size() <= 4) {
                this.f50734r.setColumnWidth(this.I.size());
            } else {
                this.f50734r.setColumnWidth(4);
            }
            com.join.mgps.adapter.l lVar = this.f50741y;
            if (lVar == null) {
                com.join.mgps.adapter.l lVar2 = new com.join.mgps.adapter.l(getActivity(), this.I, this.A);
                this.f50741y = lVar2;
                this.f50734r.setAdapter((ListAdapter) lVar2);
            } else {
                lVar.c(this.I);
            }
            this.f50741y.b(this.A);
        }
        List<DiscoveryMainDataBean.ForumListBean> forum_list = discoveryMainDataBean.getForum_list();
        if (forum_list == null || forum_list.size() <= 0) {
            return;
        }
        com.join.mgps.adapter.k kVar = this.f50742z;
        if (kVar == null) {
            this.f50742z = new com.join.mgps.adapter.k(getActivity(), forum_list);
        } else {
            kVar.b(forum_list);
        }
        this.f50735s.setAdapter((ListAdapter) this.f50742z);
    }

    boolean s0() {
        if (c0(getActivity()) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(getActivity()).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(getActivity()).b(str);
    }
}
