package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.quark.model.bean.Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailCouponViewModel.kt */
/* loaded from: classes3.dex */
public final class GameDetailCouponViewModel extends BaseViewModel {
    @Nullable
    private String gameId;
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");
    @NotNull
    private final Page page = new Page(1, 20);
    @NotNull
    private final MutableLiveData<ListDataUiState<CouponItemBean>> listData = new MutableLiveData<>();

    public final void getCouponList(final boolean z4) {
        BaseViewModelExtKt.request$default(this, new GameDetailCouponViewModel$getCouponList$1(z4, this, null), new Function1<List<? extends CouponItemBean>, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel$getCouponList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CouponItemBean> list) {
                invoke2((List<CouponItemBean>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
                r14 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r14);
             */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(@org.jetbrains.annotations.Nullable java.util.List<com.join.kotlin.discount.model.bean.CouponItemBean> r14) {
                /*
                    r13 = this;
                    com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel r0 = com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel.this
                    com.join.kotlin.quark.model.bean.Page r0 = r0.getPage()
                    int r1 = r0.getPage()
                    r2 = 1
                    int r1 = r1 + r2
                    r0.setPage(r1)
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    if (r14 == 0) goto L30
                    java.util.List r14 = kotlin.collections.CollectionsKt.filterNotNull(r14)
                    if (r14 == 0) goto L30
                    java.util.Iterator r14 = r14.iterator()
                L20:
                    boolean r0 = r14.hasNext()
                    if (r0 == 0) goto L30
                    java.lang.Object r0 = r14.next()
                    com.join.kotlin.discount.model.bean.CouponItemBean r0 = (com.join.kotlin.discount.model.bean.CouponItemBean) r0
                    r10.add(r0)
                    goto L20
                L30:
                    com.join.kotlin.base.net.stateCallback.ListDataUiState r14 = new com.join.kotlin.base.net.stateCallback.ListDataUiState
                    r4 = 1
                    r5 = 0
                    boolean r6 = r2
                    boolean r7 = r10.isEmpty()
                    boolean r0 = r10.isEmpty()
                    r8 = r0 ^ 1
                    boolean r0 = r2
                    if (r0 == 0) goto L4c
                    boolean r0 = r10.isEmpty()
                    if (r0 == 0) goto L4c
                    r9 = 1
                    goto L4e
                L4c:
                    r2 = 0
                    r9 = 0
                L4e:
                    r11 = 2
                    r12 = 0
                    r3 = r14
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel r0 = com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = r0.getListData()
                    r0.setValue(r14)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel$getCouponList$2.invoke2(java.util.List):void");
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel$getCouponList$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Intrinsics.checkNotNullParameter(it2, "it");
                this.getListData().setValue(new ListDataUiState<>(false, it2.getErrorMsg(), z4, false, false, false, new ArrayList(), 56, null));
            }
        }, false, null, 24, null);
    }

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final MutableLiveData<ListDataUiState<CouponItemBean>> getListData() {
        return this.listData;
    }

    @NotNull
    public final Page getPage() {
        return this.page;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }
}
