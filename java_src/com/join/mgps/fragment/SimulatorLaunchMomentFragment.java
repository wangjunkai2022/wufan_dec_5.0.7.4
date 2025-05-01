package com.join.mgps.fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.GameMainActivity4_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSimulatorMomentLikeArgs;
import com.join.mgps.dto.RequestSimulatorMomentListArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.SimulatorMomentBean;
import com.join.mgps.fragment.SimulatorLaunchMomentFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_simulator_launch_moment)
/* loaded from: classes3.dex */
public class SimulatorLaunchMomentFragment extends Fragment {

    /* renamed from: p  reason: collision with root package name */
    public static final int f53043p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f53044q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f53045r = 3;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XRecyclerView f53046b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f53047c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f53048d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f53049e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    NestedScrollView f53050f;

    /* renamed from: g  reason: collision with root package name */
    private String f53051g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.mgps.rpc.k f53052h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f53053i;

    /* renamed from: j  reason: collision with root package name */
    private d f53054j;

    /* renamed from: n  reason: collision with root package name */
    private long f53058n;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<e> f53055k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<String> f53056l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private int f53057m = 1;

    /* renamed from: o  reason: collision with root package name */
    private int f53059o = 1;

    /* loaded from: classes3.dex */
    class a implements XRecyclerView.f {
        a() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            SimulatorLaunchMomentFragment.W(SimulatorLaunchMomentFragment.this);
            SimulatorLaunchMomentFragment simulatorLaunchMomentFragment = SimulatorLaunchMomentFragment.this;
            simulatorLaunchMomentFragment.a0(simulatorLaunchMomentFragment.f53057m);
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Comparator<SimulatorMomentBean.UpdatesInfo> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(SimulatorMomentBean.UpdatesInfo updatesInfo, SimulatorMomentBean.UpdatesInfo updatesInfo2) {
            try {
                if (Integer.parseInt(updatesInfo.getDateStr()) > Integer.parseInt(updatesInfo2.getDateStr())) {
                    return -1;
                }
                if (Integer.parseInt(updatesInfo.getDateStr()) < Integer.parseInt(updatesInfo2.getDateStr())) {
                    return 1;
                }
                if (TextUtils.equals(updatesInfo.getUid(), AccountUtil_.getInstance_(SimulatorLaunchMomentFragment.this.getContext()).getUid())) {
                    return TextUtils.equals(updatesInfo2.getUid(), AccountUtil_.getInstance_(SimulatorLaunchMomentFragment.this.getContext()).getUid()) ? 0 : -1;
                }
                return 0;
            } catch (Exception e5) {
                e5.printStackTrace();
                return 0;
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends BaseQuickAdapter<SimulatorMomentBean.Achievement, BaseViewHolder> {
        public c(@Nullable List<SimulatorMomentBean.Achievement> list) {
            super(R.layout.layout_simulator_achievement_list_item, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, SimulatorMomentBean.Achievement achievement) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivAchievement), achievement.getIcon());
            baseViewHolder.setText(R.id.tvAchievement, achievement.getName());
            baseViewHolder.setText(R.id.tvUnlockPercent, achievement.getUnlockRate());
        }

        @Override // com.join.mgps.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private List<e> f53063a;

        public d(List<e> list) {
            this.f53063a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(SimulatorMomentBean.UpdatesInfo updatesInfo, e eVar, int i4, View view) {
            updatesInfo.setExpand(!updatesInfo.isExpand());
            eVar.l(updatesInfo);
            this.f53063a.set(i4, eVar);
            notifyItemChanged(i4);
            if (updatesInfo.isExpand()) {
                return;
            }
            SimulatorLaunchMomentFragment.this.f53046b.smoothScrollToPosition(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(SimulatorMomentBean.UpdatesInfo updatesInfo, int i4, View view) {
            if (updatesInfo.isPraised()) {
                SimulatorLaunchMomentFragment.this.d0(i4);
            } else {
                SimulatorLaunchMomentFragment.this.c0(i4);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(View view) {
            if (SimulatorLaunchMomentFragment.this.getContext() instanceof GameMainActivity4_) {
                ((GameMainActivity4_) SimulatorLaunchMomentFragment.this.getContext()).d2();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return SimulatorLaunchMomentFragment.this.f53055k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return this.f53063a.get(i4).getType();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i4) {
            int itemViewType = getItemViewType(i4);
            final e eVar = this.f53063a.get(i4);
            if (itemViewType == 1) {
                f fVar = (f) viewHolder;
                List<SimulatorMomentBean.BasicInfo> b5 = eVar.b();
                if (b5 != null && b5.size() > 0) {
                    fVar.itemView.setVisibility(0);
                    if (b5.size() > 0) {
                        fVar.f53072a.setText(b5.get(0).getTitle());
                        fVar.f53073b.setText(TextUtils.isEmpty(b5.get(0).getDesc()) ? "暂无统计" : b5.get(0).getDesc());
                    }
                    if (b5.size() > 1) {
                        fVar.f53074c.setText(b5.get(1).getTitle());
                        fVar.f53075d.setText(TextUtils.isEmpty(b5.get(1).getDesc()) ? "暂无统计" : b5.get(1).getDesc());
                    }
                    if (b5.size() > 2) {
                        fVar.f53076e.setText(b5.get(2).getTitle());
                        fVar.f53077f.setText(TextUtils.isEmpty(b5.get(2).getDesc()) ? "0人" : b5.get(2).getDesc());
                    }
                    fVar.f53078g.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.h1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SimulatorLaunchMomentFragment.d.this.lambda$onBindViewHolder$0(view);
                        }
                    });
                    return;
                }
                fVar.itemView.setVisibility(8);
            } else if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                h hVar = (h) viewHolder;
                hVar.f53091a.setText(eVar.c());
                hVar.f53092b.setVisibility(8);
                hVar.f53093c.setBackgroundResource(R.drawable.shape_oval_achievement_tree_yellow);
                hVar.f53095e.setVisibility(eVar.e() ? 8 : 0);
                hVar.f53094d.setVisibility(eVar.f() ? 8 : 0);
            } else {
                g gVar = (g) viewHolder;
                final SimulatorMomentBean.UpdatesInfo d5 = eVar.d();
                MyImageLoader.h(gVar.f53080a, d5.getAvatar());
                gVar.f53081b.setText(d5.getNickname());
                if (d5.getAchievements() == null || d5.getAchievements().size() <= 0) {
                    gVar.f53082c.setVisibility(0);
                    gVar.f53083d.setVisibility(8);
                    gVar.f53082c.setText(d5.getDescribe());
                } else {
                    gVar.f53082c.setVisibility(8);
                    gVar.f53083d.setVisibility(0);
                    gVar.f53084e.setText(d5.getDescribe());
                    gVar.f53087h.setHasFixedSize(true);
                    gVar.f53087h.setNestedScrollingEnabled(false);
                    gVar.f53087h.setLayoutManager(new LinearLayoutManager(SimulatorLaunchMomentFragment.this.getContext()));
                    List<SimulatorMomentBean.Achievement> achievements = d5.getAchievements();
                    new ArrayList();
                    c cVar = new c((achievements.size() <= 3 || d5.isExpand()) ? achievements : achievements.subList(0, 3));
                    cVar.setHasStableIds(true);
                    gVar.f53087h.setItemAnimator(null);
                    if (achievements.size() > 3) {
                        View inflate = LayoutInflater.from(SimulatorLaunchMomentFragment.this.getContext()).inflate(R.layout.item_simulator_moment_footer, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.tvFooter);
                        textView.setText(d5.isExpand() ? "收起" : "查看全部");
                        textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.j1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SimulatorLaunchMomentFragment.d.this.d(d5, eVar, i4, view);
                            }
                        });
                        cVar.addFooterView(inflate);
                    }
                    gVar.f53087h.setAdapter(cVar);
                }
                gVar.f53085f.setVisibility(d5.isSupportPraise() ? 0 : 8);
                gVar.f53086g.setVisibility(d5.isSupportPraise() ? 0 : 8);
                gVar.f53085f.setImageResource(d5.isPraised() ? R.drawable.like_blue : R.drawable.like_grey);
                gVar.f53086g.setText(String.valueOf(d5.getPraiseCount()));
                gVar.f53088i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.i1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SimulatorLaunchMomentFragment.d.this.e(d5, i4, view);
                    }
                });
                gVar.f53089j.setVisibility(eVar.f() ? 8 : 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            RecyclerView.ViewHolder fVar;
            if (i4 == 1) {
                fVar = new f(LayoutInflater.from(SimulatorLaunchMomentFragment.this.getContext()).inflate(R.layout.layout_simulator_launch_moment_item_header, viewGroup, false));
            } else if (i4 == 2) {
                fVar = new g(LayoutInflater.from(SimulatorLaunchMomentFragment.this.getContext()).inflate(R.layout.layout_simulator_launch_moment_item_list, viewGroup, false));
            } else if (i4 != 3) {
                return null;
            } else {
                fVar = new h(LayoutInflater.from(SimulatorLaunchMomentFragment.this.getContext()).inflate(R.layout.layout_simulator_launch_moment_item_time, viewGroup, false));
            }
            return fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        private int f53065a;

        /* renamed from: b  reason: collision with root package name */
        private List<SimulatorMomentBean.BasicInfo> f53066b;

        /* renamed from: c  reason: collision with root package name */
        private SimulatorMomentBean.UpdatesInfo f53067c;

        /* renamed from: d  reason: collision with root package name */
        private String f53068d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f53069e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f53070f;

        public e(int i4, List<SimulatorMomentBean.BasicInfo> list, SimulatorMomentBean.UpdatesInfo updatesInfo, String str) {
            this.f53065a = i4;
            this.f53066b = list;
            this.f53067c = updatesInfo;
            this.f53068d = str;
        }

        public List<SimulatorMomentBean.BasicInfo> b() {
            return this.f53066b;
        }

        public String c() {
            return this.f53068d;
        }

        public SimulatorMomentBean.UpdatesInfo d() {
            return this.f53067c;
        }

        public boolean e() {
            return this.f53069e;
        }

        public boolean f() {
            return this.f53070f;
        }

        public void g(List<SimulatorMomentBean.BasicInfo> list) {
            this.f53066b = list;
        }

        public int getType() {
            return this.f53065a;
        }

        public void h(boolean z4) {
            this.f53069e = z4;
        }

        public void i(boolean z4) {
            this.f53070f = z4;
        }

        public void j(String str) {
            this.f53068d = str;
        }

        public void k(int i4) {
            this.f53065a = i4;
        }

        public void l(SimulatorMomentBean.UpdatesInfo updatesInfo) {
            this.f53067c = updatesInfo;
        }
    }

