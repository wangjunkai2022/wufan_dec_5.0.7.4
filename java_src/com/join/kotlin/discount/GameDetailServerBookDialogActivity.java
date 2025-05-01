package com.join.kotlin.discount;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailServerBookDialogBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.adapter.GameDetailServerBookAdapter;
import com.join.kotlin.discount.model.bean.GameServerInfoBean;
import com.join.kotlin.discount.proxy.GameDetailServerBookDialogClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel;
import com.join.mgps.Util.c2;
import com.papa91.arc.ext.ToastManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailServerBookDialogActivity.kt */
@SourceDebugExtension({"SMAP\nGameDetailServerBookDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n350#2,7:123\n*S KotlinDebug\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity\n*L\n111#1:123,7\n*E\n"})
/* loaded from: classes3.dex */
public final class GameDetailServerBookDialogActivity extends BaseVmDbDialogActivity<GameDetailServerBookDialogViewModel, ActivityDiscountGameDetailServerBookDialogBinding> implements GameDetailServerBookDialogClickProxy {
    private com.kingja.loadsir.core.b<Object> loadSir;
    @NotNull
    private final Lazy mAdapter$delegate;

    public GameDetailServerBookDialogActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailServerBookAdapter>() { // from class: com.join.kotlin.discount.GameDetailServerBookDialogActivity$mAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailServerBookAdapter invoke() {
                return new GameDetailServerBookAdapter();
            }
        });
        this.mAdapter$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$3$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$3$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BaseQuickAdapter adapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        ((GameDetailServerBookDialogViewModel) getMViewModel()).getServerList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToAvailableData() {
        runOnUiThread(new Runnable() { // from class: com.join.kotlin.discount.q
            @Override // java.lang.Runnable
            public final void run() {
                GameDetailServerBookDialogActivity.scrollToAvailableData$lambda$5(GameDetailServerBookDialogActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToAvailableData$lambda$5(final GameDetailServerBookDialogActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this$0) { // from class: com.join.kotlin.discount.GameDetailServerBookDialogActivity$scrollToAvailableData$1$scroller$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(this$0);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return super.calculateSpeedPerPixel(displayMetrics);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            protected int getVerticalSnapPreference() {
                return -1;
            }
        };
        Iterator<GameServerInfoBean> it2 = this$0.getMAdapter().getItems().iterator();
        int i4 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i4 = -1;
                break;
            } else if (Intrinsics.areEqual(it2.next().getExpire(), Boolean.FALSE)) {
                break;
            } else {
                i4++;
            }
        }
        linearSmoothScroller.setTargetPosition(i4);
        RecyclerView.LayoutManager layoutManager = this$0.getMDatabind().f15971d.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).startSmoothScroll(linearSmoothScroller);
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
        GameDetailServerBookDialogViewModel gameDetailServerBookDialogViewModel = (GameDetailServerBookDialogViewModel) getMViewModel();
        MutableLiveData<ListDataUiState<GameServerInfoBean>> listData = gameDetailServerBookDialogViewModel.getListData();
        final Function1<ListDataUiState<GameServerInfoBean>, Unit> function1 = new Function1<ListDataUiState<GameServerInfoBean>, Unit>() { // from class: com.join.kotlin.discount.GameDetailServerBookDialogActivity$createObserver$1$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: GameDetailServerBookDialogActivity.kt */
            @DebugMetadata(c = "com.join.kotlin.discount.GameDetailServerBookDialogActivity$createObserver$1$1$1", f = "GameDetailServerBookDialogActivity.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.join.kotlin.discount.GameDetailServerBookDialogActivity$createObserver$1$1$1  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ GameDetailServerBookDialogActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailServerBookDialogActivity gameDetailServerBookDialogActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailServerBookDialogActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.label;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (DelayKt.b(500L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.scrollToAvailableData();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ListDataUiState<GameServerInfoBean> listDataUiState) {
                invoke2(listDataUiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ListDataUiState<GameServerInfoBean> it2) {
                com.kingja.loadsir.core.b bVar;
                com.kingja.loadsir.core.b bVar2;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                GameDetailServerBookAdapter mAdapter = GameDetailServerBookDialogActivity.this.getMAdapter();
                bVar = GameDetailServerBookDialogActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                XQuickRecyclerView xQuickRecyclerView = GameDetailServerBookDialogActivity.this.getMDatabind().f15971d;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.recyclerview");
                CustomViewExtKt.loadListData$default(it2, mAdapter, bVar2, xQuickRecyclerView, null, 16, null);
                kotlinx.coroutines.k.f(r0.a(d1.c()), null, null, new AnonymousClass1(GameDetailServerBookDialogActivity.this, null), 3, null);
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.discount.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailServerBookDialogActivity.createObserver$lambda$3$lambda$1(Function1.this, obj);
            }
        });
        MutableLiveData<GameServerInfoBean> subscribeResultBean = gameDetailServerBookDialogViewModel.getSubscribeResultBean();
        final Function1<GameServerInfoBean, Unit> function12 = new Function1<GameServerInfoBean, Unit>() { // from class: com.join.kotlin.discount.GameDetailServerBookDialogActivity$createObserver$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GameServerInfoBean gameServerInfoBean) {
                invoke2(gameServerInfoBean);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(GameServerInfoBean gameServerInfoBean) {
                List<GameServerInfoBean> items = GameDetailServerBookDialogActivity.this.getMAdapter().getItems();
                GameDetailServerBookDialogActivity gameDetailServerBookDialogActivity = GameDetailServerBookDialogActivity.this;
                int i4 = 0;
                for (Object obj : items) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    GameServerInfoBean gameServerInfoBean2 = (GameServerInfoBean) obj;
                    if (Intrinsics.areEqual(gameServerInfoBean2.getId(), gameServerInfoBean.getId())) {
                        gameServerInfoBean2.setSubscribe(!gameServerInfoBean2.getSubscribe());
                        ToastManager.show(gameServerInfoBean2.getSubscribe() ? "订阅成功" : "取消订阅成功");
                        gameDetailServerBookDialogActivity.getMAdapter().notifyItemChanged(i4);
                        return;
                    }
                    i4 = i5;
                }
            }
        };
        subscribeResultBean.observe(this, new Observer() { // from class: com.join.kotlin.discount.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailServerBookDialogActivity.createObserver$lambda$3$lambda$2(Function1.this, obj);
            }
        });
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    @Nullable
    public View getContentView() {
        return getMDatabind().f15969b;
    }

    @NotNull
    public final GameDetailServerBookAdapter getMAdapter() {
        return (GameDetailServerBookAdapter) this.mAdapter$delegate.getValue();
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((GameDetailServerBookDialogViewModel) getMViewModel());
        getMDatabind().g(this);
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().f15971d;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.recyclerview");
        this.loadSir = CustomViewExtKt.loadServiceInit(xQuickRecyclerView, new Function0<Unit>() { // from class: com.join.kotlin.discount.GameDetailServerBookDialogActivity$initView$1
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
                bVar = GameDetailServerBookDialogActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                CustomViewExtKt.showLoading(bVar);
                GameDetailServerBookDialogActivity.this.loadData();
            }
        });
        c2.s(this);
        ((GameDetailServerBookDialogViewModel) getMViewModel()).setGameId(getIntent().getStringExtra("gameId"));
        getMDatabind().f15971d.setLayoutManager(new GridLayoutManager(this, 2));
        getMDatabind().f15971d.setAdapter(getMAdapter());
        getMAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.discount.p
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                GameDetailServerBookDialogActivity.initView$lambda$0(baseQuickAdapter, view, i4);
            }
        });
        com.kingja.loadsir.core.b<Object> bVar = this.loadSir;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
            bVar = null;
        }
        CustomViewExtKt.showLoading(bVar);
        loadData();
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailServerBookDialogClickProxy
    public void onBackClick() {
        finish();
    }
}
