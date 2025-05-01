package com.join.mgps.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.Gson;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.EndGameListBean;
import com.join.mgps.dto.EndGameNameBean;
import com.join.mgps.dto.EndGameNameListBean;
import com.join.mgps.dto.EndGameTypeBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.RequestEndGameAdArgs;
import com.join.mgps.dto.RequestEndGameListArgs;
import com.join.mgps.dto.RequestEndGameNameListArgs;
import com.join.mgps.dto.RequestEndGameTypeArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.fragment.EndGameSelectFragment;
import com.join.mgps.fragment.EndGameSelectFragment_;
import com.join.mgps.fragment.EndGameViewpagerListFragment_;
import com.join.mgps.pref.PrefDef_;
import com.papa91.arc.interfaces.DialogListenerWrap;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_end_game)
/* loaded from: classes4.dex */
public class EndGameActivity extends BaseAppCompatActivity {
    private h A;
    private EndGameNameListBean B;
    private CommonGameInfoBean C;
    com.join.mgps.dialog.e0 D;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f30067b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f30068c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ViewPager2 f30069d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    View f30070e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ConstraintLayout f30071f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RecyclerView f30072g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f30073h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RecyclerView f30074i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ViewPager2 f30075j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f30076k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f30077l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f30078m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    String f30079n;
    @Pref

    /* renamed from: o  reason: collision with root package name */
    PrefDef_ f30080o;

    /* renamed from: p  reason: collision with root package name */
    GameMainV4DataBean.EndGameConfigBean f30081p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f30082q;

    /* renamed from: r  reason: collision with root package name */
    private Activity f30083r;

    /* renamed from: s  reason: collision with root package name */
    private i f30084s;

    /* renamed from: t  reason: collision with root package name */
    private com.join.mgps.rpc.k f30085t;

    /* renamed from: u  reason: collision with root package name */
    private int f30086u = 1;

    /* renamed from: v  reason: collision with root package name */
    private int f30087v = 1;

    /* renamed from: w  reason: collision with root package name */
    private List<EndGameNameListBean> f30088w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private List<EndGameTypeBean> f30089x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private j f30090y;

