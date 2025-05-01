package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.quark.model.bean.Page;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceShareListViewModel.kt */
/* loaded from: classes3.dex */
public final class SourceShareListViewModel extends BaseViewModel {
    @NotNull
    private List<SourceListItemBean> showData = new ArrayList();
    @NotNull
    private MutableLiveData<ListDataUiState<SourceListItemBean>> listData = new MutableLiveData<>();
    @NotNull
    private final Page page = new Page(1, 0, 2, null);

    @NotNull
    public final MutableLiveData<ListDataUiState<SourceListItemBean>> getListData() {
        return this.listData;
    }

    @NotNull
    public final Page getPage() {
        return this.page;
    }

    public final void getResourceList(final boolean z4, int i4, @NotNull String uid, @NotNull String token) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(token, "token");
        BaseViewModelExtKt.request$default(this, new SourceShareListViewModel$getResourceList$1(z4, this, i4, token, uid, null), new Function1<ArrayList<SourceListItemBean>, Unit>() { // from class: com.join.kotlin.quark.viewmodel.SourceShareListViewModel$getResourceList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<SourceListItemBean> arrayList) {
                invoke2(arrayList);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ArrayList<SourceListItemBean> arrayList) {
                Page page = SourceShareListViewModel.this.getPage();
                page.setPage(page.getPage() + 1);
                boolean isEmpty = (arrayList != null ? arrayList : CollectionsKt__CollectionsKt.emptyList()).isEmpty();
                boolean z5 = z4;
                Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
                Intrinsics.checkNotNull(valueOf);
                SourceShareListViewModel.this.getListData().setValue(new ListDataUiState<>(true, null, z5, isEmpty, valueOf.intValue() > 0, z4 && isEmpty, arrayList, 2, null));
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.viewmodel.SourceShareListViewModel$getResourceList$3
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

    @NotNull
    public final List<SourceListItemBean> getShowData() {
        return this.showData;
    }

    public final void setListData(@NotNull MutableLiveData<ListDataUiState<SourceListItemBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.listData = mutableLiveData;
    }

    public final void setShowData(@NotNull List<SourceListItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showData = list;
    }
}
