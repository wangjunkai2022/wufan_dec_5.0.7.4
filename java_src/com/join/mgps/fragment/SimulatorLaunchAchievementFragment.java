package com.join.mgps.fragment;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.GameMainActivity4_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSimulatorAchievementListArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.SimulatorAchievementBean;
import com.join.mgps.dto.UnlockBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_simulator_launch_achievement)
/* loaded from: classes3.dex */
public class SimulatorLaunchAchievementFragment extends Fragment {

    /* renamed from: j  reason: collision with root package name */
    public static final int f52985j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f52986k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f52987l = 3;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f52988b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f52989c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f52990d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    NestedScrollView f52991e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RecyclerView f52992f;

    /* renamed from: g  reason: collision with root package name */
    private String f52993g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.mgps.rpc.k f52994h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<UnlockBean> f52995i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends LinearSmoothScroller {
        a(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return super.calculateSpeedPerPixel(displayMetrics);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* loaded from: classes3.dex */
    class b extends BaseQuickAdapter<SimulatorAchievementBean.AchievementInfo, BaseViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f52997a;

        public b(@Nullable List<SimulatorAchievementBean.AchievementInfo> list, boolean z4) {
            super(R.layout.layout_simulator_launch_achievement_item_horizontal, list);
            this.f52997a = z4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, SimulatorAchievementBean.AchievementInfo achievementInfo) {
            StringBuilder sb;
            String str;
            String sb2;
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivAchievement), achievementInfo.getIcon());
            if (!this.f52997a) {
                sb = new StringBuilder();
                sb.append(achievementInfo.getUnlock_date());
                sb.append("\n");
                sb.append(achievementInfo.getUnlock_time());
                str = "解锁";
            } else if (achievementInfo.getUnlock_rate() <= 0) {
                sb2 = "还没人解锁\n快来挑战吧";
                baseViewHolder.setText(R.id.tvAchievementDesc, sb2);
            } else {
                sb = new StringBuilder();
                sb.append(achievementInfo.getUnlock_rate());
                str = "%\n玩家已解锁";
            }
            sb.append(str);
            sb2 = sb.toString();
            baseViewHolder.setText(R.id.tvAchievementDesc, sb2);
        }
    }

    /* loaded from: classes3.dex */
    class c extends BaseQuickAdapter<SimulatorAchievementBean.AchievementInfo, BaseViewHolder> {
        public c(@Nullable List<SimulatorAchievementBean.AchievementInfo> list) {
            super(R.layout.layout_simulator_launch_achievement_item_list, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, SimulatorAchievementBean.AchievementInfo achievementInfo) {
            String str;
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivAchievement), achievementInfo.getIcon());
            BaseViewHolder text = baseViewHolder.setText(R.id.tvAchievementName, achievementInfo.getName()).setText(R.id.tvAchievementDesc, achievementInfo.getCondition());
            if (achievementInfo.getUnlock_rate() > 0) {
                str = achievementInfo.getUnlock_rate() + "%玩家已解锁";
            } else {
                str = "还没人解锁,快来挑战";
            }
            text.setText(R.id.tvAchievementUnlockPercent, str).setText(R.id.tvProgress, achievementInfo.getDone() + net.lingala.zip4j.util.e.F0 + achievementInfo.getTarget()).setGone(R.id.progressGroup, achievementInfo.getTarget() > 1).setProgress(R.id.progressBar, achievementInfo.getDone(), achievementInfo.getTarget());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private List<UnlockBean> f53000a;

        public d(List<UnlockBean> list) {
            this.f53000a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(View view) {
            SimulatorLaunchAchievementFragment.this.Z(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(View view) {
            for (int size = this.f53000a.size() - 1; size >= 0; size--) {
                if (this.f53000a.get(size).getType() == 2) {
                    SimulatorLaunchAchievementFragment.this.Z(size);
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f53000a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return this.f53000a.get(i4).getType();
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02be  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
            /*
                Method dump skipped, instructions count: 713
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.SimulatorLaunchAchievementFragment.d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            RecyclerView.ViewHolder fVar;
            if (i4 == 1) {
                fVar = new f(LayoutInflater.from(SimulatorLaunchAchievementFragment.this.getContext()).inflate(R.layout.layout_simulator_launch_achievement_item_list, viewGroup, false));
            } else if (i4 == 2) {
                fVar = new g(LayoutInflater.from(SimulatorLaunchAchievementFragment.this.getContext()).inflate(R.layout.layout_simulator_launch_achievement_item_time, viewGroup, false));
            } else if (i4 != 3) {
                return null;
            } else {
                fVar = new e(LayoutInflater.from(SimulatorLaunchAchievementFragment.this.getContext()).inflate(R.layout.layout_simulator_launch_achievement_header, viewGroup, false));
            }
            return fVar;
        }
    }

    /* loaded from: classes3.dex */
    class e extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f53002a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f53003b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f53004c;

        /* renamed from: d  reason: collision with root package name */
        private ProgressBar f53005d;

        /* renamed from: e  reason: collision with root package name */
        private LinearLayout f53006e;

        /* renamed from: f  reason: collision with root package name */
        private RecyclerView f53007f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f53008g;

        /* renamed from: h  reason: collision with root package name */
        private LinearLayout f53009h;

        /* renamed from: i  reason: collision with root package name */
        private RecyclerView f53010i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f53011j;

        public e(@NonNull View view) {
            super(view);
            this.f53002a = (TextView) view.findViewById(R.id.tvTips);
            this.f53003b = (LinearLayout) view.findViewById(R.id.llProgress);
            this.f53004c = (TextView) view.findViewById(R.id.tvProgress);
            this.f53005d = (ProgressBar) view.findViewById(R.id.progressBar);
            this.f53006e = (LinearLayout) view.findViewById(R.id.llUnlocked);
            this.f53007f = (RecyclerView) view.findViewById(R.id.rvAchievementUnlocked);
            this.f53008g = (TextView) view.findViewById(R.id.tvUnlockCount);
            this.f53009h = (LinearLayout) view.findViewById(R.id.llLocked);
            this.f53010i = (RecyclerView) view.findViewById(R.id.rvAchievementLocked);
            this.f53011j = (TextView) view.findViewById(R.id.tvLockCount);
        }
    }

    /* loaded from: classes3.dex */
    class f extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f53013a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f53014b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f53015c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f53016d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f53017e;

        /* renamed from: f  reason: collision with root package name */
        private ProgressBar f53018f;

        /* renamed from: g  reason: collision with root package name */
        private Group f53019g;

        /* renamed from: h  reason: collision with root package name */
        private View f53020h;

        /* renamed from: i  reason: collision with root package name */
        private View f53021i;

        /* renamed from: j  reason: collision with root package name */
        private View f53022j;

        /* renamed from: k  reason: collision with root package name */
        private ConstraintLayout f53023k;

        public f(@NonNull View view) {
            super(view);
            this.f53013a = (SimpleDraweeView) view.findViewById(R.id.ivAchievement);
            this.f53014b = (TextView) view.findViewById(R.id.tvAchievementName);
            this.f53015c = (TextView) view.findViewById(R.id.tvAchievementUnlockPercent);
            this.f53016d = (TextView) view.findViewById(R.id.tvAchievementDesc);
            this.f53017e = (TextView) view.findViewById(R.id.tvProgress);
            this.f53018f = (ProgressBar) view.findViewById(R.id.progressBar);
            this.f53019g = (Group) view.findViewById(R.id.progressGroup);
            this.f53020h = view.findViewById(R.id.treeBall);
            this.f53021i = view.findViewById(R.id.treeLineBottom);
            this.f53022j = view.findViewById(R.id.treeLineTop);
            this.f53023k = (ConstraintLayout) view.findViewById(R.id.clContainer);
        }
    }

    /* loaded from: classes3.dex */
    class g extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f53025a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f53026b;

        /* renamed from: c  reason: collision with root package name */
        private CardView f53027c;

        public g(@NonNull View view) {
            super(view);
            this.f53025a = (TextView) view.findViewById(R.id.tvTimeDesc);
            this.f53026b = (ImageView) view.findViewById(R.id.chooseType);
            this.f53027c = (CardView) view.findViewById(R.id.tagView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(int i4) {
        a aVar = new a(getContext());
        aVar.setTargetPosition(i4);
        this.f52992f.getLayoutManager().startSmoothScroll(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void W() {
        if (getArguments() != null) {
            this.f52993g = getArguments().getString("gameId");
        }
        this.f52994h = com.join.mgps.rpc.impl.i.D0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X() {
        try {
            if (com.join.android.app.common.utils.j.j(getContext())) {
                RequestSimulatorAchievementListArgs requestSimulatorAchievementListArgs = new RequestSimulatorAchievementListArgs();
                EMUApkTable n4 = b2.p.o().n(p1.f.K().F(this.f52993g).getPlugin_num());
                requestSimulatorAchievementListArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
                requestSimulatorAchievementListArgs.setPlugVersion(String.valueOf(n4 == null ? 0 : n4.getVerCode()));
                requestSimulatorAchievementListArgs.setGameId(this.f52993g);
                requestSimulatorAchievementListArgs.setToken(AccountUtil_.getInstance_(getContext()).getToken());
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(requestSimulatorAchievementListArgs);
                requestModel.setDefault(getContext());
                ResponseModel<SimulatorAchievementBean> f02 = this.f52994h.f0(requestModel.makeSign());
                if (f02 != null && f02.getData() != null) {
                    a0(f02.getData());
                    return;
                } else {
                    showLodingFailed();
                    return;
                }
            }
            showLodingFailed();
            showTost(getResources().getString(R.string.net_connect_failed));
        } catch (Exception e5) {
            e5.printStackTrace();
            showLodingFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0(SimulatorAchievementBean simulatorAchievementBean) {
        if (simulatorAchievementBean != null && simulatorAchievementBean.getTarget() != 0) {
            showMain();
            ArrayList<UnlockBean> arrayList = new ArrayList<>();
            this.f52995i = arrayList;
            arrayList.add(new UnlockBean(3, simulatorAchievementBean));
            if (simulatorAchievementBean.getHistory_unlock_achievements() != null && simulatorAchievementBean.getHistory_unlock_achievements().size() > 0) {
                simulatorAchievementBean.getHistory_unlock_achievements();
                this.f52995i.add(new UnlockBean(2, "已解锁", false));
                int i4 = 0;
                while (i4 < simulatorAchievementBean.getHistory_unlock_achievements().size()) {
                    List<SimulatorAchievementBean.AchievementInfo> unlockAchievements = simulatorAchievementBean.getHistory_unlock_achievements().get(i4).getUnlockAchievements();
                    int i5 = 0;
                    while (i5 < unlockAchievements.size()) {
                        UnlockBean unlockBean = new UnlockBean(1, unlockAchievements.get(i5), false);
                        unlockBean.setFirst(i4 == 0 && i5 == 0);
                        unlockBean.setLast(i4 >= simulatorAchievementBean.getHistory_unlock_achievements().size() - 1 && i5 >= unlockAchievements.size() - 1);
                        this.f52995i.add(unlockBean);
                        i5++;
                    }
                    i4++;
                }
            }
            if (simulatorAchievementBean.getAll_lock_achievements() != null && simulatorAchievementBean.getAll_lock_achievements().size() > 0) {
                this.f52995i.add(new UnlockBean(2, "未解锁", true));
                int i6 = 0;
                while (i6 < simulatorAchievementBean.getAll_lock_achievements().size()) {
                    UnlockBean unlockBean2 = new UnlockBean(1, simulatorAchievementBean.getAll_lock_achievements().get(i6), true);
                    unlockBean2.setFirst(i6 == 0);
                    unlockBean2.setLast(i6 >= simulatorAchievementBean.getAll_lock_achievements().size() - 1);
                    this.f52995i.add(unlockBean2);
                    i6++;
                }
            }
            this.f52992f.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f52992f.setAdapter(new d(this.f52995i));
            return;
        }
        showEmpty();
        ((GameMainActivity4_) getActivity()).V1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        showLoding();
        X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showEmpty() {
        NestedScrollView nestedScrollView = this.f52991e;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f52989c;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f52988b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f52992f;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f52990d;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        NestedScrollView nestedScrollView = this.f52991e;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f52988b;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52989c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f52992f;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f52990d;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        NestedScrollView nestedScrollView = this.f52991e;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f52989c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52988b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f52992f;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f52990d;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        NestedScrollView nestedScrollView = this.f52991e;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f52989c;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f52988b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f52992f;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f52990d;
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
