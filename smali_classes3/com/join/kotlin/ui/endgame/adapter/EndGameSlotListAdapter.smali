.class public final Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;
.super Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;
.source "EndGameSlotListAdapter.kt"

# interfaces
.implements Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter<",
        "Lcom/join/mgps/dto/ArchiveListBean;",
        "Landroidx/databinding/ViewDataBinding;",
        ">;",
        "Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;"
    }
.end annotation


# instance fields
.field private checkedItem:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/mgps/dto/ArchiveListBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->context:Landroid/content/Context;

    .line 3
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->checkedItem:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method


# virtual methods
.method public final getCheckedItem()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/mgps/dto/ArchiveListBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->checkedItem:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method protected getLayoutResId(I)I
    .locals 0

    const p1, 0x7f0c03a5

    return p1
.end method

.method protected onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/ArchiveListBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/ArchiveListBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;

    if-eqz p3, :cond_0

    .line 3
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->g(Lcom/join/mgps/dto/ArchiveListBean;)V

    .line 4
    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->h(Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onBindItem(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/join/mgps/dto/ArchiveListBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/ArchiveListBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/ArchiveListBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/ArchiveListBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;

    if-eqz p3, :cond_0

    .line 3
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->g(Lcom/join/mgps/dto/ArchiveListBean;)V

    .line 4
    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->h(Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/join/mgps/dto/ArchiveListBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/ArchiveListBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onItemCheckedChanged(Lcom/join/mgps/dto/ArchiveListBean;)V
    .locals 3
    .param p1    # Lcom/join/mgps/dto/ArchiveListBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->checkedItem:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ArchiveListBean;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ArchiveListBean;->setIsCheck(I)V

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->checkedItem:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ArchiveListBean;->setIsCheck(I)V

    .line 4
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->checkedItem:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveListBean;->getIsCheck()I

    move-result v2

    if-ne v2, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final setCheckedItem(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/mgps/dto/ArchiveListBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->checkedItem:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method

.method public final setContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->context:Landroid/content/Context;

    return-void
.end method
