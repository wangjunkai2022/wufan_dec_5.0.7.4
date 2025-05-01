package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.discount.model.bean.CommentDataBean;
import com.join.kotlin.discount.model.bean.CommentDetailBean;
import com.join.kotlin.discount.model.bean.CommentStatisticDataBean;
import com.join.kotlin.discount.model.bean.GameDetailBean;
import com.join.kotlin.discount.model.bean.GameDetailDataBean;
import com.join.kotlin.quark.model.bean.Page;
import com.join.mgps.dto.CollectionBeanSub;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailFragmentViewModel.kt */
/* loaded from: classes3.dex */
public final class GameDetailFragmentViewModel extends BaseViewModel {
    private boolean autoDownload;
    @Nullable
    private String defaultBtnImage;
    @Nullable
    private String gameId;
    @NotNull
    private final MutableLiveData<String> goodRate;
    @NotNull
    private final MutableLiveData<Boolean> showAvgDuration;
    @NotNull
    private final MutableLiveData<Boolean> showAvgScore;
    @NotNull
    private final MutableLiveData<Boolean> showComment;
    @NotNull
    private final MutableLiveData<Boolean> showGameInfo;
    @NotNull
    private final MutableLiveData<ListDataUiState<CollectionBeanSub>> similarListData;
    @NotNull
    private Page similarListPage;
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");
    @NotNull
    private MutableLiveData<ResultState<GameDetailDataBean>> gameResult = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<GameDetailBean> gameInfo = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<DownloadTask> downloadTask = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> progress = new MutableLiveData<>(0);
    @NotNull
    private MutableLiveData<String> btnText = new MutableLiveData<>("下载");
    @NotNull
    private final MutableLiveData<ListDataUiState<CommentDetailBean>> commentListData = new MutableLiveData<>();
    @NotNull
    private final MutableLiveData<CommentStatisticDataBean> commentStatistic = new MutableLiveData<>();

    public GameDetailFragmentViewModel() {
        Boolean bool = Boolean.FALSE;
        this.showComment = new MutableLiveData<>(bool);
        this.showGameInfo = new MutableLiveData<>(bool);
        this.showAvgScore = new MutableLiveData<>(bool);
        this.showAvgDuration = new MutableLiveData<>(bool);
        this.goodRate = new MutableLiveData<>("100%");
        this.similarListPage = new Page(1, 0, 2, null);
        this.similarListData = new MutableLiveData<>();
    }

    public final boolean getAutoDownload() {
        return this.autoDownload;
    }

    @NotNull
    public final MutableLiveData<String> getBtnText() {
        return this.btnText;
    }