    /* renamed from: z  reason: collision with root package name */
    private k f30091z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements BaseQuickAdapter.l {
        a() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.l
        public void onLoadMoreRequested() {
            EndGameActivity.h0(EndGameActivity.this);
            EndGameActivity endGameActivity = EndGameActivity.this;
            endGameActivity.w0(endGameActivity.f30086u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements BaseQuickAdapter.j {
        b() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            if (EndGameActivity.this.f30082q) {
                EndGameActivity.this.y0();
            }
            int i5 = 0;
            while (i5 < EndGameActivity.this.f30088w.size()) {
                ((EndGameNameListBean) EndGameActivity.this.f30088w.get(i5)).setSelected(i5 == i4);
                i5++;
            }
            EndGameActivity.this.f30084s.replaceData(EndGameActivity.this.f30088w);
            EndGameActivity endGameActivity = EndGameActivity.this;
            endGameActivity.B = (EndGameNameListBean) endGameActivity.f30088w.get(i4);
            ViewPager2 viewPager2 = EndGameActivity.this.f30069d;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i4, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f30094a;

        c(UniversalItemDecoration.a aVar) {
            this.f30094a = aVar;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return this.f30094a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements BaseQuickAdapter.l {
        d() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.l
        public void onLoadMoreRequested() {
            EndGameActivity.o0(EndGameActivity.this);
            EndGameActivity endGameActivity = EndGameActivity.this;
            endGameActivity.x0(endGameActivity.f30087v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f30097a;

        e(UniversalItemDecoration.a aVar) {
            this.f30097a = aVar;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return this.f30097a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends ViewPager2.OnPageChangeCallback {
        f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i4) {
            EndGameSelectFragment_ c5;
            int i5 = 0;
            while (i5 < EndGameActivity.this.f30089x.size()) {
                ((EndGameTypeBean) EndGameActivity.this.f30089x.get(i5)).setSelected(i5 == i4);
                i5++;
            }
            if (EndGameActivity.this.f30090y != null) {
                EndGameActivity.this.f30090y.replaceData(EndGameActivity.this.f30089x);
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) EndGameActivity.this.f30074i.getLayoutManager();
            if (linearLayoutManager != null) {
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (i4 < linearLayoutManager.findFirstCompletelyVisibleItemPosition() || i4 > findLastCompletelyVisibleItemPosition) {
                    EndGameActivity.this.f30074i.smoothScrollToPosition(i4);
                }
            }
            if (EndGameActivity.this.f30091z == null || (c5 = EndGameActivity.this.f30091z.c(i4)) == null || EndGameActivity.this.B == null) {
                return;
            }
            c5.d0(EndGameActivity.this.B.getGameId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends DialogListenerWrap {
        g() {
        }

        @Override // com.papa91.arc.interfaces.DialogListenerWrap, com.papa91.arc.interfaces.IDialogListener
        public void onConfirm() {
            CreateEndGameActivity_.D0(EndGameActivity.this).a(EndGameActivity.this.f30081p).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<EndGameNameListBean> f30101a;

        public h(@NonNull FragmentActivity fragmentActivity, List<EndGameNameListBean> list) {
            super(fragmentActivity);
            this.f30101a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EndGameViewpagerListFragment_ c(int i4) {
            FragmentManager supportFragmentManager = EndGameActivity.this.getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + getItemId(i4));
            if (findFragmentByTag == null || !(findFragmentByTag instanceof EndGameViewpagerListFragment_)) {
                return null;
            }
            return (EndGameViewpagerListFragment_) findFragmentByTag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(List<EndGameNameListBean> list) {
            this.f30101a = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            return EndGameViewpagerListFragment_.c0().c(this.f30101a.get(i4).getGameId()).b(EndGameActivity.this.f30079n).build();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f30101a.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return i4 + 1000;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends BaseQuickAdapter<EndGameNameListBean, BaseViewHolder> {
        public i(@Nullable List<EndGameNameListBean> list) {
            super(R.layout.item_end_game_icon, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, EndGameNameListBean endGameNameListBean) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon), endGameNameListBean.getGameIcon());
            baseViewHolder.getView(R.id.selector).setSelected(endGameNameListBean.isSelected());
            if (baseViewHolder.getLayoutPosition() == 0) {
                ((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon)).setImageURI(Uri.parse("res:///2131232330"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j extends BaseQuickAdapter<EndGameTypeBean, BaseViewHolder> {
        public j(@Nullable List<EndGameTypeBean> list) {
            super(R.layout.item_end_game_select_tag, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, EndGameTypeBean endGameTypeBean) {
            baseViewHolder.setText(R.id.tvTag, endGameTypeBean.getTypeName());
            baseViewHolder.getView(R.id.tvTag).setSelected(endGameTypeBean.isSelected());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<EndGameTypeBean> f30105a;

        public k(@NonNull FragmentActivity fragmentActivity, List<EndGameTypeBean> list) {
            super(fragmentActivity);
            this.f30105a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EndGameSelectFragment_ c(int i4) {
            FragmentManager supportFragmentManager = EndGameActivity.this.getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + getItemId(i4));
            if (findFragmentByTag == null || !(findFragmentByTag instanceof EndGameSelectFragment_)) {
                return null;
            }
            return (EndGameSelectFragment_) findFragmentByTag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(List<EndGameTypeBean> list) {
            this.f30105a = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            EndGameSelectFragment build = EndGameSelectFragment_.m0().b(this.f30105a.get(i4).getModelType()).build();
            if (EndGameActivity.this.B != null) {
                build.d0(EndGameActivity.this.B.getGameId());
            }
            return build;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f30105a.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return i4 + 100;
        }
    }

    static /* synthetic */ int h0(EndGameActivity endGameActivity) {
        int i4 = endGameActivity.f30086u;
        endGameActivity.f30086u = i4 + 1;
        return i4;
    }

    static /* synthetic */ int o0(EndGameActivity endGameActivity) {
        int i4 = endGameActivity.f30087v;
        endGameActivity.f30087v = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        int i5 = 0;
        while (i5 < this.f30089x.size()) {
            this.f30089x.get(i5).setSelected(i5 == i4);
            i5++;
        }
        j jVar = this.f30090y;
        if (jVar != null) {
            jVar.replaceData(this.f30089x);
        }
        this.f30075j.setCurrentItem(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        i iVar = this.f30084s;
        if (iVar != null) {
            iVar.loadMoreComplete();
            this.f30084s.loadMoreEnd(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        j jVar = this.f30090y;
        if (jVar != null) {
            jVar.loadMoreComplete();
            this.f30090y.loadMoreEnd(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
        ViewPager2 viewPager2;
        EndGameViewpagerListFragment_ c5;
        h hVar = this.A;
        if (hVar == null || (viewPager2 = this.f30069d) == null || (c5 = hVar.c(viewPager2.getCurrentItem())) == null) {
            return;
        }
        c5.b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        LinearLayout linearLayout = this.f30077l;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f30076k;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0(EndGameListBean endGameListBean, int i4) {
        if (this.f30089x == null) {
            this.f30089x = new ArrayList();
        }
        this.f30089x.clear();
        this.f30089x.addAll(endGameListBean.getTypeList());
        j jVar = this.f30090y;
        if (jVar != null) {
            jVar.loadMoreComplete();
            this.f30090y.replaceData(this.f30089x);
        }
        k kVar = this.f30091z;
        if (kVar != null) {
            kVar.d(this.f30089x);
            this.f30091z.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0(List<EndGameNameListBean> list, int i4) {
        E0();
        if (this.f30088w == null) {
            this.f30088w = new ArrayList();
        }
        this.f30088w.addAll(list);
        if (i4 == 1 && TextUtils.isEmpty(this.f30078m)) {
            this.f30088w.get(0).setSelected(true);
        }
        h hVar = this.A;
        if (hVar != null) {
            hVar.d(this.f30088w);
            this.A.notifyDataSetChanged();
        }
        if (i4 == 1) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.f30088w.size()) {
                    break;
                } else if (TextUtils.equals(this.f30088w.get(i5).getGameId(), this.f30078m)) {
                    this.f30088w.get(i5).setSelected(true);
                    this.f30069d.setCurrentItem(i5, false);
                    break;
                } else {
                    i5++;
                }
            }
        }
        i iVar = this.f30084s;
        if (iVar != null) {
            iVar.loadMoreComplete();
            this.f30084s.replaceData(this.f30088w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f30083r = this;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        String d5 = this.f30080o.endGameConfig().d();
        if (com.join.mgps.Util.g2.i(d5)) {
            this.f30081p = (GameMainV4DataBean.EndGameConfigBean) JsonMapper.getInstance().fromJson(d5, GameMainV4DataBean.EndGameConfigBean.class);
        } else {
            getEndGameConfig();
        }
        GameMainV4DataBean.EndGameConfigBean endGameConfigBean = this.f30081p;
        if (endGameConfigBean != null && endGameConfigBean.getEndgame_challenge_level() != null) {
            new Gson();
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f30068c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = com.join.android.app.common.utils.n.v(this.f30083r);
        this.f30068c.setLayoutParams(layoutParams);
        this.f30073h.setImageResource(this.f30082q ? R.drawable.ic_menu_endgame_expand : R.drawable.ic_menu_endgame_shrink);
        this.f30085t = com.join.mgps.rpc.impl.i.D0();
        GameMainV4DataBean.EndGameConfigBean endGameConfigBean2 = this.f30081p;
        if (endGameConfigBean2 != null) {
            if (endGameConfigBean2.isEndgame_creation_switch()) {
                this.f30067b.setVisibility(0);
            } else {
                this.f30067b.setVisibility(8);
            }
        } else {
            this.f30067b.setVisibility(8);
        }
        i iVar = new i(this.f30088w);
        this.f30084s = iVar;
        iVar.setOnLoadMoreListener(new a(), this.f30072g);
        this.f30084s.setOnItemClickListener(new b());
        this.f30084s.setLoadMoreView(new com.join.mgps.base.c());
        this.f30072g.setLayoutManager(new LinearLayoutManager(this.f30083r, 0, false));
        this.f30072g.setAdapter(this.f30084s);
        UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46235b = (int) getResources().getDimension(R.dimen.wdp16);
        this.f30072g.addItemDecoration(new c(aVar));
        j jVar = new j(this.f30089x);
        this.f30090y = jVar;
        jVar.setOnLoadMoreListener(new d(), this.f30074i);
        this.f30090y.setLoadMoreView(new com.join.mgps.base.c());
        this.f30074i.setLayoutManager(new LinearLayoutManager(this.f30083r, 0, false));
        this.f30074i.setAdapter(this.f30090y);
        UniversalItemDecoration.a aVar2 = new UniversalItemDecoration.a();
        aVar2.f46233f = 0;
        aVar2.f46235b = (int) getResources().getDimension(R.dimen.wdp31);
        this.f30074i.addItemDecoration(new e(aVar2));
        this.f30090y.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.activity.j
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i5) {
                EndGameActivity.this.z0(baseQuickAdapter, view, i5);
            }
        });
        k kVar = new k(this, this.f30089x);
        this.f30091z = kVar;
        this.f30075j.setAdapter(kVar);
        this.f30075j.setOffscreenPageLimit(3);
        this.f30075j.registerOnPageChangeCallback(new f());
        h hVar = new h(this, this.f30088w);
        this.A = hVar;
        this.f30069d.setAdapter(hVar);
        this.f30069d.setUserInputEnabled(false);
        this.f30069d.setOffscreenPageLimit(-1);
        u0();
        w0(this.f30086u);
        x0(this.f30087v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getEndGameConfig() {
        if (com.join.android.app.common.utils.j.j(this.f30083r)) {
            RequestEndGameListArgs requestEndGameListArgs = new RequestEndGameListArgs();
            requestEndGameListArgs.setUid(AccountUtil_.getInstance_(this.f30083r).getUid());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameListArgs);
            requestModel.setDefault(this.f30083r);
            ResponseModel<GameMainV4DataBean.EndGameConfigBean> x4 = com.join.mgps.rpc.impl.i.D0().x(requestModel.makeSign());
            if (x4 == null || x4.getCode() != 200 || x4.getData() == null) {
                return;
            }
            String jsonString = JsonMapper.toJsonString(x4.getData());
            this.f30080o.endGameConfig().g(jsonString);
            if (com.join.mgps.Util.g2.i(jsonString)) {
                GameMainV4DataBean.EndGameConfigBean data = x4.getData();
                this.f30081p = data;
                if (data != null) {
                    if (data.isEndgame_creation_switch()) {
                        this.f30067b.setVisibility(0);
                        return;
                    } else {
                        this.f30067b.setVisibility(8);
                        return;
                    }
                }
                this.f30067b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f30086u = 1;
        this.f30087v = 1;
        w0(1);
        x0(this.f30087v);
    }

    public void s0(String str) {
        int i4 = 0;
        while (i4 < this.f30088w.size()) {
            if (TextUtils.equals(str, this.f30088w.get(i4).getGameId())) {
                int i5 = 0;
                while (i5 < this.f30088w.size()) {
                    this.f30088w.get(i5).setSelected(i4 == i5);
                    i5++;
                }
                this.f30084s.replaceData(this.f30088w);
                if (this.f30072g.getLayoutManager() != null && (this.f30072g.getLayoutManager() instanceof LinearLayoutManager)) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f30072g.getLayoutManager();
                    if (i4 < linearLayoutManager.findFirstCompletelyVisibleItemPosition() || i4 > linearLayoutManager.findLastCompletelyVisibleItemPosition()) {
                        this.f30072g.smoothScrollToPosition(i4);
                    }
                }
                this.f30069d.setCurrentItem(i4, false);
                this.B = this.f30088w.get(i4);
                if (this.f30082q) {
                    y0();
                    return;
                }
                return;
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f30083r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        LinearLayout linearLayout = this.f30076k;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f30077l;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f30077l;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f30076k;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        com.join.mgps.Util.l2.a(this.f30083r).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        if (AccountUtil_.getInstance_(this.f30083r).isTourist()) {
            IntentUtil.getInstance().goLogin(this.f30083r);
            return;
        }
        boolean booleanValue = this.f30080o.showGuideCreateEndGame().d().booleanValue();
        if (this.f30081p != null) {
            if (booleanValue) {
                if (this.D == null) {
                    this.D = new com.join.mgps.dialog.e0(this);
                }
                this.D.b(this.f30081p.getCreate_endgame_hint());
                this.D.a(new g());
                return;
            }
            CreateEndGameActivity_.D0(this).a(this.f30081p).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0() {
        if (com.join.android.app.common.utils.j.j(this.f30083r)) {
            RequestEndGameAdArgs requestEndGameAdArgs = new RequestEndGameAdArgs();
            requestEndGameAdArgs.setUid(AccountUtil_.getInstance_(this.f30083r).getUid());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameAdArgs);
            requestModel.setDefault(this.f30083r);
            ResponseModel<List<CommonGameInfoBean>> j02 = this.f30085t.j0(requestModel.makeSign());
            if (j02 == null || j02.getCode() != 200 || j02.getData() == null || j02.getData().size() <= 0) {
                return;
            }
            this.C = j02.getData().get(0);
            C0();
        }
    }

    public CommonGameInfoBean v0() {
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void w0(int i4) {
        if (com.join.android.app.common.utils.j.j(this.f30083r)) {
            RequestEndGameNameListArgs requestEndGameNameListArgs = new RequestEndGameNameListArgs();
            requestEndGameNameListArgs.setWithEndGame(false);
            requestEndGameNameListArgs.setUid(AccountUtil_.getInstance_(this.f30083r).getUid());
            requestEndGameNameListArgs.setPage(i4);
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameNameListArgs);
            requestModel.setDefault(this.f30083r);
            ResponseModel<EndGameNameBean> u02 = this.f30085t.u0(requestModel.makeSign());
            if (u02 == null || u02.getCode() != 200) {
                if (i4 == 1) {
                    showLodingFailed();
                    return;
                }
                return;
            } else if (u02.getData() != null && u02.getData().getGameList() != null && u02.getData().getGameList().size() > 0) {
                G0(u02.getData().getGameList(), i4);
                return;
            } else {
                A0();
                return;
            }
        }
        showLodingFailed();
        showTost(getResources().getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x0(int i4) {
        if (com.join.android.app.common.utils.j.j(this.f30083r)) {
            RequestEndGameTypeArgs requestEndGameTypeArgs = new RequestEndGameTypeArgs();
            requestEndGameTypeArgs.setUid(AccountUtil_.getInstance_(this.f30083r).getUid());
            requestEndGameTypeArgs.setPage(i4);
            requestEndGameTypeArgs.setModelType(0);
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameTypeArgs);
            requestModel.setDefault(this.f30083r);
            ResponseModel<EndGameListBean> I = this.f30085t.I(requestModel.makeSign());
            if (I == null || I.getCode() != 200) {
                return;
            }
            if (I.getData() != null && I.getData().getGameList() != null && I.getData().getGameList().size() > 0) {
                F0(I.getData(), i4);
            } else {
                B0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void y0() {
        ViewPager2 viewPager2;
        EndGameSelectFragment_ c5;
        EndGameNameListBean endGameNameListBean;
        this.f30073h.setClickable(false);
        this.f30070e.setVisibility(this.f30082q ? 8 : 0);
        this.f30073h.setImageResource(this.f30082q ? R.drawable.ic_menu_endgame_shrink : R.drawable.ic_menu_endgame_expand);
        ViewGroup.LayoutParams layoutParams = this.f30071f.getLayoutParams();
        layoutParams.height = this.f30082q ? getResources().getDimensionPixelSize(R.dimen.wdp92) : -2;
        this.f30071f.setLayoutParams(layoutParams);
        this.f30082q = !this.f30082q;
        k kVar = this.f30091z;
        if (kVar != null && (viewPager2 = this.f30075j) != null && (c5 = kVar.c(viewPager2.getCurrentItem())) != null && (endGameNameListBean = this.B) != null) {
            c5.d0(endGameNameListBean.getGameId());
        }
        this.f30073h.setClickable(true);
    }
}
