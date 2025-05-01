.class final Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "CreateSourceHopeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/CreateSourceHopeActivity;->createObserver()V
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
.field final synthetic this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V

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

    iget-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-static {v1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "loadSir"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    iget-object v2, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-virtual {v2}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->j:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string v3, "mDatabind.xrvList"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2$1;

    iget-object v4, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-direct {v3, v4}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2$1;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    invoke-static {p1, v0, v1, v2, v3}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadListData(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/kingja/loadsir/core/b;Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Lkotlin/jvm/functions/Function0;)V

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->getListSizeStr()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x2b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-virtual {v1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
