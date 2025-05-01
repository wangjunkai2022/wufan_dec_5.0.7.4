.class public Lcom/join/mgps/adapter/AbouSubMenuAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "AbouSubMenuAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/CommonGameInfoBean;",
        "Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method protected e(Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;ILcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/mgps/dto/CommonGameInfoBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object p2

    const p3, 0x7f091696

    invoke-virtual {p1, p3, p2}, Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;->n(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;

    return-void
.end method

.method protected f(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance p1, Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;

    const p3, 0x7f0c0365

    invoke-direct {p1, p3, p2}, Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;-><init>(ILandroid/view/ViewGroup;)V

    return-object p1
.end method

.method protected bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;

    check-cast p3, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/mgps/adapter/AbouSubMenuAdapter;->e(Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;ILcom/join/mgps/dto/CommonGameInfoBean;)V

    return-void
.end method

.method protected bridge synthetic onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/mgps/adapter/AbouSubMenuAdapter;->f(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;

    move-result-object p1

    return-object p1
.end method
