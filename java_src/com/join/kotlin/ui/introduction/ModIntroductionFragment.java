package com.join.kotlin.ui.introduction;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.BbsTagListBean;
import com.join.mgps.dto.RequestBbsTagListArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import com.join.mgps.rpc.k;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.wufan.user.service.protobuf.n0;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_mod_introduction)
/* loaded from: classes3.dex */
public class ModIntroductionFragment extends Fragment {
    Context context;
    String draftUrl;
    String gameId;
    @ViewById
    View loding_faile;
    @ViewById
    View loding_layout;
    private TypeAdapter mTypeAdapter;
    k rpcGameClient;
    @ViewById
    RecyclerView rv_list_type;
    private List<BbsTagListBean> typeList;
    @ViewById
    ViewPager view_pager;
    private int defSelectPos = 0;
    List<FragmentPagerAdapter.a> items = new ArrayList();
    private boolean isAddData = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class TypeAdapter extends BaseQuickAdapter<BbsTagListBean, BaseViewHolder> {
        public TypeAdapter() {
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
        List<BbsTagListBean> list = this.typeList;
        if (list != null) {
            list.get(this.defSelectPos).setSelected(false);
            this.mTypeAdapter.notifyItemChanged(this.defSelectPos);
            this.defSelectPos = i4;
            this.typeList.get(i4).setSelected(true);
            this.mTypeAdapter.notifyItemChanged(this.defSelectPos);
            this.view_pager.setCurrentItem(this.defSelectPos);
            this.rv_list_type.smoothScrollToPosition(i4);
            p l4 = p.l(getContext());
            Event event = Event.singleStartGamePageList;
            Event event2 = Event.ClickContentTag;
            Ext from = new Ext().setFrom("1");
            l4.q1(event, event2, "", from.setFromTabId(this.typeList.get(this.defSelectPos).getId() + ""), new Data().setGameId(Long.parseLong(this.gameId)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void aftervidew() {
        this.context = getActivity();
        this.rpcGameClient = i.D0();
        if (getArguments() != null) {
            this.gameId = getArguments().getString("gameId");
            this.draftUrl = getArguments().getString("draftUrl");
        }
        if (this.mTypeAdapter == null) {
            this.mTypeAdapter = new TypeAdapter();
        }
        final UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46235b = (int) getResources().getDimension(R.dimen.wdp20);
        this.rv_list_type.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.ui.introduction.ModIntroductionFragment.1
            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                return aVar;
            }
        });
        this.mTypeAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.kotlin.ui.introduction.b
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                ModIntroductionFragment.this.lambda$aftervidew$0(baseQuickAdapter, view, i4);
            }
        });
        this.view_pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.join.kotlin.ui.introduction.ModIntroductionFragment.2
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i4) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i4, float f5, int i5) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i4) {
                if (ModIntroductionFragment.this.typeList != null) {
                    ((BbsTagListBean) ModIntroductionFragment.this.typeList.get(ModIntroductionFragment.this.defSelectPos)).setSelected(false);
                    ModIntroductionFragment.this.mTypeAdapter.notifyItemChanged(ModIntroductionFragment.this.defSelectPos);
                    ModIntroductionFragment.this.defSelectPos = i4;
                    ((BbsTagListBean) ModIntroductionFragment.this.typeList.get(ModIntroductionFragment.this.defSelectPos)).setSelected(true);
                    ModIntroductionFragment.this.mTypeAdapter.notifyItemChanged(ModIntroductionFragment.this.defSelectPos);
                    ModIntroductionFragment.this.rv_list_type.smoothScrollToPosition(i4);
                }
            }
        });
        this.rv_list_type.setAdapter(this.mTypeAdapter);
        loadData();
    }

    public String getDraftUrl(String str) {
        if (g2.i(str)) {
            if (str.contains("?")) {
                return str + "&gameId=" + this.gameId;
            }
            return str + "?gameId=" + this.gameId;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        View view = this.loding_layout;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.loding_faile;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        RecyclerView recyclerView = this.rv_list_type;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        showLoadingView();
        if (j.j(this.context)) {
            try {
                RequestBbsTagListArgs requestBbsTagListArgs = new RequestBbsTagListArgs();
                requestBbsTagListArgs.setGameId(this.gameId);
                n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
                if (accountData != null) {
                    requestBbsTagListArgs.setUid(accountData.getUid());
                    requestBbsTagListArgs.setUserToken(accountData.getToken());
                }
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsTagListArgs);
                ResponseModel<List<BbsTagListBean>> b5 = this.rpcGameClient.b(requestModel.makeSign());
                try {
                    hideLoading();
                    if (b5 != null && b5.getData() != null) {
                        List<BbsTagListBean> data = b5.getData();
                        this.typeList = data;
                        showMain(data);
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
        p.l(getContext()).q1(Event.singleStartGamePageDetail, Event.ClickcontributionButton, "", new Ext().setFrom("1"), new Data().setGameId(Long.parseLong(this.gameId)));
        IntentUtil.getInstance().goShareWebActivity(getContext(), getDraftUrl(this.draftUrl));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.context);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        List<BbsTagListBean> list;
        super.setUserVisibleHint(z4);
        if (!z4 || this.isAddData || (list = this.typeList) == null) {
            return;
        }
        this.isAddData = true;
        showMain(list);
    }

    void showLoadFailed() {
        showLoadFailed("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadingView() {
        List<BbsTagListBean> list = this.typeList;
        if (list != null && list.size() > 0) {
            RecyclerView recyclerView = this.rv_list_type;
            if (recyclerView != null && recyclerView.getVisibility() == 8) {
                this.rv_list_type.setVisibility(0);
            }
            View view = this.loding_layout;
            if (view != null && view.getVisibility() == 0) {
                this.loding_layout.setVisibility(8);
            }
        } else {
            RecyclerView recyclerView2 = this.rv_list_type;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            View view2 = this.loding_layout;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.loding_faile;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<BbsTagListBean> list) {
        try {
            List<BbsTagListBean> list2 = this.typeList;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.typeList.size()) {
                    break;
                } else if (this.typeList.get(i4).getId().intValue() == 0) {
                    this.defSelectPos = i4;
                    break;
                } else {
                    i4++;
                }
            }
            this.typeList.get(this.defSelectPos).setSelected(true);
            this.mTypeAdapter.setNewData(this.typeList);
            this.items.clear();
            for (BbsTagListBean bbsTagListBean : this.typeList) {
                ModIntroductionListFragment_ modIntroductionListFragment_ = new ModIntroductionListFragment_();
                Bundle bundle = new Bundle();
                bundle.putInt("tagId", bbsTagListBean.getId() == null ? 0 : bbsTagListBean.getId().intValue());
                bundle.putString("gameId", this.gameId);
                modIntroductionListFragment_.setArguments(bundle);
                this.items.add(new FragmentPagerAdapter.a(String.valueOf(bbsTagListBean.getId()), modIntroductionListFragment_));
            }
            if (isAdded()) {
                this.isAddData = true;
                FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getChildFragmentManager(), this.items);
                ViewPager viewPager = this.view_pager;
                if (viewPager != null) {
                    viewPager.setAdapter(fragmentPagerAdapter);
                    this.view_pager.setOffscreenPageLimit(3);
                    this.view_pager.setCurrentItem(this.defSelectPos);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadFailed(String str) {
        RecyclerView recyclerView = this.rv_list_type;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        View view = this.loding_layout;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.loding_faile;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
