package com.join.mgps.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.EndGameActivity_;
import com.join.mgps.activity.ForumIndexActivity_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.NewArenaMainActivty_;
import com.join.mgps.activity.SearchHintActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DiscoveryBannerBean;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.EndGameNameBean;
import com.join.mgps.dto.EndGameNameListBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.RequestEndGameNameListArgs;
import com.join.mgps.dto.RequestInfoArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.fragment.DiscoveryFragmentV3;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa91.arc.view.GlideImageLoader;
import com.youth.banner.Banner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.fragment_discovery)
/* loaded from: classes.dex */
public class DiscoveryFragmentV3 extends Fragment implements View.OnClickListener, AbsListView.OnScrollListener {
    private List<DownloadTask> D;
    com.join.android.app.component.video.c E;
    MGMainActivity F;
    private j H;
    private k I;
    private View J;
    private ArrayList<Boolean> K;
    private ArrayList<String> L;
    private l M;
    private boolean U;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f50793b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f50794c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    PtrClassicFrameLayout f50795d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f50796e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f50797f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f50798g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f50799h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f50800i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f50801j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    CustomerDownloadView f50802k;
    @Bean

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.Util.b f50803l;

    /* renamed from: m  reason: collision with root package name */
    private com.join.mgps.rpc.i f50804m;

    /* renamed from: o  reason: collision with root package name */
    private ForumBaseAdapter f50806o;

    /* renamed from: q  reason: collision with root package name */
    private View f50808q;

    /* renamed from: r  reason: collision with root package name */
    private ViewPager2 f50809r;

    /* renamed from: s  reason: collision with root package name */
    private Group f50810s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f50811t;

    /* renamed from: u  reason: collision with root package name */
    private TextView f50812u;

    /* renamed from: v  reason: collision with root package name */
    private Banner f50813v;

    /* renamed from: w  reason: collision with root package name */
    private RecyclerView f50814w;

    /* renamed from: z  reason: collision with root package name */
    private com.join.mgps.rpc.l f50817z;

    /* renamed from: n  reason: collision with root package name */
    private int f50805n = 1;

    /* renamed from: p  reason: collision with root package name */
    private boolean f50807p = false;

    /* renamed from: x  reason: collision with root package name */
    private int f50815x = 1;

    /* renamed from: y  reason: collision with root package name */
    private List<EndGameNameListBean> f50816y = new ArrayList();
    private com.join.mgps.adapter.l A = null;
    private com.join.mgps.adapter.k B = null;
    private String C = "";
    String G = "DiscoveryFragmentV3";
    private List<ForumBean.ForumPostsBean> N = new ArrayList();
    private List<DiscoveryMainDataBean.BattleGameBean> O = null;
    private int P = 0;
    private SparseArray Q = new SparseArray(0);
    private int R = -1;
    Map<String, DownloadTask> S = new HashMap();
    Map<String, DownloadTask> T = new HashMap();

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.listener.f {
        a() {
        }

        @Override // com.join.mgps.listener.f
        public void a(int i4) {
            int height = DiscoveryFragmentV3.this.f50794c.getHeight();
            if (height < DiscoveryFragmentV3.this.f50798g.getResources().getDimensionPixelOffset(R.dimen.wdp80)) {
                height = DiscoveryFragmentV3.this.f50798g.getResources().getDimensionPixelOffset(R.dimen.wdp140);
            }
            DiscoveryFragmentV3.this.f50798g.smoothScrollToPositionFromTop(i4, height);
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (DiscoveryFragmentV3.this.f50807p) {
                return;
            }
            DiscoveryFragmentV3.this.t0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (DiscoveryFragmentV3.this.f50807p) {
                return;
            }
            DiscoveryFragmentV3.this.f50805n = 1;
            com.join.android.app.component.video.c cVar = DiscoveryFragmentV3.this.E;
            if (cVar != null) {
                cVar.H();
                DiscoveryFragmentV3.this.E.M(1);
            }
            DiscoveryFragmentV3.this.N.clear();
            DiscoveryFragmentV3.this.t0();
            DiscoveryFragmentV3.this.f50815x = 1;
            DiscoveryFragmentV3.this.f50816y.clear();
            DiscoveryFragmentV3 discoveryFragmentV3 = DiscoveryFragmentV3.this;
            discoveryFragmentV3.u0(discoveryFragmentV3.f50815x);
            DiscoveryFragmentV3.this.s0();
        }
    }

