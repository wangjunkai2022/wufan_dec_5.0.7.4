package com.join.kotlin.discount;

import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailCouponBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.adapter.CouponGameDetailAdapter;
import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.discount.model.bean.CouponUseTip;
import com.join.kotlin.discount.proxy.CouponListClickProxy;
import com.join.kotlin.discount.proxy.GameDetailCouponClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailCouponActivity.kt */
/* loaded from: classes3.dex */
public final class GameDetailCouponActivity extends BaseVmDbActivity<GameDetailCouponViewModel, ActivityDiscountGameDetailCouponBinding> implements GameDetailCouponClickProxy, CouponListClickProxy {
    private com.kingja.loadsir.core.b<Object> loadSir;
    @NotNull
    private final Lazy mAdapter$delegate;
    @Nullable
    private String pkg;

    public GameDetailCouponActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<CouponGameDetailAdapter>() { // from class: com.join.kotlin.discount.GameDetailCouponActivity$mAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CouponGameDetailAdapter invoke() {
                return new CouponGameDetailAdapter();
            }
        });
        this.mAdapter$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$2$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CouponGameDetailAdapter getMAdapter() {
        return (CouponGameDetailAdapter) this.mAdapter$delegate.getValue();
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
        MutableLiveData<ListDataUiState<CouponItemBean>> listData = ((GameDetailCouponViewModel) getMViewModel()).getListData();
        final Function1<ListDataUiState<CouponItemBean>, Unit> function1 = new Function1<ListDataUiState<CouponItemBean>, Unit>() { // from class: com.join.kotlin.discount.GameDetailCouponActivity$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ListDataUiState<CouponItemBean> listDataUiState) {
                invoke2(listDataUiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ListDataUiState<CouponItemBean> it2) {
                CouponGameDetailAdapter mAdapter;
                com.kingja.loadsir.core.b bVar;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                mAdapter = GameDetailCouponActivity.this.getMAdapter();
                bVar = GameDetailCouponActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                XQuickRecyclerView xQuickRecyclerView = GameDetailCouponActivity.this.getMDatabind().f15938d;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.rvCoupon");
                CustomViewExtKt.loadListData$default(it2, mAdapter, bVar, xQuickRecyclerView, null, 16, null);
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.discount.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailCouponActivity.createObserver$lambda$2$lambda$1(Function1.this, obj);
            }
        });
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((GameDetailCouponViewModel) getMViewModel());
        getMDatabind().g(this);
        ConstraintLayout constraintLayout = getMDatabind().f15937c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mDatabind.clContainer");
        com.kingja.loadsir.core.b<Object> loadServiceInit = CustomViewExtKt.loadServiceInit(constraintLayout, new Function0<Unit>() { // from class: com.join.kotlin.discount.GameDetailCouponActivity$initView$1
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
                bVar = GameDetailCouponActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                CustomViewExtKt.showLoading(bVar);
                GameDetailCouponActivity.this.loadData(true);
            }
        });
        this.loadSir = loadServiceInit;
        if (loadServiceInit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
            loadServiceInit = null;
        }
        CustomViewExtKt.showLoading(loadServiceInit);
        ((GameDetailCouponViewModel) getMViewModel()).setGameId(getIntent().getStringExtra("gameId"));
        this.pkg = getIntent().getStringExtra("gamePkg");
        getMAdapter().setListClickProxy(this);
        final XQuickRecyclerView xQuickRecyclerView = getMDatabind().f15938d;
        xQuickRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        xQuickRecyclerView.setAdapter(getMAdapter());
        xQuickRecyclerView.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.discount.GameDetailCouponActivity$initView$2$1
            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            @NotNull
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
                aVar.f46233f = 0;
                if (i4 == 0) {
                    aVar.f46236c = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp40);
                } else {
                    aVar.f46236c = 0;
                }
                aVar.f46234a = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp30);
                aVar.f46235b = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp30);
                aVar.f46237d = (int) XQuickRecyclerView.this.getResources().getDimension(R.dimen.wdp30);
                return aVar;
            }
        });
        xQuickRecyclerView.setLoadingMoreEnabled(false);
        getMDatabind().f15938d.setLoadingListener(new XQuickRecyclerView.LoadingListener() { // from class: com.join.kotlin.discount.GameDetailCouponActivity$initView$3
            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onLoadMore() {
                GameDetailCouponActivity.this.loadData(false);
            }

            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onRefresh() {
                GameDetailCouponActivity.this.loadData(true);
            }
        });
        loadData(true);
    }

    public final void loadData(boolean z4) {
        if (z4) {
            com.kingja.loadsir.core.b<Object> bVar = this.loadSir;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                bVar = null;
            }
            CustomViewExtKt.showLoading(bVar);
        }
        ((GameDetailCouponViewModel) getMViewModel()).getCouponList(z4);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailCouponClickProxy
    public void onBackClick() {
        finish();
    }

    @Override // com.join.kotlin.discount.proxy.CouponListClickProxy
    public void onDetailClick(@NotNull CouponItemBean itemBean) {
        Intrinsics.checkNotNullParameter(itemBean, "itemBean");
        Intent intent = new Intent(this, CommonBottomDialogActivity.class);
        intent.putExtra("title", "温馨提示");
        intent.putExtra("content", "请前往游戏中领取");
        intent.putExtra("btnText", "我知道了");
        startActivity(intent);
    }

    @Override // com.join.kotlin.discount.proxy.CouponListClickProxy
    public void onReceiveClick(@NotNull CouponItemBean itemBean) {
        Intrinsics.checkNotNullParameter(itemBean, "itemBean");
        Intent intent = new Intent(this, CommonBottomDialogActivity.class);
        intent.putExtra("title", "温馨提示");
        intent.putExtra("content", "请前往游戏中领取");
        intent.putExtra("btnText", "我知道了");
        startActivity(intent);
    }

    @Override // com.join.kotlin.discount.proxy.CouponListClickProxy
    public void onUnSupportClick(@NotNull CouponItemBean itemBean) {
        Intrinsics.checkNotNullParameter(itemBean, "itemBean");
    }

    @Override // com.join.kotlin.discount.proxy.CouponListClickProxy
    public void onUseClick(@NotNull CouponItemBean itemBean) {
        Intrinsics.checkNotNullParameter(itemBean, "itemBean");
    }

    @Override // com.join.kotlin.discount.proxy.CouponListClickProxy
    public void showUseTip(@Nullable CouponUseTip couponUseTip) {
    }
}
