package com.join.kotlin.quark;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.FragmentSourceHopeBinding;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.fragment.BaseVmDbFragment;
import com.join.kotlin.base.fragment.BaseVmFragment;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.adapter.SourceHopeAdapter;
import com.join.kotlin.quark.callback.IChangeSortCallback;
import com.join.kotlin.quark.callback.impl.DialogShareSourceCallbackImpl;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceHopeItemClickProxy;
import com.join.kotlin.quark.viewmodel.SourceHopeListViewModel;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.ResponseModel;
import com.papa91.arc.ext.ToastManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceHopeFragment.kt */
/* loaded from: classes3.dex */
public final class SourceHopeFragment extends BaseVmDbFragment<SourceHopeListViewModel, FragmentSourceHopeBinding> implements SourceHopeItemClickProxy, IChangeSortCallback {
    @NotNull
    private final Lazy adapter$delegate;
    private com.kingja.loadsir.core.b<Object> loadSir;

    public SourceHopeFragment() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<SourceHopeAdapter>() { // from class: com.join.kotlin.quark.SourceHopeFragment$adapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SourceHopeAdapter invoke() {
                return new SourceHopeAdapter();
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
    public static final void initView$lambda$3$lambda$2(BaseQuickAdapter adapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void createObserver() {
        MutableLiveData<ListDataUiState<SourceListItemBean>> listData = ((SourceHopeListViewModel) getMViewModel()).getListData();
        final Function1<ListDataUiState<SourceListItemBean>, Unit> function1 = new Function1<ListDataUiState<SourceListItemBean>, Unit>() { // from class: com.join.kotlin.quark.SourceHopeFragment$createObserver$1$1
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
                SourceHopeAdapter adapter = SourceHopeFragment.this.getAdapter();
                bVar = SourceHopeFragment.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                XQuickRecyclerView xQuickRecyclerView = SourceHopeFragment.this.getMDatabind().f20129b;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
                CustomViewExtKt.loadListData$default(it2, adapter, bVar, xQuickRecyclerView, null, 16, null);
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.quark.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SourceHopeFragment.createObserver$lambda$5$lambda$4(Function1.this, obj);
            }
        });
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void dismissLoading() {
    }

    @NotNull
    public final SourceHopeAdapter getAdapter() {
        return (SourceHopeAdapter) this.adapter$delegate.getValue();
    }

    @Override // com.join.kotlin.quark.callback.IChangeSortCallback
    @Nullable
    public Integer getStatusState() {
        return ((SourceHopeListViewModel) getMViewModel()).getStatus();
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void initView(@Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            ((SourceHopeListViewModel) getMViewModel()).setKeyword(arguments.getString("_keyword", ""));
            ((SourceHopeListViewModel) getMViewModel()).setSortType(Integer.valueOf(arguments.getInt("_sortType", 1)));
            ((SourceHopeListViewModel) getMViewModel()).setType(Integer.valueOf(arguments.getInt("_type", 0)));
        }
        getMDatabind().f((SourceHopeListViewModel) getMViewModel());
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().f20129b;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
        CustomViewExtKt.init$default(xQuickRecyclerView, (RecyclerView.LayoutManager) new LinearLayoutManager(getContext(), 1, false), (RecyclerView.Adapter) getAdapter(), false, 4, (Object) null);
        getAdapter().setSourceHopeItemClickProxy(this);
        final XQuickRecyclerView xQuickRecyclerView2 = getMDatabind().f20129b;
        xQuickRecyclerView2.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.quark.SourceHopeFragment$initView$2$1
            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            @NotNull
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
                aVar.f46233f = 0;
                aVar.f46236c = 0;
                aVar.f46237d = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp30);
                aVar.f46234a = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp30);
                aVar.f46235b = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp30);
                return aVar;
            }
        });
        getAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.quark.p
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                SourceHopeFragment.initView$lambda$3$lambda$2(baseQuickAdapter, view, i4);
            }
        });
        getMDatabind().f20129b.setLoadingListener(new XQuickRecyclerView.LoadingListener() { // from class: com.join.kotlin.quark.SourceHopeFragment$initView$4
            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onLoadMore() {
                SourceHopeFragment.this.loadData(false);
            }

            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onRefresh() {
                SourceHopeFragment.this.loadData(true);
            }
        });
        XQuickRecyclerView xQuickRecyclerView3 = getMDatabind().f20129b;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView3, "mDatabind.xrvList");
        com.kingja.loadsir.core.b<Object> loadServiceInit = CustomViewExtKt.loadServiceInit(xQuickRecyclerView3, new Function0<Unit>() { // from class: com.join.kotlin.quark.SourceHopeFragment$initView$5
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
                SourceHopeFragment.this.loadData(true);
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
        if (getContext() instanceof IChangeSortCallback) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.join.kotlin.quark.callback.IChangeSortCallback");
            ((SourceHopeListViewModel) getMViewModel()).setStatus(((IChangeSortCallback) context).getStatusState());
        }
        String uid = AccountUtil_.getInstance_(getContext()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(context).uid");
        ((SourceHopeListViewModel) getMViewModel()).getWishPoolList(z4, uid);
    }

    @Override // com.join.kotlin.quark.callback.IChangeSortCallback
    public void onStatusChanged() {
        if (!isAdded() || ((SourceHopeListViewModel) getMViewModel()) == null) {
            return;
        }
        loadData(true);
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeItemClickProxy
    public void onUploadSourceClick(@Nullable SourceListItemBean sourceListItemBean) {
        Intent putExtra = new Intent().putExtra("_wishPoolItem", sourceListItemBean);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(\"_wishPoolItem\", item)");
        IntentUtil.getInstance().startActivityWithCallback(getContext(), ShareSourceActivity.class, putExtra, new DialogShareSourceCallbackImpl() { // from class: com.join.kotlin.quark.SourceHopeFragment$onUploadSourceClick$1
            @Override // com.join.kotlin.quark.callback.impl.DialogShareSourceCallbackImpl, com.join.kotlin.quark.callback.IDialogShareSourceCallback
            public void onSuccess() {
                SourceHopeFragment.this.loadData(true);
            }
        });
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeItemClickProxy
    public void onViewSourceClick(@Nullable SourceListItemBean sourceListItemBean) {
        Intent intent = new Intent(getContext(), SourceShareDetailActivity.class);
        intent.putExtra("itemBean", sourceListItemBean);
        startActivity(intent);
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeItemClickProxy
    public void onWantClick(@Nullable SourceListItemBean sourceListItemBean) {
        BaseVmFragment.showLoading$default(this, null, 1, null);
        SourceHopeListViewModel sourceHopeListViewModel = (SourceHopeListViewModel) getMViewModel();
        Integer id = sourceListItemBean != null ? sourceListItemBean.getId() : null;
        String uid = AccountUtil_.getInstance_(getContext()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(context).uid");
        sourceHopeListViewModel.wishPoolWant(id, uid, new Function1<ResponseModel<Boolean>, Unit>() { // from class: com.join.kotlin.quark.SourceHopeFragment$onWantClick$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<Boolean> responseModel) {
                invoke2(responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ResponseModel<Boolean> responseModel) {
                if (responseModel != null ? Intrinsics.areEqual(responseModel.getData(), Boolean.TRUE) : false) {
                    ToastManager.show("数据上传成功");
                    SourceHopeFragment.this.loadData(true);
                    return;
                }
                ToastManager.show("数据上传失败");
            }
        }, new Function1<Throwable, Unit>() { // from class: com.join.kotlin.quark.SourceHopeFragment$onWantClick$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                ToastManager.show(it2.getMessage());
            }
        });
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void showLoading(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