    public final void getCommentList() {
        BaseViewModelExtKt.request$default(this, new GameDetailFragmentViewModel$getCommentList$1(this, null), new Function1<CommentDataBean, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel$getCommentList$2
            /* JADX INFO: Access modifiers changed from: package-private */
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
                CommentStatisticDataBean commentScores;
                List<CommentDetailBean> commentList;
                ArrayList arrayList = new ArrayList();
                if (commentDataBean != null && (commentList = commentDataBean.getCommentList()) != null) {
                    int i4 = 0;
                    for (Object obj : commentList) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CommentDetailBean commentDetailBean = (CommentDetailBean) obj;
                        if (i4 <= 1) {
                            arrayList.add(commentDetailBean);
                        }
                        i4 = i5;
                    }
                }
                if (commentDataBean != null && (commentScores = commentDataBean.getCommentScores()) != null) {
                    GameDetailFragmentViewModel.this.getCommentStatistic().setValue(commentScores);
                }
                GameDetailFragmentViewModel.this.getCommentListData().setValue(new ListDataUiState<>(true, null, true, arrayList.isEmpty(), !arrayList.isEmpty(), arrayList.isEmpty(), arrayList, 2, null));
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel$getCommentList$3
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
                GameDetailFragmentViewModel.this.getCommentListData().setValue(new ListDataUiState<>(false, it2.getErrorMsg(), true, false, false, false, new ArrayList(), 56, null));
            }
        }, false, null, 24, null);
    }

    @NotNull
    public final MutableLiveData<ListDataUiState<CommentDetailBean>> getCommentListData() {
        return this.commentListData;
    }

    @NotNull
    public final MutableLiveData<CommentStatisticDataBean> getCommentStatistic() {
        return this.commentStatistic;
    }

    public final void getCommentStatisticData() {
    }

    @Nullable
    public final String getDefaultBtnImage() {
        return this.defaultBtnImage;
    }

    @NotNull
    public final MutableLiveData<DownloadTask> getDownloadTask() {
        return this.downloadTask;
    }

    public final void getGameDetail() {
        String str = this.gameId;
        if (str == null || str.length() == 0) {
            return;
        }
        BaseViewModelExtKt.request$default(this, new GameDetailFragmentViewModel$getGameDetail$1(this, null), this.gameResult, false, null, 12, null);
    }

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final MutableLiveData<GameDetailBean> getGameInfo() {
        return this.gameInfo;
    }

    @NotNull
    public final MutableLiveData<ResultState<GameDetailDataBean>> getGameResult() {
        return this.gameResult;
    }

    @NotNull
    public final MutableLiveData<String> getGoodRate() {
        return this.goodRate;
    }

    @NotNull
    public final MutableLiveData<Integer> getProgress() {
        return this.progress;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowAvgDuration() {
        return this.showAvgDuration;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowAvgScore() {
        return this.showAvgScore;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowComment() {
        return this.showComment;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowGameInfo() {
        return this.showGameInfo;
    }

    public final void getSimilarGames(final boolean z4) {
        BaseViewModelExtKt.request$default(this, new GameDetailFragmentViewModel$getSimilarGames$1(z4, this, null), new Function1<List<? extends CollectionBeanSub>, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel$getSimilarGames$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionBeanSub> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable List<? extends CollectionBeanSub> list) {
                Page similarListPage = GameDetailFragmentViewModel.this.getSimilarListPage();
                similarListPage.setPage(similarListPage.getPage() + 1);
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add((CollectionBeanSub) obj);
                        i4 = i5;
                    }
                }
                GameDetailFragmentViewModel.this.getSimilarListData().setValue(new ListDataUiState<>(true, null, z4, arrayList.isEmpty(), !arrayList.isEmpty(), arrayList.isEmpty(), arrayList, 2, null));
            }
        }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel$getSimilarGames$3
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
                GameDetailFragmentViewModel.this.getSimilarListData().setValue(new ListDataUiState<>(false, it2.getErrorMsg(), true, false, false, false, new ArrayList(), 56, null));
            }
        }, false, null, 24, null);
    }

    @NotNull
    public final MutableLiveData<ListDataUiState<CollectionBeanSub>> getSimilarListData() {
        return this.similarListData;
    }

    @NotNull
    public final Page getSimilarListPage() {
        return this.similarListPage;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void likeComment(@Nullable CommentDetailBean commentDetailBean) {
    }

    public final void setAutoDownload(boolean z4) {
        this.autoDownload = z4;
    }

    public final void setBtnText(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.btnText = mutableLiveData;
    }

    public final void setDefaultBtnImage(@Nullable String str) {
        this.defaultBtnImage = str;
    }

    public final void setDownloadTask(@NotNull MutableLiveData<DownloadTask> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.downloadTask = mutableLiveData;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }

    public final void setGameInfo(@NotNull MutableLiveData<GameDetailBean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.gameInfo = mutableLiveData;
    }

    public final void setGameResult(@NotNull MutableLiveData<ResultState<GameDetailDataBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.gameResult = mutableLiveData;
    }

    public final void setProgress(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.progress = mutableLiveData;
    }

    public final void setSimilarListPage(@NotNull Page page) {
        Intrinsics.checkNotNullParameter(page, "<set-?>");
        this.similarListPage = page;
    }
}
