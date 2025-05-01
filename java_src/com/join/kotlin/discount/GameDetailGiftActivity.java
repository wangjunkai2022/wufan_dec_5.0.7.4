package com.join.kotlin.discount;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailGiftBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.adapter.GameDetailGiftAdapter;
import com.join.kotlin.discount.model.bean.GameDetailGiftEntityBean;
import com.join.kotlin.discount.model.bean.GiftItemBean;
import com.join.kotlin.discount.proxy.GameDetailGiftClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailGiftActivity.kt */
/* loaded from: classes3.dex */
public final class GameDetailGiftActivity extends BaseVmDbActivity<GameDetailGiftViewModel, ActivityDiscountGameDetailGiftBinding> implements GameDetailGiftClickProxy {
    @NotNull
    private List<GameDetailGiftEntityBean> datas = new ArrayList();
    private com.kingja.loadsir.core.b<Object> loadSir;
    @NotNull
    private final Lazy mAdapter$delegate;

    public GameDetailGiftActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailGiftAdapter>() { // from class: com.join.kotlin.discount.GameDetailGiftActivity$mAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailGiftAdapter invoke() {
                return new GameDetailGiftAdapter();
            }
        });
        this.mAdapter$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$1$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GameDetailGiftAdapter getMAdapter() {
        return (GameDetailGiftAdapter) this.mAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        ((GameDetailGiftViewModel) getMViewModel()).getGiftList();
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
        MutableLiveData<ListDataUiState<GameDetailGiftEntityBean>> listData = ((GameDetailGiftViewModel) getMViewModel()).getListData();
        final Function1<ListDataUiState<GameDetailGiftEntityBean>, Unit> function1 = new Function1<ListDataUiState<GameDetailGiftEntityBean>, Unit>() { // from class: com.join.kotlin.discount.GameDetailGiftActivity$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ListDataUiState<GameDetailGiftEntityBean> listDataUiState) {
                invoke2(listDataUiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ListDataUiState<GameDetailGiftEntityBean> it2) {
                GameDetailGiftAdapter mAdapter;
                com.kingja.loadsir.core.b bVar;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                mAdapter = GameDetailGiftActivity.this.getMAdapter();
                bVar = GameDetailGiftActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                XQuickRecyclerView xQuickRecyclerView = GameDetailGiftActivity.this.getMDatabind().f15950d;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.rvGift");
                CustomViewExtKt.loadListData$default(it2, mAdapter, bVar, xQuickRecyclerView, null, 16, null);
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.discount.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailGiftActivity.createObserver$lambda$1$lambda$0(Function1.this, obj);
            }
        });
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailGiftClickProxy
    public void goGiftDetail(@Nullable GiftItemBean giftItemBean) {
        Intent intent = new Intent(this, CommonBottomDialogActivity.class);
        intent.putExtra("title", "温馨提示");
        intent.putExtra("content", "请前往游戏中领取");
        intent.putExtra("btnText", "我知道了");
        startActivity(intent);
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((GameDetailGiftViewModel) getMViewModel());
        getMDatabind().g(this);
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().f15950d;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.rvGift");
        com.kingja.loadsir.core.b<Object> loadServiceInit = CustomViewExtKt.loadServiceInit(xQuickRecyclerView, new Function0<Unit>() { // from class: com.join.kotlin.discount.GameDetailGiftActivity$initView$1
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
                bVar = GameDetailGiftActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                CustomViewExtKt.showLoading(bVar);
                GameDetailGiftActivity.this.loadData();
            }
        });
        this.loadSir = loadServiceInit;
        if (loadServiceInit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
            loadServiceInit = null;
        }
        CustomViewExtKt.showLoading(loadServiceInit);
        getMAdapter().setClick(this);
        ((GameDetailGiftViewModel) getMViewModel()).setGameId(getIntent().getStringExtra("gameId"));
        getMDatabind().f15950d.setLayoutManager(new LinearLayoutManager(this));
        getMDatabind().f15950d.setAdapter(getMAdapter());
        loadData();
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailGiftClickProxy
    public void onBackClick() {
        finish();
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailGiftClickProxy
    public void receiveGift(@Nullable GiftItemBean giftItemBean) {
        Intent intent = new Intent(this, CommonBottomDialogActivity.class);
        intent.putExtra("title", "温馨提示");
        intent.putExtra("content", "请前往游戏中领取");
        intent.putExtra("btnText", "我知道了");
        startActivity(intent);
    }
}
