.class Lcom/beizi/fusion/widget/dialog/dislike/a$h;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "DislikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;
    }
.end annotation


# instance fields
.field public a:Lcom/beizi/fusion/widget/dialog/dislike/a$e;

.field final synthetic b:Lcom/beizi/fusion/widget/dialog/dislike/a;

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$b;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->b:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->c:Landroid/content/Context;

    .line 3
    iput-object p3, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/widget/dialog/dislike/a$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$e;

    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-virtual {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-virtual {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->b:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-static {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a;->a(Lcom/beizi/fusion/widget/dialog/dislike/a;)I

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->b:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-static {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a;->b(Lcom/beizi/fusion/widget/dialog/dislike/a;)I

    move-result p1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 5
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;

    if-eqz v0, :cond_0

    .line 2
    move-object v0, p1

    check-cast v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;

    .line 3
    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->d:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-virtual {p2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;

    .line 5
    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->d:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-virtual {v2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    new-instance v1, Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager;

    invoke-direct {v1}, Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager;-><init>()V

    .line 7
    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;->b(Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 8
    new-instance v1, Lcom/beizi/fusion/widget/dialog/dislike/a$g;

    iget-object v2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->b:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-virtual {v2}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->d:Ljava/util/List;

    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-virtual {p2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a()Ljava/util/List;

    move-result-object p2

    invoke-direct {v1, v2, v3, p2}, Lcom/beizi/fusion/widget/dialog/dislike/a$g;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;Landroid/content/Context;Ljava/util/List;)V

    .line 9
    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;->b(Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 10
    new-instance p2, Lcom/beizi/fusion/widget/dialog/dislike/a$h$1;

    invoke-direct {p2, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$1;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;)V

    invoke-virtual {v1, p2}, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$f;)V

    .line 11
    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;->b(Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    new-instance v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$2;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$2;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 12
    :goto_0
    iget-object p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$e;

    if-eqz p2, :cond_1

    .line 13
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;

    invoke-direct {v0, p0, p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->b:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a;->b(Lcom/beizi/fusion/widget/dialog/dislike/a;)I

    move-result v0

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lcom/beizi/fusion/R$layout;->beizi_dislike_item_multi_one:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;

    invoke-direct {p2, p0, p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;Landroid/view/View;)V

    return-object p2

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lcom/beizi/fusion/R$layout;->beizi_dislike_item_multi_two:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 5
    new-instance p2, Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;

    invoke-direct {p2, p0, p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$h$b;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;Landroid/view/View;)V

    return-object p2
.end method
