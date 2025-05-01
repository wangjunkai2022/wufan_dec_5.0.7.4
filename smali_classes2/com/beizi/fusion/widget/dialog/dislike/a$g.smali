.class public Lcom/beizi/fusion/widget/dialog/dislike/a$g;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "DislikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/dialog/dislike/a;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$d;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Lcom/beizi/fusion/widget/dialog/dislike/a$f;


# direct methods
.method public constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$d;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->a:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->b:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->c:Landroid/content/Context;

    .line 4
    iput-object p3, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->b:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/widget/dialog/dislike/a$g;)Lcom/beizi/fusion/widget/dialog/dislike/a$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->d:Lcom/beizi/fusion/widget/dialog/dislike/a$f;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/widget/dialog/dislike/a$f;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->d:Lcom/beizi/fusion/widget/dialog/dislike/a$f;

    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 5
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "RecyclerView"
            }
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;

    .line 2
    iget-object v0, p1, Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->b:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beizi/fusion/widget/dialog/dislike/a$d;

    invoke-virtual {v1}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const-string v1, "#FFFAF6F6"

    const/4 v2, 0x0

    const-string v3, ""

    const/16 v4, 0xa

    invoke-static {v0, v1, v2, v3, v4}, Lcom/beizi/fusion/g/as;->a(Landroid/view/View;Ljava/lang/String;ILjava/lang/String;I)V

    .line 4
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;

    invoke-direct {v0, p0, p2}, Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$g;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
    sget p2, Lcom/beizi/fusion/R$layout;->beizi_dislike_item_multi_two_recycle_item:I

    .line 2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;

    invoke-direct {p2, p0, p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$g;Landroid/view/View;)V

    return-object p2
.end method
