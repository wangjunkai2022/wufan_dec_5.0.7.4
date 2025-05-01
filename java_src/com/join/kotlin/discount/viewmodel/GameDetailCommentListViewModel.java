package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.discount.model.bean.CommentDataBean;
import com.join.kotlin.discount.model.bean.CommentDetailBean;
import com.join.kotlin.quark.model.bean.Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailCommentListViewModel.kt */
/* loaded from: classes3.dex */
public final class GameDetailCommentListViewModel extends BaseViewModel {
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");
    @NotNull
    private final MutableLiveData<ListDataUiState<CommentDetailBean>> listData = new MutableLiveData<>();
    private int sortType = 2;
    @NotNull
    private MutableLiveData<String> sortText = new MutableLiveData<>("最热");
    @NotNull
    private final Page page = new Page(1, 0, 2, null);
    @Nullable
    private String gameId = "";
    @NotNull
    private MutableLiveData<String> goodRate = new MutableLiveData<>("");
    @NotNull
    private MutableLiveData<Boolean> showGoodRate = new MutableLiveData<>(Boolean.TRUE);

    public final void getCommentList(final boolean z4) {
        BaseViewModelExtKt.request$default(this, new GameDetailCommentListViewModel$getCommentList$1(z4, this, null), new Function1<CommentDataBean, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailCommentListViewModel$getCommentList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CommentDataBean commentDataBean) {
                invoke2(commentDataBean);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable CommentDataBean commentDataBean) {
                List<CommentDetailBean> commentList;
                Page page = GameDetailCommentListViewModel.this.getPage();
                page.setPage(page.getPage() + 1);
                ArrayList arrayList = new ArrayList();
                if (commentDataBean != null && (commentList = commentDataBean.getCommentList()) != null) {
                    for (CommentDetailBean commentDetailBean : commentList) {
                        arrayList.add(commentDetailBean);
                    }
                }
                GameDetailCommentListViewModel.this.getListData().setValue(new ListDataUiState<>(true, null, z4, arrayList.isEmpty(), !arrayList.isEmpty(), z4 && arrayList.isEmpty(), arrayList, 2, null));
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailCommentListViewModel$getCommentList$3
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
    public final MutableLiveData<String> getGoodRate() {
        return this.goodRate;
    }

    @NotNull
    public final MutableLiveData<ListDataUiState<CommentDetailBean>> getListData() {
        return this.listData;
    }

    @NotNull
    public final Page getPage() {
        return this.page;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowGoodRate() {
        return this.showGoodRate;
    }

    @NotNull
    public final MutableLiveData<String> getSortText() {
        return this.sortText;
    }

    public final int getSortType() {
        return this.sortType;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }

    public final void setGoodRate(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.goodRate = mutableLiveData;
    }

    public final void setShowGoodRate(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showGoodRate = mutableLiveData;
    }

    public final void setSortText(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.sortText = mutableLiveData;
    }

    public final void setSortType(int i4) {
        this.sortType = i4;
    }
}