    /* loaded from: classes3.dex */
    class d extends ForumBaseAdapter.b1 {
        d() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
            DiscoveryFragmentV3 discoveryFragmentV3 = DiscoveryFragmentV3.this;
            if (!discoveryFragmentV3.isLogined(discoveryFragmentV3.getActivity())) {
                DiscoveryFragmentV3 discoveryFragmentV32 = DiscoveryFragmentV3.this;
                discoveryFragmentV32.showMessage(discoveryFragmentV32.getActivity().getString(R.string.forum_user_not_login));
            } else if (!DiscoveryFragmentV3.this.L0()) {
                DiscoveryFragmentV3.this.E0();
            } else {
                DiscoveryFragmentV3.this.B0(i4);
                DiscoveryFragmentV3.this.z0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
            super.d(i4);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(DiscoveryFragmentV3.this.getActivity(), forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void e(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends ViewOutlineProvider {
        e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DiscoveryFragmentV3.this.getResources().getDimension(R.dimen.wdp16));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements ViewPager.OnPageChangeListener {
        f() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (DiscoveryFragmentV3.this.K != null) {
                int i5 = 0;
                while (i5 < DiscoveryFragmentV3.this.K.size()) {
                    DiscoveryFragmentV3.this.K.set(i5, Boolean.valueOf(i5 == i4 % DiscoveryFragmentV3.this.K.size()));
                    if (DiscoveryFragmentV3.this.M != null) {
                        DiscoveryFragmentV3.this.M.notifyDataSetChanged();
                    }
                    i5++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements m3.b {
        g() {
        }

        @Override // m3.b
        public void OnBannerClick(int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h extends BaseQuickAdapter<DiscoveryMainDataBean.BattleGameBean, BaseViewHolder> {
        public h(@Nullable List<DiscoveryMainDataBean.BattleGameBean> list) {
            super(R.layout.item_end_game_icon, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(DiscoveryMainDataBean.BattleGameBean battleGameBean, View view) {
            com.papa.sim.statistic.p.l(DiscoveryFragmentV3.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragmentV3.this.getActivity()).getUid(), "gameEnter");
            GameInfoBean gameInfoBean = new GameInfoBean();
            gameInfoBean.setGame_name(battleGameBean.getGame_name());
            gameInfoBean.setGame_ico(battleGameBean.getGame_ico());
            gameInfoBean.setGame_id(battleGameBean.getGame_id());
            GameRoomListActivity_.W3(DiscoveryFragmentV3.this.getActivity()).c(gameInfoBean).start();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final DiscoveryMainDataBean.BattleGameBean battleGameBean) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon), battleGameBean.getGame_ico());
            baseViewHolder.getView(R.id.selector).setVisibility(8);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiscoveryFragmentV3.h.this.c(battleGameBean, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends BaseQuickAdapter<DiscoveryMainDataBean.ForumListBean, BaseViewHolder> {
        public i(@Nullable List<DiscoveryMainDataBean.ForumListBean> list) {
            super(R.layout.item_end_game_icon, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(DiscoveryMainDataBean.ForumListBean forumListBean, View view) {
            com.papa.sim.statistic.p.l(DiscoveryFragmentV3.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragmentV3.this.getActivity()).getUid(), "groupEnter");
            IntentUtil.getInstance().goForumGroupActivity(DiscoveryFragmentV3.this.getContext(), forumListBean.getFid(), "discovery");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final DiscoveryMainDataBean.ForumListBean forumListBean) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon), forumListBean.getIcon_src());
            baseViewHolder.getView(R.id.selector).setVisibility(8);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiscoveryFragmentV3.i.this.c(forumListBean, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j extends BaseQuickAdapter<EndGameNameListBean, BaseViewHolder> {
        public j(@Nullable List<EndGameNameListBean> list) {
            super(R.layout.item_header_discovery_list, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, EndGameNameListBean endGameNameListBean) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon), endGameNameListBean.getGameIcon());
            baseViewHolder.setText(R.id.tvGameName, endGameNameListBean.getGameName());
            baseViewHolder.setGone(R.id.selectMask, endGameNameListBean.isSelected());
            baseViewHolder.setTextColor(R.id.tvGameName, Color.parseColor(endGameNameListBean.isSelected() ? "#3FABFF" : "#A1A0A0"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<EndGameNameListBean> f50828a;

        public k(@NonNull FragmentActivity fragmentActivity, List<EndGameNameListBean> list) {
            super(fragmentActivity);
            this.f50828a = list;
        }

        private EndGameDiscoveryFragment_ b(int i4) {
            FragmentManager parentFragmentManager = DiscoveryFragmentV3.this.getParentFragmentManager();
            Fragment findFragmentByTag = parentFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + i4);
            if (findFragmentByTag == null || !(findFragmentByTag instanceof EndGameDiscoveryFragment_)) {
                return null;
            }
            return (EndGameDiscoveryFragment_) findFragmentByTag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(List<EndGameNameListBean> list) {
            this.f50828a = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            return EndGameDiscoveryFragment_.e0().b(this.f50828a.get(i4)).c(i4).build();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f50828a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class l extends BaseQuickAdapter<Boolean, BaseViewHolder> {
        public l() {
            super(R.layout.item_discovery_banner_indicator, DiscoveryFragmentV3.this.K);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, Boolean bool) {
            baseViewHolder.setGone(R.id.viewUnselected, !bool.booleanValue()).setGone(R.id.viewSelected, bool.booleanValue());
        }
    }

    /* loaded from: classes3.dex */
    class m {

        /* renamed from: a  reason: collision with root package name */
        int f50831a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f50832b = 0;

        m() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C0(com.join.mgps.dto.ForumBean.ForumPostsBean r24, int r25) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.DiscoveryFragmentV3.C0(com.join.mgps.dto.ForumBean$ForumPostsBean, int):void");
    }

    private void D0(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append("setStatusBarLight: ");
        sb.append(z4);
        View decorView = getActivity().getWindow().getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 j02 = j0(getActivity());
        return j02 != null && g2.i(j02.getToken());
    }

    private com.wufan.user.service.protobuf.n0 j0(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void m0() {
        this.C = "";
        List<DownloadTask> R = p1.f.K().R(null);
        this.D = R;
        if (R == null || R.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.D) {
            if (downloadTask.isIs_fight() == 1) {
                if ("".equals(this.C)) {
                    this.C += downloadTask.getCrc_link_type_val();
                } else {
                    this.C += "," + downloadTask.getCrc_link_type_val();
                }
            }
        }
    }

    private int n0() {
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.P;
            if (i5 >= i4) {
                break;
            }
            m mVar = (m) this.Q.get(i5);
            if (mVar != null) {
                i6 += mVar.f50831a;
            }
            i5++;
        }
        m mVar2 = (m) this.Q.get(i4);
        if (mVar2 == null) {
            mVar2 = new m();
        }
        return i6 - mVar2.f50832b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(View view) {
        NewArenaMainActivty_.g1(getActivity()).start();
        com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "enterLobby");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(View view) {
        com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "communityEnter");
        ForumIndexActivity_.i0(getContext()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(View view) {
        EndGameActivity_.U0(getContext()).start();
    }

    void A0(ForumBean.GameInfo gameInfo) {
    }

    void B0(int i4) {
        List<ForumBean.ForumPostsBean> list = this.N;
        if (list == null || list.size() == 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.N.size()) {
                break;
            }
            ForumBean.ForumPostsBean forumPostsBean = this.N.get(i5);
            if (forumPostsBean.getPid() == i4) {
                this.N.get(i5).setPraise(forumPostsBean.is_praise() ? forumPostsBean.getPraise() - 1 : forumPostsBean.getPraise() + 1);
                this.N.get(i5).setIs_praise(!forumPostsBean.is_praise());
            } else {
                i5++;
            }
        }
        this.f50806o.x().clear();
        for (int i6 = 0; i6 < this.N.size(); i6++) {
            C0(this.N.get(i6), i6);
        }
        this.f50806o.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        com.join.mgps.Util.b0.f0(getActivity()).m(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        try {
            this.f50797f.setVisibility(0);
            this.f50796e.setVisibility(8);
            this.f50795d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        XListView2 xListView2 = this.f50798g;
        if (xListView2 != null) {
            xListView2.u();
            this.f50798g.v();
        }
        this.f50807p = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0(List<ForumBean.ForumPostsBean> list) {
        if (list == null) {
            return;
        }
        if (this.f50805n == 1) {
            this.f50806o.x().clear();
            this.N.clear();
        }
        this.N.addAll(list);
        for (int size = this.N.size(); size < this.N.size(); size++) {
            C0(this.N.get(size), size);
        }
        this.f50806o.notifyDataSetChanged();
        if (this.f50798g != null) {
            if (list.size() >= 10 && list.size() != 0) {
                this.f50805n++;
                this.f50798g.u();
                this.f50798g.v();
            } else {
                this.f50798g.setNoMore();
                this.f50798g.v();
            }
        }
        this.f50807p = false;
        this.f50806o.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0(DiscoveryMainDataBean discoveryMainDataBean) {
        LinearLayout linearLayout = this.f50797f;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
        this.f50796e.setVisibility(8);
        this.f50795d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0(List<CommonGameInfoBean> list) {
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        int i4 = 0;
        while (true) {
            boolean z4 = true;
            if (i4 >= list.size()) {
                break;
            }
            ArrayList<Boolean> arrayList = this.K;
            if (i4 != 0) {
                z4 = false;
            }
            arrayList.add(Boolean.valueOf(z4));
            this.L.add(list.get(i4).getBig_pic());
            i4++;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f50813v.setOutlineProvider(new e());
            this.f50813v.setClipToOutline(true);
        }
        if (!TextUtils.equals((CharSequence) this.f50813v.getTag(), this.G)) {
            this.f50813v.z(this.L).y(new GlideImageLoader()).q(true).x(5000).t(0).D(new g()).setOnPageChangeListener(new f());
            this.f50813v.setTag(this.G);
            this.f50813v.I();
        } else {
            this.f50813v.update(this.L);
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K0(EndGameNameBean endGameNameBean, int i4) {
        if (endGameNameBean == null) {
            return;
        }
        Group group = this.f50810s;
        if (group != null) {
            group.setVisibility(0);
        }
        if (this.f50816y == null) {
            this.f50816y = new ArrayList();
        }
        this.f50816y.addAll(endGameNameBean.getGameList());
        TextView textView = this.f50811t;
        if (textView != null) {
            textView.setText(endGameNameBean.getRoom() + "房");
        }
        TextView textView2 = this.f50812u;
        if (textView2 != null) {
            textView2.setText(endGameNameBean.getPost() + "贴");
        }
        if (i4 == 1) {
            int i5 = 0;
            while (i5 < this.f50816y.size()) {
                this.f50816y.get(i5).setSelected(i5 == 0);
                i5++;
            }
        }
        j jVar = this.H;
        if (jVar != null) {
            jVar.loadMoreComplete();
            this.H.replaceData(this.f50816y);
        }
        if (this.I != null) {
            if (i4 == 1) {
                this.f50809r.setCurrentItem(0);
            }
            this.I.c(this.f50816y);
            this.I.notifyDataSetChanged();
        }
    }

    boolean L0() {
        if (j0(getActivity()) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(getActivity()).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        org.greenrobot.eventbus.c.f().t(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f50794c.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.topMargin = com.join.android.app.common.utils.n.v(getContext());
            this.f50794c.setLayoutParams(layoutParams);
        }
        this.E = new com.join.android.app.component.video.c(getContext(), this.G);
        this.F = (MGMainActivity) getActivity();
        this.f50817z = com.join.mgps.rpc.impl.k.n0();
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.part_discovery_header_v3, (ViewGroup) null);
        this.f50808q = inflate;
        this.f50809r = (ViewPager2) inflate.findViewById(R.id.vpEndGame);
        this.f50810s = (Group) this.f50808q.findViewById(R.id.groupEndGame);
        this.f50811t = (TextView) this.f50808q.findViewById(R.id.tvBattleRoomCount);
        this.f50812u = (TextView) this.f50808q.findViewById(R.id.tvCommunityCount);
        this.f50813v = (Banner) this.f50808q.findViewById(R.id.banner);
        this.f50814w = (RecyclerView) this.f50808q.findViewById(R.id.indicator);
        View findViewById = this.f50808q.findViewById(R.id.bgBattle);
        this.J = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiscoveryFragmentV3.this.p0(view);
            }
        });
        this.f50808q.findViewById(R.id.bgCommunity).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiscoveryFragmentV3.this.q0(view);
            }
        });
        this.f50808q.findViewById(R.id.tvMore).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiscoveryFragmentV3.this.r0(view);
            }
        });
        k kVar = new k(getActivity(), this.f50816y);
        this.I = kVar;
        this.f50809r.setAdapter(kVar);
        View findViewById2 = this.f50808q.findViewById(R.id.statubar);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) findViewById2.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = com.join.android.app.common.utils.n.v(getContext());
        findViewById2.setLayoutParams(layoutParams2);
        this.f50799h.setOnClickListener(this);
        this.f50798g.addHeaderView(this.f50808q);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(getActivity(), this.E);
        this.f50806o = forumBaseAdapter;
        forumBaseAdapter.f1(new a());
        this.f50806o.C0(this.G);
        this.f50798g.setAdapter((ListAdapter) this.f50806o);
        this.f50798g.setPreLoadCount(10);
        this.f50798g.setVerticalScrollBarEnabled(false);
        this.f50798g.setPullLoadEnable(new b());
        this.f50798g.setPullRefreshEnable(new c());
        this.f50798g.setOnScrollListener(this);
        l0();
        u0(this.f50815x);
        s0();
        this.f50806o.I0(new d());
        D0(true);
        getDownloadTaskInfo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r4 != 11) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask r3, int r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getCrc_link_type_val()
            r1 = 2
            if (r4 == r1) goto L8d
            r1 = 3
            if (r4 == r1) goto L7f
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 6
            if (r4 == r1) goto L56
            r1 = 7
            if (r4 == r1) goto L3b
            r1 = 10
            if (r4 == r1) goto L20
            r3 = 11
            if (r4 == r3) goto L71
            goto La7
        L20:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.S
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.S
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.T
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.T
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.S
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.S
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.S
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.S
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.T
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.S
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.S
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.T
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.T
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.DiscoveryFragmentV3.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void downloadView1() {
        IntentUtil.getInstance().goMyGameManagerActivity(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.S.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.T.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    public void k0() {
        com.join.android.app.component.video.c cVar = this.E;
        if (cVar != null) {
            cVar.M(1);
            this.E.n(this.f50798g);
        }
    }

    public void l0() {
        m0();
        loadData();
        List<ForumBean.ForumPostsBean> list = this.N;
        if (list == null || list.size() != 0) {
            return;
        }
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.put("uid", this.f50803l.getUid());
                linkedMultiValueMap.put("token", this.f50803l.getToken());
                linkedMultiValueMap.put("game_ids", this.C);
                GameWorldResponse<DiscoveryMainDataBean> j02 = this.f50817z.j0(linkedMultiValueMap);
                if (j02 != null && j02.getData() != null && j02.getError() == 0) {
                    I0(j02.getData());
                } else {
                    F0();
                }
                return;
            } catch (Exception unused) {
                F0();
                return;
            }
        }
        F0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loding_faile() {
        this.f50797f.setVisibility(8);
        this.f50796e.setVisibility(0);
        this.f50795d.setVisibility(8);
        l0();
        this.f50815x = 1;
        this.f50816y.clear();
        u0(this.f50815x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f50814w.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        l lVar = new l();
        this.M = lVar;
        this.f50814w.setAdapter(lVar);
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
        org.greenrobot.eventbus.c.f().y(this);
        com.join.android.app.component.video.c cVar = this.E;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        changeDownloadTaskNumber(nVar.a(), nVar.c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            l0();
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
        if (this.A != null) {
            l0();
            if (this.F.getPositionNum() != 4 || (cVar = this.E) == null) {
                return;
            }
            cVar.I();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("onScrollStateChanged: ");
        sb.append(i4);
        this.E.j(absListView, i4);
        if (i4 == 0 && Fresco.getImagePipeline().H()) {
            Fresco.getImagePipeline().N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                RequestInfoArgs requestInfoArgs = new RequestInfoArgs();
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(requestInfoArgs);
                requestModel.setDefault(getContext());
                ResponseModel<DiscoveryBannerBean> k02 = com.join.mgps.rpc.impl.i.D0().k0(requestModel.makeSign());
                if (k02 != null) {
                    if (k02.getData() != null && k02.getData().getBanner() != null && k02.getData().getBanner().size() > 0) {
                        J0(k02.getData().getBanner());
                    }
                    x0();
                } else {
                    x0();
                }
            } catch (Exception unused) {
                x0();
            }
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            if (this.f50804m == null) {
                this.f50804m = com.join.mgps.rpc.impl.g.A0();
            }
            String uid = AccountUtil_.getInstance_(getActivity()).getUid();
            String token = AccountUtil_.getInstance_(getActivity()).getToken();
            if (this.f50807p) {
                return;
            }
            this.f50807p = true;
            try {
                ForumResponse<List<ForumBean.ForumPostsBean>> W = this.f50804m.W(uid, token, this.f50805n);
                if (W != null && W.getError() == 0) {
                    H0(W.getData());
                } else {
                    G0();
                }
                return;
            } catch (Exception unused) {
                G0();
                return;
            }
        }
        G0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0(int i4) {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                RequestEndGameNameListArgs requestEndGameNameListArgs = new RequestEndGameNameListArgs();
                requestEndGameNameListArgs.setWithEndGame(true);
                requestEndGameNameListArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
                requestEndGameNameListArgs.setPage(i4);
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(requestEndGameNameListArgs);
                requestModel.setDefault(getContext());
                ResponseModel<EndGameNameBean> u02 = com.join.mgps.rpc.impl.i.D0().u0(requestModel.makeSign());
                if (u02 != null && u02.getCode() == 200) {
                    if (u02.getData() != null && u02.getData().getGameList() != null && u02.getData().getGameList().size() > 0) {
                        K0(u02.getData(), i4);
                    }
                    y0();
                } else if (i4 == 1) {
                    v0();
                }
                return;
            } catch (Exception unused) {
                v0();
                return;
            }
        }
        v0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.S.size();
        int size2 = this.T.size();
        CustomerDownloadView customerDownloadView = this.f50802k;
        if (customerDownloadView != null) {
            customerDownloadView.setDownloadGameNum(size);
        }
        if (size2 > 0) {
            CustomerDownloadView customerDownloadView2 = this.f50802k;
            if (customerDownloadView2 != null) {
                customerDownloadView2.d();
                return;
            }
            return;
        }
        CustomerDownloadView customerDownloadView3 = this.f50802k;
        if (customerDownloadView3 != null) {
            customerDownloadView3.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        Group group = this.f50810s;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        this.f50813v.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        j jVar = this.H;
        if (jVar != null) {
            jVar.loadMoreComplete();
            this.H.loadMoreEnd(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(getActivity())) {
                com.join.mgps.Util.j0.L0(getActivity());
                l2.a(getActivity()).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(getActivity(), i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f50804m.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                B0(i4);
                E0();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
