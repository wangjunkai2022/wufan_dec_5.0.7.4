.class public final Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceHopeTagAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;",
        "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemSourceHopeTagBinding;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;->onBindViewHolder(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/quark/model/bean/SourceTabItemBean;)V

    return-void
.end method

.method protected onBindViewHolder(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/quark/model/bean/SourceTabItemBean;)V
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemSourceHopeTagBinding;",
            ">;I",
            "Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;",
            ")V"
        }
    .end annotation

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSourceHopeTagBinding;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ItemSourceHopeTagBinding;->f(Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;->onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    move-result-object p1

    return-object p1
.end method

.method protected onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemSourceHopeTagBinding;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "parent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    const p3, 0x7f0c041d

    invoke-direct {p1, p3, p2}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;-><init>(ILandroid/view/ViewGroup;)V

    return-object p1
.end method
