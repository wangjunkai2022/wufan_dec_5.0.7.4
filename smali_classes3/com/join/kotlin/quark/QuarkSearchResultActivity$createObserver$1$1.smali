.class final Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QuarkSearchResultActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/QuarkSearchResultActivity;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
        "Lcom/join/kotlin/quark/model/bean/SourceListItemBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
            "Lcom/join/kotlin/quark/model/bean/SourceListItemBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "it"

    .line 2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SearchResultAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;

    invoke-static {v1}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "loadSir"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    iget-object v2, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;

    invoke-virtual {v2}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string v3, "mDatabind.xrvList"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1$1;

    iget-object v4, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;

    invoke-direct {v3, v4}, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1$1;-><init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V

    invoke-static {p1, v0, v1, v2, v3}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadListData(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/kingja/loadsir/core/b;Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
