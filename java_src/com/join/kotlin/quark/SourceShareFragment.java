package com.join.kotlin.quark;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.FragmentSourceShareBinding;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.fragment.BaseVmDbFragment;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.adapter.SourceShareAdapter;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.viewmodel.SourceShareListViewModel;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceShareFragment.kt */
/* loaded from: classes3.dex */
public final class SourceShareFragment extends BaseVmDbFragment<SourceShareListViewModel, FragmentSourceShareBinding> {
    @NotNull
    private final Lazy adapter$delegate;
    private com.kingja.loadsir.core.b<Object> loadSir;
    private int tabId;

    public SourceShareFragment() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<SourceShareAdapter>() { // from class: com.join.kotlin.quark.SourceShareFragment$adapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SourceShareAdapter invoke() {
                return new SourceShareAdapter();
            }
        });
        this.adapter$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$5$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(SourceShareAdapter this_run, SourceShareFragment this$0, BaseQuickAdapter adapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Intent intent = new Intent(this_run.getContext(), SourceShareDetailActivity.class);
        intent.putExtra("itemBean", (Serializable) adapter.getItem(i4));
        intent.putExtra("qkPosition", "hp");
        this$0.startActivity(intent);
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void createObserver() {
        MutableLiveData<ListDataUiState<SourceListItemBean>> listData = ((SourceShareListViewModel) getMViewModel()).getListData();
        final Function1<ListDataUiState<SourceListItemBean>, Unit> function1 = new Function1<ListDataUiState<SourceListItemBean>, Unit>() { // from class: com.join.kotlin.quark.SourceShareFragment$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ListDataUiState<SourceListItemBean> listDataUiState) {
                invoke2(listDataUiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ListDataUiState<SourceListItemBean> it2) {
                com.kingja.loadsir.core.b bVar;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                SourceShareAdapter adapter = SourceShareFragment.this.getAdapter();
                bVar = SourceShareFragment.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                XQuickRecyclerView xQuickRecyclerView = SourceShareFragment.this.getMDatabind().f20135b;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
                CustomViewExtKt.loadListData$default(it2, adapter, bVar, xQuickRecyclerView, null, 16, null);
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.quark.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SourceShareFragment.createObserver$lambda$5$lambda$4(Function1.this, obj);
            }
        });
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void dismissLoading() {
    }

    @NotNull
    public final SourceShareAdapter getAdapter() {
        return (SourceShareAdapter) this.adapter$delegate.getValue();
    }

    public final int getTabId() {
        return this.tabId;
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void initView(@Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.tabId = arguments.getInt("_tab_id", 0);
        }
        getMDatabind().h((SourceShareListViewModel) getMViewModel());
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().f20135b;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
        CustomViewExtKt.init$default(xQuickRecyclerView, (RecyclerView.LayoutManager) new StaggeredGridLayoutManager(2, 1), (RecyclerView.Adapter) getAdapter(), false, 4, (Object) null);
        final XQuickRecyclerView xQuickRecyclerView2 = getMDatabind().f20135b;
        xQuickRecyclerView2.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.quark.SourceShareFragment$initView$2$1
            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            @NotNull
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
                aVar.f46233f = 0;
                aVar.f46236c = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp10);
                aVar.f46237d = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp10);
                aVar.f46234a = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp10);
                aVar.f46235b = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp10);
                return aVar;
            }
        });
        final SourceShareAdapter adapter = getAdapter();
        adapter.setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.quark.v
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                SourceShareFragment.initView$lambda$3$lambda$2(SourceShareAdapter.this, this, baseQuickAdapter, view, i4);
            }
        });
        getMDatabind().f20135b.setLoadingListener(new XQuickRecyclerView.LoadingListener() { // from class: com.join.kotlin.quark.SourceShareFragment$initView$4
            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onLoadMore() {
                SourceShareFragment.this.loadData(false);
            }

            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onRefresh() {
                SourceShareFragment.this.loadData(true);
            }
        });
        XQuickRecyclerView xQuickRecyclerView3 = getMDatabind().f20135b;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView3, "mDatabind.xrvList");
        com.kingja.loadsir.core.b<Object> loadServiceInit = CustomViewExtKt.loadServiceInit(xQuickRecyclerView3, new Function0<Unit>() { // from class: com.join.kotlin.quark.SourceShareFragment$initView$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.kingja.loadsir.core.b bVar;
                bVar = SourceShareFragment.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                CustomViewExtKt.showLoading(bVar);
                SourceShareFragment.this.loadData(true);
            }
        });
        this.loadSir = loadServiceInit;
        if (loadServiceInit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
            loadServiceInit = null;
        }
        CustomViewExtKt.showLoading(loadServiceInit);
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void lazyLoadData() {
        loadData(true);
    }

    public final void loadData(boolean z4) {
        int i4 = this.tabId;
        String uid = AccountUtil_.getInstance_(getContext()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(context).uid");
        String token = AccountUtil_.getInstance_(getContext()).getToken();
        Intrinsics.checkNotNullExpressionValue(token, "getInstance_(context).token");
        ((SourceShareListViewModel) getMViewModel()).getResourceList(z4, i4, uid, token);
    }

    public final void setTabId(int i4) {
        this.tabId = i4;
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void showLoading(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
