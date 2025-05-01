.class Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;
.super Ljava/lang/Object;
.source "DislikeDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a$h;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field final synthetic b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    iput-object p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;->a:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;->a:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    iget-object v0, v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->b:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a;->a(Lcom/beizi/fusion/widget/dialog/dislike/a;)I

    move-result v0

    iget-object v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    invoke-virtual {v1, p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->getItemViewType(I)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    iget-object v0, v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$e;

    iget-object v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$3;->a:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-interface {v0, v1, p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$e;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method
