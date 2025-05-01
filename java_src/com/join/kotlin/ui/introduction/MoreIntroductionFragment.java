package com.join.kotlin.ui.introduction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.BbsListBean;
import com.join.mgps.dto.GameBbsPostListBean;
import com.join.mgps.dto.RequestBbsRecommendArgs;
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
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import w1.h;
@EFragment(R.layout.fragment_more_introduction)
/* loaded from: classes3.dex */
public class MoreIntroductionFragment extends Fragment implements View.OnClickListener {
    Context context;
    private GameBbsPostListBean datas;
    String gameId;
    @ViewById
    View loding_faile;
    @ViewById
    View loding_layout;
    private ItemAdapter mItemAdapter;
    k rpcGameClient;
    @ViewById
    RecyclerView rv_list_data;
    int tagId;
    private int page = 1;
    private int next_page = 1;
    private boolean dataChanged = false;

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

    private int getUid() {
        n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
        if (accountData != null) {
            return accountData.getUid();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$aftervidew$0() {
        int i4 = this.page + 1;
        this.page = i4;
        loadData(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$aftervidew$1(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        BbsListBean item = this.mItemAdapter.getItem(i4);
        p l4 = p.l(getContext());
        Event event = Event.singleStartGamePageDetail;
        Event event2 = Event.ClickMoreContent;
        Ext fromTabId = new Ext().setFrom("1").setFromTabId(String.valueOf(1));
        l4.q1(event, event2, "", fromTabId.setArticleId(item.getId() + ""), new Data().setGameId(Long.parseLong(this.gameId)));
        if (getActivity() instanceof h) {
            ((h) getActivity()).s(item.getId().intValue(), item.getType().intValue(), item.getIsCollection().intValue() == 1);
        }
        onClockClick();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void aftervidew() {
        this.context = getActivity();
        if (getArguments() != null) {
            this.gameId = getArguments().getString("gameId");
            this.tagId = getArguments().getInt("tagId", 0);
        }
        this.rpcGameClient = i.D0();
        this.rv_list_data.setLayoutManager(new GridLayoutManager(this.context, 2));
        if (this.mItemAdapter == null) {
            this.mItemAdapter = new ItemAdapter();
            final UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = 0;
            aVar.f46237d = (int) getResources().getDimension(R.dimen.wdp26);
            aVar.f46234a = (int) getResources().getDimension(R.dimen.wdp24);
            this.rv_list_data.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.ui.introduction.MoreIntroductionFragment.1
                @Override // com.join.mgps.base.decoration.UniversalItemDecoration
                public UniversalItemDecoration.b getItemOffsets(int i4) {
                    return aVar;
                }
            });
            this.mItemAdapter.setOnLoadMoreListener(new BaseQuickAdapter.l() { // from class: com.join.kotlin.ui.introduction.f
                @Override // com.join.mgps.base.BaseQuickAdapter.l
                public final void onLoadMoreRequested() {
                    MoreIntroductionFragment.this.lambda$aftervidew$0();
                }
            }, this.rv_list_data);
            this.mItemAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.kotlin.ui.introduction.e
                @Override // com.join.mgps.base.BaseQuickAdapter.j
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                    MoreIntroductionFragment.this.lambda$aftervidew$1(baseQuickAdapter, view, i4);
                }
            });
            this.rv_list_data.setAdapter(this.mItemAdapter);
        }
        loadData(1);
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
    @Background
    public void loadData(int i4) {
        showLoadingView();
        if (j.j(this.context)) {
            try {
                RequestBbsRecommendArgs requestBbsRecommendArgs = new RequestBbsRecommendArgs();
                requestBbsRecommendArgs.setFirstReqInCurPage(Boolean.valueOf(i4 == 1));
                requestBbsRecommendArgs.setGameId(this.gameId);
                requestBbsRecommendArgs.setPostId(Integer.valueOf(this.tagId));
                requestBbsRecommendArgs.setPage(Integer.valueOf(this.next_page));
                requestBbsRecommendArgs.setUid(Integer.valueOf(getUid()));
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsRecommendArgs);
                ResponseModel<GameBbsPostListBean> e5 = this.rpcGameClient.e(requestModel.makeSign());
                try {
                    hideLoading();
                    if (e5 != null && e5.getData() != null) {
                        showMain(e5.getData(), i4 > 1);
                    } else {
                        showLoadFailed();
                    }
                    return;
                } catch (Exception e6) {
                    e6.printStackTrace();
                    showLoadFailed();
                    return;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                showLoadFailed();
                return;
            }
        }
        showLoadFailed();
    }

    public void notifyDataChanged(int i4) {
        boolean z4 = this.tagId != i4;
        this.dataChanged = z4;
        if (z4) {
            this.tagId = i4;
            this.page = 1;
            this.next_page = 1;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_close})
    public void onClockClick() {
        if (getActivity() instanceof h) {
            ((h) getActivity()).U(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!this.dataChanged || z4) {
            return;
        }
        loadData(1);
        this.dataChanged = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        view.setOnClickListener(this);
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
        GameBbsPostListBean gameBbsPostListBean = this.datas;
        if (gameBbsPostListBean != null && gameBbsPostListBean.getGame_bbs_post_list() != null && this.datas.getGame_bbs_post_list().size() > 0) {
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
    public void showMain(GameBbsPostListBean gameBbsPostListBean, boolean z4) {
        this.datas = gameBbsPostListBean;
        if (gameBbsPostListBean != null) {
            this.next_page = gameBbsPostListBean.getNext_page().intValue();
        }
        GameBbsPostListBean gameBbsPostListBean2 = this.datas;
        if (gameBbsPostListBean2 != null && gameBbsPostListBean2.getGame_bbs_post_list() != null && this.datas.getGame_bbs_post_list().size() > 0) {
            if (z4) {
                this.mItemAdapter.addData((Collection) this.datas.getGame_bbs_post_list());
            } else {
                this.mItemAdapter.setNewData(this.datas.getGame_bbs_post_list());
            }
            this.mItemAdapter.loadMoreComplete();
            return;
        }
        this.mItemAdapter.loadMoreComplete();
        this.mItemAdapter.loadMoreEnd();
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
