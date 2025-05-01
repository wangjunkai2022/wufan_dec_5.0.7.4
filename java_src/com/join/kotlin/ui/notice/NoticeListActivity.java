package com.join.kotlin.ui.notice;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.join.android.app.common.utils.j;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityNoticelistActivityBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.coupon.NoticeListData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: NoticeListActivity.kt */
/* loaded from: classes3.dex */
public final class NoticeListActivity extends BaseAppCompatActivity implements ClickProxy, LoadBindClickProxy {
    private int page = 1;
    public NoticeViewModle viewModle;
    @Nullable
    private ActivityNoticelistActivityBinding viewdataBinding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(NoticeListActivity this$0, ArrayList arrayList) {
        XRecyclerView xRecyclerView;
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding = this$0.viewdataBinding;
        if (activityNoticelistActivityBinding == null || (xRecyclerView = activityNoticelistActivityBinding.f16673c) == null || (adapter = xRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(NoticeListActivity this$0, ResponseModel responseModel) {
        XRecyclerView xRecyclerView;
        XRecyclerView xRecyclerView2;
        RecyclerView.Adapter adapter;
        XRecyclerView xRecyclerView3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z4 = false;
        if (responseModel != null && responseModel.getCode() == 200) {
            z4 = true;
        }
        if (z4) {
            NoticeListData noticeListData = (NoticeListData) responseModel.getData();
            if (this$0.page == responseModel.getPage()) {
                this$0.page++;
            }
            ArrayList<BTActivityBean> value = this$0.getViewModle().getNoticeDats().getValue();
            if (value != null) {
                value.addAll(noticeListData.getGame_announcement_dto_list());
            }
            ActivityNoticelistActivityBinding activityNoticelistActivityBinding = this$0.viewdataBinding;
            if (activityNoticelistActivityBinding != null && (xRecyclerView3 = activityNoticelistActivityBinding.f16673c) != null) {
                xRecyclerView3.loadMoreComplete();
            }
        } else {
            ActivityNoticelistActivityBinding activityNoticelistActivityBinding2 = this$0.viewdataBinding;
            if (activityNoticelistActivityBinding2 != null && (xRecyclerView = activityNoticelistActivityBinding2.f16673c) != null) {
                xRecyclerView.setNoMore();
            }
        }
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding3 = this$0.viewdataBinding;
        if (activityNoticelistActivityBinding3 != null && (xRecyclerView2 = activityNoticelistActivityBinding3.f16673c) != null && (adapter = xRecyclerView2.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        this$0.getViewModle().updateShowLoadUI(true);
    }

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final NoticeViewModle getViewModle() {
        NoticeViewModle noticeViewModle = this.viewModle;
        if (noticeViewModle != null) {
            return noticeViewModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModle");
        return null;
    }

    @Nullable
    public final ActivityNoticelistActivityBinding getViewdataBinding() {
        return this.viewdataBinding;
    }

    public final void loadData(int i4) {
        RequestModel<RequestGameIdArgs> requestModel = new RequestModel<>();
        requestModel.setDefault(this);
        RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
        requestGameIdArgs.setGameId(getIntent().getStringExtra("gameId"));
        requestGameIdArgs.setPage(i4);
        requestGameIdArgs.setUid(AccountUtil_.getInstance_(this).getAccountData().getUid());
        requestModel.setArgs(requestGameIdArgs);
        if (j.j(this)) {
            getViewModle().getRequest().getNoticeData(requestModel);
        } else {
            getViewModle().updateShowLoadUI(false);
        }
    }

    @Override // com.join.kotlin.ui.notice.ClickProxy
    public void onClickBack() {
        finish();
    }

    @Override // com.join.kotlin.ui.notice.ClickProxy
    public void onClickItem(@NotNull BTActivityBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        IntentUtil.getInstance().goShareWebActivity(this, data.getJump_url());
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickReload() {
        getViewModle().getLoadDataBinding().setValue(new LoadBindindData(2));
        loadData(this.page);
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickSetNetWork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        XRecyclerView xRecyclerView;
        super.onCreate(bundle);
        this.viewdataBinding = (ActivityNoticelistActivityBinding) DataBindingUtil.setContentView(this, R.layout.activity_noticelist_activity);
        setViewModle((NoticeViewModle) new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(NoticeViewModle.class));
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding = this.viewdataBinding;
        if (activityNoticelistActivityBinding != null) {
            activityNoticelistActivityBinding.setVariable(36, getViewModle());
        }
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding2 = this.viewdataBinding;
        if (activityNoticelistActivityBinding2 != null) {
            activityNoticelistActivityBinding2.setVariable(7, this);
        }
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding3 = this.viewdataBinding;
        if (activityNoticelistActivityBinding3 != null) {
            activityNoticelistActivityBinding3.setVariable(21, this);
        }
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding4 = this.viewdataBinding;
        if (activityNoticelistActivityBinding4 != null) {
            activityNoticelistActivityBinding4.setLifecycleOwner(this);
        }
        NoticeListAdapter noticeListAdapter = new NoticeListAdapter(this, this);
        getViewModle().getNoticeDats().observe(this, new Observer() { // from class: com.join.kotlin.ui.notice.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NoticeListActivity.onCreate$lambda$0(NoticeListActivity.this, (ArrayList) obj);
            }
        });
        ArrayList<BTActivityBean> arrayList = new ArrayList<>();
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding5 = this.viewdataBinding;
        XRecyclerView xRecyclerView2 = activityNoticelistActivityBinding5 != null ? activityNoticelistActivityBinding5.f16673c : null;
        if (xRecyclerView2 != null) {
            xRecyclerView2.setAdapter(noticeListAdapter);
        }
        ActivityNoticelistActivityBinding activityNoticelistActivityBinding6 = this.viewdataBinding;
        if (activityNoticelistActivityBinding6 != null && (xRecyclerView = activityNoticelistActivityBinding6.f16673c) != null) {
            xRecyclerView.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.notice.NoticeListActivity$onCreate$2
                @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
                public void onLoadMore() {
                    NoticeListActivity noticeListActivity = NoticeListActivity.this;
                    noticeListActivity.loadData(noticeListActivity.getPage());
                }

                @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
                public void onRefresh() {
                }
            });
        }
        getViewModle().getNoticeDats().setValue(arrayList);
        getViewModle().getLoadDataBinding().setValue(new LoadBindindData(2));
        loadData(this.page);
        noticeListAdapter.setOnItemClickListener(new BaseDataBindingAdapter.OnItemClickListener<BTActivityBean>() { // from class: com.join.kotlin.ui.notice.NoticeListActivity$onCreate$3
            @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter.OnItemClickListener
            public void onItemClick(int i4, @NotNull BTActivityBean item, int i5) {
                Intrinsics.checkNotNullParameter(item, "item");
                IntentUtil.getInstance().goShareWebActivity(NoticeListActivity.this, item.getJump_url());
            }
        });
        getViewModle().getRequest().getResultData().observe(this, new Observer() { // from class: com.join.kotlin.ui.notice.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NoticeListActivity.onCreate$lambda$1(NoticeListActivity.this, (ResponseModel) obj);
            }
        });
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    public final void setViewModle(@NotNull NoticeViewModle noticeViewModle) {
        Intrinsics.checkNotNullParameter(noticeViewModle, "<set-?>");
        this.viewModle = noticeViewModle;
    }

    public final void setViewdataBinding(@Nullable ActivityNoticelistActivityBinding activityNoticelistActivityBinding) {
        this.viewdataBinding = activityNoticelistActivityBinding;
    }
}