    /* loaded from: classes3.dex */
    class f extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f53072a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f53073b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f53074c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f53075d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f53076e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f53077f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f53078g;

        public f(@NonNull View view) {
            super(view);
            this.f53072a = (TextView) view.findViewById(R.id.tvTitle1);
            this.f53073b = (TextView) view.findViewById(R.id.tvTotalPlayTime);
            this.f53074c = (TextView) view.findViewById(R.id.tvTitle2);
            this.f53075d = (TextView) view.findViewById(R.id.tvLastPlayTime);
            this.f53076e = (TextView) view.findViewById(R.id.tvTitle3);
            this.f53077f = (TextView) view.findViewById(R.id.tvOnlinePlayerCount);
            this.f53078g = (TextView) view.findViewById(R.id.tvBattle);
        }
    }

    /* loaded from: classes3.dex */
    class g extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f53080a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f53081b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f53082c;

        /* renamed from: d  reason: collision with root package name */
        private Group f53083d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f53084e;

        /* renamed from: f  reason: collision with root package name */
        private ImageView f53085f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f53086g;

        /* renamed from: h  reason: collision with root package name */
        private RecyclerView f53087h;

        /* renamed from: i  reason: collision with root package name */
        private LinearLayout f53088i;

        /* renamed from: j  reason: collision with root package name */
        private View f53089j;

        public g(@NonNull View view) {
            super(view);
            this.f53080a = (SimpleDraweeView) view.findViewById(R.id.ivAvatar);
            this.f53081b = (TextView) view.findViewById(R.id.tvName);
            this.f53082c = (TextView) view.findViewById(R.id.tvDesc);
            this.f53083d = (Group) view.findViewById(R.id.groupAchievement);
            this.f53084e = (TextView) view.findViewById(R.id.tvAchievementTitle);
            this.f53085f = (ImageView) view.findViewById(R.id.ivLike);
            this.f53086g = (TextView) view.findViewById(R.id.tvLikeCount);
            this.f53087h = (RecyclerView) view.findViewById(R.id.rvAchievement);
            this.f53088i = (LinearLayout) view.findViewById(R.id.llLike);
            this.f53089j = view.findViewById(R.id.treeLine);
        }
    }

    /* loaded from: classes3.dex */
    class h extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f53091a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f53092b;

        /* renamed from: c  reason: collision with root package name */
        private View f53093c;

        /* renamed from: d  reason: collision with root package name */
        private View f53094d;

        /* renamed from: e  reason: collision with root package name */
        private View f53095e;

        public h(@NonNull View view) {
            super(view);
            this.f53091a = (TextView) view.findViewById(R.id.tvTimeDesc);
            this.f53092b = (ImageView) view.findViewById(R.id.chooseType);
            this.f53093c = view.findViewById(R.id.treeBall);
            this.f53094d = view.findViewById(R.id.treeLineBottom);
            this.f53095e = view.findViewById(R.id.treeLineTop);
        }
    }

    static /* synthetic */ int W(SimulatorLaunchMomentFragment simulatorLaunchMomentFragment) {
        int i4 = simulatorLaunchMomentFragment.f53057m;
        simulatorLaunchMomentFragment.f53057m = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void Z() {
        if (getArguments() != null) {
            this.f53051g = getArguments().getString("gameId");
        }
        this.f53052h = com.join.mgps.rpc.impl.i.D0();
        this.f53046b.setLayoutManager(new LinearLayoutManager(getContext()));
        d dVar = new d(this.f53055k);
        this.f53054j = dVar;
        dVar.setHasStableIds(true);
        this.f53046b.setAdapter(this.f53054j);
        this.f53046b.setItemAnimator(null);
        this.f53046b.setLoadingListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a0(int i4) {
        try {
            try {
                if (!this.f53053i && com.join.android.app.common.utils.j.j(getContext())) {
                    this.f53053i = true;
                    RequestSimulatorMomentListArgs requestSimulatorMomentListArgs = new RequestSimulatorMomentListArgs();
                    EMUApkTable n4 = b2.p.o().n(p1.f.K().F(this.f53051g).getPlugin_num());
                    requestSimulatorMomentListArgs.setPage(i4);
                    requestSimulatorMomentListArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
                    requestSimulatorMomentListArgs.setSelectCondition(this.f53059o);
                    requestSimulatorMomentListArgs.setGameId(this.f53051g);
                    requestSimulatorMomentListArgs.setPlugVersion(String.valueOf(n4 == null ? 0 : n4.getVerCode()));
                    RequestModel requestModel = new RequestModel();
                    requestModel.setArgs(requestSimulatorMomentListArgs);
                    requestModel.setDefault(getContext());
                    ResponseModel<SimulatorMomentBean> i5 = this.f53052h.i(requestModel.makeSign());
                    if (i5 != null && i5.getData() != null) {
                        h0(i5.getData(), i4);
                    } else if (i4 == 1) {
                        showLodingFailed();
                    }
                    this.f53053i = false;
                } else {
                    if (i4 == 1) {
                        showLodingFailed();
                    }
                    showTost(getResources().getString(R.string.net_connect_failed));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                this.f53053i = false;
                if (i4 == 1) {
                    showLodingFailed();
                }
            }
        } finally {
            g0();
        }
    }

    public int b0() {
        return this.f53059o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0(int i4) {
        try {
            if (com.join.android.app.common.utils.j.j(getContext())) {
                if (System.currentTimeMillis() - this.f53058n < 1000) {
                    return;
                }
                this.f53058n = System.currentTimeMillis();
                e eVar = this.f53055k.get(i4);
                SimulatorMomentBean.UpdatesInfo d5 = eVar.d();
                RequestSimulatorMomentLikeArgs requestSimulatorMomentLikeArgs = new RequestSimulatorMomentLikeArgs();
                requestSimulatorMomentLikeArgs.setDs(d5.getDateStr());
                requestSimulatorMomentLikeArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
                requestSimulatorMomentLikeArgs.setRuid(d5.getUid());
                requestSimulatorMomentLikeArgs.setGameId(this.f53051g);
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(requestSimulatorMomentLikeArgs);
                requestModel.setDefault(getContext());
                ResponseModel<Boolean> p02 = this.f53052h.p0(requestModel.makeSign());
                if (p02 != null && p02.getData() != null) {
                    d5.setPraised(true);
                    d5.setPraiseCount(d5.getPraiseCount() + 1);
                    eVar.l(d5);
                    this.f53055k.set(i4, eVar);
                    e0(i4);
                }
            } else {
                showTost(getResources().getString(R.string.net_connect_failed));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0(int i4) {
        try {
            if (com.join.android.app.common.utils.j.j(getContext())) {
                if (System.currentTimeMillis() - this.f53058n < 1000) {
                    return;
                }
                this.f53058n = System.currentTimeMillis();
                e eVar = this.f53055k.get(i4);
                SimulatorMomentBean.UpdatesInfo d5 = eVar.d();
                RequestSimulatorMomentLikeArgs requestSimulatorMomentLikeArgs = new RequestSimulatorMomentLikeArgs();
                requestSimulatorMomentLikeArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
                requestSimulatorMomentLikeArgs.setPraiseId(d5.getPraiseId());
                requestSimulatorMomentLikeArgs.setRuid(d5.getUid());
                requestSimulatorMomentLikeArgs.setGameId(this.f53051g);
                requestSimulatorMomentLikeArgs.setDs(d5.getDateStr());
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(requestSimulatorMomentLikeArgs);
                requestModel.setDefault(getContext());
                ResponseModel<Boolean> u4 = this.f53052h.u(requestModel.makeSign());
                if (u4 != null && u4.getData() != null) {
                    d5.setPraised(false);
                    d5.setPraiseCount(Math.max(d5.getPraiseCount() - 1, 0));
                    eVar.l(d5);
                    this.f53055k.set(i4, eVar);
                    e0(i4);
                }
            } else {
                showTost(getResources().getString(R.string.net_connect_failed));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(int i4) {
        d dVar = this.f53054j;
        if (dVar != null) {
            dVar.notifyItemChanged(i4);
        }
    }

    public void f0(int i4) {
        if (this.f53059o == i4) {
            return;
        }
        this.f53059o = i4;
        this.f53046b.reset();
        this.f53057m = 1;
        a0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        XRecyclerView xRecyclerView = this.f53046b;
        if (xRecyclerView != null) {
            xRecyclerView.stopRefresh();
            this.f53046b.stopLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(SimulatorMomentBean simulatorMomentBean, int i4) {
        if (simulatorMomentBean == null) {
            return;
        }
        if (i4 == 1 && (simulatorMomentBean.getUpdatesInfos() == null || simulatorMomentBean.getUpdatesInfos().size() <= 0)) {
            showEmpty();
            return;
        }
        showMain();
        if (simulatorMomentBean.getUpdatesInfos() == null || simulatorMomentBean.getUpdatesInfos().size() <= 0) {
            this.f53046b.setNoMore();
        }
        if (getActivity() != null && (getActivity() instanceof GameMainActivity4_)) {
            ((GameMainActivity4_) getActivity()).Z1(simulatorMomentBean.getBasicInfos());
        }
        if (i4 == 1) {
            this.f53055k.clear();
            this.f53056l.clear();
            this.f53055k.add(new e(1, simulatorMomentBean.getBasicInfos(), null, null));
        }
        if (simulatorMomentBean.getUpdatesInfos() != null && simulatorMomentBean.getUpdatesInfos().size() > 0) {
            if (i4 == 1) {
                Collections.sort(simulatorMomentBean.getUpdatesInfos(), new b());
            }
            int i5 = 0;
            while (i5 < simulatorMomentBean.getUpdatesInfos().size()) {
                SimulatorMomentBean.UpdatesInfo updatesInfo = simulatorMomentBean.getUpdatesInfos().get(i5);
                if (!this.f53056l.contains(updatesInfo.getFeDate())) {
                    e eVar = new e(3, null, null, updatesInfo.getFeDate());
                    eVar.h(i5 == 0);
                    this.f53055k.add(eVar);
                    this.f53056l.add(updatesInfo.getFeDate());
                }
                this.f53055k.add(new e(2, null, updatesInfo, null));
                i5++;
            }
        }
        if (simulatorMomentBean.getUpdatesInfos() == null || simulatorMomentBean.getUpdatesInfos().size() <= 0) {
            boolean z4 = false;
            for (int size = this.f53055k.size() - 1; size >= 0; size--) {
                if (this.f53055k.get(size).f53065a != 2 || z4) {
                    if (this.f53055k.get(size).f53065a == 3 && !z4) {
                        this.f53055k.get(size).i(true);
                        z4 = true;
                    } else {
                        this.f53055k.get(size).i(false);
                    }
                } else {
                    this.f53055k.get(size).i(true);
                }
            }
        }
        this.f53054j.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f53057m = 1;
        this.f53046b.reset();
        showLoding();
        a0(this.f53057m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        a0(this.f53057m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showEmpty() {
        NestedScrollView nestedScrollView = this.f53050f;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f53048d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f53047c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f53046b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f53049e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        NestedScrollView nestedScrollView = this.f53050f;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f53047c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f53048d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f53046b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f53049e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        NestedScrollView nestedScrollView = this.f53050f;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f53048d;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f53047c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f53046b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f53049e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        NestedScrollView nestedScrollView = this.f53050f;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f53048d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f53047c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f53046b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f53049e;
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
