.class Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;
.super Ljava/lang/Object;
.source "DislikeDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a$g;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/beizi/fusion/widget/dialog/dislike/a$g;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a$g;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$g;

    iput p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$g;

    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$g;)Lcom/beizi/fusion/widget/dialog/dislike/a$f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$g;

    invoke-static {v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$g;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$g;)Lcom/beizi/fusion/widget/dialog/dislike/a$f;

    move-result-object v0

    iget v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$1;->a:I

    invoke-interface {v0, p1, v1}, Lcom/beizi/fusion/widget/dialog/dislike/a$f;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method
