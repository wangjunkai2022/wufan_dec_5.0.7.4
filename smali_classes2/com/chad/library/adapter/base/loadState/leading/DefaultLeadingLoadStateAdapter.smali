.class public final Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;
.super Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
.source "DefaultLeadingLoadStateAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
        "Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/chad/library/adapter/base/loadState/b;)I
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "loadState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f0c00e2

    return p1
.end method

.method public bridge synthetic d(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/chad/library/adapter/base/loadState/b;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;

    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;->r(Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;Lcom/chad/library/adapter/base/loadState/b;)V

    return-void
.end method

.method public bridge synthetic e(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/b;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;->s(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/b;)Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;

    move-result-object p1

    return-object p1
.end method

.method public r(Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;Lcom/chad/library/adapter/base/loadState/b;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of p2, p2, Lcom/chad/library/adapter/base/loadState/b$b;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;->a()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;->a()Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public s(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/b;)Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p2, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method
