package com.join.kotlin.ui.endgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityEndGameSlotListBinding;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.cloudarchive.IOnRunListener;
import com.join.kotlin.ui.endgame.adapter.EndGameSlotListAdapter;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.dto.ArchiveListBean;
import com.wufan.user.service.protobuf.n0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EndGameSlotListActivity.kt */
/* loaded from: classes3.dex */
public final class EndGameSlotListActivity extends BaseAppCompatActivity implements ISlotListener, LoadBindClickProxy {
    @NotNull
    private final Lazy adapterx$delegate;
    public ActivityEndGameSlotListBinding dataBinding;
    private boolean isLogin;
    @Nullable
    private IOnRunListener mListener;
    @NotNull
    private final Lazy viewModle$delegate;

    public EndGameSlotListActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<EndGameSlotViewModel>() { // from class: com.join.kotlin.ui.endgame.EndGameSlotListActivity$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final EndGameSlotViewModel invoke() {
                return (EndGameSlotViewModel) new ViewModelProvider(EndGameSlotListActivity.this, new ViewModelProvider.NewInstanceFactory()).get(EndGameSlotViewModel.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<EndGameSlotListAdapter>() { // from class: com.join.kotlin.ui.endgame.EndGameSlotListActivity$adapterx$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final EndGameSlotListAdapter invoke() {
                return new EndGameSlotListAdapter(EndGameSlotListActivity.this);
            }
        });
        this.adapterx$delegate = lazy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @NotNull
    public final EndGameSlotListAdapter getAdapterx() {
        return (EndGameSlotListAdapter) this.adapterx$delegate.getValue();
    }

    @NotNull
    public final ActivityEndGameSlotListBinding getDataBinding() {
        ActivityEndGameSlotListBinding activityEndGameSlotListBinding = this.dataBinding;
        if (activityEndGameSlotListBinding != null) {
            return activityEndGameSlotListBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @Nullable
    public final IOnRunListener getMListener() {
        return this.mListener;
    }

    @NotNull
    public final EndGameSlotViewModel getViewModle() {
        return (EndGameSlotViewModel) this.viewModle$delegate.getValue();
    }

    public final void initData() {
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(21, this);
        getDataBinding().f16077d.setAdapter(getAdapterx());
        boolean z4 = false;
        getDataBinding().f16077d.setLoadingMoreEnabled(false);
        getDataBinding().f16077d.setPullRefreshEnabled(false);
        RecyclerView.ItemAnimator itemAnimator = getDataBinding().f16077d.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        MutableLiveData<List<ArchiveListBean>> listArchive = getViewModle().getListArchive();
        final Function1<List<ArchiveListBean>, Unit> function1 = new Function1<List<ArchiveListBean>, Unit>() { // from class: com.join.kotlin.ui.endgame.EndGameSlotListActivity$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<ArchiveListBean> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<ArchiveListBean> list) {
                boolean z5 = true;
                if (list != null) {
                    EndGameSlotListActivity.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    if (list.isEmpty()) {
                        List<ArchiveListBean> value = EndGameSlotListActivity.this.getViewModle().getListArchive().getValue();
                        if ((value == null || value.size() != 0) ? false : false) {
                            EndGameSlotListActivity.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(4));
                        }
                        EndGameSlotListActivity.this.getDataBinding().f16077d.setNoMore();
                        return;
                    }
                    EndGameSlotListActivity.this.getAdapterx().setListDatas(list);
                    EndGameSlotListActivity.this.getDataBinding().f16077d.loadMoreComplete();
                    EndGameSlotListActivity.this.getAdapterx().notifyDataSetChanged();
                    return;
                }
                List<ArchiveListBean> value2 = EndGameSlotListActivity.this.getViewModle().getListArchive().getValue();
                if (!(value2 != null && value2.size() == 0)) {
                    EndGameSlotListActivity.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                }
                List<ArchiveListBean> value3 = EndGameSlotListActivity.this.getViewModle().getListArchive().getValue();
                if ((value3 == null || value3.size() != 0) ? false : false) {
                    EndGameSlotListActivity.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(3));
                }
            }
        };
        listArchive.observe(this, new Observer() { // from class: com.join.kotlin.ui.endgame.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EndGameSlotListActivity.initData$lambda$0(Function1.this, obj);
            }
        });
        n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        Intrinsics.checkNotNullExpressionValue(accountData, "getInstance_(this).accountData");
        if (!g2.h(accountData.getToken()) && !AccountUtil_.getInstance_(this).isTourist()) {
            z4 = true;
        }
        this.isLogin = z4;
        loadData();
        getDataBinding().j(this);
        MutableLiveData<ArchiveListBean> checkedItem = getAdapterx().getCheckedItem();
        final Function1<ArchiveListBean, Unit> function12 = new Function1<ArchiveListBean, Unit>() { // from class: com.join.kotlin.ui.endgame.EndGameSlotListActivity$initData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArchiveListBean archiveListBean) {
                invoke2(archiveListBean);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArchiveListBean archiveListBean) {
                MutableLiveData<String> commitText = EndGameSlotListActivity.this.getViewModle().getCommitText();
                StringBuilder sb = new StringBuilder();
                sb.append("完成(");
                sb.append(archiveListBean == null ? "0" : "1");
                sb.append("/1)");
                commitText.setValue(sb.toString());
                EndGameSlotListActivity.this.getViewModle().getCommitEnableStatus().setValue(Boolean.valueOf(archiveListBean != null));
            }
        };
        checkedItem.observe(this, new Observer() { // from class: com.join.kotlin.ui.endgame.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EndGameSlotListActivity.initData$lambda$1(Function1.this, obj);
            }
        });
    }

    public final boolean isLogin() {
        return this.isLogin;
    }

    public final void loadData() {
        getViewModle().loadLocalArchiveData();
    }

    @Override // com.join.kotlin.ui.endgame.ISlotListener
    public void onBack() {
        finish();
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickReload() {
        loadData();
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickSetNetWork() {
        UtilsMy.w3(this);
    }

    @Override // com.join.kotlin.ui.endgame.ISlotListener
    public void onCommit() {
        Intent intent = new Intent();
        intent.putExtra("mData", getAdapterx().getCheckedItem().getValue());
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        View root;
        super.onCreate(bundle);
        EndGameSlotViewModel viewModle = getViewModle();
        String stringExtra = getIntent().getStringExtra("gameId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        viewModle.setGameId(stringExtra);
        ViewDataBinding inflate = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_end_game_slot_list, null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            lay…          false\n        )");
        setDataBinding((ActivityEndGameSlotListBinding) inflate);
        setContentView(getDataBinding().getRoot());
        initData();
        ActivityEndGameSlotListBinding dataBinding = getDataBinding();
        if (dataBinding == null || (root = dataBinding.getRoot()) == null) {
            return;
        }
        root.setBackgroundResource(R.drawable.alph);
    }

    public final void setDataBinding(@NotNull ActivityEndGameSlotListBinding activityEndGameSlotListBinding) {
        Intrinsics.checkNotNullParameter(activityEndGameSlotListBinding, "<set-?>");
        this.dataBinding = activityEndGameSlotListBinding;
    }

    public final void setLogin(boolean z4) {
        this.isLogin = z4;
    }

    public final void setMListener(@Nullable IOnRunListener iOnRunListener) {
        this.mListener = iOnRunListener;
    }
}
