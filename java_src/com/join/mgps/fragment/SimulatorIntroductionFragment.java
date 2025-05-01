package com.join.mgps.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.introduction.ModIntroductionListFragmentForSimulator_;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.GameMainActivity4;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.BbsTagListBean;
import com.join.mgps.dto.RequestBbsTagListArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_simulator_introduction)
/* loaded from: classes3.dex */
public class SimulatorIntroductionFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f52945b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewPager f52946c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f52947d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f52948e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f52949f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f52950g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f52951h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    View f52952i;

    /* renamed from: k  reason: collision with root package name */
    Context f52954k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    View f52955l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    View f52956m;

    /* renamed from: n  reason: collision with root package name */
    String f52957n;

    /* renamed from: o  reason: collision with root package name */
    String f52958o;

    /* renamed from: q  reason: collision with root package name */
    com.join.mgps.rpc.k f52960q;

    /* renamed from: r  reason: collision with root package name */
    private List<BbsTagListBean> f52961r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f52962s;

    /* renamed from: t  reason: collision with root package name */
    private c f52963t;

    /* renamed from: j  reason: collision with root package name */
    private int f52953j = 0;

    /* renamed from: p  reason: collision with root package name */
    int f52959p = 1;

    /* loaded from: classes3.dex */
    class a extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f52964a;

        a(UniversalItemDecoration.a aVar) {
            this.f52964a = aVar;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return this.f52964a;
        }
    }

    /* loaded from: classes3.dex */
    class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (SimulatorIntroductionFragment.this.f52961r != null) {
                ((BbsTagListBean) SimulatorIntroductionFragment.this.f52961r.get(SimulatorIntroductionFragment.this.f52953j)).setSelected(false);
                SimulatorIntroductionFragment.this.f52963t.notifyItemChanged(SimulatorIntroductionFragment.this.f52953j);
                SimulatorIntroductionFragment.this.f52953j = i4;
                ((BbsTagListBean) SimulatorIntroductionFragment.this.f52961r.get(SimulatorIntroductionFragment.this.f52953j)).setSelected(true);
                SimulatorIntroductionFragment.this.f52963t.notifyItemChanged(SimulatorIntroductionFragment.this.f52953j);
                SimulatorIntroductionFragment.this.f52945b.smoothScrollToPosition(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends BaseQuickAdapter<BbsTagListBean, BaseViewHolder> {
        public c() {
            super((int) R.layout.item_mod_introduction_type);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, BbsTagListBean bbsTagListBean) {
            baseViewHolder.setText(R.id.tv_name, bbsTagListBean.getName());
            if (bbsTagListBean.isSelected()) {
                baseViewHolder.setTextColor(R.id.tv_name, -1);
                baseViewHolder.setBackgroundRes(R.id.tv_name, R.drawable.shape_rect_339cf4_3965bc_r6_solid);
                return;
            }
            baseViewHolder.setTextColor(R.id.tv_name, Color.parseColor("#C1D0DD"));
            baseViewHolder.setBackgroundRes(R.id.tv_name, R.drawable.shape_rect_2d3645_r6_solid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$aftervidew$0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        List<BbsTagListBean> list = this.f52961r;
        if (list != null) {
            list.get(this.f52953j).setSelected(false);
            this.f52963t.notifyItemChanged(this.f52953j);
            this.f52953j = i4;
            this.f52961r.get(i4).setSelected(true);
            this.f52963t.notifyItemChanged(this.f52953j);
            this.f52946c.setCurrentItem(this.f52953j);
            this.f52945b.smoothScrollToPosition(i4);
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(getContext());
            Event event = Event.singleStartGamePageList;
            Event event2 = Event.ClickContentTag;
            Ext from = new Ext().setFrom("1");
            l4.q1(event, event2, "", from.setFromTabId(this.f52961r.get(this.f52953j).getId() + ""), new Data().setGameId(Long.parseLong(this.f52957n)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void aftervidew() {
        this.f52954k = getActivity();
        this.f52960q = com.join.mgps.rpc.impl.i.D0();
        if (getArguments() != null) {
            this.f52957n = getArguments().getString("gameId");
            this.f52958o = getArguments().getString("draftUrl");
            this.f52962s = getArguments().getBoolean("isExpand");
        }
        this.f52948e.setVisibility(this.f52962s ? 0 : 8);
        this.f52959p = this.f52962s ? 2 : 1;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f52946c.getLayoutParams();
        layoutParams.topMargin = this.f52962s ? (int) getResources().getDimension(R.dimen.wdp26) : 0;
        this.f52946c.setLayoutParams(layoutParams);
        if (this.f52963t == null) {
            this.f52963t = new c();
        }
        UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46235b = (int) getResources().getDimension(R.dimen.wdp20);
        this.f52945b.addItemDecoration(new a(aVar));
        this.f52963t.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.fragment.e1
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                SimulatorIntroductionFragment.this.lambda$aftervidew$0(baseQuickAdapter, view, i4);
            }
        });
        this.f52946c.addOnPageChangeListener(new b());
        this.f52945b.setAdapter(this.f52963t);
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ivExpand})
    public void b0() {
        ((GameMainActivity4) getActivity()).e2();
    }

    public void c0() {
        b0();
    }

    public String getDraftUrl(String str) {
        if (g2.i(str)) {
            if (str.contains("?")) {
                return str + "&gameId=" + this.f52957n;
            }
            return str + "?gameId=" + this.f52957n;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        View view = this.f52955l;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f52956m;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f52945b;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        showLoadingView();
        if (com.join.android.app.common.utils.j.j(this.f52954k)) {
            try {
                RequestBbsTagListArgs requestBbsTagListArgs = new RequestBbsTagListArgs();
                requestBbsTagListArgs.setGameId(this.f52957n);
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f52954k).getAccountData();
                if (accountData != null) {
                    requestBbsTagListArgs.setUid(accountData.getUid());
                    requestBbsTagListArgs.setUserToken(accountData.getToken());
                }
                RequestModel requestModel = new RequestModel(this.f52954k);
                requestModel.setArgs(requestBbsTagListArgs);
                ResponseModel<List<BbsTagListBean>> b5 = this.f52960q.b(requestModel.makeSign());
                try {
                    hideLoading();
                    if (b5 != null && b5.getData() != null) {
                        showMain(b5.getData());
                    } else {
                        showLoadFailed();
                    }
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLoadFailed();
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                showLoadFailed();
                return;
            }
        }
        showLoadFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_draft})
    public void onDraftClick() {
        com.papa.sim.statistic.p.l(getContext()).q1(Event.singleStartGamePageDetail, Event.ClickcontributionButton, "", new Ext().setFrom("1"), new Data().setGameId(Long.parseLong(this.f52957n)));
        IntentUtil.getInstance().goShareWebActivity(getContext(), getDraftUrl(this.f52958o));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52954k);
    }

    void showLoadFailed() {
        showLoadFailed("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadingView() {
        List<BbsTagListBean> list = this.f52961r;
        if (list != null && list.size() > 0) {
            RecyclerView recyclerView = this.f52945b;
            if (recyclerView != null && recyclerView.getVisibility() == 8) {
                this.f52945b.setVisibility(0);
            }
            View view = this.f52955l;
            if (view != null && view.getVisibility() == 0) {
                this.f52955l.setVisibility(8);
            }
        } else {
            RecyclerView recyclerView2 = this.f52945b;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            View view2 = this.f52955l;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.f52956m;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<BbsTagListBean> list) {
        this.f52961r = list;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f52961r.size()) {
                break;
            } else if (this.f52961r.get(i4).getId().intValue() == 0) {
                this.f52953j = i4;
                break;
            } else {
                i4++;
            }
        }
        this.f52961r.get(this.f52953j).setSelected(true);
        this.f52963t.setNewData(this.f52961r);
        ArrayList arrayList = new ArrayList();
        for (BbsTagListBean bbsTagListBean : list) {
            ModIntroductionListFragmentForSimulator_ modIntroductionListFragmentForSimulator_ = new ModIntroductionListFragmentForSimulator_();
            Bundle bundle = new Bundle();
            bundle.putInt("tagId", bbsTagListBean.getId() == null ? 0 : bbsTagListBean.getId().intValue());
            bundle.putString("gameId", this.f52957n);
            bundle.putInt("column", this.f52959p);
            modIntroductionListFragmentForSimulator_.setArguments(bundle);
            arrayList.add(new FragmentPagerAdapter.a(bbsTagListBean.getName(), modIntroductionListFragmentForSimulator_));
        }
        this.f52946c.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), arrayList));
        this.f52946c.setOffscreenPageLimit(3);
        this.f52946c.setCurrentItem(this.f52953j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadFailed(String str) {
        RecyclerView recyclerView = this.f52945b;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        View view = this.f52955l;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f52956m;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
