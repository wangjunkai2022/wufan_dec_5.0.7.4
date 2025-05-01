package com.join.kotlin.quark;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityCreateSourceHopeBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.adapter.SourceHopeAdapter;
import com.join.kotlin.quark.adapter.SourceHopeTagAdapter;
import com.join.kotlin.quark.callback.impl.DialogShareSourceCallbackImpl;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.model.bean.SourceTabItemBean;
import com.join.kotlin.quark.model.bean.SourceTabListBean;
import com.join.kotlin.quark.proxy.CreateSourceHopeClickProxy;
import com.join.kotlin.quark.proxy.SourceHopeItemClickProxy;
import com.join.kotlin.quark.viewmodel.CreateSourceHopeViewModel;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.ResponseModel;
import com.papa91.arc.ext.ToastManager;
import com.psk.kotlin.util.GridSpacingItemDecoration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CreateSourceHopeActivity.kt */
@SourceDebugExtension({"SMAP\nCreateSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n1864#2,3:278\n*S KotlinDebug\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity\n*L\n90#1:278,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CreateSourceHopeActivity extends BaseVmDbDialogActivity<CreateSourceHopeViewModel, ActivityCreateSourceHopeBinding> implements CreateSourceHopeClickProxy, SourceHopeItemClickProxy {
    @NotNull
    private final Lazy adapter$delegate;
    private com.kingja.loadsir.core.b<Object> loadSir;
    @NotNull
    private final Lazy tagAdapter$delegate;

    public CreateSourceHopeActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<SourceHopeTagAdapter>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$tagAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SourceHopeTagAdapter invoke() {
                return new SourceHopeTagAdapter();
            }
        });
        this.tagAdapter$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<SourceHopeAdapter>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$adapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SourceHopeAdapter invoke() {
                return new SourceHopeAdapter();
            }
        });
        this.adapter$delegate = lazy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$11$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$11$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$11$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SourceHopeTagAdapter getTagAdapter() {
        return (SourceHopeTagAdapter) this.tagAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4$lambda$3(CreateSourceHopeActivity this$0, BaseQuickAdapter adapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        int i5 = 0;
        for (Object obj : this$0.getTagAdapter().getItems()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SourceTabItemBean sourceTabItemBean = (SourceTabItemBean) obj;
            if (sourceTabItemBean != null) {
                sourceTabItemBean.setActive(Boolean.valueOf(i4 == i5));
            }
            if (sourceTabItemBean != null ? Intrinsics.areEqual(sourceTabItemBean.getActive(), Boolean.TRUE) : false) {
                ((CreateSourceHopeViewModel) this$0.getMViewModel()).setSelectTag(sourceTabItemBean);
            }
            i5 = i6;
        }
        this$0.getTagAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7$lambda$6(BaseQuickAdapter adapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
        CreateSourceHopeViewModel createSourceHopeViewModel = (CreateSourceHopeViewModel) getMViewModel();
        MutableLiveData<ResultState<SourceTabListBean>> homeData = createSourceHopeViewModel.getHomeData();
        final Function1<ResultState<? extends SourceTabListBean>, Unit> function1 = new Function1<ResultState<? extends SourceTabListBean>, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResultState<? extends SourceTabListBean> resultState) {
                invoke2((ResultState<SourceTabListBean>) resultState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ResultState<SourceTabListBean> resultState) {
                com.kingja.loadsir.core.b bVar;
                if (resultState == null) {
                    bVar = CreateSourceHopeActivity.this.loadSir;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                        bVar = null;
                    }
                    CustomViewExtKt.showError$default(bVar, null, 1, null);
                    return;
                }
                final CreateSourceHopeActivity createSourceHopeActivity = CreateSourceHopeActivity.this;
                Function1<SourceTabListBean, Unit> function12 = new Function1<SourceTabListBean, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SourceTabListBean sourceTabListBean) {
                        invoke2(sourceTabListBean);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable SourceTabListBean sourceTabListBean) {
                        com.kingja.loadsir.core.b bVar2;
                        SourceHopeTagAdapter tagAdapter;
                        Integer tab_id;
                        Integer tab_id2;
                        bVar2 = CreateSourceHopeActivity.this.loadSir;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                            bVar2 = null;
                        }
                        bVar2.h();
                        if (sourceTabListBean != null) {
                            CreateSourceHopeActivity createSourceHopeActivity2 = CreateSourceHopeActivity.this;
                            ArrayList<SourceTabItemBean> tabs = sourceTabListBean.getTabs();
                            if (tabs != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it2 = tabs.iterator();
                                while (true) {
                                    boolean z4 = false;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    SourceTabItemBean sourceTabItemBean = (SourceTabItemBean) it2.next();
                                    if (!((sourceTabItemBean == null || (tab_id2 = sourceTabItemBean.getTab_id()) == null || tab_id2.intValue() != 1) ? false : true)) {
                                        if (sourceTabItemBean != null && (tab_id = sourceTabItemBean.getTab_id()) != null && tab_id.intValue() == 2) {
                                            z4 = true;
                                        }
                                        if (!z4) {
                                            arrayList.add(sourceTabItemBean);
                                        }
                                    }
                                }
                                tagAdapter = createSourceHopeActivity2.getTagAdapter();
                                tagAdapter.submitList(arrayList);
                                if (arrayList.size() > 0) {
                                    ((CreateSourceHopeViewModel) createSourceHopeActivity2.getMViewModel()).setSelectTag((SourceTabItemBean) arrayList.get(0));
                                }
                            }
                        }
                    }
                };
                final CreateSourceHopeActivity createSourceHopeActivity2 = CreateSourceHopeActivity.this;
                BaseViewModelExtKt.parseState$default(createSourceHopeActivity, resultState, function12, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$1.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AppException appException) {
                        invoke2(appException);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AppException it2) {
                        com.kingja.loadsir.core.b bVar2;
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ToastManager.show(it2.getErrorMsg());
                        bVar2 = CreateSourceHopeActivity.this.loadSir;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                            bVar2 = null;
                        }
                        CustomViewExtKt.showError$default(bVar2, null, 1, null);
                    }
                }, (Function0) null, 8, (Object) null);
            }
        };
        homeData.observe(this, new Observer() { // from class: com.join.kotlin.quark.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CreateSourceHopeActivity.createObserver$lambda$11$lambda$8(Function1.this, obj);
            }
        });
        MutableLiveData<ListDataUiState<SourceListItemBean>> listData = createSourceHopeViewModel.getListData();
        final Function1<ListDataUiState<SourceListItemBean>, Unit> function12 = new Function1<ListDataUiState<SourceListItemBean>, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$2
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
                SourceHopeAdapter adapter = CreateSourceHopeActivity.this.getAdapter();
                bVar = CreateSourceHopeActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                XQuickRecyclerView xQuickRecyclerView = CreateSourceHopeActivity.this.getMDatabind().f15877j;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
                final CreateSourceHopeActivity createSourceHopeActivity = CreateSourceHopeActivity.this;
                CustomViewExtKt.loadListData(it2, adapter, bVar, xQuickRecyclerView, new Function0<Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$2.1
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
                        CreateSourceHopeActivity.this.getMDatabind().f15877j.setNoMore();
                    }
                });
                MutableLiveData<String> listSizeStr = ((CreateSourceHopeViewModel) CreateSourceHopeActivity.this.getMViewModel()).getListSizeStr();
                StringBuilder sb = new StringBuilder();
                sb.append('+');
                sb.append(CreateSourceHopeActivity.this.getAdapter().getItemCount());
                listSizeStr.setValue(sb.toString());
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.quark.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CreateSourceHopeActivity.createObserver$lambda$11$lambda$9(Function1.this, obj);
            }
        });
        MutableLiveData<ResultState<Boolean>> uploadData = createSourceHopeViewModel.getUploadData();
        final Function1<ResultState<? extends Boolean>, Unit> function13 = new Function1<ResultState<? extends Boolean>, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResultState<? extends Boolean> resultState) {
                invoke2((ResultState<Boolean>) resultState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ResultState<Boolean> resultState) {
                CreateSourceHopeActivity.this.dismissLoading();
                if (resultState == null) {
                    ToastManager.show("上传失败");
                    return;
                }
                final CreateSourceHopeActivity createSourceHopeActivity = CreateSourceHopeActivity.this;
                BaseViewModelExtKt.parseState$default(createSourceHopeActivity, resultState, new Function1<Boolean, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$3.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke2(bool);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool) {
                        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            ToastManager.show("上传成功");
                            CreateSourceHopeActivity.this.finish();
                            return;
                        }
                        ToastManager.show("上传失败");
                    }
                }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$createObserver$1$3.2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AppException appException) {
                        invoke2(appException);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AppException it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ToastManager.show(it2.getErrorMsg());
                    }
                }, (Function0) null, 8, (Object) null);
            }
        };
        uploadData.observe(this, new Observer() { // from class: com.join.kotlin.quark.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CreateSourceHopeActivity.createObserver$lambda$11$lambda$10(Function1.this, obj);
            }
        });
    }

    @NotNull
    public final SourceHopeAdapter getAdapter() {
        return (SourceHopeAdapter) this.adapter$delegate.getValue();
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        Intent intent = getIntent();
        ((CreateSourceHopeViewModel) getMViewModel()).setKeyword(intent.getStringExtra("_keyword"));
        ((CreateSourceHopeViewModel) getMViewModel()).setSortType(intent.getIntExtra("_sortType", 1));
        ((CreateSourceHopeViewModel) getMViewModel()).setType(Integer.valueOf(intent.getIntExtra("_type", 0)));
        getMDatabind().h((CreateSourceHopeViewModel) getMViewModel());
        getMDatabind().g(this);
        CoordinatorLayout coordinatorLayout = getMDatabind().f15873f;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "mDatabind.mainContent");
        this.loadSir = CustomViewExtKt.loadServiceInit(coordinatorLayout, new Function0<Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$initView$2
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
                String uid = AccountUtil_.getInstance_(CreateSourceHopeActivity.this).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this).uid");
                ((CreateSourceHopeViewModel) CreateSourceHopeActivity.this.getMViewModel()).getWebDiskHome(uid);
                CreateSourceHopeActivity.this.loadData(true);
            }
        });
        getMDatabind().f15874g.setAdapter(getTagAdapter());
        getMDatabind().f15874g.setAdapter(getTagAdapter());
        RecyclerView recyclerView = getMDatabind().f15874g;
        recyclerView.setLayoutManager(new GridLayoutManager(this) { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$initView$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(4, (int) recyclerView.getResources().getDimension(R.dimen.wdp32), false));
        getTagAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.quark.d
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                CreateSourceHopeActivity.initView$lambda$4$lambda$3(CreateSourceHopeActivity.this, baseQuickAdapter, view, i4);
            }
        });
        getAdapter().setSourceHopeItemClickProxy(this);
        String uid = AccountUtil_.getInstance_(this).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this).uid");
        ((CreateSourceHopeViewModel) getMViewModel()).getWebDiskHome(uid);
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().f15877j;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
        CustomViewExtKt.init$default(xQuickRecyclerView, (RecyclerView.LayoutManager) new LinearLayoutManager(this, 1, false), (RecyclerView.Adapter) getAdapter(), false, 4, (Object) null);
        final XQuickRecyclerView xQuickRecyclerView2 = getMDatabind().f15877j;
        xQuickRecyclerView2.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$initView$5$1
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
        getAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.quark.e
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                CreateSourceHopeActivity.initView$lambda$7$lambda$6(baseQuickAdapter, view, i4);
            }
        });
        getMDatabind().f15877j.setLoadingListener(new XQuickRecyclerView.LoadingListener() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$initView$7
            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onLoadMore() {
                CreateSourceHopeActivity.this.loadData(false);
            }

            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onRefresh() {
                CreateSourceHopeActivity.this.loadData(true);
            }
        });
        loadData(true);
    }

    public final void loadData(boolean z4) {
        String uid = AccountUtil_.getInstance_(this).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this).uid");
        ((CreateSourceHopeViewModel) getMViewModel()).getWishPoolList(z4, uid);
    }

    @Override // com.join.kotlin.quark.proxy.CreateSourceHopeClickProxy
    public void onBackClick() {
        finish();
    }

    @Override // com.join.kotlin.quark.proxy.CreateSourceHopeClickProxy
    public void onCreateHopeClick() {
        showLoading();
        SourceTabItemBean selectTag = ((CreateSourceHopeViewModel) getMViewModel()).getSelectTag();
        if (selectTag != null) {
            Integer tab_id = selectTag.getTab_id();
            Intrinsics.checkNotNull(tab_id);
            int intValue = tab_id.intValue();
            String uid = AccountUtil_.getInstance_(this).getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this@CreateSourceHopeActivity).uid");
            ((CreateSourceHopeViewModel) getMViewModel()).sourceShareCreate(intValue, uid);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeItemClickProxy
    public void onUploadSourceClick(@Nullable SourceListItemBean sourceListItemBean) {
        Intent putExtra = new Intent().putExtra("_wishPoolItem", sourceListItemBean);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(\"_wishPoolItem\", item)");
        IntentUtil.getInstance().startActivityWithCallback(this, ShareSourceActivity.class, putExtra, new DialogShareSourceCallbackImpl() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$onUploadSourceClick$1
            @Override // com.join.kotlin.quark.callback.impl.DialogShareSourceCallbackImpl, com.join.kotlin.quark.callback.IDialogShareSourceCallback
            public void onSuccess() {
                CreateSourceHopeActivity.this.loadData(true);
            }
        });
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeItemClickProxy
    public void onViewSourceClick(@Nullable SourceListItemBean sourceListItemBean) {
        Intent intent = new Intent(this, SourceShareDetailActivity.class);
        intent.putExtra("itemBean", sourceListItemBean);
        intent.putExtra("qkPosition", "xy");
        startActivity(intent);
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeItemClickProxy
    public void onWantClick(@Nullable SourceListItemBean sourceListItemBean) {
        showLoading();
        CreateSourceHopeViewModel createSourceHopeViewModel = (CreateSourceHopeViewModel) getMViewModel();
        Integer id = sourceListItemBean != null ? sourceListItemBean.getId() : null;
        String uid = AccountUtil_.getInstance_(this).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this@CreateSourceHopeActivity).uid");
        createSourceHopeViewModel.wishPoolWant(id, uid, new Function1<ResponseModel<Boolean>, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$onWantClick$1
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
                    CreateSourceHopeActivity.this.loadData(true);
                    return;
                }
                ToastManager.show("数据上传失败");
            }
        }, new Function1<Throwable, Unit>() { // from class: com.join.kotlin.quark.CreateSourceHopeActivity$onWantClick$2
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
}
