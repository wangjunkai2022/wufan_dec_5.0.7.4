package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.SourceShareActivity;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.DiscoveryPaiweiActivity_;
import com.join.mgps.activity.EndGameActivity_;
import com.join.mgps.activity.ForumIndexActivity_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.activity.NewArenaMainActivty_;
import com.join.mgps.activity.SearchHintActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.DiscoveryHeaderArgs;
import com.join.mgps.dto.DiscoveryHeaderBean;
import com.join.mgps.dto.DiscoveryHeaderMenuBean;
import com.join.mgps.dto.DiscoveryHeaderMenuClickArgs;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.EndGameNameListBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.fragment.DiscoveryFragmentV4;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
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
public class DiscoveryFragmentV4 extends Fragment implements View.OnClickListener, AbsListView.OnScrollListener {
    private boolean H;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f50866b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f50867c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    PtrClassicFrameLayout f50868d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f50869e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f50870f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f50871g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f50872h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f50873i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f50874j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    CustomerDownloadView f50875k;
    @Bean

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.Util.b f50876l;

    /* renamed from: m  reason: collision with root package name */
    private com.join.mgps.rpc.i f50877m;

    /* renamed from: o  reason: collision with root package name */
    private ForumBaseAdapter f50879o;

    /* renamed from: q  reason: collision with root package name */
    private View f50881q;

    /* renamed from: r  reason: collision with root package name */
    private com.join.mgps.rpc.l f50882r;

    /* renamed from: v  reason: collision with root package name */
    private List<DownloadTask> f50886v;

    /* renamed from: w  reason: collision with root package name */
    com.join.android.app.component.video.c f50887w;

    /* renamed from: x  reason: collision with root package name */
    MGMainActivity f50888x;

    /* renamed from: z  reason: collision with root package name */
    private LinearLayout f50890z;

    /* renamed from: n  reason: collision with root package name */
    private int f50878n = 1;

    /* renamed from: p  reason: collision with root package name */
    private boolean f50880p = false;

    /* renamed from: s  reason: collision with root package name */
    private com.join.mgps.adapter.l f50883s = null;

    /* renamed from: t  reason: collision with root package name */
    private com.join.mgps.adapter.k f50884t = null;

    /* renamed from: u  reason: collision with root package name */
    private String f50885u = "";

    /* renamed from: y  reason: collision with root package name */
    String f50889y = "DiscoveryFragmentV4";
    private String A = null;
    private List<ForumBean.ForumPostsBean> B = new ArrayList();
    private int C = 0;
    private SparseArray D = new SparseArray(0);
    private int E = -1;
    Map<String, DownloadTask> F = new HashMap();
    Map<String, DownloadTask> G = new HashMap();

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.listener.f {
        a() {
        }

        @Override // com.join.mgps.listener.f
        public void a(int i4) {
            int height = DiscoveryFragmentV4.this.f50867c.getHeight();
            if (height < DiscoveryFragmentV4.this.f50871g.getResources().getDimensionPixelOffset(R.dimen.wdp80)) {
                height = DiscoveryFragmentV4.this.f50871g.getResources().getDimensionPixelOffset(R.dimen.wdp140);
            }
            DiscoveryFragmentV4.this.f50871g.smoothScrollToPositionFromTop(i4, height);
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (DiscoveryFragmentV4.this.f50880p) {
                return;
            }
            DiscoveryFragmentV4.this.j0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (DiscoveryFragmentV4.this.f50880p) {
                return;
            }
            DiscoveryFragmentV4.this.f50878n = 1;
            com.join.android.app.component.video.c cVar = DiscoveryFragmentV4.this.f50887w;
            if (cVar != null) {
                cVar.H();
                DiscoveryFragmentV4.this.f50887w.M(1);
            }
            DiscoveryFragmentV4.this.B.clear();
            DiscoveryFragmentV4.this.j0();
            DiscoveryFragmentV4.this.k0();
        }
    }

