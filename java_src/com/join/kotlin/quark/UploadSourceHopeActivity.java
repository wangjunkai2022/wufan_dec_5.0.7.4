package com.join.kotlin.quark;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityUploadSourceHopeBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.quark.adapter.SourceHopeTagAdapter;
import com.join.kotlin.quark.model.bean.SourceTabItemBean;
import com.join.kotlin.quark.model.bean.SourceTabListBean;
import com.join.kotlin.quark.proxy.UploadSourceHopeClickProxy;
import com.join.kotlin.quark.viewmodel.UploadSourceHopeViewModel;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.papa91.arc.ext.ToastManager;
import com.psk.kotlin.util.GridSpacingItemDecoration;
import java.util.ArrayList;
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
/* compiled from: UploadSourceHopeActivity.kt */
@SourceDebugExtension({"SMAP\nUploadSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1864#2,3:151\n*S KotlinDebug\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity\n*L\n67#1:151,3\n*E\n"})
/* loaded from: classes3.dex */
public final class UploadSourceHopeActivity extends BaseVmDbDialogActivity<UploadSourceHopeViewModel, ActivityUploadSourceHopeBinding> implements UploadSourceHopeClickProxy {
    private com.kingja.loadsir.core.b<Object> loadSir;
    @NotNull
    private final Lazy tagAdapter$delegate;

    public UploadSourceHopeActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<SourceHopeTagAdapter>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$tagAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SourceHopeTagAdapter invoke() {
                return new SourceHopeTagAdapter();
            }
        });
        this.tagAdapter$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$6$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$6$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SourceHopeTagAdapter getTagAdapter() {
        return (SourceHopeTagAdapter) this.tagAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(UploadSourceHopeActivity this$0, BaseQuickAdapter adapter, View view, int i4) {
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
                ((UploadSourceHopeViewModel) this$0.getMViewModel()).setSelectTag(sourceTabItemBean);
            }
            i5 = i6;
        }
        this$0.getTagAdapter().notifyDataSetChanged();
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
        UploadSourceHopeViewModel uploadSourceHopeViewModel = (UploadSourceHopeViewModel) getMViewModel();
        MutableLiveData<ResultState<SourceTabListBean>> homeData = uploadSourceHopeViewModel.getHomeData();
        final Function1<ResultState<? extends SourceTabListBean>, Unit> function1 = new Function1<ResultState<? extends SourceTabListBean>, Unit>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$createObserver$1$1
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
                    bVar = UploadSourceHopeActivity.this.loadSir;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                        bVar = null;
                    }
                    CustomViewExtKt.showError$default(bVar, null, 1, null);
                    return;
                }
                final UploadSourceHopeActivity uploadSourceHopeActivity = UploadSourceHopeActivity.this;
                Function1<SourceTabListBean, Unit> function12 = new Function1<SourceTabListBean, Unit>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$createObserver$1$1.1
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
                        bVar2 = UploadSourceHopeActivity.this.loadSir;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                            bVar2 = null;
                        }
                        bVar2.h();
                        if (sourceTabListBean != null) {
                            UploadSourceHopeActivity uploadSourceHopeActivity2 = UploadSourceHopeActivity.this;
                            ArrayList<SourceTabItemBean> tabs = sourceTabListBean.getTabs();
                            if (tabs != null) {
                                tagAdapter = uploadSourceHopeActivity2.getTagAdapter();
                                tagAdapter.submitList(tabs);
                                int i4 = 0;
                                for (Object obj : tabs) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    SourceTabItemBean sourceTabItemBean = (SourceTabItemBean) obj;
                                    if (sourceTabItemBean != null ? Intrinsics.areEqual(sourceTabItemBean.getActive(), Boolean.TRUE) : false) {
                                        ((UploadSourceHopeViewModel) uploadSourceHopeActivity2.getMViewModel()).setSelectTag(sourceTabItemBean);
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                    }
                };
                final UploadSourceHopeActivity uploadSourceHopeActivity2 = UploadSourceHopeActivity.this;
                BaseViewModelExtKt.parseState$default(uploadSourceHopeActivity, resultState, function12, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$createObserver$1$1.2
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
                        bVar2 = UploadSourceHopeActivity.this.loadSir;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                            bVar2 = null;
                        }
                        CustomViewExtKt.showError$default(bVar2, null, 1, null);
                    }
                }, (Function0) null, 8, (Object) null);
            }
        };
        homeData.observe(this, new Observer() { // from class: com.join.kotlin.quark.x
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UploadSourceHopeActivity.createObserver$lambda$6$lambda$4(Function1.this, obj);
            }
        });
        MutableLiveData<ResultState<Boolean>> uploadData = uploadSourceHopeViewModel.getUploadData();
        final Function1<ResultState<? extends Boolean>, Unit> function12 = new Function1<ResultState<? extends Boolean>, Unit>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$createObserver$1$2
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
                UploadSourceHopeActivity.this.dismissLoading();
                if (resultState == null) {
                    ToastManager.show("上传失败");
                    return;
                }
                final UploadSourceHopeActivity uploadSourceHopeActivity = UploadSourceHopeActivity.this;
                BaseViewModelExtKt.parseState$default(uploadSourceHopeActivity, resultState, new Function1<Boolean, Unit>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$createObserver$1$2.1
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
                            UploadSourceHopeActivity.this.finish();
                            return;
                        }
                        ToastManager.show("上传失败");
                    }
                }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$createObserver$1$2.2
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
        uploadData.observe(this, new Observer() { // from class: com.join.kotlin.quark.w
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UploadSourceHopeActivity.createObserver$lambda$6$lambda$5(Function1.this, obj);
            }
        });
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((UploadSourceHopeViewModel) getMViewModel());
        getMDatabind().g(this);
        NestedScrollView nestedScrollView = getMDatabind().f17200f;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "mDatabind.mainContent");
        this.loadSir = CustomViewExtKt.loadServiceInit(nestedScrollView, new Function0<Unit>() { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$initView$1
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
                String uid = AccountUtil_.getInstance_(UploadSourceHopeActivity.this).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this).uid");
                ((UploadSourceHopeViewModel) UploadSourceHopeActivity.this.getMViewModel()).getWebDiskHome(uid);
            }
        });
        getMDatabind().f17201g.setAdapter(getTagAdapter());
        RecyclerView recyclerView = getMDatabind().f17201g;
        recyclerView.setLayoutManager(new GridLayoutManager(this) { // from class: com.join.kotlin.quark.UploadSourceHopeActivity$initView$2$1
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
        getTagAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.quark.y
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                UploadSourceHopeActivity.initView$lambda$3$lambda$2(UploadSourceHopeActivity.this, baseQuickAdapter, view, i4);
            }
        });
        String uid = AccountUtil_.getInstance_(this).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this).uid");
        ((UploadSourceHopeViewModel) getMViewModel()).getWebDiskHome(uid);
    }

    @Override // com.join.kotlin.quark.proxy.UploadSourceHopeClickProxy
    public void onBackClick() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // com.join.kotlin.quark.proxy.UploadSourceHopeClickProxy
    public void onUploadSourceClick() {
        showLoading();
        SourceTabItemBean selectTag = ((UploadSourceHopeViewModel) getMViewModel()).getSelectTag();
        if (selectTag != null) {
            Integer tab_id = selectTag.getTab_id();
            Intrinsics.checkNotNull(tab_id);
            int intValue = tab_id.intValue();
            String uid = AccountUtil_.getInstance_(this).getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this@UploadSourceHopeActivity).uid");
            ((UploadSourceHopeViewModel) getMViewModel()).sourceShareCreate(intValue, uid);
        }
    }
}
