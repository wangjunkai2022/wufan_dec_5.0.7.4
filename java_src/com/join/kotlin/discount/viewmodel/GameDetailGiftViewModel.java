package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.discount.model.bean.GameDetailGiftEntityBean;
import com.join.kotlin.discount.model.bean.GiftItemTypeBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailGiftViewModel.kt */
/* loaded from: classes3.dex */
public final class GameDetailGiftViewModel extends BaseViewModel {
    @Nullable
    private String gameId;
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");
    @NotNull
    private final MutableLiveData<ListDataUiState<GameDetailGiftEntityBean>> listData = new MutableLiveData<>();

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    public final void getGiftList() {
        BaseViewModelExtKt.request$default(this, new GameDetailGiftViewModel$getGiftList$1(this, null), new Function1<List<? extends GiftItemTypeBean>, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel$getGiftList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GiftItemTypeBean> list) {
                invoke2((List<GiftItemTypeBean>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
                r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
                r11 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r11);
             */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(@org.jetbrains.annotations.Nullable java.util.List<com.join.kotlin.discount.model.bean.GiftItemTypeBean> r11) {
                /*
                    r10 = this;
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r7.<init>()
                    if (r11 == 0) goto L50
                    java.util.List r11 = kotlin.collections.CollectionsKt.filterNotNull(r11)
                    if (r11 == 0) goto L50
                    java.util.Iterator r11 = r11.iterator()
                L11:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto L50
                    java.lang.Object r0 = r11.next()
                    com.join.kotlin.discount.model.bean.GiftItemTypeBean r0 = (com.join.kotlin.discount.model.bean.GiftItemTypeBean) r0
                    com.join.kotlin.discount.model.bean.GameDetailGiftEntityBean r1 = new com.join.kotlin.discount.model.bean.GameDetailGiftEntityBean
                    r2 = 1
                    java.lang.String r3 = r0.getTypeName()
                    r1.<init>(r2, r3)
                    r7.add(r1)
                    java.util.List r0 = r0.getGifts()
                    if (r0 == 0) goto L11
                    java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)
                    if (r0 == 0) goto L11
                    java.util.Iterator r0 = r0.iterator()
                L3a:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L11
                    java.lang.Object r1 = r0.next()
                    com.join.kotlin.discount.model.bean.GiftItemBean r1 = (com.join.kotlin.discount.model.bean.GiftItemBean) r1
                    com.join.kotlin.discount.model.bean.GameDetailGiftEntityBean r2 = new com.join.kotlin.discount.model.bean.GameDetailGiftEntityBean
                    r3 = 2
                    r2.<init>(r3, r1)
                    r7.add(r2)
                    goto L3a
                L50:
                    com.join.kotlin.base.net.stateCallback.ListDataUiState r11 = new com.join.kotlin.base.net.stateCallback.ListDataUiState
                    r1 = 1
                    r2 = 0
                    r3 = 1
                    boolean r4 = r7.isEmpty()
                    r5 = 0
                    boolean r6 = r7.isEmpty()
                    r8 = 2
                    r9 = 0
                    r0 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel r0 = com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = r0.getListData()
                    r0.setValue(r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel$getGiftList$2.invoke2(java.util.List):void");
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel$getGiftList$3
            /* JADX INFO: Access modifiers changed from: package-private */
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
                GameDetailGiftViewModel.this.getListData().setValue(new ListDataUiState<>(false, it2.getErrorMsg(), true, false, false, false, new ArrayList(), 56, null));
            }
        }, false, null, 24, null);
    }

    @NotNull
    public final MutableLiveData<ListDataUiState<GameDetailGiftEntityBean>> getListData() {
        return this.listData;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }
}
