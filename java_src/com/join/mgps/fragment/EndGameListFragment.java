package com.join.mgps.fragment;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.c;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.EndGameDetailActivity_;
import com.join.mgps.activity.EndGameLaunchActivity_;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.dto.EndGameBean;
import com.join.mgps.dto.RequestEndGameListArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.fragment.EndGameListFragment;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_end_game_list)
/* loaded from: classes3.dex */
public class EndGameListFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XRecyclerView f51114b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f51115c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f51116d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f51117e;
    @FragmentArg

    /* renamed from: f  reason: collision with root package name */
    String f51118f;
    @FragmentArg

    /* renamed from: g  reason: collision with root package name */
    int f51119g;
    @FragmentArg

    /* renamed from: h  reason: collision with root package name */
    String f51120h;
    @FragmentArg

    /* renamed from: i  reason: collision with root package name */
    String f51121i;

    /* renamed from: l  reason: collision with root package name */
    private com.join.mgps.rpc.k f51124l;

    /* renamed from: m  reason: collision with root package name */
    private Context f51125m;

    /* renamed from: o  reason: collision with root package name */
    private f f51127o;

    /* renamed from: p  reason: collision with root package name */
    private com.join.android.app.component.video.c f51128p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f51129q;

    /* renamed from: r  reason: collision with root package name */
    private Handler f51130r;

    /* renamed from: j  reason: collision with root package name */
    private String f51122j = "EndGameListFragment";

    /* renamed from: k  reason: collision with root package name */
    private int f51123k = 1;

    /* renamed from: n  reason: collision with root package name */
    private List<EndGameBean> f51126n = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    Runnable f51131s = new e();

    /* loaded from: classes3.dex */
    class a implements XRecyclerView.f {
        a() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            EndGameListFragment.W(EndGameListFragment.this);
            EndGameListFragment.this.i0();
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
            EndGameListFragment.this.f51123k = 1;
            EndGameListFragment.this.i0();
        }
    }

    /* loaded from: classes3.dex */
    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0 && EndGameListFragment.this.f51128p != null && EndGameListFragment.this.f51129q) {
                EndGameListFragment.this.f51128p.o(recyclerView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (EndGameListFragment.this.f51128p == null || !EndGameListFragment.this.f51129q) {
                return;
            }
            EndGameListFragment.this.f51128p.o(EndGameListFragment.this.f51114b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (EndGameListFragment.this.f51128p != null) {
                EndGameListFragment.this.f51128p.J(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Ext ext = new Ext();
                ext.setFrom(String.valueOf(EndGameListFragment.this.f51119g));
                Data data = new Data();
                String str = EndGameListFragment.this.f51118f;
                data.setGameId(str == null ? 0L : Long.parseLong(str));
                com.papa.sim.statistic.p.l(EndGameListFragment.this.getContext()).i0(Event.clickEndGameList, ext, data);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends RecyclerView.Adapter<g> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f51138b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ EndGameBean f51139c;

            a(g gVar, EndGameBean endGameBean) {
                this.f51138b = gVar;
                this.f51139c = endGameBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EndGameListFragment.this.f51128p.F(this.f51138b.getLayoutPosition());
                EndGameListFragment.this.m0(this.f51139c.getEndgameId());
            }
        }

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(EndGameBean endGameBean, View view) {
            EndGameDetailActivity_.C0(EndGameListFragment.this.f51125m).b(endGameBean.getGameId()).a(endGameBean.getEndgameId()).d(EndGameListFragment.this.f51120h).start();
            EndGameListFragment.this.m0(endGameBean.getEndgameId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(g gVar, View view) {
            EndGameListFragment endGameListFragment = EndGameListFragment.this;
            endGameListFragment.n0((EndGameBean) endGameListFragment.f51126n.get(gVar.getLayoutPosition()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: e */
        public void onBindViewHolder(@NonNull final g gVar, int i4) {
            double d5;
            String str;
            String str2;
            final EndGameBean endGameBean = (EndGameBean) EndGameListFragment.this.f51126n.get(i4);
            try {
                d5 = Double.parseDouble(endGameBean.getChallengeSucRateStr());
            } catch (Exception e5) {
                e5.printStackTrace();
                d5 = 0.0d;
            }
            gVar.f51153m.setText(endGameBean.getGameName());
            MyImageLoader.n(gVar.f51152l, endGameBean.getGameIcon());
            gVar.f51142b.setText(endGameBean.getTitle());
            TextView textView = gVar.f51141a;
            if (endGameBean.getChallenge() <= 0) {
                str = "还没有人挑战过";
            } else {
                str = EndGameListFragment.this.h0(endGameBean.getChallenge()) + "人挑战过";
            }
            textView.setText(str);
            TextView textView2 = gVar.f51144d;
            if (d5 > 0.0d) {
                str2 = "通过率 " + endGameBean.getChallengeSucRate();
            } else {
                str2 = "等你挑战";
            }
            textView2.setText(str2);
            gVar.f51143c.setVisibility(endGameBean.getWin() == 1 ? 0 : 8);
            gVar.f51149i.setStarCount(endGameBean.getStar());
            gVar.f51150j.setVisibility(endGameBean.getStar() <= 0 ? 4 : 0);
            gVar.f51149i.setVisibility(endGameBean.getStar() <= 0 ? 4 : 0);
            gVar.f51151k.setVisibility(endGameBean.getStar() > 0 ? 0 : 4);
            gVar.f51149i.setFocusable(false);
            gVar.f51149i.setFocusableInTouchMode(false);
            gVar.f51149i.setClickable(false);
            if (g2.i(endGameBean.getVideo())) {
                MyImageLoader.d(gVar.f51147g, R.drawable.banner_normal_icon, endGameBean.getCover());
                gVar.f51147g.setTag(Integer.valueOf(gVar.getLayoutPosition()));
                EndGameListFragment.this.f51128p.e(gVar.getLayoutPosition(), new c.l(gVar.getLayoutPosition(), endGameBean.getVideo(), endGameBean.getCover(), endGameBean.getGameId(), endGameBean.getEndgameId(), EndGameListFragment.this.f51120h), new boolean[0]);
                gVar.f51148h.setOnClickListener(new a(gVar, endGameBean));
            }
            gVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EndGameListFragment.f.this.c(endGameBean, view);
                }
            });
            gVar.f51146f.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EndGameListFragment.f.this.d(gVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: f */
        public g onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new g(LayoutInflater.from(EndGameListFragment.this.f51125m).inflate(R.layout.item_end_game_list, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return EndGameListFragment.this.f51126n.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f51141a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f51142b;

        /* renamed from: c  reason: collision with root package name */
        private final ImageView f51143c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f51144d;

        /* renamed from: e  reason: collision with root package name */
        private final TextView f51145e;

        /* renamed from: f  reason: collision with root package name */
        private final TextView f51146f;

        /* renamed from: g  reason: collision with root package name */
        public SimpleDraweeView f51147g;

        /* renamed from: h  reason: collision with root package name */
        public FrameLayout f51148h;

        /* renamed from: i  reason: collision with root package name */
        public MStarBar f51149i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f51150j;

        /* renamed from: k  reason: collision with root package name */
        public View f51151k;

        /* renamed from: l  reason: collision with root package name */
        public SimpleDraweeView f51152l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f51153m;

        public g(@NonNull View view) {
            super(view);
            this.f51141a = (TextView) view.findViewById(R.id.tvHot);
            this.f51142b = (TextView) view.findViewById(R.id.tvName);
            this.f51143c = (ImageView) view.findViewById(R.id.tvPassTag);
            this.f51144d = (TextView) view.findViewById(R.id.tvPassCount);
            this.f51145e = (TextView) view.findViewById(R.id.tvPassRatio);
            this.f51146f = (TextView) view.findViewById(R.id.btnPlay);
            this.f51147g = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            this.f51148h = (FrameLayout) view.findViewById(R.id.videoContner);
            this.f51149i = (MStarBar) view.findViewById(R.id.mStarBar);
            this.f51150j = (TextView) view.findViewById(R.id.tvHard);
            this.f51151k = view.findViewById(R.id.divider);
            this.f51152l = (SimpleDraweeView) view.findViewById(R.id.gameIcon);
            this.f51153m = (TextView) view.findViewById(R.id.tvGameName);
        }
    }

    static /* synthetic */ int W(EndGameListFragment endGameListFragment) {
        int i4 = endGameListFragment.f51123k;
        endGameListFragment.f51123k = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h0(int i4) {
        if (i4 < 10000) {
            return String.valueOf(i4);
        }
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("##0.0");
        double d5 = i4;
        Double.isNaN(d5);
        sb.append(decimalFormat.format((d5 * 1.0d) / 10000.0d));
        sb.append("万");
        return sb.toString();
    }

    private void l0() {
        if (this.f51130r == null) {
            this.f51130r = new Handler();
        }
        this.f51130r.removeCallbacks(this.f51131s);
        this.f51130r.postDelayed(this.f51131s, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(String str) {
        try {
            Ext ext = new Ext();
            ext.setEndId(str);
            Data data = new Data();
            String str2 = this.f51118f;
            data.setGameId(str2 == null ? 0L : Long.parseLong(str2));
            com.papa.sim.statistic.p.l(getContext()).i0(Event.clickEndGameDetail, ext, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(EndGameBean endGameBean) {
        if (AccountUtil_.getInstance_(this.f51125m).isTourist()) {
            IntentUtil.getInstance().goLogin(this.f51125m);
        } else if (endGameBean == null) {
        } else {
            EndGameLaunchActivity_.G0(getContext()).b(endGameBean.getGameId()).a(endGameBean).d(16).start();
            try {
                Ext ext = new Ext();
                ext.setPosition("1");
                ext.setEndId(endGameBean.getEndgameId());
                Data data = new Data();
                data.setGameId(Long.parseLong(endGameBean.getGameId()));
                com.papa.sim.statistic.p.l(getContext()).i0(Event.gameStartVS, ext, data);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void f0() {
        this.f51125m = getContext();
        this.f51124l = com.join.mgps.rpc.impl.i.D0();
        this.f51114b.setLayoutManager(new LinearLayoutManager(this.f51125m));
        this.f51127o = new f();
        Context context = getContext();
        this.f51128p = new com.join.android.app.component.video.c(context, "EndGameListFragmentVideoHelper" + this.f51118f + this.f51119g, false);
        this.f51114b.setAdapter(this.f51127o);
        this.f51114b.setLoadingListener(new a());
        this.f51114b.addOnScrollListener(new b());
        showLoding();
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        com.join.android.app.component.video.c cVar = this.f51128p;
        if (cVar == null || !this.f51129q) {
            return;
        }
        cVar.o(this.f51114b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        if (com.join.android.app.common.utils.j.j(this.f51125m)) {
            RequestEndGameListArgs requestEndGameListArgs = new RequestEndGameListArgs();
            requestEndGameListArgs.setGameId(this.f51118f);
            requestEndGameListArgs.setUid(AccountUtil_.getInstance_(this.f51125m).getUid());
            requestEndGameListArgs.setType(this.f51119g);
            requestEndGameListArgs.setPage(this.f51123k);
            String str = this.f51121i;
            if (str != null) {
                requestEndGameListArgs.setExt(str);
            }
            requestEndGameListArgs.setDownloadGameIdList(p1.f.K().A());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameListArgs);
            requestModel.setDefault(this.f51125m);
            ResponseModel<List<EndGameBean>> O = this.f51124l.O(requestModel.makeSign());
            if (O != null && O.getCode() == 200) {
                if (O.getData() != null && O.getData().size() > 0) {
                    o0(O.getData());
                    return;
                }
                if (this.f51123k == 1) {
                    showEmpty();
                }
                j0();
                return;
            } else if (this.f51123k == 1) {
                showLodingFailed();
                return;
            } else {
                return;
            }
        }
        showLodingFailed();
        showTost(getResources().getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        XRecyclerView xRecyclerView = this.f51114b;
        if (xRecyclerView != null) {
            xRecyclerView.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void k0() {
        if (this.f51129q) {
            StringBuilder sb = new StringBuilder();
            sb.append("onResume: ");
            sb.append(this);
            p0();
            new Handler().postDelayed(new d(), 700L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(List<EndGameBean> list) {
        XRecyclerView xRecyclerView = this.f51114b;
        if (xRecyclerView != null) {
            xRecyclerView.loadMoreComplete();
        }
        showMain();
        if (this.f51123k == 1) {
            this.f51126n.clear();
        }
        this.f51126n.addAll(list);
        this.f51127o.notifyDataSetChanged();
        g0();
        new Handler().postDelayed(new c(), 1000L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
        com.join.android.app.component.video.c cVar = this.f51128p;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.join.android.app.component.video.c cVar = this.f51128p;
        if (cVar != null) {
            cVar.H();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        k0();
    }

    public void p0() {
        com.join.android.app.component.video.c cVar = this.f51128p;
        if (cVar != null) {
            cVar.o(this.f51114b);
            this.f51128p.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        this.f51123k = 1;
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f51125m);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        this.f51129q = z4;
        if (z4) {
            StringBuilder sb = new StringBuilder();
            sb.append("onresume: ");
            sb.append(this);
            p0();
            l0();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onpause: ");
        sb2.append(this);
        com.join.android.app.component.video.c cVar = this.f51128p;
        if (cVar != null) {
            cVar.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showEmpty() {
        LinearLayout linearLayout = this.f51116d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f51115c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f51114b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f51117e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f51115c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51116d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f51114b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f51117e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f51116d;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51115c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f51114b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f51117e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f51116d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f51115c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f51114b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f51117e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(getActivity()).b(str);
    }
}
