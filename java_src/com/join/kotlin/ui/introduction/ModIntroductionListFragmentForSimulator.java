package com.join.kotlin.ui.introduction;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.y;
import com.join.mgps.activity.GameMainActivity4_;
import com.join.mgps.activity.IntroductionActivity_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.BbsListBean;
import com.join.mgps.dto.RequestBbsListArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import com.join.mgps.rpc.k;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.wufan.user.service.protobuf.n0;
import java.util.Collection;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_mod_introduction_list_for_simulator)
/* loaded from: classes3.dex */
public class ModIntroductionListFragmentForSimulator extends Fragment {
    Context context;
    private List<BbsListBean> datas;
    String gameId;
    @ViewById
    View loding_faile;
    @ViewById
    View loding_layout;
    private ItemAdapter mItemAdapter;
    k rpcGameClient;
    @ViewById
    RecyclerView rv_list_data;
    @ViewById
    View setNetwork;
    int tagId;
    private int page = 1;
    private int defalutColumns = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ItemAdapter extends BaseQuickAdapter<BbsListBean, BaseViewHolder> {
        public ItemAdapter() {
            super((int) R.layout.item_mod_introduction_item);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, BbsListBean bbsListBean) {
            baseViewHolder.setText(R.id.tv_title, bbsListBean.getTitle());
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), bbsListBean.getPic());
            if (bbsListBean.getType().intValue() == 1) {
                baseViewHolder.setGone(R.id.tv_time, true);
                baseViewHolder.setText(R.id.tv_time, y.h(bbsListBean.getDuration().intValue()));
            } else {
                baseViewHolder.setGone(R.id.tv_time, false);
            }
            if (bbsListBean.getIsCollection().intValue() == 1) {
                baseViewHolder.setText(R.id.tv_pic_num, "合集·" + bbsListBean.getVideos());
                baseViewHolder.setGone(R.id.tv_pic_num, true);
                return;
            }
            baseViewHolder.setGone(R.id.tv_pic_num, false);
        }
    }

    static /* synthetic */ int access$008(ModIntroductionListFragmentForSimulator modIntroductionListFragmentForSimulator) {
        int i4 = modIntroductionListFragmentForSimulator.page;
        modIntroductionListFragmentForSimulator.page = i4 + 1;
        return i4;
    }

    private int getUid() {
        n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
        if (accountData != null) {
            return accountData.getUid();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$aftervidew$0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        BbsListBean item = this.mItemAdapter.getItem(i4);
        if (getActivity() instanceof GameMainActivity4_) {
            Ext ext = new Ext();
            ext.setGameId(this.gameId);
            p.l(getContext()).O1(Event.clickModMainGbaSee, ext);
        } else {
            p l4 = p.l(getContext());
            Event event = Event.singleStartGamePageList;
            Event event2 = Event.ClickContentCard;
            Ext from = new Ext().setFrom("1");
            l4.q1(event, event2, "", from.setArticleId(item.getId() + ""), new Data().setGameId(Long.parseLong(this.gameId)));
        }
        IntroductionActivity_.e1(this.context).d(item.getId().intValue()).e(this.tagId).a(this.gameId).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void aftervidew() {
        this.context = getActivity();
        if (getArguments() != null) {
            this.gameId = getArguments().getString("gameId");
            this.tagId = getArguments().getInt("tagId", 0);
            this.defalutColumns = getArguments().getInt("column", 1);
        }
        this.rpcGameClient = i.D0();
        this.rv_list_data.setLayoutManager(new GridLayoutManager(this.context, this.defalutColumns));
        if (this.mItemAdapter == null) {
            this.mItemAdapter = new ItemAdapter();
        }
        final UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46237d = (int) getResources().getDimension(R.dimen.wdp20);
        if (this.defalutColumns != 1) {
            aVar.f46235b = (int) getResources().getDimension(R.dimen.wdp8);
        }
        final UniversalItemDecoration.a aVar2 = new UniversalItemDecoration.a();
        aVar2.f46233f = 0;
        aVar2.f46237d = (int) getResources().getDimension(R.dimen.wdp20);
        if (this.defalutColumns != 1) {
            aVar2.f46234a = (int) getResources().getDimension(R.dimen.wdp8);
        }
        this.rv_list_data.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragmentForSimulator.1
            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                if (i4 % 2 == 0) {
                    return aVar;
                }
                return aVar2;
            }
        });
        this.mItemAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.kotlin.ui.introduction.d
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                ModIntroductionListFragmentForSimulator.this.lambda$aftervidew$0(baseQuickAdapter, view, i4);
            }
        });
        this.rv_list_data.setAdapter(this.mItemAdapter);
        this.mItemAdapter.setOnLoadMoreListener(new BaseQuickAdapter.l() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragmentForSimulator.2
            @Override // com.join.mgps.base.BaseQuickAdapter.l
            public void onLoadMoreRequested() {
                ModIntroductionListFragmentForSimulator.access$008(ModIntroductionListFragmentForSimulator.this);
                ModIntroductionListFragmentForSimulator modIntroductionListFragmentForSimulator = ModIntroductionListFragmentForSimulator.this;
                modIntroductionListFragmentForSimulator.loadData(modIntroductionListFragmentForSimulator.page);
            }
        }, this.rv_list_data);
        this.page = 1;
        loadData(1);
    }

    public void changeColumn(int i4) {
        if (this.defalutColumns == i4) {
            return;
        }
        this.defalutColumns = i4;
        RecyclerView recyclerView = this.rv_list_data;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(this.context, i4));
            this.mItemAdapter.setNewData(this.datas);
        }
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
        RecyclerView recyclerView = this.rv_list_data;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:23:0x0075). Please submit an issue!!! */
    @Background
    public void loadData(int i4) {
        showLoadingView();
        if (j.j(this.context)) {
            try {
                RequestBbsListArgs requestBbsListArgs = new RequestBbsListArgs();
                requestBbsListArgs.setGameId(this.gameId);
                requestBbsListArgs.setPage(Integer.valueOf(i4));
                requestBbsListArgs.setTagId(Integer.valueOf(this.tagId));
                requestBbsListArgs.setUid(Integer.valueOf(getUid()));
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsListArgs);
                ResponseModel<List<BbsListBean>> o4 = this.rpcGameClient.o(requestModel.makeSign());
                try {
                    hideLoading();
                    if (o4 != null && o4.getData() != null) {
                        List<BbsListBean> data = o4.getData();
                        boolean z4 = true;
                        if (i4 <= 1) {
                            z4 = false;
                        }
                        showMain(data, z4);
                    } else {
                        showLoadFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLoadFailed();
                }
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                showLoadFailed();
                return;
            }
        }
        showLoadFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        loadData(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.context);
    }

    void showLoadFailed() {
        showLoadFailed("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadingView() {
        List<BbsListBean> list = this.datas;
        if (list != null && list.size() > 0) {
            RecyclerView recyclerView = this.rv_list_data;
            if (recyclerView != null && recyclerView.getVisibility() == 8) {
                this.rv_list_data.setVisibility(0);
            }
            View view = this.loding_layout;
            if (view != null && view.getVisibility() == 0) {
                this.loding_layout.setVisibility(8);
            }
        } else {
            RecyclerView recyclerView2 = this.rv_list_data;
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
    public void showMain(List<BbsListBean> list, boolean z4) {
        this.datas = list;
        if (list == null || list.size() <= 0) {
            this.mItemAdapter.loadMoreEnd();
        } else if (z4) {
            this.mItemAdapter.loadMoreComplete();
            this.mItemAdapter.addData((Collection) this.datas);
        } else {
            this.mItemAdapter.setNewData(this.datas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadFailed(String str) {
        RecyclerView recyclerView = this.rv_list_data;
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
