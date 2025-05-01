package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.discount.model.bean.GameServerInfoBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailServerBookDialogViewModel.kt */
/* loaded from: classes3.dex */
public final class GameDetailServerBookDialogViewModel extends BaseViewModel {
    @Nullable
    private String gameId;
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");
    @NotNull
    private final MutableLiveData<ListDataUiState<GameServerInfoBean>> listData = new MutableLiveData<>();
    @NotNull
    private final MutableLiveData<GameServerInfoBean> subscribeResultBean = new MutableLiveData<>();

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final MutableLiveData<ListDataUiState<GameServerInfoBean>> getListData() {
        return this.listData;
    }

    public final void getServerList() {
        BaseViewModelExtKt.request$default(this, new GameDetailServerBookDialogViewModel$getServerList$1(this, null), new Function1<List<? extends GameServerInfoBean>, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel$getServerList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GameServerInfoBean> list) {
                invoke2((List<GameServerInfoBean>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
                r11 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r11);
             */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(@org.jetbrains.annotations.Nullable java.util.List<com.join.kotlin.discount.model.bean.GameServerInfoBean> r11) {
                /*
                    r10 = this;
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r7.<init>()
                    if (r11 == 0) goto L21
                    java.util.List r11 = kotlin.collections.CollectionsKt.filterNotNull(r11)
                    if (r11 == 0) goto L21
                    java.util.Iterator r11 = r11.iterator()
                L11:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto L21
                    java.lang.Object r0 = r11.next()
                    com.join.kotlin.discount.model.bean.GameServerInfoBean r0 = (com.join.kotlin.discount.model.bean.GameServerInfoBean) r0
                    r7.add(r0)
                    goto L11
                L21:
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
                    com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel r0 = com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = r0.getListData()
                    r0.setValue(r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel$getServerList$2.invoke2(java.util.List):void");
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel$getServerList$3
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
                GameDetailServerBookDialogViewModel.this.getListData().setValue(new ListDataUiState<>(false, it2.getErrorMsg(), true, false, false, false, new ArrayList(), 56, null));
            }
        }, false, null, 24, null);
    }

    @NotNull
    public final MutableLiveData<GameServerInfoBean> getSubscribeResultBean() {
        return this.subscribeResultBean;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }
}
