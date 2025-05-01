package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.quark.model.bean.Page;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.mgps.dto.ResponseModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceHopeListViewModel.kt */
/* loaded from: classes3.dex */
public final class SourceHopeListViewModel extends BaseViewModel {
    @Nullable
    private String keyword;
    @Nullable
    private Integer sortType;
    @Nullable
    private Integer status;
    @Nullable
    private Integer type;
    @NotNull
    private List<SourceListItemBean> showData = new ArrayList();
    @NotNull
    private MutableLiveData<ListDataUiState<SourceListItemBean>> listData = new MutableLiveData<>();
    @NotNull
    private final Page page = new Page(1, 0, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void wishPoolWant$default(SourceHopeListViewModel sourceHopeListViewModel, Integer num, String str, Function1 function1, Function1 function12, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            function12 = new Function1<Throwable, Unit>() { // from class: com.join.kotlin.quark.viewmodel.SourceHopeListViewModel$wishPoolWant$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                }
            };
        }
        sourceHopeListViewModel.wishPoolWant(num, str, function1, function12);
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @NotNull
    public final MutableLiveData<ListDataUiState<SourceListItemBean>> getListData() {
        return this.listData;
    }

    @NotNull
    public final Page getPage() {
        return this.page;
    }

    @NotNull
    public final List<SourceListItemBean> getShowData() {
        return this.showData;
    }

    @Nullable
    public final Integer getSortType() {
        return this.sortType;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void getWishPoolList(final boolean z4, @NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        BaseViewModelExtKt.request$default(this, new SourceHopeListViewModel$getWishPoolList$1(z4, this, uid, null), new Function1<ArrayList<SourceListItemBean>, Unit>() { // from class: com.join.kotlin.quark.viewmodel.SourceHopeListViewModel$getWishPoolList$2
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
                Page page = SourceHopeListViewModel.this.getPage();
                page.setPage(page.getPage() + 1);
                boolean isEmpty = (arrayList != null ? arrayList : CollectionsKt__CollectionsKt.emptyList()).isEmpty();
                boolean z5 = z4;
                Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
                Intrinsics.checkNotNull(valueOf);
                SourceHopeListViewModel.this.getListData().setValue(new ListDataUiState<>(true, null, z5, isEmpty, valueOf.intValue() > 0, z4 && isEmpty, arrayList, 2, null));
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.viewmodel.SourceHopeListViewModel$getWishPoolList$3
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

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setListData(@NotNull MutableLiveData<ListDataUiState<SourceListItemBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.listData = mutableLiveData;
    }

    public final void setShowData(@NotNull List<SourceListItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showData = list;
    }

    public final void setSortType(@Nullable Integer num) {
        this.sortType = num;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void wishPoolWant(@Nullable Integer num, @NotNull String uid, @NotNull Function1<? super ResponseModel<Boolean>, Unit> success, @NotNull Function1<? super Throwable, Unit> error) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        BaseViewModelExtKt.launch(this, new SourceHopeListViewModel$wishPoolWant$2(uid, num, null), success, error);
    }
}
