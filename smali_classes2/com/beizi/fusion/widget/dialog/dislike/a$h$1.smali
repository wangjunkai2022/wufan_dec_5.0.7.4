.class Lcom/beizi/fusion/widget/dialog/dislike/a$h$1;
.super Ljava/lang/Object;
.source "DislikeDialog.java"

# interfaces
.implements Lcom/beizi/fusion/widget/dialog/dislike/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a$h;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/dialog/dislike/a$h;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$1;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$1;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    iget-object v0, v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/beizi/fusion/widget/dialog/dislike/a$e;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method