    /* loaded from: classes3.dex */
    class d extends ForumBaseAdapter.b1 {
        d() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
            DiscoveryFragmentV4 discoveryFragmentV4 = DiscoveryFragmentV4.this;
            if (!discoveryFragmentV4.isLogined(discoveryFragmentV4.getActivity())) {
                DiscoveryFragmentV4 discoveryFragmentV42 = DiscoveryFragmentV4.this;
                discoveryFragmentV42.showMessage(discoveryFragmentV42.getActivity().getString(R.string.forum_user_not_login));
            } else if (!DiscoveryFragmentV4.this.y0()) {
                DiscoveryFragmentV4.this.s0();
            } else {
                DiscoveryFragmentV4.this.o0(i4);
                DiscoveryFragmentV4.this.m0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
            super.d(i4);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(DiscoveryFragmentV4.this.getActivity(), forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void e(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends BaseQuickAdapter<DiscoveryMainDataBean.BattleGameBean, BaseViewHolder> {
        public e(@Nullable List<DiscoveryMainDataBean.BattleGameBean> list) {
            super(R.layout.item_end_game_icon, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(DiscoveryMainDataBean.BattleGameBean battleGameBean, View view) {
            com.papa.sim.statistic.p.l(DiscoveryFragmentV4.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragmentV4.this.getActivity()).getUid(), "gameEnter");
            GameInfoBean gameInfoBean = new GameInfoBean();
            gameInfoBean.setGame_name(battleGameBean.getGame_name());
            gameInfoBean.setGame_ico(battleGameBean.getGame_ico());
            gameInfoBean.setGame_id(battleGameBean.getGame_id());
            GameRoomListActivity_.W3(DiscoveryFragmentV4.this.getActivity()).c(gameInfoBean).start();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final DiscoveryMainDataBean.BattleGameBean battleGameBean) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon), battleGameBean.getGame_ico());
            baseViewHolder.getView(R.id.selector).setVisibility(8);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiscoveryFragmentV4.e.this.c(battleGameBean, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends BaseQuickAdapter<DiscoveryMainDataBean.ForumListBean, BaseViewHolder> {
        public f(@Nullable List<DiscoveryMainDataBean.ForumListBean> list) {
            super(R.layout.item_end_game_icon, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(DiscoveryMainDataBean.ForumListBean forumListBean, View view) {
            com.papa.sim.statistic.p.l(DiscoveryFragmentV4.this.getActivity()).n2(AccountUtil_.getInstance_(DiscoveryFragmentV4.this.getActivity()).getUid(), "groupEnter");
            IntentUtil.getInstance().goForumGroupActivity(DiscoveryFragmentV4.this.getContext(), forumListBean.getFid(), "discovery");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final DiscoveryMainDataBean.ForumListBean forumListBean) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon), forumListBean.getIcon_src());
            baseViewHolder.getView(R.id.selector).setVisibility(8);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiscoveryFragmentV4.f.this.c(forumListBean, view);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    class g extends BaseQuickAdapter<EndGameNameListBean, BaseViewHolder> {
        public g(@Nullable List<EndGameNameListBean> list) {
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

    /* loaded from: classes3.dex */
    class h extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<EndGameNameListBean> f50898a;

        public h(@NonNull FragmentActivity fragmentActivity, List<EndGameNameListBean> list) {
            super(fragmentActivity);
            this.f50898a = list;
        }

        private EndGameDiscoveryFragment_ a(int i4) {
            FragmentManager parentFragmentManager = DiscoveryFragmentV4.this.getParentFragmentManager();
            Fragment findFragmentByTag = parentFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + i4);
            if (findFragmentByTag == null || !(findFragmentByTag instanceof EndGameDiscoveryFragment_)) {
                return null;
            }
            return (EndGameDiscoveryFragment_) findFragmentByTag;
        }

        private void b(List<EndGameNameListBean> list) {
            this.f50898a = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            return EndGameDiscoveryFragment_.e0().b(this.f50898a.get(i4)).c(i4).build();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f50898a.size();
        }
    }

    /* loaded from: classes3.dex */
    class i {

        /* renamed from: a  reason: collision with root package name */
        int f50900a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f50901b = 0;

        i() {
        }
    }

    private com.wufan.user.service.protobuf.n0 c0(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void f0() {
        this.f50885u = "";
        List<DownloadTask> R = p1.f.K().R(null);
        this.f50886v = R;
        if (R == null || R.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f50886v) {
            if (downloadTask.isIs_fight() == 1) {
                if ("".equals(this.f50885u)) {
                    this.f50885u += downloadTask.getCrc_link_type_val();
                } else {
                    this.f50885u += "," + downloadTask.getCrc_link_type_val();
                }
            }
        }
    }

    private List<DiscoveryHeaderMenuBean> g0(List<DiscoveryHeaderMenuBean> list, int i4) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DiscoveryHeaderMenuBean discoveryHeaderMenuBean : list) {
                if (i4 == discoveryHeaderMenuBean.getModule_id()) {
                    arrayList.add(discoveryHeaderMenuBean);
                }
            }
        }
        return arrayList;
    }

    private int h0() {
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.C;
            if (i5 >= i4) {
                break;
            }
            i iVar = (i) this.D.get(i5);
            if (iVar != null) {
                i6 += iVar.f50900a;
            }
            i5++;
        }
        i iVar2 = (i) this.D.get(i4);
        if (iVar2 == null) {
            iVar2 = new i();
        }
        return i6 - iVar2.f50901b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(View view, View view2, View view3, DiscoveryHeaderMenuBean discoveryHeaderMenuBean, SimpleDraweeView simpleDraweeView, TextView textView, View view4) {
        view.setVisibility(8);
        view2.setVisibility(8);
        view3.setVisibility(8);
        p0(discoveryHeaderMenuBean);
        com.papa.sim.statistic.p.l(this.f50888x).O1(Event.clickEveryFindPageEnter, new Ext().setFrom(String.valueOf(discoveryHeaderMenuBean.getFrom())));
        IntentDateBean intentDataBean = discoveryHeaderMenuBean.getJump_model_dto() != null ? discoveryHeaderMenuBean.getJump_model_dto().getIntentDataBean() : null;
        if (intentDataBean != null && intentDataBean.getObject() == null && discoveryHeaderMenuBean.getJump_model_dto() != null && discoveryHeaderMenuBean.getJump_model_dto().getSub_title() != null) {
            intentDataBean.setObject(discoveryHeaderMenuBean.getJump_model_dto().getSub_title());
        }
        if (!discoveryHeaderMenuBean.isSystem()) {
            if (discoveryHeaderMenuBean.getJump_model_dto() != null) {
                IntentUtil.getInstance().intentActivity(this.f50888x, intentDataBean);
                return;
            }
            return;
        }
        switch (discoveryHeaderMenuBean.getMenu_id()) {
            case 1:
                NewArenaMainActivty_.g1(getActivity()).start();
                com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "enterLobby");
                return;
            case 2:
                simpleDraweeView.setVisibility(8);
                textView.setVisibility(8);
                this.A = discoveryHeaderMenuBean.getSub_title();
                EndGameActivity_.U0(this.f50888x).a(discoveryHeaderMenuBean.getExtData()).start();
                return;
            case 3:
                DiscoveryPaiweiActivity_.v0(this.f50888x).a(discoveryHeaderMenuBean.getExtData()).start();
                return;
            case 4:
                startActivity(new Intent(this.f50888x, SourceShareActivity.class));
                return;
            case 5:
                Intent intent = new Intent();
                intent.setClass(this.f50888x, MGMainActivity_.class);
                intent.setFlags(603979776);
                Bundle bundle = new Bundle();
                bundle.putInt("MainPos", 7);
                bundle.putInt("currTabNumber", 4);
                bundle.putString("currTabTagId", "minigame");
                if (discoveryHeaderMenuBean.getExtData() != null) {
                    bundle.putString("currGameId", discoveryHeaderMenuBean.getExtData());
                }
                intent.putExtras(bundle);
                this.f50888x.startActivity(intent);
                return;
            case 6:
                com.papa.sim.statistic.p.l(getActivity()).n2(AccountUtil_.getInstance_(getActivity()).getUid(), "communityEnter");
                ForumIndexActivity_.i0(getContext()).start();
                return;
            default:
                if (discoveryHeaderMenuBean.getJump_model_dto() != null) {
                    IntentUtil.getInstance().intentActivity(this.f50888x, intentDataBean);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 c02 = c0(getActivity());
        return c02 != null && g2.i(c02.getToken());
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q0(com.join.mgps.dto.ForumBean.ForumPostsBean r24, int r25) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.DiscoveryFragmentV4.q0(com.join.mgps.dto.ForumBean$ForumPostsBean, int):void");
    }

    private void r0(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append("setStatusBarLight: ");
        sb.append(z4);
        View decorView = getActivity().getWindow().getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void W() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        org.greenrobot.eventbus.c.f().t(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f50874j.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.height = com.join.android.app.common.utils.n.v(getContext());
        }
        this.f50874j.setLayoutParams(layoutParams);
        this.f50887w = new com.join.android.app.component.video.c(getContext(), this.f50889y);
        this.f50888x = (MGMainActivity) getActivity();
        this.f50882r = com.join.mgps.rpc.impl.k.n0();
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.part_discovery_header_v4, (ViewGroup) null);
        this.f50881q = inflate;
        this.f50890z = (LinearLayout) inflate.findViewById(R.id.llHeader);
        this.f50872h.setOnClickListener(this);
        this.f50871g.addHeaderView(this.f50881q);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(getActivity(), this.f50887w);
        this.f50879o = forumBaseAdapter;
        forumBaseAdapter.f1(new a());
        this.f50879o.C0(this.f50889y);
        this.f50871g.setAdapter((ListAdapter) this.f50879o);
        this.f50871g.setPreLoadCount(10);
        this.f50871g.setVerticalScrollBarEnabled(false);
        this.f50871g.setPullLoadEnable(new b());
        this.f50871g.setPullRefreshEnable(new c());
        this.f50871g.setOnScrollListener(this);
        e0();
        this.f50879o.I0(new d());
        r0(true);
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.G
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.G
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.G
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.G
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.G
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.DiscoveryFragmentV4.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    public void d0() {
        com.join.android.app.component.video.c cVar = this.f50887w;
        if (cVar != null) {
            cVar.M(1);
            this.f50887w.n(this.f50871g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void downloadView1() {
        IntentUtil.getInstance().goMyGameManagerActivity(getContext());
    }

    public void e0() {
        f0();
        k0();
        List<ForumBean.ForumPostsBean> list = this.B;
        if (list == null || list.size() != 0) {
            return;
        }
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.F.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.G.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            if (this.f50877m == null) {
                this.f50877m = com.join.mgps.rpc.impl.g.A0();
            }
            String uid = AccountUtil_.getInstance_(getActivity()).getUid();
            String token = AccountUtil_.getInstance_(getActivity()).getToken();
            if (this.f50880p) {
                return;
            }
            this.f50880p = true;
            try {
                ForumResponse<List<ForumBean.ForumPostsBean>> W = this.f50877m.W(uid, token, this.f50878n);
                if (W != null && W.getError() == 0) {
                    v0(W.getData());
                } else {
                    u0();
                }
                return;
            } catch (Exception unused) {
                u0();
                return;
            }
        }
        u0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                DiscoveryHeaderArgs discoveryHeaderArgs = new DiscoveryHeaderArgs();
                discoveryHeaderArgs.setUid(String.valueOf(this.f50876l.getAccountData().getUid()));
                discoveryHeaderArgs.setDownloadGameIdList(p1.f.K().B());
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(discoveryHeaderArgs);
                requestModel.setDefault(getContext());
                ResponseModel<DiscoveryHeaderBean> y02 = com.join.mgps.rpc.impl.i.D0().y0(requestModel.makeSign());
                if (y02 != null) {
                    if (y02.getData() != null && y02.getData().getMenu() != null && y02.getData().getMenu().size() > 0) {
                        showMain();
                        x0(y02.getData().getMenu());
                    }
                    t0();
                } else {
                    t0();
                }
                return;
            } catch (Exception unused) {
                t0();
                return;
            }
        }
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.put("uid", this.f50876l.getUid());
                linkedMultiValueMap.put("token", this.f50876l.getToken());
                linkedMultiValueMap.put("game_ids", this.f50885u);
                GameWorldResponse<DiscoveryMainDataBean> j02 = this.f50882r.j0(linkedMultiValueMap);
                if (j02 != null && j02.getData() != null && j02.getError() == 0) {
                    w0(j02.getData());
                } else {
                    t0();
                }
                return;
            } catch (Exception unused) {
                t0();
                return;
            }
        }
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loding_faile() {
        this.f50870f.setVisibility(8);
        this.f50869e.setVisibility(0);
        this.f50868d.setVisibility(8);
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(getActivity())) {
                com.join.mgps.Util.j0.L0(getActivity());
                l2.a(getActivity()).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(getActivity(), i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f50877m.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                o0(i4);
                s0();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void n0(ForumBean.GameInfo gameInfo) {
    }

    void o0(int i4) {
        List<ForumBean.ForumPostsBean> list = this.B;
        if (list == null || list.size() == 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.B.size()) {
                break;
            }
            ForumBean.ForumPostsBean forumPostsBean = this.B.get(i5);
            if (forumPostsBean.getPid() == i4) {
                this.B.get(i5).setPraise(forumPostsBean.is_praise() ? forumPostsBean.getPraise() - 1 : forumPostsBean.getPraise() + 1);
                this.B.get(i5).setIs_praise(!forumPostsBean.is_praise());
            } else {
                i5++;
            }
        }
        this.f50879o.x().clear();
        for (int i6 = 0; i6 < this.B.size(); i6++) {
            q0(this.B.get(i6), i6);
        }
        this.f50879o.notifyDataSetChanged();
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
        com.join.android.app.component.video.c cVar = this.f50887w;
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
            e0();
            com.join.android.app.component.video.c cVar = this.f50887w;
            if (cVar != null) {
                cVar.I();
                return;
            }
            return;
        }
        com.join.android.app.component.video.c cVar2 = this.f50887w;
        if (cVar2 != null) {
            cVar2.H();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.join.android.app.component.video.c cVar;
        if (this.f50888x.getPositionNum() == 4 && (cVar = this.f50887w) != null) {
            cVar.H();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        com.join.android.app.component.video.c cVar;
        super.onResume();
        e0();
        if (this.f50888x.getPositionNum() != 4 || (cVar = this.f50887w) == null) {
            return;
        }
        cVar.I();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("onScrollStateChanged: ");
        sb.append(i4);
        this.f50887w.j(absListView, i4);
        if (i4 == 0 && Fresco.getImagePipeline().H()) {
            Fresco.getImagePipeline().N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(DiscoveryHeaderMenuBean discoveryHeaderMenuBean) {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                DiscoveryHeaderMenuClickArgs discoveryHeaderMenuClickArgs = new DiscoveryHeaderMenuClickArgs();
                discoveryHeaderMenuClickArgs.setUid(String.valueOf(AccountUtil_.getInstance_(this.f50888x).getAccountData().getUid()));
                discoveryHeaderMenuClickArgs.setExtData(discoveryHeaderMenuBean.getExtData());
                discoveryHeaderMenuClickArgs.setMenuId(String.valueOf(discoveryHeaderMenuBean.getMenu_id()));
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(discoveryHeaderMenuClickArgs);
                requestModel.setDefault(getContext());
                com.join.mgps.rpc.impl.i.D0().d(requestModel.makeSign());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        com.join.mgps.Util.b0.f0(getActivity()).m(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        LinearLayout linearLayout = this.f50870f;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
        this.f50869e.setVisibility(8);
        this.f50868d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(getActivity()).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        try {
            this.f50870f.setVisibility(0);
            this.f50869e.setVisibility(8);
            this.f50868d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        XListView2 xListView2 = this.f50871g;
        if (xListView2 != null) {
            xListView2.u();
            this.f50871g.v();
        }
        this.f50880p = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.F.size();
        int size2 = this.G.size();
        CustomerDownloadView customerDownloadView = this.f50875k;
        if (customerDownloadView != null) {
            customerDownloadView.setDownloadGameNum(size);
        }
        if (size2 > 0) {
            CustomerDownloadView customerDownloadView2 = this.f50875k;
            if (customerDownloadView2 != null) {
                customerDownloadView2.d();
                return;
            }
            return;
        }
        CustomerDownloadView customerDownloadView3 = this.f50875k;
        if (customerDownloadView3 != null) {
            customerDownloadView3.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0(List<ForumBean.ForumPostsBean> list) {
        if (list == null) {
            return;
        }
        if (this.f50878n == 1) {
            this.f50879o.x().clear();
            this.B.clear();
        }
        this.B.addAll(list);
        for (int size = this.B.size(); size < this.B.size(); size++) {
            q0(this.B.get(size), size);
        }
        this.f50879o.notifyDataSetChanged();
        if (this.f50871g != null) {
            if (list.size() >= 10 && list.size() != 0) {
                this.f50878n++;
                this.f50871g.u();
                this.f50871g.v();
            } else {
                this.f50871g.setNoMore();
                this.f50871g.v();
            }
        }
        this.f50880p = false;
        this.f50879o.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(DiscoveryMainDataBean discoveryMainDataBean) {
        LinearLayout linearLayout = this.f50870f;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
        this.f50869e.setVisibility(8);
        this.f50868d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(List<DiscoveryHeaderMenuBean> list) {
        this.f50890z.removeAllViews();
        int i4 = 101;
        for (int i5 = 1; i5 <= 4; i5++) {
            List<DiscoveryHeaderMenuBean> g02 = g0(list, i5);
            if (g02 != null && g02.size() > 0) {
                for (final DiscoveryHeaderMenuBean discoveryHeaderMenuBean : g02) {
                    discoveryHeaderMenuBean.setFrom(i4);
                    View inflate = LayoutInflater.from(this.f50888x).inflate(R.layout.layout_discovery_header_include, (ViewGroup) null);
                    final SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.subIcon);
                    final TextView textView = (TextView) inflate.findViewById(R.id.desc);
                    final View findViewById = inflate.findViewById(R.id.redPointTitle);
                    final View findViewById2 = inflate.findViewById(R.id.redPointDesc);
                    final View findViewById3 = inflate.findViewById(R.id.redPointSubIcon);
                    MyImageLoader.n((SimpleDraweeView) inflate.findViewById(R.id.icon), discoveryHeaderMenuBean.getIcon());
                    ((TextView) inflate.findViewById(R.id.title)).setText(discoveryHeaderMenuBean.getTitle());
                    if (!TextUtils.isEmpty(discoveryHeaderMenuBean.getSub_icon()) && (discoveryHeaderMenuBean.getMenu_id() != 2 || !TextUtils.equals(this.A, discoveryHeaderMenuBean.getSub_title()))) {
                        simpleDraweeView.setVisibility(0);
                        MyImageLoader.n(simpleDraweeView, discoveryHeaderMenuBean.getSub_icon());
                    }
                    if (!TextUtils.isEmpty(discoveryHeaderMenuBean.getSub_title()) && (discoveryHeaderMenuBean.getMenu_id() != 2 || !TextUtils.equals(this.A, discoveryHeaderMenuBean.getSub_title()))) {
                        textView.setVisibility(0);
                        textView.setText(discoveryHeaderMenuBean.getSub_title());
                    }
                    if (discoveryHeaderMenuBean.isRedBot() && (discoveryHeaderMenuBean.getMenu_id() != 2 || !TextUtils.equals(this.A, discoveryHeaderMenuBean.getSub_title()))) {
                        if (!TextUtils.isEmpty(discoveryHeaderMenuBean.getSub_icon())) {
                            findViewById3.setVisibility(0);
                        } else if (!TextUtils.isEmpty(discoveryHeaderMenuBean.getSub_title())) {
                            findViewById2.setVisibility(0);
                        } else {
                            findViewById.setVisibility(0);
                        }
                    }
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DiscoveryFragmentV4.this.i0(findViewById, findViewById2, findViewById3, discoveryHeaderMenuBean, simpleDraweeView, textView, view);
                        }
                    });
                    this.f50890z.addView(inflate);
                    i4++;
                }
                this.f50890z.addView(LayoutInflater.from(this.f50888x).inflate(R.layout.layout_discovery_header_divider, (ViewGroup) null));
            }
        }
    }

    boolean y0() {
        if (c0(getActivity()) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(getActivity()).isTourist();
    }
}
